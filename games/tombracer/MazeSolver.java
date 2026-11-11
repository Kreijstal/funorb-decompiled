/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MazeSolver {
    private MazeGrid grid;
    static String field_b;
    private int[][] path;
    private int field_c;
    private int field_d;
    static boolean field_e;

    private final void clearDistances(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int discarded$0 = 0;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.grid.width; var2++) {
          for (var3 = 0; var3 < this.grid.height; var3++) {
            if (this.isDistanceMark(-124, this.grid.getCell((byte) -5, var3, var2))) {
              this.grid.setCell(var3, 0, 0, var2);
            }
          }
        }
        if (!param0) {
          discarded$0 = this.encodeDistance(47, 0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        ClientMemoryVertexArray.field_e.field_r = param4;
        if (2 != OpenGlUnderwaterEffect.field_q) {
          qpa.field_b.field_r = ValidationMessageWidget.field_J;
        } else {
          qpa.field_b.field_r = gj.field_a;
        }
        int var9_int = 495;
        int var10 = 5;
        dh.field_e.setBounds(var9_int - 10, param7, -23776, var10, 5);
        CharacterChoiceFactory.field_g.setBounds(dh.field_e.field_G - ComponentMount.field_b.field_G, param7, -23776, 0, 0);
        if (param3 != -5327) {
          return;
        }
        try {
          var10 = var10 + (param7 + param5);
          ComponentMount.field_b.setBounds(ComponentMount.field_b.field_G, param7, -23776, 0, CharacterChoiceFactory.field_g.field_G);
          ClientMemoryVertexArray.field_d.setBounds(ClientMemoryVertexArray.field_d.measureNaturalWidth((byte) 69), param6, param3 - 18449, var10, 5);
          var11 = qpa.field_b.measureNaturalWidth((byte) 69);
          qpa.field_b.setBounds(var11, param6, -23776, var10, var9_int - 5 - var11);
          var12 = 5 + (param6 + var10);
          ClientMemoryVertexArray.field_e.setBounds(var9_int, param1, -23776, 0, 0);
          Projectile.field_r.setBounds(var9_int, var12, -23776, param1, 0);
          Projectile.field_r.field_w = Player.createScrollbarSprites(Projectile.field_r.field_t, 2105376, 3, 11579568, -112, 8421504);
          var12 = var12 + param1;
          SimpleMoveLocomotor.field_s.setBounds(var9_int, var12, -23776, -(var12 / 2) + param0, -(var9_int / 2) + param8);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "av.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void initializeArchiveServices(int param0, PlatformTaskDispatcher param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        try {
          CourseLayout.field_a = param4;
          int var9_int = -25 / ((44 - param2) / 33);
          pu.field_b = param0;
          wk.field_n = param5;
          TileGridCell.field_a = param3;
          oi.field_a = param1;
          joa.field_a = param7;
          MenuInputState.field_d = param8;
          du.field_d = param6;
          wg.field_l = (ArchiveNetworkClient) ((Object) new SocketArchiveNetworkClient());
          Projectile.field_k = new DiskCacheWorker(param1);
          IntrusiveDequeCursor.field_a = new ArchiveManager(wg.field_l, Projectile.field_k);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "av.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void floodFill(boolean param0, int param1, int param2, int param3) {
        int var7 = 0;
        if (!this.grid.isInBounds(param1, param2, (byte) -128)) {
          return;
        }
        int var5 = this.grid.getCell((byte) -5, param2, param1);
        int var6 = 0;
        if (var5 == 0) {
          var6 = 1;
        } else {
          if (var5 <= 0) {
            var7 = this.decodeDistance((byte) -121, var5);
            if (var7 > param3) {
              var6 = 1;
            }
          }
        }
        if (var6 == 0) {
          return;
        }
        this.grid.setCell(param2, this.encodeDistance(param3, 8421504), 0, param1);
        param3++;
        this.floodFill(param0, -1 + param1, param2, param3);
        this.floodFill(true, 1 + param1, param2, param3);
        this.floodFill(true, param1, param2 - 1, param3);
        this.floodFill(param0, param1, param2 + 1, param3);
    }

    private final void tracePath(int param0) {
        int var6 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.grid.getCell((byte) -5, this.field_c, this.field_d) > -100) {
          return;
        }
        var2 = this.decodeDistance((byte) -111, this.grid.getCell((byte) -5, this.field_c, this.field_d));
        var3 = var2;
        this.path = new int[var2][2];
        if (param0 <= 57) {
          this.solve(93, 41, -21, -32, -119);
        }
        var4 = this.field_d;
        var5 = this.field_c;
        for (var6 = 0; this.path.length > var6; var6++) {
          var7 = -1 + (this.path.length - var6);
          this.path[var7][0] = var4;
          this.path[var7][1] = var5;
          if (this.distanceAt(92, var5, -1 + var4) == var3 - 1) {
            var3--;
            var4--;
          } else {
            if (-1 + var3 == this.distanceAt(90, var5, var4 + 1)) {
              var3--;
              var4++;
            } else {
              if (var3 - 1 == this.distanceAt(-41, -1 + var5, var4)) {
                var5--;
                var3--;
              } else {
                if (this.distanceAt(96, var5 + 1, var4) != -1 + var3) {
                  return;
                }
                var3--;
                var5++;
              }
            }
          }
        }
        return;
    }

    final int[][] getPath(byte param0) {
        if (param0 < 120) {
          this.field_c = 94;
        }
        return this.path;
    }

    private final int encodeDistance(int param0, int param1) {
        if (param1 != 8421504) {
          this.grid = (MazeGrid) null;
        }
        return -param0 - 100;
    }

    private final int decodeDistance(byte param0, int param1) {
        if (param0 >= -25) {
          return -100;
        }
        return -param1 - 100;
    }

    final int[][] findDeadEnds(byte param0) {
        int var3_int = 0;
        int[][] var3;
        int var4;
        qja var5;
        int var5_int;
        int var6;
        int var7;
        IntrusiveDeque var8;
        int[][] var9;
        int[][] var10;
        int var4Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        var8 = new IntrusiveDeque();
        for (var3_int = 0; this.grid.width > var3_int; var3_int++) {
          for (var4 = 0; this.grid.height > var4; var4++) {
            var5_int = 0;
            if (this.isOpen(var4, var3_int, -51)) {
              if (this.isOpen(var4, -1 + var3_int, 67)) {
                var5_int++;
              }
              if (this.isOpen(var4, 1 + var3_int, 100)) {
                var5_int++;
              }
              if (this.isOpen(-1 + var4, var3_int, 124)) {
                var5_int++;
              }
              if (this.isOpen(1 + var4, var3_int, 126)) {
                var5_int++;
              }
              if (var5_int == 1) {
                var8.addLast((byte) -80, new qja(var3_int, var4));
              }
            }
          }
        }
        var10 = new int[var8.size((byte) -16)][2];
        var9 = var10;
        var3 = var9;
        if (param0 > -40) {
          return (int[][]) null;
        }
        var7 = 0;
        var4Lifetime1 = var7;
        var5 = (qja) (var8.first(-80));
        while (var5 != null) {
          var10[var7][0] = var5.field_h;
          var10[var7][1] = var5.field_g;
          var7++;
          var5 = (qja) (var8.next(125));
        }
        return var3;
    }

    public static void releaseStatics(boolean param0) {
        field_b = null;
        if (param0) {
          field_e = false;
        }
    }

    private final boolean isDistanceMark(int param0, int param1) {
        if (param0 > -104) {
          return true;
        }
        return param1 <= -100 ? true : false;
    }

    private final int distanceAt(int param0, int param1, int param2) {
        int var4 = 52 % ((26 - param0) / 61);
        if (!this.grid.isInBounds(param2, param1, (byte) -128)) {
          return 0;
        }
        int var5 = this.grid.getCell((byte) -5, param1, param2);
        if (!this.isDistanceMark(-118, var5)) {
          return 0;
        }
        return this.decodeDistance((byte) -36, var5);
    }

    final void solve(int param0, int param1, int param2, int param3, int param4) {
        this.field_c = param1;
        this.field_d = param4;
        int var6 = 1;
        this.floodFill(true, param2, param0, var6);
        if (param3 <= 79) {
          return;
        }
        this.tracePath(66);
        this.clearDistances(true);
    }

    final static LobbyGameWidget findLobbyGame(int param0, int param1) {
        if (param1 != 0) {
          MazeSolver.findLobbyGame(96, 11);
        }
        return null != WhiteLightSensorComponent.field_K ? (LobbyGameWidget) (WhiteLightSensorComponent.field_K.get(-122, (long)param0)) : null;
    }

    private final boolean isOpen(int param0, int param1, int param2) {
        if (!this.grid.isInBounds(param1, param0, (byte) -128)) {
          return true;
        }
        int var4 = 6 / ((5 - param2) / 55);
        return this.grid.getCell((byte) -5, param0, param1) == 0 ? true : false;
    }

    MazeSolver(MazeGrid param0) {
        try {
          this.grid = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "av.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Enter name of player to delete from list";
    }
}
