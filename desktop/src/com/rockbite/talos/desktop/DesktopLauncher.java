package com.rockbite.talos.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl.LwjglFrame;
import com.rockbite.tools.talos.TalosMain;

import java.awt.dnd.DropTarget;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();		
		config.width = 1200;
		config.height = 700;
		TalosMain talos = new TalosMain();
		LwjglFrame frame = new LwjglFrame(talos, config);

		DropTarget dropTarget = new DropTarget(frame, talos);
	}
}
