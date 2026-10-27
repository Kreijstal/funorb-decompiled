/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class GameplaySession {
    DynamicTerrainRenderer dynamicTerrain;
    private int field_T;
    int[][] terrainMasks;
    static String field_cc;
    private int field_sc;
    int tilesWide;
    private int field_c;
    private int field_S;
    Vector levelObjects;
    int worldHeight;
    private int[][] initialTerrainMasks;
    private int field_L;
    private va field_Ab;
    boolean field_rc;
    boolean timeHackMode;
    boolean easyMode;
    int tilesHigh;
    static int[] field_xb;
    IntrusiveDeque field_k;
    private int field_Rb;
    int field_Q;
    private int secondaryTheme;
    private int field_nc;
    private int terrainTheme;
    private byte[][] levelData;
    private ce field_Y;
    int levelIndex;
    int gameMode;
    int worldWidth;
    private IntrusiveDeque field_vb;
    private od field_Db;
    private PointCloudEffect field_Xb;
    int spawnXQ16;
    private int field_I;
    private int field_Kb;
    int shipXQ16;
    private int field_qc;
    private boolean field_lb;
    private int field_ib;
    private int field_Ob;
    private boolean field_W;
    private int field_O;
    private int field_pc;
    private int field_ac;
    private int field_E;
    private int shipVelocityXQ16;
    private int field_x;
    private int field_o;
    private int spawnYQ16;
    private int field_e;
    private boolean field_Bb;
    private int field_Tb;
    private int field_mb;
    private IntrusiveNode field_nb;
    private int field_U;
    private int field_tb;
    private int field_Sb;
    int shipYQ16;
    int field_Ub;
    private int shipVelocityYQ16;
    private int field_gc;
    private IntrusiveDeque field_G;
    int field_M;
    private int field_qb;
    boolean field_ec;
    private IntrusiveDeque field_N;
    private int field_w;
    boolean field_Jb;
    private int field_J;
    int field_Zb;
    private int field_m;
    private int field_Hb;
    boolean field_Gb;
    int score;
    private boolean field_q;
    private int field_yb;
    private int field_A;
    private IntrusiveDeque field_tc;
    boolean field_Ib;
    private boolean field_jc;
    int elapsedTicks;
    private boolean field_rb;
    private int field_pb;
    private int field_ic;
    boolean field_Cb;
    private IntrusiveDeque field_hb;
    private int field_u;
    private boolean field_kc;
    private int field_bc;
    private int field_d;
    private int[] field_g;
    private Sprite field_i;
    boolean field_a;
    private String field_h;
    int field_X;
    private int field_y;
    private int field_sb;
    private int field_Qb;
    private boolean field_db;
    private int[] field_Lb;
    private int field_l;
    private int field_dc;
    private int field_z;
    private int field_ab;
    private int field_j;
    Minimap minimap;
    private IntrusiveDeque field_s;
    private boolean field_zb;
    private hl field_f;
    private hl field_wb;
    private m field_fb;
    private hl field_v;
    private hl field_Eb;
    private hl field_Wb;
    private hl field_r;
    private IntrusiveDeque field_C;
    hl field_lc;
    private hl field_Z;
    private int field_ub;
    private hl field_jb;
    private hl field_R;
    private int field_oc;
    private boolean field_b;

    private final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var12 = EscapeVector.obfuscationControl;
        int var9 = (param5 << 5) - param1;
        if (param3 != 1395798865) {
          GameplaySession.c(true, -95);
        }
        int var10 = -param4 + (param2 << 5);
        if (var9 > 0) {
          var10 = this.b(param0, param2, -var9 + 32, -1 + param5, param7, var10, 32, 1299998021);
        }
        for (int var11 = param5; var11 < param6; var11++) {
          var10 = this.b(param0, param2, 0, var11, param7, var10, 32, 1299998021);
        }
        int var11Lifetime1 = 31 & -var9 + 480;
        if (var11Lifetime1 > 0) {
          int discarded$0 = this.b(param0, param2, 0, param6, param7, var10, var11Lifetime1, 1299998021);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        IntrusiveNode var21_ref_hg = null;
        int var21 = 0;
        int var22 = 0;
        int stackIn_11_0Lifetime1;
        int stackIn_11_1Lifetime1;
        Object var27 = null;
        Object var29 = null;
        int var24 = EscapeVector.obfuscationControl;
        int[] var30 = this.a(param14, -1, param8);
        int[] var28 = var30;
        int[] var26 = var28;
        int[] var16 = var26;
        if (param1 < 78) {
          pi var25 = (pi) null;
          this.a((pi) null, -78);
        }
        if (var26 == null &&
          vh.field_i == 0) {
          return;
        }
        param8 = param8 << 16;
        param14 = param14 << 16;
        int var17 = param11;
        while (true) {
          int stackIn_8_0 = param9;
          int stackIn_8_1 = var17;
          if (stackIn_8_0 < stackIn_8_1) {
            return;
          }
          int var18 = param7;
          while (true) {
            int stackIn_11_0 = ~var18;
            int stackIn_11_1 = ~param2;
            if (stackIn_11_0 < stackIn_11_1) {
              var17++;
              break;
            }
            int var19 = (var18 << 11) + param8;
            int var20 = param14 + (var17 << 11);
            int stackIn_8_0Lifetime1 = (param13 - param12) * (var20 - param3);
            int stackIn_8_1Lifetime1 = (-param12 + var19) * (-param3 + param4);
            if (stackIn_8_0Lifetime1 <= stackIn_8_1Lifetime1) {
              if (((param13 - param10) * (var20 - param6)) > ((param4 - param6) * (-param10 + var19)) &&
                (-param10 + param12) * (var20 - param6) < (param3 - param6) * (-param10 + var19)) {
                var21_ref_hg = IntrusiveDeque.field_f.first(false);
                for (var22 = 0; vh.field_i > var22; var22++) {
                  am var29_ref = (am) (var21_ref_hg);
                  stackIn_11_0Lifetime1 = ~var20;
                  stackIn_11_1Lifetime1 = ~var29_ref.field_j;
                  if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                    var29_ref.field_i <= var19 &&
                    var29_ref.field_h > var19) {
                    this.field_q = true;
                    return;
                  }
                  var21_ref_hg = var21_ref_hg.next;
                }
                if (!this.field_rb &&
                  var26 != null &&
                  this.a(var30, var18, (byte) -74, var17)) {
                  if ((255 & 24 + this.field_I) > 48) {
                    this.field_q = true;
                    return;
                  }
                  if (65536 < (this.shipVelocityXQ16 >> 8) * (this.shipVelocityXQ16 >> 8) + (this.shipVelocityYQ16 >> 8) * (this.shipVelocityYQ16 >> 8)) {
                    this.field_q = true;
                    return;
                  }
                  var21 = -param10 + var19;
                  var22 = -param6 + var20;
                  if (var22 * var22 + var21 * var21 >= 150994944) {
                    this.field_q = true;
                    return;
                  }
                  this.field_kc = true;
                }
              }
            } else if (((var19 - param0) * (-param5 + param4)) > ((-param5 + var20) * (-param0 + param13)) &&
              ((-param5 + param3) * (-param0 + var19)) < ((-param0 + param12) * (var20 - param5))) {
              var21_ref_hg = IntrusiveDeque.field_f.first(false);
              for (var22 = 0; vh.field_i > var22; var22++) {
                am var27_ref = (am) (var21_ref_hg);
                stackIn_11_0Lifetime1 = ~var20;
                stackIn_11_1Lifetime1 = ~var27_ref.field_j;
                if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                  var19 >= var27_ref.field_i &&
                  var27_ref.field_h > var19) {
                  this.field_q = true;
                  return;
                }
                var21_ref_hg = var21_ref_hg.next;
              }
              if (!this.field_rb &&
                var26 != null &&
                this.a(var30, var18, (byte) -74, var17)) {
                if ((255 & this.field_I + 24) > 48) {
                  this.field_q = true;
                  return;
                }
                if ((this.shipVelocityYQ16 >> 8) * (this.shipVelocityYQ16 >> 8) + (this.shipVelocityXQ16 >> 8) * (this.shipVelocityXQ16 >> 8) > 65536) {
                  this.field_q = true;
                  return;
                }
                var21 = var19 - param0;
                var22 = -param5 + var20;
                if (var21 * var21 + var22 * var22 < 150994944) {
                  this.field_jc = true;
                } else {
                  this.field_q = true;
                  return;
                }
              }
            }
            var18++;
          }
        }
    }

    private final void b(int param0, byte param1) {
        if (10 != param0) {
          return;
        }
        this.field_lb = true;
        af.a(0);
        this.a(-128, hd.field_a);
        if (param1 != 59) {
          this.field_oc = -54;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        if ((param4 ^ param6) >> 5 == 0) {
          this.a(param11, 94, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, param6 & 31, param1, param8, param6 >> 5);
        } else {
          this.a(param11, 106, param9, param3, param0, param10, param13, param5, param12, 31, param2, 31 & param6, param1, param8, param6 >> 5);
          if (this.field_q) {
            return;
          }
          this.a(param11, 104, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, 0, param1, param8, param4 >> 5);
        }
        int var15 = -29 / ((param7 - 71) / 38);
    }

    private final int b(int param0, int param1) {
        if (param1 != 16082) {
          return -27;
        }
        return (param0 & 65280) >> 8;
    }

    final void D(int param0) {
        if (param0 >= this.tilesHigh) {
          int var2 = param0 + 1;
          int[][] var3 = new int[this.tilesWide * var2][];
          for (int var4 = 0; var4 < this.tilesWide * this.tilesHigh; var4++) {
            var3[var4] = this.terrainMasks[var4];
          }
          int var5 = this.tilesWide * this.tilesHigh;
          int var4Lifetime1 = var5;
          while (var5 < this.tilesWide * var2) {
            var3[var5] = QuickChatPhraseDefinition.fullTileMask;
            var5++;
          }
          this.tilesHigh = var2;
          this.worldHeight = this.tilesHigh << 5;
          this.terrainMasks = var3;
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        vh var7_ref;
        param1 = ((this.worldWidth << 16) + param1) % (this.worldWidth << 16);
        if (this.field_O != 0 &&
          ~this.field_O != ~this.field_x) {
          Object var7 = null;
          if (this.field_nb != null) {
            var7_ref = (vh) (this.field_nb.next);
          } else {
            var7_ref = (vh) (this.field_G.first(false));
          }
          var7_ref.a(param1, false, param5, param2, (byte) -124, param4, param0, 250);
          this.field_x = this.field_x + 1;
          this.field_nb = (IntrusiveNode) ((Object) var7_ref);
        } else {
          IntrusiveNode var8 = (IntrusiveNode) ((Object) new vh(param1, param0, param5, param2, param4, 250));
          this.field_G.addLast(-12328, var8);
          this.field_O = this.field_O + 1;
          this.field_x = this.field_x + 1;
          this.field_nb = var8;
        }
        if (param3 != 256) {
          this.D(-37);
        }
    }

    private final void loadTerrain(boolean headerOnly, int formatVersion, int guard, DataInputStream input) throws IOException {
        TerrainMap var5 = new TerrainMap(input, formatVersion);
        vl.b(1, var5.terrainTheme);
        if (guard != 640) {
          this.x(-13);
        }
        this.terrainTheme = var5.terrainTheme;
        this.secondaryTheme = var5.secondaryTheme;
        if (headerOnly) {
          return;
        }
        try {
          this.terrainMasks = var5.tileMasks;
          this.worldWidth = var5.pixelWidth;
          this.worldHeight = var5.pixelHeight;
          this.tilesWide = var5.tilesWide;
          this.tilesHigh = var5.tilesHigh;
          this.snapshotTerrain((byte) 111);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.SF(" + headerOnly + ',' + formatVersion + ',' + guard + ',' + (input != null ? "{...}" : "null") + ')');
        }
    }

    private final void t(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        ce.field_f.c(0, this.gameMode, this.levelIndex);
        this.o(0);
        if (this.levelIndex == 15 &&
          this.field_Rb <= 0) {
          if (90000 >= this.elapsedTicks) {
            this.a(this.gameMode, false, 9, 246);
          }
          if (this.elapsedTicks <= 60000) {
            this.a(this.gameMode, false, 10, 245);
          }
        }
        if (this.field_ac > 2500) {
          this.a(this.gameMode, false, 6, 249);
        }
        if (this.field_b) {
          this.a(this.gameMode, false, 7, 248);
        }
        if (param0 == this.levelIndex &&
          1700 == this.field_ib) {
          this.a(this.gameMode, false, 13, 242);
        }
        if (9 == this.levelIndex &&
          !this.field_db &&
          this.field_m < 0) {
          this.a(this.gameMode, false, 14, 241);
        }
        if (this.levelIndex == 10) {
          int var2 = 0;
          int var3 = 0;
          while (true) {
            if (var3 < this.levelObjects.size()) {
              LevelObject var4 = (LevelObject) (this.levelObjects.elementAt(var3));
              int stackIn_28_0 = var4.objectType;
              int stackIn_28_1 = 2;
              if (stackIn_28_0 == stackIn_28_1) {
                var2++;
              }
              var3++;
              continue;
            }
            int stackIn_28_0Lifetime1 = 8;
            int stackIn_28_1Lifetime1 = var2;
            if (stackIn_28_0Lifetime1 > stackIn_28_1Lifetime1) {
              break;
            }
            this.a(this.gameMode, false, 15, 240);
            break;
          }
        }
        if (this.levelIndex == 14 &&
          !this.field_db) {
          this.a(this.gameMode, false, 16, 239);
        }
    }

    final int b(int param0, int param1, int param2, int param3) {
        int var6 = EscapeVector.obfuscationControl;
        param1 = param1 - this.shipXQ16;
        param3 = param3 - this.shipYQ16;
        while (-this.worldWidth << 15 > param1) {
          param1 = param1 + (this.worldWidth << 16);
        }
        while (this.worldWidth << 15 < param1) {
          param1 = param1 - (this.worldWidth << 16);
        }
        int var5 = (int)Math.sqrt((double)param3 * (double)param3 + (double)param1 * (double)param1);
        if (var5 <= param0) {
          return qm.field_c * 6144 / 64;
        }
        if (param2 != 96) {
          am var7 = (am) null;
          this.a((am) null, (byte) 83);
        }
        return qm.field_c * param0 / (var5 / 96);
    }

    private final String d(boolean param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        if (param0) {
          return (String) null;
        }
        String var3 = "";
        if (this.field_tb == 0 &&
          param1 == 1) {
          var3 = ef.field_k;
        } else if (param1 == 1) {
          var3 = Minimap.field_p;
        } else if (this.field_tb == 0 &&
          param1 == 5) {
          var3 = dd.field_b;
        } else if (5 == param1) {
          var3 = af.field_g;
        }
        return var3;
    }

    private final void a(int param0, boolean param1) {
        this.stopSessionAudio((byte) -41);
        this.field_vb.clear((byte) 118);
        this.field_Db = new od(this);
        this.field_Xb.f((byte) -125);
        if (param0 != 24661) {
          hh var4 = (hh) null;
          this.a(-10, -80, (Sprite) null, 116, (hh) null);
        }
        ji.a(true);
        this.field_pc = 0;
        this.field_qc = 0;
        this.field_tc = new IntrusiveDeque();
        this.field_sb = 0;
    }

    private final void c(int param0) {
        if (this.field_ab > param0) {
          this.field_ab = this.field_ab - 1;
          if (0 == this.field_ab) {
            this.field_h = null;
          }
        }
        if (this.field_h == null) {
          rb var2 = this.B(-27521);
          if (var2 == null) {
            return;
          }
          this.field_h = var2.field_g;
          this.field_ab = var2.field_i;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        this.field_C.addFirst(new am(param2, param0, param1), 8364);
        if (param3 != 2134602960) {
          this.field_j = 65;
        }
        this.field_ub = this.field_ub + 1;
    }

    private final LevelObject a(DataInputStream param0, byte param1, int param2, int param3) throws IOException {
        LevelObject var5 = null;
        String stackIn_15_2 = null;
        try {
          int var6 = param0.readUnsignedByte();
          if (param3 < 2 &&
            var6 >= 8) {
            var6++;
          }
          int var7 = param0.readUnsignedShort();
          int var8 = -8 / ((param1 + 7) / 47);
          int var9 = param0.readUnsignedShort();
          if (param3 < 5) {
            var5 = new LevelObject(param2, var6, var7, var9);
          } else {
            var5 = this.a(param0, var7, param3, false, var6, var9, param2);
          }
          if (var6 == 2 &&
            11 > param3) {
          }
          LevelObject stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var5_ref;
          StringBuilder stackIn_14_1 = new StringBuilder().append("oe.IF(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void v(int param0) {
        if (this.gameMode != 2) {
          return;
        }
        if (null == ua.field_c) {
          return;
        }
        if (!ua.field_c.c(115)) {
          return;
        }
        int var3 = 28;
        int var4 = var3 ^ 255;
        this.a(this.gameMode, false, var3, var4);
        if (param0 != -33) {
          this.field_O = -80;
        }
    }

    private final int a(uk param0, byte param1, int param2, int param3) {
        String stackIn_20_2 = null;
        try {
          IntPoint var12 = param0.field_e;
          IntPoint var6 = param0.field_d;
          IntPoint var7 = param0.field_k;
          IntPoint var8 = param0.field_c;
          if (param1 != 15) {
            this.field_kc = false;
          }
          IntPoint var9 = param0.field_g;
          int var10 = var12.x + param3 << 11;
          int var11 = param2 + var12.y << 11;
          if (((var10 - var6.x) * (-var6.y + var7.y)) < ((-var6.x + var7.x) * (var11 - var6.y))) {
            if ((var7.y - var8.y) * (-var8.x + var10) > (-var8.y + var11) * (var7.x - var8.x) &&
              ((var6.y - var8.y) * (-var8.x + var10)) < ((-var8.y + var11) * (-var8.x + var6.x))) {
              int stackIn_6_0 = 1;
              return stackIn_6_0;
            }
            int stackIn_8_0 = 0;
            return stackIn_8_0;
          }
          if ((-var9.y + var7.y) * (-var9.x + var10) >= (var11 - var9.y) * (-var9.x + var7.x)) {
            return 0;
          }
          if ((var11 - var9.y) * (var6.x - var9.x) < (var6.y - var9.y) * (var10 - var9.x)) {
            int stackIn_14_0 = -1;
            return stackIn_14_0;
          }
          int stackIn_16_0 = 0;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var5;
          StringBuilder stackIn_19_1 = new StringBuilder().append("oe.RF(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void snapshotTerrain(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        this.field_nc = this.tilesHigh;
        if (guard <= 110) {
          return;
        }
        this.initialTerrainMasks = new int[this.terrainMasks.length][];
        for (int var2 = 0; this.terrainMasks.length > var2; var2++) {
          if (this.terrainMasks[var2] != null &&
            this.terrainMasks[var2] != QuickChatPhraseDefinition.fullTileMask) {
            this.initialTerrainMasks[var2] = new int[32];
            for (int var3 = 0; var3 < 32; var3++) {
              this.initialTerrainMasks[var2][var3] = this.terrainMasks[var2][var3];
            }
          } else {
            this.initialTerrainMasks[var2] = this.terrainMasks[var2];
          }
        }
    }

    private final void a(byte param0) {
        if (this.field_Gb &&
          this.field_A == 0) {
          Sprite var2_ref_ed = ij.field_g;
          int var3 = -var2_ref_ed.fullWidth + 640 >> 1;
          int var4 = 480 - var2_ref_ed.fullHeight >> 1;
          if (this.field_a &&
            this.field_X < 0) {
            int var5 = 1;
            var2_ref_ed.a(var3, var4, var5);
          } else {
            var2_ref_ed.e(var3, var4);
          }
        }
        int var2 = -51 % ((-2 - param0) / 46);
    }

    private final void a(int param0) {
        Throwable decompiledCaughtException = null;
        int var5 = EscapeVector.obfuscationControl;
        pl.field_n.b(this.field_jb);
        pl.field_n.b(this.field_Z);
        pl.field_n.b(this.field_v);
        if (null != this.field_R) {
          pl.field_n.b(this.field_R);
        }
        if (null != this.field_f) {
          pl.field_n.b(this.field_f);
        }
        if (this.field_Eb != null) {
          this.field_Eb.h(0);
        }
        pl.field_n.b(this.field_Wb);
        pl.field_n.b(this.field_wb);
        pl.field_n.b(this.field_r);
        pl.field_n.b(this.field_lc);
        pl.field_n.b(this.field_fb);
        Object var2 = pl.field_n;
        synchronized (var2) {
          pi var3 = (pi) (this.field_hb.first(false));
          while (true) {
            if (var3 != null) {
              int stackIn_15_0 = var3.field_r;
              if (stackIn_15_0 != 0) {
                pl.field_n.b(var3.field_o);
              }
              var3 = (pi) (this.field_hb.next((byte) 70));
              continue;
            }
            break;
          }
          int stackIn_15_0Lifetime1 = param0;
          if (stackIn_15_0Lifetime1 <= 60) {
            this.a(93, 112, 30, 56, 98, -40, 38, -71);
          }
          ic var3_ref = (ic) (this.field_N.first(false));
          while (var3_ref != null) {
            if (null != var3_ref.field_g) {
              pl.field_n.b(var3_ref.field_g);
              pl.field_n.b(var3_ref.field_m);
            }
            var3_ref = (ic) (this.field_N.next((byte) 70));
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, Sprite param3) {
        String stackIn_58_2 = null;
        int var31 = EscapeVector.obfuscationControl;
        try {
          param2 = param2 + param3.offsetX;
          param1 = param1 + param3.offsetY;
          int var5_int = param3.width + param2 - 1;
          int var6 = -1 + (param3.height + param1);
          double var7 = (double)this.field_I * 0.02454369260617026;
          int var9 = (int)(2048.0 * Math.sin(var7));
          int var10 = -(int)(2048.0 * Math.cos(var7));
          int var11 = -var10;
          int var12 = var9;
          if (param0) {
            this.worldHeight = 6;
          }
          int var13 = this.shipXQ16 >> 5;
          var13 = var13 + (this.worldWidth << 11);
          int var14 = this.shipYQ16 >> 5;
          int var15 = var13 + var9 * 10;
          int var16 = var13 - 2 * var9;
          int var17 = var14 + var10 * 10;
          int var18 = var14 - var10 * 2;
          int var19 = var13 + (-(var9 * 6) - 8 * var11);
          int var20 = -(var9 * 6) + var13 + var11 * 8;
          int var21 = -(6 * var10) + var14 - var12 * 8;
          int var22 = var12 * 8 + (var14 - 6 * var10);
          int var23 = var15;
          if (var23 > var19) {
            var23 = var19;
          }
          if (var20 < var23) {
            var23 = var20;
          }
          int var24 = var17;
          if (var24 > var21) {
            var24 = var21;
          }
          if (var22 < var24) {
            var24 = var22;
          }
          int var25 = var15;
          if (var25 < var19) {
            var25 = var19;
          }
          if (var25 < var20) {
            var25 = var20;
          }
          int var26 = var17;
          if (var21 > var26) {
            var26 = var21;
          }
          var23 = var23 >> 11;
          var25 = var25 >> 11;
          if (var26 < var22) {
            var26 = var22;
          }
          var24 = var24 >> 11;
          if (var24 < param1) {
            var24 = param1;
          }
          if (var5_int < var25) {
            var25 = var5_int;
          }
          if (var23 < param2) {
            var23 = param2;
          }
          var26 = var26 >> 11;
          if (var26 > var6) {
            var26 = var6;
          }
          int var27 = var24;
          while (true) {
            int stackIn_35_0 = var26;
            int stackIn_35_1 = var27;
            if (stackIn_35_0 < stackIn_35_1) {
              return false;
            }
            for (int var28 = var23; var25 >= var28; var28++) {
              int stackIn_35_0Lifetime1 = 0;
              int stackIn_35_1Lifetime1 = param3.pixels[-param2 + ((var27 - param1) * param3.width + var28)];
              if (stackIn_35_0Lifetime1 != stackIn_35_1Lifetime1) {
                int var29 = var28 << 11;
                int var30 = var27 << 11;
                if (((var30 - var18) * (-var16 + var15)) > ((-var16 + var29) * (var17 - var18))) {
                  if ((var17 - var22) * (var29 - var20) > (var30 - var22) * (-var20 + var15) &&
                    (var16 - var20) * (var30 - var22) > (-var22 + var18) * (-var20 + var29)) {
                    return true;
                  }
                } else if ((-var21 + var17) * (-var19 + var29) < (-var19 + var15) * (var30 - var21) &&
                  ((-var19 + var16) * (var30 - var21)) < ((var29 - var19) * (var18 - var21))) {
                  return true;
                }
              }
            }
            var27++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_57_0 = var5;
          StringBuilder stackIn_57_1 = new StringBuilder().append("oe.UE(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    private final IntrusiveNode a(IntrusiveNode param0, int param1, int param2, boolean param3, int param4) {
        am var6_ref = null;
        String stackIn_14_2 = null;
        try {
          if (!param3) {
            this.field_S = -120;
          }
          if (aa.field_a != 0 &&
            ~vh.field_i != ~aa.field_a) {
            Object var6 = null;
            if (param0 == null) {
              var6_ref = (am) (IntrusiveDeque.field_f.first(false));
            } else {
              var6_ref = (am) (param0.next);
            }
            vh.field_i = vh.field_i + 1;
            var6_ref.field_j = param4;
            var6_ref.field_h = param1;
            var6_ref.field_i = param2;
            am stackIn_8_0 = var6_ref;
            return (IntrusiveNode) ((Object) stackIn_8_0);
          }
          am var6_refLifetime1 = new am(param2, param1, param4);
          IntrusiveDeque.field_f.addLast(-12328, var6_refLifetime1);
          aa.field_a = aa.field_a + 1;
          vh.field_i = vh.field_i + 1;
          am stackIn_10_0 = var6_refLifetime1;
          return (IntrusiveNode) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref2 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var6_ref2;
          StringBuilder stackIn_13_1 = new StringBuilder().append("oe.BD(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(int param0, Sprite param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        String stackIn_37_2 = null;
        Object var18 = null;
        int var19 = EscapeVector.obfuscationControl;
        try {
          int[] var22 = this.a(param6, param4, param3);
          int[] var21 = var22;
          int[] var20 = var21;
          int[] var11 = var20;
          if (var20 == null &&
            0 == vh.field_i) {
            return false;
          }
          param6 = param6 << 5;
          param3 = param3 << 5;
          int var12 = param5;
          while (true) {
            int stackIn_8_0 = ~param7;
            int stackIn_8_1 = ~var12;
            if (stackIn_8_0 > stackIn_8_1) {
              return false;
            }
            int var13 = param2;
            while (true) {
              int stackIn_11_0 = param8;
              int stackIn_11_1 = var13;
              if (stackIn_11_0 < stackIn_11_1) {
                var12++;
                break;
              }
              int var14 = param9 + var13;
              int var15 = var12 + param0;
              int stackIn_8_0Lifetime1 = -1;
              int stackIn_8_1Lifetime1 = ~param1.pixels[param1.width * var15 + var14];
              if (stackIn_8_0Lifetime1 != stackIn_8_1Lifetime1) {
                IntrusiveNode var16 = IntrusiveDeque.field_f.first(false);
                for (int var17 = 0; vh.field_i > var17; var17++) {
                  am var18_ref = (am) (var16);
                  int stackIn_11_0Lifetime1 = var12 + param6;
                  int stackIn_11_1Lifetime1 = var18_ref.field_j;
                  if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                    (var13 + param3) >= var18_ref.field_i &&
                    (var13 + param3) < var18_ref.field_h) {
                    return true;
                  }
                  var16 = var16.next;
                }
                if (var20 != null &&
                  this.a(var22, var13, (byte) -74, var12)) {
                  return true;
                }
              }
              var13++;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var11_ref = decompiledCaughtException;
          RuntimeException stackIn_36_0 = var11_ref;
          StringBuilder stackIn_36_1 = new StringBuilder().append("oe.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final void x(int param0) {
        if (ua.field_c.b(15954, this.gameMode, this.levelIndex)) {
          ua.field_c.a(-15748, this.gameMode, this.levelIndex, oj.k(64));
        }
        if (param0 != 6324320) {
          this.b((byte) 87, 37);
        }
    }

    private final void A(byte param0) {
        Object var25 = null;
        int var26 = EscapeVector.obfuscationControl;
        double var2 = (double)this.field_I * 0.02454369260617026;
        int var4 = (int)(Math.sin(var2) * 2048.0);
        int var5 = -(int)(Math.cos(var2) * 2048.0);
        int var6 = -var5;
        int var7 = var4;
        int var8 = this.shipXQ16 >> 5;
        var8 = var8 + (this.worldWidth << 11);
        int var9 = this.shipYQ16 >> 5;
        int var10 = var4 * 10 + var8;
        int var11 = -(2 * var4) + var8;
        int var12 = var5 * 10 + var9;
        int var13 = 26 / ((-43 - param0) / 47);
        int var14 = var9 - var5 * 2;
        int var15 = -(8 * var6) + (-(6 * var4) + var8);
        int var16 = var6 * 8 + (var8 - var4 * 6);
        int var17 = -(8 * var7) + (var9 - var5 * 6);
        int var18 = -(var5 * 6) + (var9 + 8 * var7);
        int var19 = var10;
        if (var19 > var15) {
          var19 = var15;
        }
        if (var16 < var19) {
          var19 = var16;
        }
        int var20 = var12;
        if (var17 < var20) {
          var20 = var17;
        }
        if (var20 > var18) {
          var20 = var18;
        }
        int var21 = var10;
        if (var21 < var15) {
          var21 = var15;
        }
        if (var21 < var16) {
          var21 = var16;
        }
        int var22 = var12;
        if (var17 > var22) {
          var22 = var17;
        }
        var21 = var21 >> 11;
        var19 = var19 >> 11;
        if (var22 < var18) {
          var22 = var18;
        }
        var20 = var20 >> 11;
        var22 = var22 >> 11;
        this.a(94, var22, var20, var19, var21);
        IntrusiveNode var23 = IntrusiveDeque.field_f.first(false);
        for (int var24 = 0; vh.field_i > var24; var24++) {
          am var25_ref = (am) (var23);
          var23 = var23.next;
          var25_ref.field_i = var25_ref.field_i << 11;
          var25_ref.field_h = var25_ref.field_h << 11;
          var25_ref.field_j = var25_ref.field_j << 11;
        }
        if (this.field_rb &&
          vh.field_i == 0) {
          return;
        }
        if ((var21 ^ var19) >> 5 != 0) {
          this.a(var12, var11, var15, var14, var22, 31 & var19, var20, -5, var10, 31, var18, var16, var19 >> 5, var17);
          if (this.field_q) {
            return;
          }
          this.a(var12, var11, var15, var14, var22, 0, var20, 112, var10, 31 & var21, var18, var16, var21 >> 5, var17);
        } else {
          this.a(var12, var11, var15, var14, var22, 31 & var19, var20, -98, var10, var21 & 31, var18, var16, var19 >> 5, var17);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        if ((param0 ^ param6) >> 5 != 0) {
          this.a(param4, 31 & param0, param1, param2, param0 >> 5, param3, (byte) 119, param7, 31);
          this.a(param4, 0, param1, param2, param6 >> 5, param3, (byte) 123, param7, 31 & param6);
        } else {
          this.a(param4, 31 & param0, param1, param2, param0 >> 5, param3, (byte) 123, param7, 31 & param6);
        }
        if (!param5) {
          this.field_y = 64;
        }
    }

    private final void a(byte param0, DataInputStream param1, int param2) throws IOException {
        try {
          if (param2 < 3) {
            this.spawnYQ16 = -8388608;
            this.spawnXQ16 = this.worldWidth << 15;
            this.field_U = 2500;
          } else {
            this.spawnXQ16 = param1.readInt();
            this.spawnYQ16 = param1.readInt();
            this.field_U = param1.readInt();
            if (this.field_U <= 0) {
              this.field_U = 2500;
            }
          }
          int var4_int = -29 / ((79 - param0) / 37);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = EscapeVector.obfuscationControl;
        if (param5 != 0) {
          return true;
        }
        while (param0 > 0) {
          while (0 > param3) {
            param3 = param3 + (this.worldWidth << 16);
          }
          while (param3 >= this.worldWidth << 16) {
            param3 = param3 - (this.worldWidth << 16);
          }
          int var7 = param3 >> 16;
          int var8 = param2 >> 16;
          int var9 = var7 & 31;
          var7 = var7 >> 5;
          int var10 = var8 & 31;
          var8 = var8 >> 5;
          if (var8 >= 0) {
            if (var8 >= this.tilesHigh) {
              return false;
            }
            int[] var11 = this.terrainMasks[var7 + var8 * this.tilesWide];
            if (var11 != null && (var11 == QuickChatPhraseDefinition.fullTileMask ||
              (var11[var10] & 1 << var9) != 0)) {
              return false;
            }
          }
          param2 = param2 + param1;
          param0--;
          param3 = param3 + param4;
        }
        return true;
    }

    private final boolean i(int param0) {
        int var2 = 92 / ((param0 + 57) / 36);
        if (this.field_l == 0) {
          return false;
        }
        if (0 == this.field_Q &&
          this.field_l == 1) {
          return true;
        }
        if (this.field_Q != 1) {
          return false;
        }
        if (this.field_l == 2) {
          return true;
        }
        return false;
    }

    private final void a(int param0, int param1, Sprite param2, int param3, hh param4) {
        if (param1 != -28311553) {
          return;
        }
        try {
          boolean var6_int = (this.usesDynamicTerrain(8192));
          PointCloudEffect var7 = ci.a((byte) -43, param4, param3, param2, (var6_int), param0);
          this.field_vb.addLast(-12328, var7);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void u(int param0) {
        if (param0 != -15474) {
          this.b(-86, -60, (byte) -9);
          return;
        }
    }

    private final int a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int[] param8) {
        String stackIn_55_2 = null;
        int var17 = EscapeVector.obfuscationControl;
        try {
          if (param3) {
            this.field_j = -67;
          }
          regionExit1: {
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            int[] var23 = this.a(param7, (byte) -82, param1);
            int[] var21 = var23;
            int[] var18 = var21;
            int[] var10 = var18;
            int[] var22 = this.a(param1, -1, param7);
            int[] var20 = var22;
            int[] var11 = var20;
            if (var18 == null) {
              param0 = param0 + 640 * (-param6 + param4);
              for (int var12 = param5; param2 > var12; var12++) {
                param8[var12] = ae.a(255, (param7 << 5) + var12);
              }
            } else {
              int[] var12_ref_int__ = dd.field_a[this.terrainTheme].pixels;
              if (var18 == QuickChatPhraseDefinition.fullTileMask) {
                int var13 = param6;
                while (true) {
                  int stackIn_7_0 = var13;
                  int stackIn_7_1 = param4;
                  if (stackIn_7_0 >= stackIn_7_1) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  boolean var14 = false;
                  for (int var15 = param5; var15 < param2; var15++) {
                    int stackIn_7_0Lifetime1 = param8[var15];
                    int stackIn_7_1Lifetime1 = 3840;
                    if (stackIn_7_0Lifetime1 < stackIn_7_1Lifetime1) {
                      if (0 <= var15 + param0 &&
                        var11 != null && (QuickChatPhraseDefinition.fullTileMask == var11 ||
                        0 != (var22[var13] >>> var15 & 1))) {
                        int var16 = var12_ref_int__[param8[var15]];
                        if (var16 != 0) {
                          SoftwareRasterizer.pixels[param0 + var15] = var16;
                        }
                      }
                      var14 = true;
                      param8[var15] = param8[var15] + 256;
                    }
                  }
                  if (!var14) {
                    param0 = param0 + 640 * (-var13 + param4);
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  param0 += 640;
                  var13++;
                }
              }
              if (decompiledFrameCompleted1 &&
                decompiledFrameCompleted0) {
                int var13Lifetime1 = param6;
                while (true) {
                  int stackIn_28_0 = ~var13Lifetime1;
                  int stackIn_28_1 = ~param4;
                  if (stackIn_28_0 <= stackIn_28_1) {
                    break;
                  }
                  int var14Lifetime1 = var23[var13Lifetime1];
                  int var19 = param5;
                  int var15Lifetime1 = var19;
                  while (var19 < param2) {
                    int stackIn_28_0Lifetime1 = -1;
                    int stackIn_28_1Lifetime1 = ~(1 & var14Lifetime1 >>> var19);
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_28_0Lifetime1 == stackIn_28_1Lifetime1) {
                      param8[var19] = ae.a(var19 + (param7 << 5), 255);
                    } else if (param8[var19] < 3840) {
                      if (param0 + var19 >= 0 &&
                        var11 != null) {
                        if (QuickChatPhraseDefinition.fullTileMask != var11 &&
                          (1 & var22[var13Lifetime1] >>> var19) == 0) {
                          param8[var19] = param8[var19] + 256;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          int var16Lifetime1 = var12_ref_int__[param8[var19]];
                          if (var16Lifetime1 != 0) {
                            SoftwareRasterizer.pixels[param0 + var19] = var16Lifetime1;
                          }
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        param8[var19] = param8[var19] + 256;
                      }
                    }
                    var19++;
                  }
                  param0 += 640;
                  var13Lifetime1++;
                }
              }
            }
          }
          int stackIn_51_0 = param0;
          return stackIn_51_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_54_0 = var10_ref;
          StringBuilder stackIn_54_1 = new StringBuilder().append("oe.SD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    private final void m(int param0) {
        if (!hi.a(this.gameMode, -2)) {
          return;
        }
        if (this.levelIndex == 0) {
          LevelObject.a(1, (byte) -86);
        }
        if (this.levelIndex == 0) {
          DialogueScreen var3 = new DialogueScreen(BoundedRandomAccessFile.field_c, ae.field_c, se.field_a, false);
          re.a(1820, var3);
        }
        if (2 == this.levelIndex) {
          DialogueScreen var4 = new DialogueScreen(bg.field_c, ae.field_c, ae.field_e, false);
          re.a(1820, var4);
        }
        if (4 == this.levelIndex) {
          DialogueScreen var5 = new DialogueScreen(DynamicTerrainRenderer.field_i, ae.field_c, co.field_e, false);
          re.a(1820, var5);
        }
        if (param0 == ~this.levelIndex) {
          DialogueScreen var6 = new DialogueScreen(bj.field_F, ae.field_c, me.field_g, false);
          re.a(param0 + 1829, var6);
        }
        if (this.levelIndex == 12) {
          DialogueScreen var7 = new DialogueScreen(vl.field_c, ae.field_c, tl.field_t, false);
          re.a(1820, var7);
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var25 = EscapeVector.obfuscationControl;
        double var4 = 0.02454369260617026 * (double)this.field_I;
        int var6 = (int)(2048.0 * Math.sin(var4));
        int var7 = -(int)(Math.cos(var4) * 2048.0);
        int var8 = -var7;
        int var9 = var6;
        int var10 = this.shipXQ16 >> 5;
        var10 = var10 + (this.worldWidth << 11);
        int var11 = this.shipYQ16 >> 5;
        int var12 = var6 * 10 + var10;
        int var13 = -(2 * var6) + var10;
        int var14 = var11 + var7 * 10;
        int var15 = var11 - var7 * 2;
        int var16 = var10 - 6 * var6 - var8 * 8;
        int var17 = var8 * 8 + var10 - 6 * var6;
        int var18 = -(var9 * 8) + (var11 - var7 * 6);
        int var19 = -(6 * var7) + (var11 + 8 * var9);
        int var20 = 48 % ((param0 - 62) / 40);
        int var21 = var12;
        if (var16 < var21) {
          var21 = var16;
        }
        if (var21 > var17) {
          var21 = var17;
        }
        int var22 = var14;
        if (var22 > var18) {
          var22 = var18;
        }
        if (var19 < var22) {
          var22 = var19;
        }
        int var23 = var12;
        if (var16 > var23) {
          var23 = var16;
        }
        if (var17 > var23) {
          var23 = var17;
        }
        int var24 = var14;
        if (var18 > var24) {
          var24 = var18;
        }
        if (var24 < var19) {
          var24 = var19;
        }
        param2 = param2 << 11;
        param1 = param1 << 11;
        while (var21 > param2) {
          param2 = param2 + (this.worldWidth << 11);
        }
        if (var23 >= param2 &&
          param1 >= var22 &&
          var24 >= param1) {
          if ((param2 - var13) * (var14 - var15) < (var12 - var13) * (param1 - var15)) {
            if ((param2 - var17) * (-var19 + var14) > (-var19 + param1) * (-var17 + var12) &&
              (var13 - var17) * (param1 - var19) > (-var17 + param2) * (var15 - var19)) {
              this.h((byte) -118);
              return true;
            }
          } else if ((-var16 + param2) * (-var18 + var14) < (-var18 + param1) * (-var16 + var12)) {
            if (((param1 - var18) * (-var16 + var13)) >= ((-var16 + param2) * (-var18 + var15))) {
              return false;
            }
            this.h((byte) -62);
            return true;
          }
          return false;
        }
        return false;
    }

    private final boolean n(byte param0) {
        if (param0 < 26) {
          return false;
        }
        boolean var2 = true;
        if (6 == this.secondaryTheme) {
          var2 = (fg.c(0));
        }
        var2 = ((var2) & mm.a(4, this.terrainTheme));
        return (var2);
    }

    final int m(byte param0) {
        if (4 > this.levelIndex) {
          return 0;
        }
        if (this.levelIndex < 12) {
          return 1;
        }
        if (param0 != -84) {
          return -54;
        }
        return 2;
    }

    private final void a(byte[] param0, int param1) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              this.loadLevelStream((InputStream) ((Object) new ByteArrayInputStream(param0)), false);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var3 = (IOException) (Object) decompiledCaughtException;
            }
            if (param1 < 36) {
              this.field_Db = (od) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var3_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("oe.OD(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean k(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.field_Ub >= 0 &&
          0 == this.field_e) {
          Sprite var8 = mb.field_f[this.field_Ub];
          int var5 = this.worldWidth + ((this.field_mb - (var8.fullWidth << 15) >> 16) + var8.offsetX);
          int var6 = (-(var8.fullHeight << 15) + this.field_E >> 16) + var8.offsetY;
          while (param1 < var5) {
            param1 = param1 + this.worldWidth;
          }
          if (param1 < (var8.width + var5) &&
            param2 >= var6) {
            if (param2 >= (var6 + var8.height)) {
              return false;
            }
            if (var8.pixels[param1 + (param2 - var6) * var8.height - var5] == 0) {
              return false;
            }
            this.k((byte) 81);
            return true;
          }
          return false;
        }
        if (param0 != -2) {
          this.levelData = (byte[][]) null;
        }
        return false;
    }

    final static void c(boolean param0, int param1) {
        pg.field_b = true;
        if (param1 != 2560) {
          GameplaySession.c((byte) 49);
        }
        hm.field_o = new pf(param0);
        di.field_d = null;
        mj.field_d = 0;
        gi.a((byte) -93);
    }

    final void j(int param0) {
        this.e((byte) 94);
        if (param0 != 256) {
          this.b(63, -69, (byte) -63);
        }
        this.l(10974);
    }

    private final void k(int param0) {
        try {
          try {
            this.loadLevelStream((InputStream) ((Object) new ByteArrayInputStream(this.levelData[this.levelIndex])), false);
            if (param0 > -123) {
              this.a(42, false);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            IOException var2 = (IOException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final PointCloudEffect i(int param0, int param1) {
        boolean var3 = (this.usesDynamicTerrain(8192));
        if (param1 != -22944) {
          return (PointCloudEffect) null;
        }
        return BoundedRandomAccessFile.a(param0, (var3), 8);
    }

    private final boolean a(int[] param0, int param1, byte param2, int param3) {
        String stackIn_14_2 = null;
        try {
          if (param2 != -74) {
            return false;
          }
          if (QuickChatPhraseDefinition.fullTileMask == param0) {
            return true;
          }
          boolean stackIn_10_0 = ((param0[param3] & 1 << param1) != 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("oe.LF(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean usesDynamicTerrain(int guard) {
        if (guard != 8192) {
          return false;
        }
        return this.terrainTheme == 4 ? true : false;
    }

    private final PointCloudEffect a(LevelObject param0, byte param1) {
        String stackIn_7_2 = null;
        try {
          boolean var3_int = (this.usesDynamicTerrain(8192));
          PointCloudEffect var4 = ee.a(param0, 14, (var3_int));
          this.field_vb.addLast(-12328, var4);
          if (param1 != 42) {
            field_xb = (int[]) null;
          }
          PointCloudEffect stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oe.AC(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = EscapeVector.obfuscationControl;
        if (this.levelIndex < 0) {
          Sprite var4 = qf.field_d;
          if (var4 == null) {
            return;
          }
          for (var5 = -param0; var5 > -1024; var5 -= 1024) {
          }
          while (var5 < 640) {
            var4.e(480 + var5, -param1);
            var5 += 1024;
          }
        }
        if (param2 != -14) {
          this.field_fb = (m) null;
        }
    }

    private final void f(int param0, int param1) {
        if (this.field_l == 0) {
          return;
        }
        if (param1 != this.field_l) {
          return;
        }
        this.field_a = true;
        int var3 = 100;
        if (param1 == 3) {
          var3 = 164;
        }
        this.a(var3, (byte) 72, di.field_c);
        int var4 = -77 / ((param0 + 30) / 34);
    }

    private final void e(int param0, int param1, int param2) {
        int var10 = EscapeVector.obfuscationControl;
        if (dd.field_a[this.terrainTheme] == null) {
          return;
        }
        while (0 > param2) {
          param2 = param2 + this.worldWidth;
        }
        int var4 = 31 + param2 >> 5;
        int var5 = param0 + 16 >> 5;
        int var6 = param2 + 640 >> 5;
        int var7 = param0 + 480 >> 5;
        int var8 = -param2 + (var4 << 5);
        if (0 < var8) {
          this.a(-1 + var4, var5, param0, var7, 32 - var8, param2, 10943, 32);
        }
        int var9 = var4;
        if (param1 != 8192) {
          this.gameMode = -7;
        }
        while (var6 > var9) {
          this.a(var9, var5, param0, var7, 0, param2, param1 + 2751, 32);
          var9++;
        }
        var9 = 31 & -var8 + 640;
        if (var9 > 0) {
          this.a(var6, var5, param0, var7, 0, param2, 10943, var9);
        }
    }

    private final void F(int param0) {
        int var8 = EscapeVector.obfuscationControl;
        int var2 = -49 % ((82 - param0) / 43);
        int var3 = 0;
        IntrusiveNode var4 = this.field_G.first(false);
        for (int var5 = 0; this.field_x > var5; var5++) {
          vh var6 = (vh) (var4);
          if (!var6.field_h) {
            var4 = var4.next;
          } else {
            var6.d(-37);
            var3++;
            if (0 == this.field_x - var3) {
              this.field_nb = null;
            } else if (this.field_nb == var4) {
              this.field_nb = var4.previous;
            }
            IntrusiveNode var7 = var4;
            var4 = var4.next;
            var7.unlink((byte) -14);
            this.field_G.addLast(-12328, var7);
          }
        }
        this.field_x = this.field_x - var3;
    }

    private final void f(boolean param0) {
        int var2 = this.score + this.field_J;
        ce.field_f.d((byte) -101, this.gameMode, var2);
        if (param0) {
          this.tilesWide = -77;
        }
    }

    private final void e(byte param0) {
        int var4 = EscapeVector.obfuscationControl;
        if (!hi.a(this.gameMode, -2)) {
          return;
        }
        int var2 = 95 / ((51 - param0) / 36);
        if (this.levelIndex < 2) {
          DialogueScreen var5 = new DialogueScreen(BoundedRandomAccessFile.field_c, ae.field_c, se.field_a, false);
          re.a(1820, var5);
        } else if (this.levelIndex < 4) {
          DialogueScreen var6 = new DialogueScreen(bg.field_c, ae.field_c, ae.field_e, false);
          re.a(1820, var6);
        } else if (this.levelIndex < 8) {
          DialogueScreen var7 = new DialogueScreen(DynamicTerrainRenderer.field_i, ae.field_c, co.field_e, false);
          re.a(1820, var7);
        } else if (this.levelIndex < 12) {
          DialogueScreen var8 = new DialogueScreen(bj.field_F, ae.field_c, me.field_g, false);
          re.a(1820, var8);
        } else {
          DialogueScreen var9 = new DialogueScreen(vl.field_c, ae.field_c, tl.field_t, false);
          re.a(1820, var9);
        }
    }

    private final void a(int param0, String param1) {
        try {
          int var3_int = -72 / ((param0 + 38) / 58);
          this.a(100, (byte) 91, param1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.QB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, hl param1) {
        if (param1 == null) {
          return;
        }
        try {
          if (param0 != 4) {
            Sprite var4 = (Sprite) null;
            boolean discarded$0 = this.a((Sprite) null, -82, -79, -108, -58, 107, 91, -47);
          }
          param1.f(0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13;
        int var14;
        int var16 = EscapeVector.obfuscationControl;
        int[] var19 = this.a(param3, param7 ^ -1299998022, param1);
        int[] var18 = var19;
        int[] var17 = var18;
        int[] var9 = var17;
        if (param7 != 1299998021) {
          this.g(-25, 18);
        }
        if (var17 == null) {
          param5 = param5 + (-param2 + param6) * 640;
        } else {
          Sprite var10 = tk.field_a[this.terrainTheme];
          int[] var11 = var10.pixels;
          int var12 = (param1 << 5) % var10.width + (param2 + (param3 << 5)) % var10.height * var10.width;
          if (QuickChatPhraseDefinition.fullTileMask == var17) {
            for (var13 = param2; var13 < param6; var13++) {
              for (var14 = param0; param4 > var14; var14++) {
                SoftwareRasterizer.pixels[var14 + param5] = var11[var12 + var14];
              }
              var12 = var12 + var10.width;
              param5 += 640;
            }
          } else {
            var13 = param2;
            while (param6 > var13) {
              var14 = var19[var13];
              int var15 = param0;
              while (var15 < param4) {
                int stackIn_14_0 = 0;
                int stackIn_14_1 = var14 >>> var15 & 1;
                if (stackIn_14_0 != stackIn_14_1) {
                  SoftwareRasterizer.pixels[var15 + param5] = var11[var12 + var15];
                }
                var15++;
              }
              int stackIn_14_0Lifetime1 = var12;
              int stackIn_14_1Lifetime1 = var10.width;
              var12 = stackIn_14_0Lifetime1 + stackIn_14_1Lifetime1;
              param5 += 640;
              var13++;
            }
          }
        }
        return param5;
    }

    private final String r(int param0) {
        if (param0 != 4251) {
          this.q(11);
        }
        return wk.a(ah.field_l, false, sm.field_d, da.field_d[this.terrainTheme], fi.field_j);
    }

    private final void c(int param0, int param1, int param2) {
        Sprite var4 = sl.field_b[this.secondaryTheme][3];
        int var5 = -128 / ((43 - param2) / 45);
        if (var4 != null) {
          param1 = param1 + var4.fullHeight;
        }
        Sprite var6 = pf.field_g[this.secondaryTheme];
        if (var6 == null) {
          return;
        }
        this.a(true, false, 94, var6, param1, param0);
    }

    private final void a(int param0, DataInputStream param1, boolean param2) throws IOException {
        String stackIn_13_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          this.field_L = 0;
          this.field_k = null;
          if (!param2) {
            this.o((byte) 113);
          }
          this.field_S = 0;
          this.field_Ab = null;
          int var4_int = param1.readUnsignedByte();
          this.levelObjects.setSize(var4_int);
          for (int var5 = 0; var4_int > var5; var5++) {
            LevelObject var6 = this.a(param1, (byte) -67, var5, param0);
            this.levelObjects.setElementAt(var6, var5);
            if (var6.e((byte) -5)) {
              this.field_L = this.field_L + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("oe.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean g(byte param0) {
        if (this.field_Q == 0) {
          boolean stackIn_6_0 = (this.field_Ib) && (1 == this.field_Ub);
          return stackIn_6_0;
        }
        if (this.field_Q != 1) {
          if (param0 <= -14) {
            return false;
          }
          this.levelData = (byte[][]) null;
          return false;
        }
        boolean stackIn_12_0 = (this.field_Ib) && (this.e(119));
        return stackIn_12_0;
    }

    final void e(int param0, int param1) {
        if (param0 < 0) {
          return;
        }
        if (param0 >= this.levelData.length) {
          return;
        }
        this.levelIndex = param0;
        this.a(false, this.levelData[param0], true);
        int var3 = 20 / ((28 - param1) / 51);
    }

    private final void w(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (param0 == this.field_Q &&
          this.e(true)) {
          this.field_Ib = true;
          if (1 == this.field_Ub) {
            vj.b(97);
            pl.field_n.a(jh.field_k, 100, qm.field_c * 6144 / 64, 8192);
            if (this.field_rc) {
              if (this.levelIndex >= 0) {
                this.field_c = -150;
              }
              this.x(param0 + 6324320);
              this.t(7);
            }
            this.b((byte) -109, 1);
          } else if (0 <= this.levelIndex ||
            !this.field_ec) {
            pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
            this.a(-98, ki.field_I);
          }
        }
        if (this.field_Q == 1) {
          if (this.e(98)) {
            if (this.i(-108) &&
              !this.e(true)) {
              return;
            }
            this.field_Ib = true;
            vj.b(104);
            pl.field_n.a(jh.field_k, 100, 6144 * qm.field_c / 64, 8192);
            if (this.field_rc) {
              if (0 <= this.levelIndex) {
                this.field_c = -150;
              }
              this.x(param0 + 6324320);
              this.t(7);
            }
            this.b((byte) -124, 1);
          } else if (this.e(true)) {
            this.field_Ib = true;
            pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
            this.a(param0 ^ -101, jl.field_c);
          }
        }
    }

    private final void a(int param0, byte param1, String param2) {
        try {
          rb var4 = new rb(param2, param0);
          if (param1 <= 52) {
            int[] discarded$0 = this.a(-114, (byte) -86, 65);
          }
          this.field_tc.addLast(-12328, var4);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.SB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(int param0, int param1) {
        if (param0 != 320) {
          this.field_tb = -112;
        }
        int var3 = 0;
        if (param1 == 12) {
          var3 = 1;
        }
        if (param1 == 13) {
          var3 = 5;
        }
        if (0 == var3) {
          return;
        }
        String var4 = this.d(false, var3);
        this.a(param0 - 430, var4);
        this.field_tb = this.field_tb + var3;
        AccountRegistrationPanel.a(var3, -15655);
    }

    final void startSession(byte guard) {
        this.m(-9);
        if (guard != -40) {
          this.field_dc = -86;
        }
        this.C(-122);
    }

    private final void a(int param0, DataInputStream param1, int param2) throws IOException {
        String stackIn_15_2 = null;
        try {
          this.field_qb = param0;
          if (param2 < 8) {
            return;
          }
          int var4_int = param1.readUnsignedShort();
          if (var4_int == 512) {
            this.field_qb = 512;
          }
          if (var4_int == 768) {
            this.field_qb = 768;
          }
          if (16 == var4_int) {
            this.field_qb = 16;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("oe.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final rb B(int param0) {
        if (this.field_tc == null) {
          return null;
        }
        if (param0 != -27521) {
          this.a(-27, true);
        }
        if (this.field_tc.isEmpty(-97)) {
          return null;
        }
        IntrusiveNode var2 = this.field_tc.first(false);
        if (var2 == null) {
          return null;
        }
        var2.unlink((byte) -59);
        return (rb) (var2);
    }

    private final int a(int param0, int param1) {
        int var3 = 51 / ((-3 - param0) / 63);
        return param1 & 255;
    }

    private final void E(int param0) {
        if (hi.a(this.gameMode, -2)) {
          DialogueScreen var2 = new DialogueScreen(fn.field_e, ae.field_c, mb.field_b, true);
          var2.field_m = false;
          re.a(1820, var2);
        }
        if (~this.gameMode == param0) {
          String var2_ref = "vengeance_concl";
          String var3 = "scene";
          Sprite[] var4 = ug.field_a;
          String[] var5 = IntValueNode.field_h;
          DialogueScreen var6 = new DialogueScreen(var2_ref, var3, var4, var5, true);
          re.a(1820, var6);
        }
    }

    private final boolean t(byte param0) {
        boolean var2 = true;
        int var3 = this.c(true);
        if (param0 != -48) {
          this.field_g = (int[]) null;
        }
        boolean[] var4 = wk.field_b;
        if (var4 != null &&
          var3 >= 0 &&
          var4.length > var3) {
          var2 = (var4[var3]);
        }
        if (null != this.field_Db) {
          boolean var5 = false;
          ce var6 = this.field_Db.b(true);
          if (var6 != null) {
            var2 = var5;
          }
        }
        return (var2);
    }

    private final int s(int param0) {
        int var2 = -1;
        int var3 = this.c(true);
        if (param0 != -68661304) {
          Sprite var6 = (Sprite) null;
          this.a(-94, (Sprite) null, -116, 123);
        }
        int[] var4 = wi.field_h;
        if (var4 != null &&
          var3 >= 0 &&
          var3 < var4.length &&
          var4[var3] >= 0) {
          var2 = var4[var3];
        }
        if (null != this.field_Db) {
          int var5 = this.field_Db.c(true);
          if (var5 >= 0) {
            var2 = var5;
          }
        }
        return var2;
    }

    private final void o(byte param0) {
        int var2 = 124 % ((param0 - 56) / 62);
        if (this.field_Bb) {
          int var3 = 10053375;
          SoftwareRasterizer.g(319, 239, 10, var3, 48);
          SoftwareRasterizer.g(320, 239, 10, var3, 48);
          SoftwareRasterizer.g(319, 240, 10, var3, 48);
          SoftwareRasterizer.g(320, 240, 10, var3, 48);
        }
    }

    private final void i(int param0, int param1, int param2) {
        param2 -= 64;
        this.a(this.r((byte) 90), false, 117, sl.field_b[this.secondaryTheme][0], (-param2 >> 3) - (this.field_pc >> 1), -param1 >> 3);
        int var4 = 26 / ((16 - param0) / 39);
        this.h(-1, param2);
        this.a(false, false, 124, sl.field_b[this.secondaryTheme][1], -param2 * 5 >> 3, 5 * -param1 >> 3);
        this.a(false, false, 74, sl.field_b[this.secondaryTheme][2], -param2 + (param2 >> 2), (param1 >> 2) - param1);
        this.a(false, true, 92, sl.field_b[this.secondaryTheme][3], (param2 >> 3) - param2, -param1 + (param1 >> 3));
        this.c(-param1 + (param1 >> 3), -param2 + (param2 >> 3), -36);
        this.g(param2, -7778, param1);
    }

    private final void a(boolean param0, int param1, InputStream param2) throws IOException {
        try {
          DataInputStream var4 = new DataInputStream(param2);
          int var5 = var4.readByte();
          this.a(var5, var4, (byte) 126);
          this.a(var5, -8277, var4);
          this.loadTerrain(param0, var5, 640, var4);
          this.a(var5, var4, true);
          this.b(var5, var4, (byte) -17);
          this.a((byte) 121, var4, var5);
          if (param1 != -1) {
            this.q((byte) -88);
          }
          this.b(-112, var4, var5);
          this.a(var4, var5, (byte) 71);
          this.a(512, var4, var5);
          var4.close();
          this.field_rb = false;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.FD(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0) {
        if (this.field_e > 0) {
          this.field_e = this.field_e - 1;
          if (this.field_e == 0) {
            this.k(-123, this.field_Ub);
            pl.field_n.a(nm.field_a, 100, qm.field_c * 6144 / 64, 8192);
            int var2 = qj.a((byte) -38, this.field_Ub, this.gameMode);
            this.field_J = this.field_J + var2;
            v.a(8, var2);
            this.field_Ub = -1;
            if (this.field_rc) {
              this.field_u = this.field_u + 1;
              mh.a((byte) 119);
              if (this.field_u == 19) {
                this.a(this.gameMode, false, 11, 244);
              }
            }
          }
        }
        if (!param0) {
          this.field_Gb = true;
        }
    }

    private final boolean a(Sprite param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        String stackIn_14_2 = null;
        try {
          if (param6 != 31) {
            return true;
          }
          if ((param5 ^ param2) >> 5 == 0) {
            boolean stackIn_10_0 = this.a(-(31 & param2), param0, param3, param1, param6 - 32, 31 & param2, param2 >> 5, param5 & 31, param7, param4);
            return stackIn_10_0;
          }
          if (!this.a(-(31 & param2), param0, param3, param1, -1, 31 & param2, param2 >> 5, 31, param7, param4)) {
            boolean stackIn_8_0 = this.a(-param2 & 31, param0, param3, param1, -1, 0, param5 >> 5, 31 & param5, param7, param4);
            return stackIn_8_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var9;
          StringBuilder stackIn_13_1 = new StringBuilder().append("oe.RA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int g(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = 0;
        for (int var3 = 0; var3 < this.gameMode; var3++) {
          var2 = var2 + je.a(false, var3);
        }
        var2 = var2 + this.levelIndex;
        if (param0 != 20824) {
          this.field_M = -70;
        }
        return var2;
    }

    private final void p(byte param0) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.levelIndex < 0 &&
          !this.field_zb) {
          if (!(this.field_z <= 0)) {
            if (0 < this.field_Qb) {
              this.field_Qb = this.field_Qb - 1;
            }
            if (this.field_Qb == 0) {
              this.field_zb = true;
            }
          } else if (!this.field_Gb &&
            !this.field_Ib &&
            !this.field_ec) {
            if (this.field_ab < 60) {
              if (this.field_y == 0 &&
                58720256 > this.shipYQ16) {
                this.field_y = 1;
              }
              if (this.field_y == 1 &&
                this.field_rb) {
                this.field_y = 2;
              }
              if (this.field_y <= 3 &&
                this.shipYQ16 < 33554432) {
                this.field_y = 4;
              }
              if ((4 == this.field_y ||
                this.field_y == 5) &&
                this.shipYQ16 >= 33554432) {
                this.field_y = 3;
              }
              if (4 == this.field_y &&
                this.field_db) {
                this.field_y = 5;
              }
              if (this.field_Ub == 1 &&
                this.field_y < 6) {
                this.field_y = 6;
              }
              boolean var2_int = false;
              if (this.shipYQ16 < 20971520 &&
                this.field_y >= 5 &&
                0 < this.levelObjects.size()) {
                LevelObject var8 = (LevelObject) (this.levelObjects.elementAt(0));
                if (var8.objectType == 8) {
                  var2_int = true;
                }
              }
              if (var2_int) {
                this.field_y = 7;
              } else if (this.field_y == 7) {
                if (this.field_Ub >= 0) {
                  this.field_y = 8;
                } else {
                  this.field_y = 5;
                }
              }
              if (this.field_y == 8 &&
                20971520 <= this.shipYQ16) {
                this.field_y = 9;
              }
            }
            if (~this.field_y != ~this.field_dc) {
              if (this.field_Qb > 0) {
                this.field_Qb = this.field_Qb - 1;
              }
              if (this.field_Qb == 0) {
                this.field_dc = this.field_y;
                Sprite var2 = this.field_i;
                this.field_i.fullWidth = 638;
                var2.width = 638;
                Sprite var3_ref_ed = this.field_i;
                this.field_i.fullHeight = 60;
                var3_ref_ed.height = 60;
                this.field_i.g();
                SoftwareRasterizer.d();
                fh.field_g.c(ic.field_k[3 * this.field_y], 319, 20, 16777215, -1);
                fh.field_g.c(ic.field_k[this.field_y * 3 + 1], 319, 40, 16777215, -1);
                fh.field_g.c(ic.field_k[2 + this.field_y * 3], 319, 60, 16777215, -1);
                md.field_D.a(126);
              }
            }
            if (~this.field_dc == ~this.field_y &&
              !(this.field_Qb >= 31)) {
              this.field_Qb = this.field_Qb + 1;
            }
            boolean decompiledFrameRemainder0 = false;
          } else if ((-32 <= this.field_c ||
            this.field_Qb < 31) && this.field_Qb > 0) {
            this.field_Qb = this.field_Qb - 1;
          }
        }
        if (param0 != 9) {
          this.b(-119, (byte) 66, 9);
        }
        if (this.levelIndex >= 0 ||
          this.field_zb) {
          if (this.field_Qb > 0) {
            this.field_Qb = this.field_Qb - 1;
          }
          if (this.field_Qb == 0 &&
            this.field_z > 0) {
            this.field_d = 0;
            while (this.field_z > 0) {
              int stackIn_86_0 = this.field_d;
              int stackIn_86_1 = 3;
              if (stackIn_86_0 < stackIn_86_1) {
                int fieldTemp$0 = this.field_d;
                this.field_d = this.field_d + 1;
                this.field_g[fieldTemp$0] = this.field_Lb[0];
                this.field_z = this.field_z - 1;
                qg.a(this.field_Lb, 1, this.field_Lb, 0, this.field_z);
                continue;
              }
              break;
            }
            this.field_i.fullWidth = -20 + this.field_d * 160;
            this.field_i.width = -20 + this.field_d * 160;
            this.field_Qb = 150;
            this.field_i.fullHeight = 40;
            Sprite var2Lifetime1 = this.field_i;
            var2Lifetime1.height = 40;
            this.field_i.g();
            SoftwareRasterizer.d();
            int var3 = 0;
            for (int var4 = 0; var4 < this.field_d; var4++) {
              int var5 = this.field_g[var4];
              mi.field_m[var5].e(var3, 4);
              int var6 = 39 - fh.field_g.a(hk.field_r[var5], 100) * 10;
              fh.field_g.a(hk.field_r[var5], var3 + 40, var6 - fh.field_g.field_r, 100, 1000, 16777215, -1, 0, 0, 20);
              var3 += 160;
            }
            md.field_D.a(113);
          }
          if (this.field_Qb == 0) {
            int stackIn_86_0Lifetime1 = ~this.field_z;
            int stackIn_86_1Lifetime1 = -1;
            if (stackIn_86_0Lifetime1 == stackIn_86_1Lifetime1 &&
              0 > this.levelIndex) {
              this.field_zb = false;
              this.field_dc = -1;
              this.p((byte) 9);
            }
          }
        }
    }

    private final ce w(byte param0) {
        Object var2 = null;
        int var3 = this.c(true);
        ce[] var4 = rk.field_d;
        if (var4 != null && var3 >= 0 && var4.length > var3 &&
          var4[var3] != null) {
          var2 = var4[var3];
        }
        if (param0 >= -122) {
          this.field_C = (IntrusiveDeque) null;
        }
        if (this.field_Db != null) {
          ce var5 = this.field_Db.b(true);
          if (var5 != null) {
            var2 = var5;
          }
        }
        return (ce) (var2);
    }

    private final LevelObject b(boolean param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.levelObjects == null) {
          return null;
        }
        int var2 = this.levelObjects.size();
        int var3 = 0;
        if (param0) {
          return (LevelObject) null;
        }
        while (var2 > var3) {
          LevelObject var4 = (LevelObject) (this.levelObjects.elementAt(var3));
          if (var4.objectType == 1) {
            return var4;
          }
          var3++;
        }
        return null;
    }

    private final void a(int param0, byte param1) {
        if (param0 != 5) {
          return;
        }
        String var3 = b.field_a;
        this.a(param1 ^ 101, var3);
        if (param1 != -9) {
          int discarded$0 = this.b(-46, -122);
        }
    }

    private final void b(byte param0, int param1) {
        if (aj.b(-100)) {
          return;
        }
        if (od.field_k) {
          return;
        }
        int var3 = this.g(20824);
        if (param0 >= -99) {
          this.easyMode = true;
        }
        if (var3 < 0) {
          return;
        }
        int var4 = this.field_sb / (th.field_p + 1);
        if (var4 < 0) {
          return;
        }
        ua.a(var3, var4, param1, 1);
    }

    private final void j(int param0, int param1, int param2) {
        int var9;
        int var10 = EscapeVector.obfuscationControl;
        int var4 = -54 / ((param0 - 18) / 38);
        for (int var5 = 0; this.levelObjects.size() > var5; var5++) {
          LevelObject var6 = (LevelObject) (this.levelObjects.elementAt(var5));
          if (var6.objectType != 6 &&
            var6.objectType != 7) {
            Sprite var7 = var6.collisionSprite;
            int var8 = var7.offsetY + var6.y;
            if (param1 >= var8 &&
              param1 < var7.height + var8) {
              for (var9 = var6.x + var7.offsetX; param2 > var9; var9 = var9 + this.worldWidth) {
              }
              while (param2 < var9) {
                var9 = var9 - this.worldWidth;
              }
              if (!((var7.width + var9) <= param2) &&
                var7.pixels[(param1 - var8) * var7.width + (-var9 + param2)] != 0) {
                this.a(var6, -120, var5);
                return;
              }
            }
          }
        }
    }

    private final void f(int param0, int param1, int param2) {
        boolean stackIn_8_0 = false;
        int var10 = EscapeVector.obfuscationControl;
        boolean var4 = (this.usesDynamicTerrain(8192));
        if (param2 != 8) {
          return;
        }
        ic var5 = (ic) (this.field_N.first(false));
        while (true) {
          if (var5 == null) {
            return;
          }
          stackIn_8_0 = (null != var5.field_m &&
            (65536 & var5.field_m.field_r) != 0);
          boolean var6 = stackIn_8_0;
          int var7 = -16 + (var5.field_p >> 16) - param0;
          int stackIn_9_0 = -param1 + (var5.field_q >> 16) - 16;
          int var8 = stackIn_9_0;
          while (-od.field_b.fullWidth < var7) {
            var7 = var7 - this.worldWidth;
          }
          for (var7 = var7 + this.worldWidth; 640 > var7; var7 = var7 + this.worldWidth) {
            Sprite var9 = s.field_H;
            boolean stackIn_9_0Lifetime1 = var4;
            if (stackIn_9_0Lifetime1 &&
              null != TerrainMaskSupport.field_a) {
              var9 = TerrainMaskSupport.field_a;
            }
            var9.e(8 + var7, var8 + 8);
            if (var6) {
              od.field_b.c(var7, var8, 128);
            }
          }
          var5 = (ic) (this.field_N.next((byte) 70));
          continue;
        }
    }

    private final void a(Sprite param0, int param1, int param2, byte param3) {
        String stackIn_26_2 = null;
        int var19 = EscapeVector.obfuscationControl;
        try {
          param2 = param2 + param0.offsetX;
          param1 = param1 + param0.offsetY;
          int var5_int = -1 + param2 + param0.width;
          int var6 = -1 + param0.height + param1;
          int var7 = this.shipXQ16 >> 5;
          int var9 = -53 % ((32 - param3) / 41);
          var7 = var7 + (this.worldWidth << 11);
          int var8 = this.shipYQ16 >> 5;
          int var10 = var7 - 24576;
          int var11 = -24576 + var8;
          int var12 = 24576 + var7;
          int var13 = var8 + 24576;
          var12 = var12 >> 11;
          var10 = var10 >> 11;
          var11 = var11 >> 11;
          if (var10 < param2) {
            var10 = param2;
          }
          if (var5_int < var12) {
            var12 = var5_int;
          }
          var13 = var13 >> 11;
          if (var11 < param1) {
            var11 = param1;
          }
          if (var6 < var13) {
            var13 = var6;
          }
          int var14 = var11;
          while (true) {
            int stackIn_13_0 = var14;
            int stackIn_13_1 = var13;
            if (stackIn_13_0 > stackIn_13_1) {
              return;
            }
            for (int var15 = var10; var12 >= var15; var15++) {
              int var16 = (var15 << 11) - var7;
              int var17 = -var8 + (var14 << 11);
              int var18 = var16 * var16 + var17 * var17;
              int stackIn_13_0Lifetime1 = var18;
              int stackIn_13_1Lifetime1 = 603979776;
              if (stackIn_13_0Lifetime1 < stackIn_13_1Lifetime1 &&
                param0.pixels[-param2 + ((var14 - param1) * param0.width + var15)] != 0) {
                this.field_Hb = this.field_Hb + var16;
                this.field_pb = this.field_pb + var17;
              }
            }
            var14++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var5;
          StringBuilder stackIn_25_1 = new StringBuilder().append("oe.NC(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void o(int param0) {
        this.u((byte) 102);
        this.v(-33);
        if (param0 != 0) {
          Sprite var3 = (Sprite) null;
          boolean discarded$0 = this.a((Sprite) null, -1, 116, -120, 58, 99, 61, 108);
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var10 = EscapeVector.obfuscationControl;
        if (tk.field_a[this.terrainTheme] == null) {
          return;
        }
        if (param2 >= -53) {
          LevelObject discarded$0 = this.b(false);
        }
        while (param1 < 0) {
          param1 = param1 + this.worldWidth;
        }
        int var4 = 31 + param1 >> 5;
        int var5 = param0 + 31 >> 5;
        int var6 = 640 + param1 >> 5;
        int var7 = 480 + param0 >> 5;
        int var8 = (var4 << 5) - param1;
        if (var8 > 0) {
          this.c(-var8 + 32, param0, var4 - 1, 1395798865, param1, var5, var7, 32);
        }
        for (int var9 = var4; var9 < var6; var9++) {
          this.c(0, param0, var9, 1395798865, param1, var5, var7, 32);
        }
        int var9Lifetime1 = -var8 + 640 & 31;
        if (0 < var9Lifetime1) {
          this.c(0, param0, var6, 1395798865, param1, var5, var7, var9Lifetime1);
        }
    }

    private final void b(boolean param0, int param1) {
        if (param1 != 11) {
          return;
        }
        this.field_ib = 2550;
        bh.c(-64);
        if (param0) {
          this.field_O = -101;
        }
        this.a(113, oh.field_g);
    }

    private final void a(boolean param0, boolean param1, int param2, Sprite param3, int param4, int param5) {
        String stackIn_23_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param3 == null) {
            return;
          }
          param4 -= 48;
          scanLoop1: while (param4 < 480) {
            while (true) {
              int stackIn_17_0 = ~param5;
              int stackIn_17_1 = -1;
              if (stackIn_17_0 < stackIn_17_1) {
                param5 = param5 - param3.fullWidth;
                continue;
              }
              while (param5 < 640) {
                param3.e(param5, param4);
                param5 = param5 + param3.fullWidth;
              }
              param4 = param4 + param3.fullHeight;
              if (!param0) {
                break;
              }
              continue scanLoop1;
            }
            break;
          }
          if (param1 &&
            480 > param4) {
            int var7_int = param3.pixels[(-1 + param3.height) * param3.width];
            SoftwareRasterizer.a(0, param4, 640, 480 - param4, var7_int);
          }
          int stackIn_17_0Lifetime1 = param2;
          int stackIn_17_1Lifetime1 = 66;
          if (stackIn_17_0Lifetime1 < stackIn_17_1Lifetime1) {
            GameplaySession.c((byte) -67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var7;
          StringBuilder stackIn_22_1 = new StringBuilder().append("oe.HD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void b(int param0, DataInputStream param1, int param2) throws IOException {
        String stackIn_9_2 = null;
        try {
          if (param2 < 4) {
            this.field_gc = 150;
          } else {
            this.field_gc = param1.readInt();
            if (this.field_gc <= 0) {
              this.field_gc = 150;
            }
          }
          int var4_int = -51 % ((10 - param0) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_8_0 = runtimeException;
          StringBuilder stackIn_8_1 = new StringBuilder().append("oe.HF(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void initializeLevelObjects(boolean buildTerrainRenderer, int guard) {
        int var8 = 0;
        int var9 = EscapeVector.obfuscationControl;
        this.field_ub = 0;
        this.field_b = false;
        int var3 = 0;
        scanLoop1: while (true) {
          int stackIn_2_0 = ~this.levelObjects.size();
          int stackIn_2_1 = ~var3;
          if (stackIn_2_0 < stackIn_2_1) {
            LevelObject var10 = (LevelObject) (this.levelObjects.elementAt(var3));
            var10.stampTerrain(true, this);
            int stackIn_17_0 = -7;
            int stackIn_17_1 = ~var10.objectType;
            if (stackIn_17_0 == stackIn_17_1) {
              for (int var5_int = 0; var5_int < this.levelObjects.size(); var5_int++) {
                LevelObject var6 = (LevelObject) (this.levelObjects.elementAt(var5_int));
                stackIn_2_0 = -8;
                stackIn_2_1 = ~var6.objectType;
                if (stackIn_2_0 == stackIn_2_1 &&
                  var10.y == var6.y) {
                  int var7 = (20 + var10.x) % this.worldWidth;
                  for (var8 = var6.x; var7 > var8; var8 = var8 + this.worldWidth) {
                  }
                  this.a(var8, var10.y + 14, var7, 2134602960);
                  break;
                }
              }
            }
            var3++;
            continue scanLoop1;
          }
          break;
        }
        int var3Lifetime1 = -109 % ((-71 - guard) / 35);
        this.b((byte) -101);
        this.field_Zb = 0;
        this.field_oc = 0;
        int stackIn_17_0Lifetime1 = this.field_J;
        int stackIn_17_1Lifetime1 = 128;
        td.a(stackIn_17_0Lifetime1, stackIn_17_1Lifetime1);
        this.field_J = 0;
        if (this.timeHackMode) {
          this.elapsedTicks = this.field_T;
        }
        ck.a(111, -this.field_u);
        mn.a(-this.field_bc, (byte) 44);
        this.field_bc = this.field_w;
        this.field_u = this.field_ic;
        ck.a(77, this.field_ic);
        mn.a(this.field_w, (byte) 44);
        if (0 <= this.levelIndex) {
          this.field_db = false;
        }
        this.field_Xb = this.i(512, -22944);
        if (this.usesDynamicTerrain(8192) &&
          buildTerrainRenderer) {
          this.dynamicTerrain = new DynamicTerrainRenderer(this.terrainMasks, QuickChatPhraseDefinition.fullTileMask, (int[]) null, this.tilesWide, this.tilesHigh);
          ic.a(-101, this.dynamicTerrain.field_B);
        } else {
          this.dynamicTerrain = null;
        }
        this.f(-75, 3);
        this.h(false);
        LevelObject var4 = this.b(false);
        this.minimap = new Minimap(this, var4, gj.a(this.levelIndex, this.gameMode, (byte) 54));
        this.z((byte) 0);
        en var5 = ce.field_f;
        if (var5 != null) {
          var5.a((byte) 36);
        }
        return;
    }

    private final void a(ic param0, int param1) {
        try {
          if (null != param0.field_g) {
            pl.field_n.b(param0.field_g);
            pl.field_n.b(param0.field_m);
            param0.field_m = null;
            param0.field_g = null;
          }
          if (param1 != 5) {
            this.field_G = (IntrusiveDeque) null;
          }
          this.a(125, param0.field_q, ve.field_d, param0.field_p);
          param0.unlink((byte) -11);
          this.q((byte) -128);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.RC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
          this.field_i = (Sprite) null;
        }
        if (ce.field_f.a((byte) 54, param3, param2, param0)) {
          int fieldTemp$0 = this.field_z;
          this.field_z = this.field_z + 1;
          this.field_Lb[fieldTemp$0] = param2;
        }
    }

    private final LevelObject a(DataInputStream param0, int param1, int param2, boolean param3, int param4, int param5, int param6) throws IOException {
        String stackIn_23_2 = null;
        LevelObject var8 = null;
        try {
          int var9 = param0.readByte();
          boolean stackIn_3_0 = !(var9 == 0);
          boolean var10 = stackIn_3_0;
          boolean var11 = false;
          if (param3) {
            this.field_jc = false;
          }
          if (param2 >= 6) {
            int var12 = param0.readByte();
            boolean stackIn_9_0 = !(var12 == 0);
            var11 = stackIn_9_0;
          }
          if (param2 >= 9) {
            int var12Lifetime1 = param0.readInt();
            var8 = new LevelObject(param6, param4, param1, param5, (var10), (var11), var12Lifetime1);
          } else {
            var8 = new LevelObject(param6, param4, param1, param5, (var10), (var11));
          }
          if (var10) {
            if (null == this.field_k) {
              this.field_k = new IntrusiveDeque();
              this.field_Ab = new va();
            }
            this.field_k.addLast(-12328, var8);
          }
          LevelObject stackIn_19_0 = var8;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var8_ref;
          StringBuilder stackIn_22_1 = new StringBuilder().append("oe.EA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, int param2, int param3) {
        if (!this.field_a) {
          return param2;
        }
        if (this.field_X <= 0) {
          return param3;
        }
        int var5 = this.field_X % param1;
        param1 = param1 / 2;
        if (var5 < param1) {
          int var6 = param3;
          param3 = param2;
          param2 = var6;
        }
        var5 = this.field_X % param1;
        if (param0 < 72) {
          return -91;
        }
        int var6Lifetime1 = this.d(param3, 30351) - this.d(param2, 30351);
        int var7 = this.b(param3, 16082) - this.b(param2, 16082);
        int var8 = this.a(-99, param3) - this.a(87, param2);
        int var9 = this.d(param2, 30351) + var6Lifetime1 * var5 / param1;
        int var10 = var7 * var5 / param1 + this.b(param2, 16082);
        int var11 = var5 * var8 / param1 + this.a(-128, param2);
        return this.a(var11, var9, true, var10);
    }

    private final boolean d(int param0, int param1, int param2) {
        int var11 = EscapeVector.obfuscationControl;
        int var4 = this.shipXQ16 >> 5;
        var4 = var4 + (this.worldWidth << 11);
        int var5 = this.shipYQ16 >> 5;
        int var6 = -24576 + var4;
        int var7 = -24576 + var5;
        int var8 = 24576 + var4;
        param2 = param2 << 11;
        int var9 = var5 + 24576;
        if (param1 != 32) {
          this.field_q = true;
        }
        for (param0 = param0 << 11; param0 < var6; param0 = param0 + (this.worldWidth << 11)) {
        }
        if (var8 >= param0 &&
          var7 <= param2) {
          if (param2 > var9) {
            return false;
          }
          param0 = param0 - var4;
          param2 = param2 - var5;
          int var10 = param2 * param2 + param0 * param0;
          return !(var10 >= 603979776);
        }
        return false;
    }

    private final void a(boolean param0, byte[] param1, boolean param2) {
        try {
          if (!param2) {
            this.m(-93);
          }
          this.a(24661, param0);
          this.a(param1, 100);
          this.initializeLevelObjects(param0, -119);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int[] a(int param0, int param1, int param2) {
        int[] stackIn_7_0 = null;
        if (param1 != -1) {
          return (int[]) null;
        }
        if (param0 < 0) {
          return null;
        }
        if (param0 >= this.tilesHigh) {
          stackIn_7_0 = QuickChatPhraseDefinition.fullTileMask;
        } else {
          stackIn_7_0 = this.terrainMasks[this.tilesWide * param0 + param2 % this.tilesWide];
        }
        return stackIn_7_0;
    }

    private final void C(int param0) {
        if (this.gameMode != 2) {
          return;
        }
        Sprite[] var12 = ae.field_c;
        if (this.levelIndex == 0) {
          LevelObject.a(2, (byte) -116);
        }
        if (param0 >= -13) {
          int[] var6 = (int[]) null;
          boolean discarded$0 = this.a((int[]) null, 7, (byte) -46, -81);
        }
        if (0 == this.levelIndex) {
          int[] var32 = uj.field_e;
          String[] var13 = lh.field_c;
          DialogueScreen var14 = new DialogueScreen(var32, var12, var13, false);
          re.a(1820, var14);
        }
        if (4 == this.levelIndex) {
          int[] var33 = p.field_j;
          String[] var16 = rb.field_j;
          DialogueScreen var17 = new DialogueScreen(var33, var12, var16, false);
          re.a(1820, var17);
        }
        if (this.levelIndex == 8) {
          int[] var34 = ha.field_e;
          String[] var19 = pc.field_b;
          DialogueScreen var20 = new DialogueScreen(var34, var12, var19, false);
          re.a(1820, var20);
        }
        if (this.levelIndex == 12) {
          int[] var35 = w.field_bb;
          String[] var22 = vd.field_i;
          DialogueScreen var23 = new DialogueScreen(var35, var12, var22, false);
          re.a(1820, var23);
        }
    }

    private final void d(boolean param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (!param0) {
          this.b(-35, -120, (byte) -53);
        }
        PointCloudEffect var2 = (PointCloudEffect) (this.field_vb.first(false));
        while (var2 != null) {
          if (!var2.field_B) {
            var2.a();
          } else {
            var2.unlink((byte) -71);
          }
          var2 = (PointCloudEffect) (this.field_vb.next((byte) 70));
        }
        this.f(-20320);
    }

    private final void p(int param0) {
        this.a(72);
        dh.field_b = BoundedRandomAccessFile.activeSession.gameMode;
        BoundedRandomAccessFile.activeSession = null;
        pl.field_q = new t();
        GameplaySession.c((byte) -28);
        mj.field_d = param0;
        if (aj.b(-89) && (null != IntValueNode.field_i ||
          ce.field_f.b(-49) ||
          ua.field_c.d(17523))) {
          PacketBuffer.field_h = true;
          di.field_d = new wc(2);
          di.field_d.a(gb.a(dh.field_d, bj.field_y, 8158), true, 4767999);
          boolean decompiledFrameRemainder0 = false;
        }
        else {
          ci.a(0);
        }
        gi.a((byte) -77);
    }

    private final void a(pi param0, int param1) {
        pl.field_n.b(param0.field_o);
        param0.field_o = null;
        if (param1 < 7) {
          return;
        }
        try {
          this.a(123, param0.field_g, td.field_c, param0.field_n);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.MC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(int param0, byte param1) {
        if (9 != param0) {
          return;
        }
        this.field_Tb = this.field_Tb + 150;
        if (param1 > -107) {
          this.a(105);
        }
        if (this.field_Tb >= 500) {
          this.field_Tb = 500;
        }
        this.a(-116, qh.field_e);
    }

    private final void g(int param0, int param1, int param2) {
        int var9 = EscapeVector.obfuscationControl;
        if (param1 != -7778) {
          boolean discarded$1 = this.e(-71);
        }
        if (this.levelIndex < 0) {
          Sprite var10 = c.field_n;
          if (var10 == null) {
            return;
          }
          int var5 = (param2 >> 3) - param2;
          int var6 = (param0 >> 3) - param0;
          var6 += 240;
          if (var6 > 0) {
            SoftwareRasterizer.f(0, var6, 640, 480);
          }
          boolean var7 = false;
          while (true) {
            if (0 < var5) {
              boolean stackIn_18_0 = var7;
              boolean stackIn_16_0 = !((stackIn_18_0));
              var7 = stackIn_16_0;
              var5 = var5 - var10.fullWidth;
              continue;
            }
            break;
          }
          int stackIn_18_0Lifetime1 = var6;
          int var8 = stackIn_18_0Lifetime1;
          while (var5 < 640) {
            if (var7) {
              var6 = var6 - var10.fullHeight / 2;
            }
            while (var6 < 480) {
              var10.e(var5, var6);
              var6 = var6 + var10.fullHeight;
            }
            var5 = var5 + var10.fullWidth;
            boolean stackIn_28_0 = !((var7));
            var7 = stackIn_28_0;
            var6 = var8;
          }
          SoftwareRasterizer.c();
        }
    }

    private final void z(byte param0) {
        int var8 = EscapeVector.obfuscationControl;
        if (this.field_s == null) {
          return;
        }
        if (this.field_s.isEmpty(-97)) {
          return;
        }
        int var2 = 9;
        int var3 = 5 + (var2 - 1);
        int var4 = -54 / ((param0 - 75) / 48);
        IntrusiveNode var5 = this.field_s.first(false);
        while (var5 != null) {
          IntValueNode var6 = (IntValueNode) (var5);
          int var7 = var6.value;
          if (var7 >= var2 &&
            var3 >= var7) {
            this.k(-122, var7);
          }
          var5 = this.field_s.next((byte) 70);
        }
    }

    private final void a(int param0, int param1, DataInputStream param2) throws IOException {
        String stackIn_9_2 = null;
        try {
          if (param0 < 6) {
            this.field_a = false;
            this.field_X = 0;
            this.field_l = 0;
          } else {
            this.field_l = param2.readUnsignedByte();
            this.field_X = param2.readInt();
            this.field_a = false;
          }
          this.d(param1 + 29079);
          if (param1 != -8277) {
            this.field_kc = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("oe.TF(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_xb = null;
        if (param0 != 69) {
          field_cc = (String) null;
        }
        field_cc = null;
    }

    private final int a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          return -55;
        }
        param3 = param3 << 8;
        param1 = param1 << 16;
        int var5 = param1 & 16711680;
        var5 = var5 | param3 & 65280;
        var5 = var5 | 255 & param0;
        return var5;
    }

    private final void h(int param0, int param1) {
        if (param0 <= ~this.field_j) {
          return;
        }
        mj.field_b.g();
        SoftwareRasterizer.d();
        String var3 = ce.a((byte) 120, this.gameMode, this.levelIndex);
        fh.field_g.c(var3, 160, 22, 7899280, -1);
        md.field_D.a(126);
        cf.a(mj.field_b, true, 1);
        mj.field_b.h(5267536);
        int var4 = this.field_j;
        if (var4 > 128) {
          var4 = 128;
        }
        mj.field_b.a(-mj.field_b.fullWidth + 320, (-param1 >> 3) + 40 - 44, 2 * mj.field_b.fullWidth, mj.field_b.fullHeight * 2, var4);
    }

    private final void a(am param0, byte param1) {
        try {
          param0.unlink((byte) -25);
          if (param1 <= 10) {
            this.field_c = -106;
          }
          this.field_b = true;
          this.field_ub = this.field_ub - 1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        wa.field_c = new IntrusiveDeque();
        QuickChatPhraseDefinition.field_u = new IntrusiveDeque();
        mh.field_e = 0;
        hi.field_q = 6324320;
        int var1 = -7 / ((70 - param0) / 32);
    }

    private final void a(int param0, int param1, hh param2, int param3) {
        String stackIn_6_2 = null;
        try {
          boolean var5_int = (this.usesDynamicTerrain(8192));
          PointCloudEffect var6 = eg.a(param1, param3, (var5_int), true, param2);
          this.field_vb.addLast(-12328, var6);
          if (param0 <= 120) {
            byte[] var7 = (byte[]) null;
            this.a(true, (byte[]) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var5;
          StringBuilder stackIn_5_1 = new StringBuilder().append("oe.LD(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(LevelObject param0, int param1, int param2) {
        String stackIn_16_2 = null;
        try {
          param0.removeFromTerrain(this, (byte) 76);
          PointCloudEffect var6 = this.a(param0, (byte) 42);
          this.levelObjects.removeElementAt(param2);
          if (!this.field_Gb) {
            int var5 = mf.b(this.gameMode, param0.objectType, -2);
            this.field_J = this.field_J + var5;
            v.a(8, var5);
          }
          int var5Lifetime1 = 33 % ((6 - param1) / 44);
          if (1 == param0.objectType) {
            this.b(0);
          } else if (9 > param0.objectType &&
            param0.objectType != 5) {
            this.q((byte) -117);
          }
          this.a(param0, var6, -2);
          this.a((byte) 124, param0);
          if (this.minimap != null) {
            this.minimap.a(param0, 4236);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("oe.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean e(int param0) {
        if (param0 <= 90) {
          return true;
        }
        boolean stackIn_8_0 = (!this.field_Gb) && (this.field_k != null) && (this.field_k.isEmpty(-128)) && (this.field_Ab.b(-182442704));
        return stackIn_8_0;
    }

    final void e(boolean param0, int param1) {
        if (param1 != 0) {
          return;
        }
        ce var3 = this.w((byte) -123);
        int var4 = this.s(-68661304);
        boolean var5 = (this.t((byte) -48));
        if (var3 != null &&
          var4 >= 0 && (this.field_Y != var3 ||
          param0)) {
          TerrainMap.a(var4, var3, (var5), (byte) -93);
          this.field_sc = var4;
          this.field_Y = var3;
        }
        this.z(86);
    }

    private final void u(byte param0) {
        if (this.gameMode != 3) {
          return;
        }
        if (ua.field_c == null) {
          return;
        }
        if (!ua.field_c.a(this.gameMode, false)) {
          return;
        }
        int var3 = 29;
        if (param0 != 102) {
          this.updateSession(-34);
        }
        int var4 = 255 ^ var3;
        this.a(this.gameMode, false, var3, var4);
    }

    private final boolean e(boolean param0) {
        if (!param0) {
          this.field_G = (IntrusiveDeque) null;
        }
        boolean stackIn_6_0 = (!this.field_Gb) && (-16777216 > this.shipYQ16);
        return stackIn_6_0;
    }

    final void renderSession(int guard) {
        boolean stackIn_91_0 = false;
        int var11 = EscapeVector.obfuscationControl;
        if (!this.n((byte) 59)) {
          SoftwareRasterizer.d();
          fh.field_g.c(this.r(4251), 320, 250, 16777215, -1);
          return;
        }
        int var2 = this.usesDynamicTerrain(8192) ? 1 : 0;
        int var3 = (this.shipXQ16 >> 16) - 319;
        int var4 = (this.shipYQ16 >> 16) - 239;
        this.i(guard - 48, (this.shipXQ16 >> 16) + this.field_Kb, this.shipYQ16 >> 16);
        if (this.dynamicTerrain != null) {
          this.dynamicTerrain.renderTerrain(guard + 640, var3, var4);
        }
        this.b(var3, var4, (byte) -14);
        pi var5_ref_pi = (pi) (this.field_hb.first(false));
        while (var5_ref_pi != null) {
          var5_ref_pi.field_i.a(guard ^ 97, var3, var4);
          var5_ref_pi = (pi) (this.field_hb.next((byte) 70));
        }
        this.field_Xb.a(82, var3, var4);
        PointCloudEffect var12 = (PointCloudEffect) (this.field_vb.first(false));
        while (var12 != null) {
          var12.a(99, var3, var4);
          var12 = (PointCloudEffect) (this.field_vb.next((byte) 70));
        }
        if (null == this.dynamicTerrain) {
          this.a(var4, var3, (byte) -115);
          this.e(var4, guard + 8192, var3);
        }
        this.h(11905, var3, var4);
        pi var5_ref_piLifetime1 = (pi) (this.field_hb.first(false));
        while (var5_ref_piLifetime1 != null) {
          int stackIn_31_0 = var5_ref_piLifetime1.field_r;
          if (stackIn_31_0 != 0) {
            int var6 = (var5_ref_piLifetime1.field_n >> 16) + (-var3 + 1);
            int var7 = 1 + ((var5_ref_piLifetime1.field_g >> 16) - var4);
            while (var6 > -7) {
              var6 = var6 - this.worldWidth;
            }
            for (var6 = var6 + this.worldWidth; var6 < 647; var6 = var6 + this.worldWidth) {
              Sprite var8_ref_ed = mf.field_m;
              stackIn_31_0 = var2;
              if (stackIn_31_0 != 0 &&
                ej.field_a != null) {
                var8_ref_ed = ej.field_a;
              }
              var8_ref_ed.a(var6, (byte) 34, 4096, -var5_ref_piLifetime1.field_m << 8, var7);
            }
          }
          var5_ref_piLifetime1 = (pi) (this.field_hb.next((byte) 70));
        }
        int stackIn_31_0Lifetime1 = -1;
        if (stackIn_31_0Lifetime1 >= ~this.field_Ub) {
          Sprite var5_ref_ed = mb.field_f[this.field_Ub];
          if (var2 != 0 &&
            ob.field_b[this.field_Ub] != null) {
            var5_ref_ed = ob.field_b[this.field_Ub];
          }
          int var6Lifetime1 = (this.field_mb - (var5_ref_ed.fullWidth << 15) >> 16) - var3;
          int var7Lifetime1 = (this.field_E - (var5_ref_ed.fullHeight << 15) >> 16) - var4;
          if (640 - this.worldWidth >> 1 > var6Lifetime1) {
            var6Lifetime1 = var6Lifetime1 + this.worldWidth;
          } else if (var6Lifetime1 >= (640 + this.worldWidth >> 1)) {
            var6Lifetime1 = var6Lifetime1 - this.worldWidth;
          }
          int var8 = var5_ref_ed.width;
          int var9 = var5_ref_ed.height;
          if (this.field_e > 0) {
            var7Lifetime1 = this.field_e * (-240 + var7Lifetime1) / 50 + 240;
            var9 = var9 * this.field_e / 50;
            var8 = this.field_e * var8 / 50;
            var6Lifetime1 = this.field_e * (-320 + var6Lifetime1) / 50 + 320;
          }
          if (!this.field_Gb) {
            int var10 = 16777215;
            if (var2 != 0 &&
              this.dynamicTerrain != null) {
              var10 = this.dynamicTerrain.field_z;
            }
            SoftwareRasterizer.d(320, 240, var6Lifetime1 + (var8 >> 1), var7Lifetime1 + (var9 >> 1), var10);
          }
          if (this.field_e > 0) {
            var5_ref_ed.b(var6Lifetime1, var7Lifetime1, var8, var9);
          } else {
            var5_ref_ed.e(var6Lifetime1, var7Lifetime1);
          }
        }
        if (!this.field_Gb) {
          this.a(var4, (Sprite) null, 65793, var3);
          this.o((byte) -110);
        }
        this.f(var3, var4, 8);
        this.b(var3, var4, guard);
        this.b(var3, (byte) -108, var4);
        if (null != this.field_Db) {
          this.field_Db.a((byte) -87, var3, var4);
        }
        this.y(guard ^ -32369);
        if (this.levelIndex >= 0) {
          this.q(3);
        } else if (null == da.field_c &&
          !this.field_Jb) {
          dc.a((byte) 57, ek.field_c, 320, 476);
        }
        if (da.field_c == null) {
          if (this.g((byte) -91)) {
            if (this.field_rc &&
              0 <= this.levelIndex) {
              IntPoint.field_b.e(640 - IntPoint.field_b.fullWidth >> 1, -IntPoint.field_b.fullHeight + 212);
              if (-100 > this.field_c) {
                oj.a(266, 340, (byte) -106, en.field_e);
                EscapeVector.a(Integer.toString(this.field_J), 340, 266, (byte) 110);
              }
              if (this.field_c < -75) {
                oj.a(286, 340, (byte) -102, dg.field_s);
                EscapeVector.a(Integer.toString(this.field_ac), 340, 286, (byte) -5);
              }
              if (this.field_c < -50) {
                oj.a(306, 340, (byte) -116, DualLinkNode.field_g);
                EscapeVector.a(Integer.toString(this.field_Tb + this.field_Tb), 340, 306, (byte) -43);
              }
              oj.a(336, 340, (byte) 85, ad.field_c);
              EscapeVector.a(Integer.toString(this.score), 340, 336, (byte) 119);
            } else {
              IntPoint.field_b.e(640 - IntPoint.field_b.fullWidth >> 1, 480 - IntPoint.field_b.fullHeight >> 1);
            }
          }
          this.a((byte) -76);
          if (0 < this.field_ab &&
            this.field_ab <= 100) {
            fh.field_g.b(this.field_h, 320, 174 + (this.field_ab >> 1), 16777215, -1, (this.field_ab << 8) / 100);
          }
        }
        if (this.field_c > 0) {
          if (!this.field_Gb && (!this.field_ec ||
            this.levelIndex >= 0) && !this.field_Ib) {
            stackIn_91_0 = false;
            boolean decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_91_0 = true;
          }
          boolean var5 = stackIn_91_0;
          gh.a(this.field_c + 1, 256 - (this.field_c << 2), (var5), (var5));
        }
        if (null != this.minimap &&
          this.minimap.b((byte) -122)) {
          this.minimap.a((byte) -120);
        }
        return;
    }

    final void x(byte param0) {
        int var2 = 92 % ((-5 - param0) / 38);
        if (this.field_c < 0) {
          if (this.g((byte) -127) &&
            this.field_rc &&
            this.levelIndex >= 0) {
            if (this.field_c < -100) {
              this.score = this.score + this.field_J;
              this.field_J = 0;
              this.field_T = this.elapsedTicks;
            }
            if (-75 > this.field_c) {
              this.score = this.score + this.field_ac;
              v.a(8, this.field_ac);
            }
            if (this.field_c < -50) {
              this.score = this.score + (this.field_Tb + this.field_Tb);
              v.a(8, this.field_Tb + this.field_Tb);
            }
            this.f(false);
          }
          this.field_c = 0;
        }
    }

    private final void loadLevelStream(InputStream input, boolean option) throws IOException {
        try {
          this.a(option, -1, input);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.TC(" + (input != null ? "{...}" : "null") + ',' + option + ')');
        }
    }

    private final void d(int param0) {
        if (param0 != 20802) {
          return;
        }
    }

    private final int d(int param0, int param1) {
        if (param1 != 30351) {
          return -77;
        }
        return (16711680 & param0) >> 16;
    }

    private final void h(byte param0) {
        if (this.easyMode) {
          return;
        }
        this.a(0, mf.field_a, 65793, 0);
        this.a(0, -28311553, mf.field_a, 0, ib.field_a);
        if (this.field_Ub >= 0) {
          if (this.field_e > 0) {
            this.field_e = 0;
            this.field_Ub = -1;
          }
          pl.field_n.a(bc.field_c, 100, 6144 * qm.field_c / 64, 8192);
        }
        this.field_Gb = true;
        if (!this.timeHackMode &&
          this.levelIndex >= 0) {
          this.field_A = this.field_A - 1;
          jc.a(1);
          this.b((byte) -106, 0);
        }
        if (param0 >= -34) {
          this.terrainTheme = 112;
        }
    }

    private final String g(boolean param0) {
        String var2 = "12:00:00+";
        if (!param0) {
          this.field_i = (Sprite) null;
        }
        int var3 = this.elapsedTicks;
        if (this.field_a) {
          var3 = this.field_X;
        }
        if (2160000 > this.elapsedTicks ||
          this.field_a) {
          int var4 = var3 / 50;
          int var5 = var4 / 60;
          var4 = var4 - var5 * 60;
          int var6 = var5 / 60;
          var5 = var5 - var6 * 60;
          var2 = var6 + ":" + var5 / 10 + var5 % 10 + ":" + var4 / 10 + var4 % 10;
        }
        return var2;
    }

    private final void h(int param0, int param1, int param2) {
        int var4;
        int var6 = EscapeVector.obfuscationControl;
        if (param0 != 11905) {
          this.o(65);
        }
        if (this.levelIndex < 0 &&
          fa.field_c[5]) {
          for (var4 = -param1; var4 > -1024; var4 -= 1024) {
          }
          while (var4 < 640) {
            SoftwareRasterizer.h(0, 0, 448 + var4, 480);
            for (int var5 = 0; var5 < 512; var5 += 32) {
              wa.field_e.e(var4 + var5, -param2);
            }
            AccountRegistrationPanel.field_T.e(var4 + 224, -param2 + 96);
            for (int var5Lifetime1 = 256; 512 > var5Lifetime1; var5Lifetime1 += 32) {
              mj.field_f.e(var5Lifetime1 + var4, 96 - param2);
            }
            SoftwareRasterizer.c();
            SoftwareRasterizer.h(var4 + 576, 0, 640, 480);
            for (int var5Lifetime2 = 512; 1024 > var5Lifetime2; var5Lifetime2 += 32) {
              wa.field_e.e(var5Lifetime2 + var4, -param2);
            }
            for (int var5Lifetime3 = 512; var5Lifetime3 < 768; var5Lifetime3 += 32) {
              mj.field_f.e(var5Lifetime3 + var4, 96 - param2);
            }
            kn.field_h.e(var4 + 768, 96 - param2);
            SoftwareRasterizer.c();
            uf.field_e.e(var4 + 448, -param2);
            wa.field_b.e(544 + var4, -param2);
            gm.field_a.e(448 + var4, 288 - param2);
            gm.field_a.e(448 + var4, -param2 + 480);
            SoftwareRasterizer.h(0, 128 - param2, 640, 480);
            for (int var5Lifetime4 = 128; var5Lifetime4 < 1024; var5Lifetime4 += 32) {
              PacketBuffer.field_l.e(var4 + 224, -param2 + var5Lifetime4);
              cj.field_a.e(768 + var4, -param2 + var5Lifetime4);
            }
            SoftwareRasterizer.c();
            ej.field_e.e(var4 + 224, 1024 - param2);
            for (int var5Lifetime5 = 256; var5Lifetime5 < 768; var5Lifetime5 += 32) {
              dg.field_r.e(var5Lifetime5 + var4, -param2 + 1024);
            }
            q.field_G.e(768 + var4, -param2 + 1024);
            var4 += 1024;
          }
        }
        for (int var4Lifetime1 = 0; this.levelObjects.size() > var4Lifetime1; var4Lifetime1++) {
          LevelObject var7 = (LevelObject) (this.levelObjects.elementAt(var4Lifetime1));
          var7.a(param2, (byte) 109, param1);
        }
    }

    private final void a(byte param0, LevelObject param1) {
        if (param1 == null) {
          return;
        }
        if (!param1.e((byte) -5)) {
          return;
        }
        this.field_S = this.field_S + 1;
        if (this.field_L != this.field_S) {
          return;
        }
        try {
          ua.field_c.a((byte) -64, this.gameMode, oj.k(64), this.levelIndex);
          int var3_int = 90 % ((42 - param0) / 62);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.VF(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(int param0, int param1) {
        int var3 = 71 % ((param1 - 6) / 36);
    }

    private final void b(int param0, DataInputStream param1, byte param2) throws IOException {
        String stackIn_12_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          this.field_N = new IntrusiveDeque();
          if (param0 >= 1) {
            int var4_int = param1.readUnsignedByte();
            for (int var5 = 0; var5 < var4_int; var5++) {
              ic var6 = new ic();
              int dupTemp$0 = param1.readUnsignedShort() << 16;
              var6.field_j = dupTemp$0;
              var6.field_p = dupTemp$0;
              int dupTemp$1 = param1.readUnsignedShort() << 16;
              var6.field_l = dupTemp$1;
              var6.field_q = dupTemp$1;
              var6.field_i = (int)(32769.0 * Math.random()) - 16384;
              var6.field_h = -16384 + (int)(32769.0 * Math.random());
              this.field_N.addLast(-12328, var6);
            }
          }
          if (param2 != -17) {
            this.field_lb = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var4;
          StringBuilder stackIn_11_1 = new StringBuilder().append("oe.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void A(int param0) {
        double var2 = (double)this.field_Hb;
        double var4 = (double)this.field_pb;
        if (param0 > -123) {
          this.field_O = 85;
        }
        double var6 = 1.0 / Math.sqrt(var4 * var4 + var2 * var2);
        var2 = var2 * var6;
        var4 = var4 * var6;
        double var6Lifetime1 = (double)this.shipVelocityYQ16 * var4 + var2 * (double)this.shipVelocityXQ16;
        if (var6Lifetime1 > -32768.0) {
          if (524288.0 < var6Lifetime1) {
            this.h((byte) -50);
            if (!this.field_rc) {
              return;
            }
            if (this.levelIndex < 0 &&
              33554432 <= this.shipYQ16) {
              this.a(this.gameMode, false, 8, 247);
            }
            return;
          }
          var6Lifetime1 = (!(32768.0 < var6Lifetime1)) ? (var6Lifetime1 + 32768.0) : (2.0 * var6Lifetime1);
          this.shipVelocityXQ16 = (int)((double)this.shipVelocityXQ16 - var6Lifetime1 * var2);
          this.shipVelocityYQ16 = (int)((double)this.shipVelocityYQ16 - var6Lifetime1 * var4);
          int var8 = (int)var6Lifetime1 >> 4;
          if (var8 > 6144) {
            var8 = 6144;
          }
          pl.field_n.a(co.field_d, 100, qm.field_c * var8 / 64, 8192);
        }
    }

    private final void z(int param0) {
        if (this.field_Y == null) {
          return;
        }
        if (this.field_sc < 0) {
          return;
        }
        if ((!this.field_Gb ||
          this.field_A != 0) &&
          (!this.g((byte) -113) ||
          !kl.a(this.levelIndex + 1, this.gameMode, true))) {
          if ((this.field_Jb ||
            this.field_Cb) && this.field_c >= 0 && 32 >= this.field_c) {
            wa.a((32 - this.field_c) * this.field_sc / 32, 32471);
          }
        } else if (this.field_c >= -64 &&
          this.field_c <= 0) {
          wa.a(this.field_sc * -this.field_c / 64, 32471);
        }
        if (param0 < 28) {
          boolean discarded$0 = this.e(71);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13 = EscapeVector.obfuscationControl;
        int[] var14 = new int[32];
        int[] var18 = var14;
        for (int var10 = param4; param7 > var10; var10++) {
          var14[var10] = ae.a((param0 << 5) + var10, 255);
        }
        int var10Lifetime1 = 15 - param2 + (param1 << 5);
        int var11 = -param5 + ((param0 << 5) - 9600);
        if (param6 != 10943) {
          return;
        }
        if (var10Lifetime1 > 0) {
          var11 = this.a(var11, param1 - 1, param7, false, 32, param4, -var10Lifetime1 + 32, param0, var18);
        }
        for (int var12 = param1; var12 < param3; var12++) {
          var11 = this.a(var11, var12, param7, false, 32, param4, 0, param0, var18);
        }
        int var12Lifetime1 = param2 + 480 & 31;
        if (var12Lifetime1 > 0) {
          int discarded$0 = this.a(var11, param3, param7, false, var12Lifetime1, param4, 0, param0, var18);
        }
    }

    private final void q(byte param0) {
        if ((this.field_rc || this.easyMode) &&
          this.levelIndex >= 0 &&
          !this.field_Gb) {
          this.field_bc = this.field_bc + 1;
          c.m(-45);
          if (this.field_bc == 76) {
            this.a(this.gameMode, false, 12, 243);
          }
        }
        if (param0 >= -115) {
          this.field_i = (Sprite) null;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        int var12 = EscapeVector.obfuscationControl;
        if (this.field_oc < 50) {
          IntrusiveNode var4 = this.field_C.first(false);
          int var5 = 0;
          while (true) {
            int stackIn_3_0 = this.field_ub;
            int stackIn_3_1 = var5;
            if (stackIn_3_0 <= stackIn_3_1) {
              break;
            }
            am var6 = (am) (var4);
            int var7 = var6.field_j - param2;
            int stackIn_26_0 = -1;
            int stackIn_26_1 = var7;
            if (stackIn_26_0 <= stackIn_26_1 &&
              var7 < 481) {
              int var8 = var6.field_i - param0;
              int var9 = var6.field_h - param0;
              while (0 < var9) {
                var9 = var9 - this.worldWidth;
                var8 = var8 - this.worldWidth;
              }
              var9 = var9 + this.worldWidth;
              var8 = var8 + this.worldWidth;
              while (var8 < 640) {
                int stackIn_3_0Lifetime1 = ~var8;
                int stackIn_3_1Lifetime1 = -1;
                int stackIn_17_0 = (stackIn_3_0Lifetime1 > stackIn_3_1Lifetime1) ? 0 : var8;
                int var10 = stackIn_17_0;
                int stackIn_20_0 = (var9 > 640) ? 640 : var9;
                int var11 = stackIn_20_0;
                while (var10 < var11) {
                  SoftwareRasterizer.a(var10, var7, 16744512);
                  SoftwareRasterizer.a(var10, var7 - 1, 8396804);
                  SoftwareRasterizer.a(var10, 1 + var7, 8396804);
                  var10++;
                }
                var8 = var8 + this.worldWidth;
                var9 = var9 + this.worldWidth;
              }
            }
            var5++;
            var4 = var4.next;
          }
        }
        int stackIn_26_0Lifetime1 = param1;
        int stackIn_26_1Lifetime1 = -108;
        if (stackIn_26_0Lifetime1 != stackIn_26_1Lifetime1) {
          byte[] var13 = (byte[]) null;
          this.a(true, (byte[]) null, true);
        }
    }

    private final void a(DataInputStream param0, int param1, byte param2) throws IOException {
        String stackIn_15_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          this.field_s = new IntrusiveDeque();
          if (param1 < 7) {
            return;
          }
          int var4_int = 28 % ((param2 + 29) / 46);
          int var5 = param0.readUnsignedByte();
          if (0 == var5) {
            return;
          }
          for (int var6 = 0; var6 < var5; var6++) {
            int var7 = param0.readUnsignedByte();
            if (mf.a(var7, -64)) {
              IntValueNode var8 = new IntValueNode(var7);
              this.field_s.addLast(-12328, var8);
              this.j(var7, 101);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("oe.HB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, DataInputStream param1, byte param2) throws IOException {
        String stackIn_13_2 = null;
        try {
          if (5 > param0) {
            this.field_Q = 0;
          } else {
            this.field_Q = param1.readUnsignedByte();
            if (this.field_Q != 0 &&
              this.field_Q != 1) {
              this.field_Q = 0;
            }
          }
          if (param2 < 28) {
            int discarded$0 = this.a(-118, -50, true, 65);
          }
          this.u(-15474);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("oe.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void y(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (param0 != -32369) {
          this.field_Jb = true;
        }
        if (this.field_Qb > 0) {
          int var2 = -(this.field_i.fullWidth / 2) + 320;
          if (this.field_Qb < 31) {
            if (null == da.field_c &&
              !this.field_Jb) {
              mf.a(4, var2, 31 - this.field_Qb, this.field_i, -99);
            }
          } else if (this.field_Qb <= 120) {
            ge.a(-this.field_i.fullWidth, this.field_i.pixels, 0, -this.field_i.fullWidth + SoftwareRasterizer.width, (byte) -126, 0, 0, -this.field_i.fullHeight, SoftwareRasterizer.pixels, 3 * SoftwareRasterizer.width + (-1 + var2));
            ge.a(-this.field_i.fullWidth, this.field_i.pixels, 0, -this.field_i.fullWidth + SoftwareRasterizer.width, (byte) -84, 0, 0, -this.field_i.fullHeight, SoftwareRasterizer.pixels, var2 + 1 + 3 * SoftwareRasterizer.width);
            ge.a(-this.field_i.fullWidth, this.field_i.pixels, 0, -this.field_i.fullWidth + SoftwareRasterizer.width, (byte) -100, 0, 0, -this.field_i.fullHeight, SoftwareRasterizer.pixels, -1 + (var2 + 5 * SoftwareRasterizer.width));
            ge.a(-this.field_i.fullWidth, this.field_i.pixels, 0, SoftwareRasterizer.width - this.field_i.fullWidth, (byte) -81, 0, 0, -this.field_i.fullHeight, SoftwareRasterizer.pixels, 1 + (var2 + 5 * SoftwareRasterizer.width));
            this.field_i.e(var2, 4);
          } else if (da.field_c == null &&
            !this.field_Jb) {
            mf.a(4, var2, -120 + this.field_Qb, this.field_i, -123);
          }
        }

    }

    private final int c(boolean param0) {
        if (!param0) {
          ic var3 = (ic) null;
          this.a((ic) null, 48);
        }
        int var2 = this.terrainTheme;
        if (var2 == 0) {
          return 0;
        }
        if (var2 == 2) {
          return 1;
        }
        if (var2 == 1) {
          return 2;
        }
        if (var2 == 3) {
          return 3;
        }
        if (var2 == 4) {
          return 4;
        }
        if (var2 == 5) {
        }
        return 0;
    }

    final void updateSession(int guard) {
        int stackIn_228_2 = 0;
        int stackIn_231_2 = 0;
        int stackIn_247_3;
        int stackIn_260_0 = 0;
        int stackIn_543_0 = 0;
        int stackIn_543_1 = 0;
        int[] stackIn_586_0 = null;
        int stackIn_718_2 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        double var6_double = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var10_double = 0.0;
        int var12 = 0;
        int var13_int = 0;
        int var16 = 0;
        int var17_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var9Lifetime3;
        int var24Lifetime1;
        Object var32 = null;
        Object var33 = null;
        Object var34 = null;
        Object var37 = null;
        Object var40 = null;
        Object var21_ref = null;
        Object var22 = null;
        Object var29 = null;
        Object var44 = null;
        int var30 = EscapeVector.obfuscationControl;
        if (this.dynamicTerrain != null) {
          pf.e((byte) -106);
        }
        if (this.levelIndex < 0) {
          this.field_pc = -1 + this.field_pc & 1023;
        }
        if (this.minimap != null) {
          this.minimap.field_c = this.minimap.field_c + 1;
        }
        scanLoop1: while (true) {
          if (pn.p(-116)) {
            if (~nk.field_n == ~of.field_c &&
              this.minimap != null) {
              this.minimap.e((byte) -101);
              if (this.minimap.b((byte) -107)) {
                this.stopSessionAudio((byte) -41);
              }
            }
            if (this.minimap != null &&
              this.minimap.b((byte) -114) &&
              nk.field_n == 13) {
              this.minimap.e((byte) -101);
            }
            if (nk.field_n == 13 && (!this.field_Gb ||
              this.field_A != 0) && !this.field_Jb) {
              if (this.minimap.b((byte) -122)) {
                this.minimap.e((byte) -101);
              }
              this.stopSessionAudio((byte) -41);
              da.field_c = new tf();
              mj.field_d = 0;
              gi.a((byte) -56);
              return;
            }
            if (od.field_k &&
              nk.field_n == 12) {
              this.field_c = 63;
              this.field_Ub = 1;
              this.field_Ib = true;
              this.field_Gb = false;
              this.field_rc = false;
              System.out.println("Level skip cheat activated");
            }
            if (od.field_k &&
              nk.field_n == 11) {
              boolean stackIn_35_1 = !(this.easyMode);
              this.easyMode = stackIn_35_1;
              boolean stackIn_38_1 = !(this.easyMode);
              this.field_rc = stackIn_38_1;
              System.out.println("Easypeasy cheat activated");
            }
            if (!od.field_k) {
              continue;
            }
            int stackIn_82_0 = ~nk.field_n;
            int stackIn_82_1 = -11;
            if (stackIn_82_0 != stackIn_82_1) {
              continue;
            }
            boolean stackIn_46_1 = !(this.timeHackMode);
            this.timeHackMode = stackIn_46_1;
            boolean stackIn_49_1 = !(this.timeHackMode);
            this.field_rc = stackIn_49_1;
            System.out.println("Timehack checking cheat activated");
            continue;
          }
          if (this.minimap.b((byte) -110)) {
            return;
          }
          this.field_sb = this.field_sb + 1;
          if (!this.n((byte) 94)) {
            return;
          }
          this.c(0);
          if (this.field_j > 0) {
            this.field_j = this.field_j - 1;
          }
          if (!this.field_Gb &&
            !this.field_Ib &&
            !this.field_Jb && (!this.field_ec ||
            0 <= this.levelIndex)) {
            if (this.field_c <= 0) {
              if (this.levelIndex < 0) {
                break scanLoop1;
              }
              if (2160000 <= this.elapsedTicks) {
                break scanLoop1;
              }
              this.elapsedTicks = this.elapsedTicks + 1;
              hi.d(false);
              break scanLoop1;
            }
            if (this.field_c == 64) {
              pl.field_n.a(dd.field_g, 100, qm.field_c * 1024 / 64, 8192);
            }
            this.field_c = this.field_c - 1;
            if (0 == this.field_c) {
              this.field_c = -64;
            }
            this.stopSessionAudio((byte) -41);
            return;
          }
          if (this.field_Jb ||
            this.field_c < 0 ||
            this.field_Qb == 0 ||
            this.levelIndex < 0 &&
            this.field_z == 0 &&
            !this.field_zb) {
            int stackIn_82_0Lifetime1 = -1;
            int stackIn_82_1Lifetime1 = ~this.field_c;
            if (stackIn_82_0Lifetime1 == stackIn_82_1Lifetime1) {
              hl var31 = hl.c(dd.field_g, 100, qm.field_c * 1024 / 64, 8192);
              var31.e();
              pl.field_n.a(var31);
            }
            this.field_c = this.field_c + 1;
          }
          if (this.g((byte) -61) &&
            this.field_rc &&
            0 <= this.levelIndex) {
            if (this.field_c == -100) {
              this.score = this.score + this.field_J;
              this.field_T = this.elapsedTicks;
              this.field_J = 0;
              pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
            }
            if (this.field_c == -75) {
              var2 = ei.a(0, this.field_ac, this.gameMode);
              this.score = this.score + var2;
              v.a(8, var2);
              pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
            }
            if (this.field_c == -50) {
              var2 = ei.a(0, this.field_Tb * 2, this.gameMode);
              this.score = this.score + var2;
              v.a(8, var2);
              pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
            }
            this.f(false);
          }
          if (this.field_c < 64) {
            if (!this.field_Ib &&
              !this.field_Jb) {
              break scanLoop1;
            }
            this.stopSessionAudio((byte) -41);
            this.p((byte) 9);
            return;
          }
          if ((this.field_Gb ||
            this.field_Jb) &&
            !this.field_Cb) {
            if (this.field_A == 0 ||
              this.field_Jb) {
              if (this.levelIndex >= 0) {
                this.b((byte) 36, this.score + this.field_J, this.levelIndex);
              }
              this.p(0);
              return;
            }
          } else if (this.g((byte) -122) ||
            this.field_Cb) {
            this.field_Jb = false;
            this.levelIndex = this.levelIndex + 1;
            this.field_w = this.field_bc;
            this.field_Cb = false;
            this.field_ic = this.field_u;
            if (this.levelIndex == 2 ||
              (this.levelIndex & 3) == 0) {
              if (this.levelIndex == 0) {
                this.field_Qb = 0;
                this.a(164, (byte) 55, m.field_n);
              }
              this.startSession((byte) -40);
            }
            if (this.levelData != null &&
              this.levelData.length == this.levelIndex) {
              this.b((byte) -122, this.score, this.levelData.length);
              this.E(-3);
              this.p(0);
              return;
            }
            this.field_j = 314;
          }
          this.j((byte) -110);
          return;

        }
        var2 = 0;
        while (var2 < 64) {
          boolean stackIn_137_0 = this.field_Xb.field_E[this.field_Sb + var2];
          if (stackIn_137_0) {
            this.field_qc = this.field_qc - 1;
            this.field_Xb.field_E[this.field_Sb + var2] = false;
          }
          var2++;
        }
        this.field_Xb.a();
        this.field_Zb = 15 & 1 + this.field_Zb;
        this.d(true);
        boolean stackIn_137_0Lifetime1 = this.field_Gb;
        if (!stackIn_137_0Lifetime1) {
          if (!this.field_rb) {
            if (ik.field_h[97] &&
              !ik.field_h[96]) {
              if (!this.field_jc) {
                this.field_I = 252 & 7 + this.field_I;
              } else {
                this.field_I = this.field_I + 2 & 255;
              }
            }
            this.shipVelocityYQ16 = this.shipVelocityYQ16 + this.field_qb;
            if (ik.field_h[96] &&
              !ik.field_h[97]) {
              if (!this.field_kc) {
                this.field_I = -4 + this.field_I & 252;
              } else {
                this.field_I = -2 + this.field_I & 255;
              }
            }
          }
          if (ik.field_h[98] &&
            this.field_ac > 0 &&
            0 == this.field_e) {
            this.field_jb.f(1024 * qm.field_c / 64);
            this.field_kc = false;
            this.field_rb = false;
            this.field_jc = false;
            double var2_double = 0.02454369260617026 * (double)this.field_I;
            this.shipVelocityXQ16 = this.shipVelocityXQ16 + (int)((double)this.field_ib * Math.sin(var2_double));
            this.shipVelocityYQ16 = this.shipVelocityYQ16 - (int)((double)this.field_ib * Math.cos(var2_double));
            if (this.levelIndex >= 0) {
              if (!this.easyMode) {
                this.field_ac = this.field_ac - 1;
              }
              ji.a(true, -1);
            }
            if (this.field_ac == 0) {
              this.a(-111, rl.field_l);
            }
            for (var4 = 0; var4 < 64; var4++) {
              this.field_Xb.field_E[this.field_Sb + var4] = true;
              double var5_double = var2_double + 0.2 * Math.random() - 0.1;
              double var7_double = (double)this.field_ib * 616.8094117647058 * (0.5 + Math.random());
              int var9 = -(int)(var7_double * Math.sin(var5_double));
              int var10 = (int)(var7_double * Math.cos(var5_double));
              this.field_Xb.field_x[this.field_Sb + var4] = this.shipXQ16 + this.shipVelocityXQ16;
              this.field_Xb.field_A[this.field_Sb + var4] = this.shipYQ16 + this.shipVelocityYQ16;
              double var11_double = Math.random();
              this.field_Xb.field_y[var4 + this.field_Sb] = (int)((double)var9 * var11_double);
              this.field_Xb.field_C[this.field_Sb + var4] = (int)(var11_double * (double)var10);
              this.field_Xb.field_w[this.field_Sb + var4] = 0;
              this.field_Xb.i(var4 + this.field_Sb);
              this.field_Xb.field_y[this.field_Sb + var4] = var9 + this.shipVelocityXQ16;
              this.field_Xb.field_C[var4 + this.field_Sb] = var10 + this.shipVelocityYQ16;
            }
            this.field_qc = this.field_qc + 64;
          } else {
            this.field_jb.j(0);
          }
        } else {
          this.field_jb.j(0);
        }
        var2 = 0;
        if (this.levelIndex < 0) {
          if (this.shipYQ16 >= 33554432) {
            if (18874368 > this.shipXQ16 ||
              this.shipXQ16 >= 48234496) {
              var2 = 1;
            }
            if (this.shipYQ16 < 35651584 &&
              this.shipXQ16 >= 28311552 &&
              this.shipXQ16 < 38797312) {
              var2 = 1;
            }
          }
          int var3 = (this.shipVelocityYQ16 >> 8) * (this.shipVelocityYQ16 >> 8) + (this.shipVelocityXQ16 >> 8) * (this.shipVelocityXQ16 >> 8);
          if (this.shipYQ16 >= 65011712 &&
            var3 > 50176) {
            var4 = -this.shipYQ16 + 67108864;
            if (1048576 > var4 ||
              (-1048576 + var4 >> 6) + 50176 < var3) {
              var2 = 1;
            }
          }
        }
        if (!this.field_Gb && (!bc.field_d &&
          ik.field_h[83] ||
          (ik.field_h[81] ||
          var2 != 0)) && (this.field_Tb > 0 &&
          this.field_e == 0)) {
          if (var2 == 0) {
            this.field_db = true;
          }
          if (this.levelIndex >= 0) {
            this.field_Tb = this.field_Tb - 1;
            ca.b((byte) 76);
          }
          if (0 == this.field_Tb) {
            this.a(-107, rc.field_c);
            pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
          }
          this.field_Bb = true;
          this.field_rb = false;
          this.field_v.f(qm.field_c * 16384 / 64);
          boolean decompiledFrameRemainder1 = false;
        }
        else {
          this.field_Bb = false;
          this.field_v.f(0);
        }
        this.a(true);
        int var3Lifetime1 = 0;
        var4 = 0;
        long var5_long = 0L;
        long var7_long = 0L;
        int var9Lifetime1 = 0;
        while (this.levelObjects.size() > var9Lifetime1) {
          LevelObject var32_ref = (LevelObject) (this.levelObjects.elementAt(var9Lifetime1));
          int stackIn_324_0 = ~var32_ref.objectType;
          int stackIn_324_1 = -4;
          if (stackIn_324_0 == stackIn_324_1 ||
            4 == var32_ref.objectType) {
            var32_ref.field_h = false;
            if (!this.field_Gb) {
              int var11 = 12 + var32_ref.x << 16;
              var12 = var32_ref.y + 12 << 16;
              double var13 = (double)(-var11 + this.shipXQ16);
              double var15 = (double)(this.shipYQ16 - var12);
              if ((double)(-this.worldWidth << 15) > var13) {
                var13 = var13 + (double)(this.worldWidth << 16);
              } else if ((double)(this.worldWidth << 15) <= var13) {
                var13 = var13 - (double)(this.worldWidth << 16);
              }
              double var17 = var15 * var15 + var13 * var13;
              if (var17 < 171798691840000.0) {
                var32_ref.field_h = true;
                var19 = this.b(1310720, var11, 96, var12);
                var19 = var19 * var19;
                long var20_long = (long)this.c(var11, 106) * (long)var19;
                if (var32_ref.objectType == 3) {
                  var4 = var4 + var19;
                  var7_long = var7_long + var20_long;
                } else {
                  var5_long = var5_long + var20_long;
                  var3Lifetime1 = var3Lifetime1 + var19;
                }
                if (!this.field_rb) {
                  int var22_int = (int)(var13 * 4294967296.0 / var17);
                  int var23_int = (int)(4294967296.0 * var15 / var17);
                  if (var32_ref.objectType == 3) {
                    var22_int = -var22_int;
                    var23_int = -var23_int;
                  }
                  this.shipVelocityYQ16 = this.shipVelocityYQ16 + var23_int;
                  this.shipVelocityXQ16 = this.shipVelocityXQ16 + var22_int;
                }
              }
            }
          }
          var9Lifetime1++;
        }
        hl stackIn_227_0 = this.field_Wb;
        int stackIn_227_1 = (int)Math.sqrt((double)var3Lifetime1 + 0.5);
        if (0 == var3Lifetime1) {
          stackIn_228_2 = 8192;
        } else {
          stackIn_228_2 = (int)(var5_long / (long)var3Lifetime1);
        }
        ((hl) (Object) stackIn_227_0).f(stackIn_227_1, stackIn_228_2);
        hl stackIn_230_0 = this.field_wb;
        int stackIn_230_1 = (int)Math.sqrt((double)var4 + 0.5);
        if (var4 != 0) {
          stackIn_231_2 = (int)(var7_long / (long)var4);
        } else {
          stackIn_231_2 = 8192;
        }
        ((hl) (Object) stackIn_230_0).f(stackIn_230_1, stackIn_231_2);
        int var3Lifetime2 = 0;
        long var4_long = 0L;
        if (this.field_oc < 50) {
          IntrusiveNode var6_ref_hg = this.field_C.first(false);
          for (var7 = 0; var7 < this.field_ub; var7++) {
            am var33_ref = (am) (var6_ref_hg);
            int var9Lifetime2 = var33_ref.field_i << 16;
            int var10Lifetime1 = var33_ref.field_i << 16;
            int var11Lifetime1 = var33_ref.field_j << 16;
            while (this.shipXQ16 < var9Lifetime2) {
              var9Lifetime2 = var9Lifetime2 - (this.worldWidth << 16);
              var10Lifetime1 = var10Lifetime1 - (this.worldWidth << 16);
            }
            if (!(var10Lifetime1 <= this.shipXQ16)) {
              var12 = this.shipXQ16;
            } else if (this.shipXQ16 >= this.worldWidth + var10Lifetime1 >> 1) {
              var12 = var9Lifetime2;
            } else {
              var12 = var10Lifetime1;
            }
            var13_int = this.b(1310720, var12, 96, var11Lifetime1);
            var13_int = var13_int * var13_int;
            var4_long = var4_long + (long)this.c(var12, 123) * (long)var13_int;
            var3Lifetime2 = var3Lifetime2 + var13_int;
            var6_ref_hg = var6_ref_hg.next;
          }
        }
        hl stackIn_246_0 = this.field_r;
        int stackIn_246_1 = ie.field_q / 100;
        int stackIn_246_2 = (int)Math.sqrt(0.5 + (double)var3Lifetime2);
        if (var3Lifetime2 == 0) {
          stackIn_247_3 = 8192;
        } else {
          stackIn_247_3 = (int)(var4_long / (long)var3Lifetime2);
        }
        ((hl) (Object) stackIn_246_0).a(stackIn_246_1, stackIn_246_2, stackIn_247_3);
        ic var3_ref_ic = (ic) (this.field_N.first(false));
        while (var3_ref_ic != null) {
          if (null == var3_ref_ic.field_g) {
            var3_ref_ic.field_m = new tl();
            var3_ref_ic.field_g = hl.a(ci.field_a, 256, 0, 8192);
            var3_ref_ic.field_m.field_k = hl.a(qi.field_J, 256, 0, 8192);
            var3_ref_ic.field_m.field_q = hl.a(qi.field_J, 256, 0, 8192);
            var3_ref_ic.field_g.h(-1);
            var3_ref_ic.field_m.field_k.h(-1);
            var3_ref_ic.field_m.field_q.h(-1);
            var3_ref_ic.field_g.e((int)(Math.random() * (double)ci.field_a.field_h.length));
            pl.field_n.a(var3_ref_ic.field_g);
            pl.field_n.a(var3_ref_ic.field_m);
          }
          var4 = this.shipXQ16 - var3_ref_ic.field_p;
          var5 = this.shipYQ16 - var3_ref_ic.field_q;
          if (!(-this.worldWidth << 15 <= var4)) {
            var4 = var4 + (this.worldWidth << 16);
          } else if (var4 >= this.worldWidth << 15) {
            var4 = var4 - (this.worldWidth << 16);
          }
          var6_double = (double)var5 * (double)var5 + (double)var4 * (double)var4;
          stackIn_260_0 = (!this.field_Gb &&
            171798691840000.0 > var6_double) ? (1) : (0);
          var8 = stackIn_260_0;
          if (var8 == 0) {
            var3_ref_ic.field_m.field_p = 0;
            var4 = var3_ref_ic.field_j - var3_ref_ic.field_p;
            if (-this.worldWidth << 15 > var4) {
              var4 = var4 + (this.worldWidth << 16);
            } else if ((this.worldWidth << 15) <= var4) {
              var4 = var4 - (this.worldWidth << 16);
            }
            var4 = 32 + var4 >> 6;
            var5 = var3_ref_ic.field_l - var3_ref_ic.field_q + 16 >> 5;
            if (var5 > -64 &&
              var5 < 64) {
              var5 = (0 >= var5) ? -64 : 64;
            }
            if (var4 > -64 &&
              var4 < 64) {
              var4 = (var4 > 0) ? 64 : -64;
            }
            var9Lifetime3 = 30000 - (var3_ref_ic.field_h >> 6);
          } else {
            var6_double = Math.sqrt(var6_double);
            var3_ref_ic.field_m.field_k.i((int)(Math.pow(0.8464491362763915, var6_double / 13107200.0) * 6668800.0) / ie.field_q);
            var3_ref_ic.field_m.field_q.i((int)(Math.pow(0.5646606914212549, var6_double / 13107200.0) * 59980800.0) / ie.field_q);
            var3_ref_ic.field_m.field_p = (int)(Math.pow(0.1, var6_double / 13107200.0) * 26214.4);
            var3_ref_ic.field_l = var3_ref_ic.field_q;
            var6_double = 2949.12 / var6_double;
            var3_ref_ic.field_j = var3_ref_ic.field_p;
            var9Lifetime3 = 40000;
            var5 = (int)((double)var5 * var6_double);
            var4 = (int)((double)var4 * var6_double);
          }
          if (var3_ref_ic.field_o == 0) {
            var3_ref_ic.field_o = var9Lifetime3;
          } else {
            var3_ref_ic.field_o = var3_ref_ic.field_o + (4 - var3_ref_ic.field_o + var9Lifetime3 >> 3);
          }
          var3_ref_ic.field_g.i(var3_ref_ic.field_o * 256 / ie.field_q);
          var3_ref_ic.field_h = var3_ref_ic.field_h + var5;
          var3_ref_ic.field_i = var3_ref_ic.field_i + var4;
          if (var8 == 0) {
            var3_ref_ic.field_i = var3_ref_ic.field_i + (32 + var3_ref_ic.field_i >> 6);
            var3_ref_ic.field_h = var3_ref_ic.field_h + (var3_ref_ic.field_h + 32 >> 6);
          } else {
            var3_ref_ic.field_h = var3_ref_ic.field_h - (var3_ref_ic.field_h + 32 >> 6);
            var3_ref_ic.field_i = var3_ref_ic.field_i - (var3_ref_ic.field_i + 32 >> 6);
          }
          var6_double = (double)var3_ref_ic.field_i * (double)var3_ref_ic.field_i + (double)var3_ref_ic.field_h * (double)var3_ref_ic.field_h;
          double stackIn_288_0 = (var8 != 0) ? 38654705664.0 : 9663676416.0;
          var10_double = stackIn_288_0;
          if (var10_double < var6_double) {
            var6_double = Math.sqrt(var10_double / var6_double);
            var3_ref_ic.field_h = (int)((double)var3_ref_ic.field_h * var6_double);
            var3_ref_ic.field_i = (int)((double)var3_ref_ic.field_i * var6_double);
          }
          boolean decompiledFrameRemainder0 = true;
          var3_ref_ic.field_q = var3_ref_ic.field_q + var3_ref_ic.field_h;
          var3_ref_ic.field_p = ((this.worldWidth << 16) + (var3_ref_ic.field_p + var3_ref_ic.field_i)) % (this.worldWidth << 16);
          var12 = this.b(4194304, var3_ref_ic.field_p, 96, var3_ref_ic.field_q);
          var13_int = this.c(var3_ref_ic.field_p, 117);
          var3_ref_ic.field_g.f(var12 >> 1, var13_int);
          var3_ref_ic.field_m.field_s = var12;
          var3_ref_ic.field_m.field_n = var13_int;
          int var14 = this.worldWidth + (var3_ref_ic.field_p >> 16);
          int var15_int = var3_ref_ic.field_q >> 16;
          var16 = var14 - 8;
          var17_int = -8 + var15_int;
          if (!this.field_Gb) {
            if (this.field_Bb) {
              this.field_Hb = 0;
              this.field_pb = 0;
              this.a(s.field_H, var17_int, var16, (byte) 83);
              if ((this.field_Hb | this.field_pb) != 0) {
                int var18 = var3_ref_ic.field_i + 3 * this.shipVelocityXQ16 >> 2;
                this.shipVelocityXQ16 = this.shipVelocityXQ16 - var18;
                var19 = this.shipVelocityYQ16 * 3 + var3_ref_ic.field_h >> 2;
                this.shipVelocityYQ16 = this.shipVelocityYQ16 - var19;
                double var20_double = (double)this.field_Hb;
                double var22_double = (double)this.field_pb;
                double var24_double = 1.0 / Math.sqrt(var20_double * var20_double + var22_double * var22_double);
                var22_double = var22_double * var24_double;
                var20_double = var20_double * var24_double;
                double var24_doubleLifetime1 = 49152.0 + ((double)this.shipVelocityXQ16 * var20_double + (double)this.shipVelocityYQ16 * var22_double);
                if (var24_doubleLifetime1 > 0.0) {
                  this.shipVelocityYQ16 = (int)((double)this.shipVelocityYQ16 - var24_doubleLifetime1 * var22_double);
                  this.shipVelocityXQ16 = (int)((double)this.shipVelocityXQ16 - var24_doubleLifetime1 * var20_double);
                }
                this.shipVelocityXQ16 = this.shipVelocityXQ16 + var18;
                this.shipVelocityYQ16 = this.shipVelocityYQ16 + var19;
                this.a(var3_ref_ic, 5);
                var12 = (int)var24_doubleLifetime1 >> 4;
                if (var12 > 6144) {
                  var12 = 6144;
                }
                pl.field_n.a(co.field_d, 100, var12 * qm.field_c / 64, 8192);
                decompiledFrameRemainder0 = false;
              }
            } else if (this.a(false, var17_int, var16, s.field_H)) {
              this.h((byte) -62);
              this.a(var3_ref_ic, 5);
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            if (0 <= this.field_Ub &&
              this.field_e == 0) {
              Sprite var18_ref_ed = mb.field_f[this.field_Ub];
              for (var19 = -var16 + (this.field_mb - (var18_ref_ed.fullWidth << 15) >> 16); -this.worldWidth >> 1 > var19; var19 = var19 + this.worldWidth) {
              }
              while (var19 >= this.worldWidth >> 1) {
                var19 = var19 - this.worldWidth;
              }
              if (ln.a(s.field_H, 0, var17_int, var18_ref_ed, var19, -(var18_ref_ed.fullHeight << 15) + this.field_E >> 16)) {
                this.k((byte) 64);
                this.a(var3_ref_ic, 5);
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0 &&
              this.b(var16, s.field_H, var17_int, -1)) {
              if (!this.field_Gb) {
                int var18Lifetime2 = hc.a(this.gameMode, (byte) 77);
                this.field_J = this.field_J + var18Lifetime2;
                v.a(8, var18Lifetime2);
              }
              this.a(var3_ref_ic, 5);
            }
          }
          var3_ref_ic = (ic) (this.field_N.next((byte) 70));
        }
        this.field_oc = (1 + this.field_oc) % 200;
        if (!this.field_Gb ||
          this.field_Ub >= 0) {
          int var3Lifetime3 = 0;
          var4 = 0;
          if (!this.field_Gb) {
            var4 = this.shipVelocityYQ16;
            var3Lifetime3 = this.shipVelocityXQ16;
          }
          int stackIn_324_0Lifetime1 = ~this.field_Ub;
          int stackIn_324_1Lifetime1 = -1;
          if (stackIn_324_0Lifetime1 <= stackIn_324_1Lifetime1) {
            var3Lifetime3 = (this.field_Ob >> 2) + var3Lifetime3 - (var3Lifetime3 >> 2);
            var4 = (this.field_o >> 2) + (var4 - (var4 >> 2));
          }
          double var5_doubleLifetime1 = (double)var4 * (double)var4 + (double)var3Lifetime3 * (double)var3Lifetime3;
          if (1717986918400.0 <= var5_doubleLifetime1) {
            var5_doubleLifetime1 = Math.sqrt(1717986918400.0 / var5_doubleLifetime1);
            this.shipVelocityXQ16 = (int)((double)this.shipVelocityXQ16 * var5_doubleLifetime1);
            this.field_Ob = (int)((double)this.field_Ob * var5_doubleLifetime1);
            this.field_o = (int)((double)this.field_o * var5_doubleLifetime1);
            this.shipVelocityYQ16 = (int)((double)this.shipVelocityYQ16 * var5_doubleLifetime1);
          }
        }
        boolean var3Lifetime4 = false;
        if (!this.field_Gb) {
          if (!this.field_rb) {
            int stackIn_337_0 = (this.shipYQ16 < 33554432) ? 0 : 1;
            var4 = stackIn_337_0;
            this.field_M = this.field_M + this.shipVelocityXQ16;
            this.shipXQ16 = this.shipXQ16 + this.shipVelocityXQ16;
            this.shipYQ16 = this.shipYQ16 + this.shipVelocityYQ16;
            int stackIn_340_0 = (!this.field_kc) ? 0 : 1;
            var5 = stackIn_340_0;
            int stackIn_343_0 = (!this.field_jc) ? 0 : 1;
            var6 = stackIn_343_0;
            this.field_q = false;
            this.field_jc = false;
            this.field_kc = false;
            if (!this.field_Bb) {
              this.A((byte) -102);
              if (this.field_q) {
                this.h((byte) -70);
              } else if (this.field_kc ||
                this.field_jc) {
                if (var5 != 0) {
                  this.field_kc = true;
                } else if (this.field_kc) {
                  pl.field_n.a(TerrainMaskSupport.field_e, 100, qm.field_c * 6144 / 64, 8192);
                }
                if (var6 != 0) {
                  this.field_jc = true;
                } else if (this.field_jc) {
                  pl.field_n.a(ri.field_b, 100, 6144 * qm.field_c / 64, 8192);
                }
                this.shipVelocityXQ16 = this.shipVelocityXQ16 >> 1;
                if (this.shipVelocityYQ16 > 65536) {
                  this.shipVelocityYQ16 = 65536;
                }
                if (this.field_kc &&
                  this.field_jc) {
                  if (this.shipVelocityYQ16 > 0) {
                    this.shipVelocityYQ16 = 0;
                  }
                  this.shipYQ16 = this.shipYQ16 - 65536;
                  if (!(-256 > this.shipVelocityXQ16) &&
                    !(this.shipVelocityXQ16 > 256)) {
                    this.shipVelocityYQ16 = 0;
                    var3Lifetime4 = true;
                    this.shipVelocityXQ16 = 0;
                    this.field_rb = true;
                  }
                  boolean decompiledFrameRemainder2 = false;
                } else if (this.field_kc) {
                  this.field_M = this.field_M + 16384;
                  this.shipXQ16 = this.shipXQ16 + 16384;
                  this.field_I = this.field_I + 1 & 255;
                } else {
                  this.shipXQ16 = this.shipXQ16 - 16384;
                  this.field_I = -1 + this.field_I & 255;
                  this.field_M = this.field_M - 16384;
                }
              }
            } else {
              this.field_Hb = 0;
              this.field_pb = 0;
              this.v((byte) 69);
              if (0 != (this.field_Hb | this.field_pb)) {
                this.A(-125);
              }
            }
            if (this.levelIndex < 0 &&
              !this.field_ec) {
              if (var4 != 0 &&
                this.shipYQ16 < 33554432) {
                this.a(-114, bh.field_e);
                pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
              }
              if (var4 == 0 &&
                this.shipYQ16 >= 33554432) {
                this.a(67, ge.field_a);
                pl.field_n.a(gm.field_b, 100, 6144 * qm.field_c / 64, 8192);
              }
            }
          } else {
            this.field_q = false;
            this.A((byte) 72);
            if (this.field_q) {
              this.h((byte) -112);
            }
          }
          while (this.shipXQ16 < 0) {
            this.shipXQ16 = this.shipXQ16 + (this.worldWidth << 16);
            this.field_Kb = this.field_Kb - this.worldWidth;
          }
          while (this.shipXQ16 >= this.worldWidth << 16) {
            this.shipXQ16 = this.shipXQ16 - (this.worldWidth << 16);
            this.field_Kb = this.field_Kb + this.worldWidth;
          }
        }
        Object var4_ref = this.field_f;
        hl var5_ref_hl = this.field_Eb;
        this.field_f = null;
        this.field_Eb = null;
        var6 = 0;
        while (var6 < this.levelObjects.size()) {
          LevelObject var34_ref = (LevelObject) (this.levelObjects.elementAt(var6));
          stackIn_543_0 = -1;
          stackIn_543_1 = ~var34_ref.objectType;
          if (stackIn_543_0 == stackIn_543_1) {
            var34_ref.field_h = false;
            if (!this.field_Gb &&
              this.field_rb) {
              var8 = (-var34_ref.x + ((this.shipXQ16 >> 16) + this.worldWidth)) % this.worldWidth;
              int var9Lifetime4 = -var34_ref.y + (this.shipYQ16 >> 16);
              if (var8 >= 7 &&
                var8 < 23 &&
                var9Lifetime4 >= 50 &&
                var9Lifetime4 < 55) {
                if (this.field_ac < 5000) {
                  var34_ref.field_h = true;
                  int var10Lifetime2 = 5000 - this.field_ac;
                  if (var10Lifetime2 > 13) {
                    var10Lifetime2 = 13;
                  }
                  ji.a(true, var10Lifetime2);
                  this.field_ac = this.field_ac + 13;
                  if (this.field_ac > 5000) {
                    this.field_ac = 5000;
                  }
                  if (var4_ref != null) {
                    ((hl) (var4_ref)).f(6144 * qm.field_c / 64);
                    this.field_R.f(6144 * qm.field_c / 64);
                  } else {
                    this.field_R = hl.c(qa.field_E, 100, 6144 * qm.field_c / 64, 8192);
                    pl.field_n.a(this.field_R);
                    hl var36 = hl.c(lm.field_d, 100, qm.field_c * 6144 / 64, 8192);
                    var4_ref = var36;
                    var36.h(-1);
                    pl.field_n.a(var36);
                  }
                  this.field_f = (hl) (var4_ref);
                } else {
                  if (var4_ref != null) {
                    pl.field_n.b((wg) (var4_ref));
                    pl.field_n.b(this.field_R);
                    var4_ref = null;
                    this.field_R = null;
                  }
                  if (var5_ref_hl == null) {
                    hl var35 = hl.c(fn.field_f, 100, 3584 * qm.field_c / 64, 8192);
                    var5_ref_hl = var35;
                    var35.h(-1);
                    pl.field_n.a(var35);
                  }
                  this.field_Eb = var5_ref_hl;
                }
              }
              if (var8 >= 3 &&
                27 > var8 &&
                48 <= var9Lifetime4 &&
                var9Lifetime4 < 57) {
                var3Lifetime4 = false;
              }
            }
          }
          if (this.field_rc &&
            this.levelIndex == 7 &&
            !this.field_Gb &&
            this.field_rb &&
            var34_ref.objectType == 3) {
            var8 = this.shipXQ16 >> 16;
            int var9Lifetime4Lifetime1 = this.shipYQ16 >> 16;
            if (var8 >= (var34_ref.x - 20) &&
              var34_ref.x + 40 > var8 &&
              var9Lifetime4Lifetime1 >= -30 + var34_ref.y &&
              var34_ref.y > var9Lifetime4Lifetime1) {
              this.a(this.gameMode, false, 17, 238);
            }
          }
          var6++;
        }
        if (var4_ref != null &&
          this.field_f == null) {
          pl.field_n.b((wg) (var4_ref));
          pl.field_n.b(this.field_R);
          this.field_R = null;
          pl.field_n.a(al.field_b, 100, 6144 * qm.field_c / 64, 8192);
        }
        if (var5_ref_hl != null &&
          null == this.field_Eb) {
          var5_ref_hl.h(0);
        }
        if (!this.field_Gb &&
          this.field_rb &&
          this.field_ac == 0) {
          this.h((byte) -61);
        }
        if (!this.field_Gb &&
          this.field_rb &&
          this.field_Ub < 0) {
          Object var4_refLifetime1 = null;
          var5 = 0;
          scanLoop2: while (true) {
            int stackIn_449_0 = ~var5;
            int stackIn_449_1 = -4;
            if (stackIn_449_0 <= stackIn_449_1) {
              if (!var3Lifetime4) {
                break scanLoop2;
              }
              if (var4_refLifetime1 == null) {
                break scanLoop2;
              }
              pl.field_n.a(gm.field_b, 100, 6144 * qm.field_c / 64, 8192);
              this.a(127, (String) (var4_refLifetime1));
              break scanLoop2;
            }
            var6 = 0;
            while (var6 < this.levelObjects.size()) {
              LevelObject var37_ref = (LevelObject) (this.levelObjects.elementAt(var6));
              int stackIn_449_0Lifetime1 = ~var5;
              int stackIn_449_1Lifetime1 = -1;
              if (stackIn_449_0Lifetime1 == stackIn_449_1Lifetime1) {
                int stackIn_457_0 = (!mf.a(var37_ref.objectType, -64)) ? 0 : 1;
                var8 = stackIn_457_0;
              } else if (var5 != 1) {
                int stackIn_466_0 = (var37_ref.objectType != 1) ? 0 : 1;
                var8 = stackIn_466_0;
              } else {
                int stackIn_462_0 = (5 != var37_ref.objectType) ? 0 : 1;
                var8 = stackIn_462_0;
              }
              boolean decompiledFrameRemainder4 = true;
              if (var8 != 0) {
                Sprite var38 = var37_ref.collisionSprite;
                int var10Lifetime3 = ((var37_ref.x << 16) + (var38.fullWidth << 15)) % (this.worldWidth << 16);
                int var11Lifetime2 = (var38.fullHeight << 15) + (var37_ref.y << 16);
                for (var12 = -(var10Lifetime3 >> 16) + (this.shipXQ16 >> 16); (-this.worldWidth >> 1) > var12; var12 = var12 + this.worldWidth) {
                }
                while (this.worldWidth >> 1 <= var12) {
                  var12 = var12 - this.worldWidth;
                }
                var13_int = (this.shipYQ16 >> 16) - (var11Lifetime2 >> 16);
                if (-5 <= var12 &&
                  var12 <= 5 &&
                  -10 - var38.fullHeight / 2 <= var13_int &&
                  var13_int <= -(var38.fullHeight / 2) - 2) {
                  if (var37_ref.objectType >= 9) {
                    var4_refLifetime1 = on.field_d;
                    decompiledFrameRemainder4 = false;
                  }
                  else {
                    var13_int = 0;
                    var12 = 0;
                  }
                }
                if (decompiledFrameRemainder4) {
                  if (-5 <= var13_int &&
                    var13_int <= 5 &&
                    -32 <= var12 &&
                    var12 <= 32) {
                    this.levelObjects.removeElementAt(var6);
                    var37_ref.removeFromTerrain(this, (byte) 75);
                    var6--;
                    if (this.minimap != null) {
                      this.minimap.a(var37_ref, 4236);
                    }
                    this.field_Ub = var37_ref.objectType;
                    this.f(-118, 1);
                    this.field_mb = var10Lifetime3;
                    this.field_o = 0;
                    this.field_E = var11Lifetime2;
                    this.field_Ob = 0;
                    this.field_W = false;
                    if (this.field_Ub < 9) {
                      int var14Lifetime1 = qj.a((byte) -38, this.field_Ub, this.gameMode);
                      this.field_J = this.field_J + var14Lifetime1;
                      v.a(8, var14Lifetime1);
                      this.a(this.field_Ub, (byte) -9);
                    } else {
                      this.field_e = 50;
                    }
                    pl.field_n.a(fg.field_a, 100, qm.field_c * 6144 / 64, 8192);
                    break scanLoop2;
                  }
                  if (var4_refLifetime1 != on.field_d &&
                    var13_int >= -15 &&
                    var13_int <= 15 &&
                    var12 >= -32 &&
                    32 >= var12) {
                    if (1 == var37_ref.objectType) {
                      var4_refLifetime1 = ff.field_f;
                    } else if (5 != var37_ref.objectType) {
                      var4_refLifetime1 = nn.field_c;
                    } else {
                      var4_refLifetime1 = ui.field_d;
                    }
                    decompiledFrameRemainder4 = false;
                  } else if (var4_refLifetime1 == null &&
                    var13_int >= -15 &&
                    15 >= var13_int &&
                    var12 >= -64 &&
                    var12 <= 64) {
                    var4_refLifetime1 = fd.field_e;
                  }
                }
              }
              var6++;
            }
            var5++;
          }
        }
        if (this.field_Ub < 0) {
          this.field_fb.field_l = 0;
        } else {
          if (!this.field_W &&
            !this.field_Gb) {
            var4 = this.shipXQ16 - this.field_mb >> 8;
            if (-this.worldWidth << 7 > var4) {
              var4 = var4 + (this.worldWidth << 8);
            } else if ((this.worldWidth << 7) <= var4) {
              var4 = var4 - (this.worldWidth << 8);
            }
            var5 = -this.field_E + this.shipYQ16 >> 8;
            var6 = this.shipVelocityXQ16;
            var7 = this.shipVelocityYQ16;
            if (this.field_e > 0) {
              var6 = var6 + (var4 << 8) * (-this.field_e + 50) / 2500;
              var7 = var7 + (-this.field_e + 50) * (var5 << 8) / 2500;
              var5 = (125 - this.field_e) * var5 / 75;
              var4 = var4 * (125 - this.field_e) / 75;
            }
            var8 = var4 * var4 + var5 * var5;
            Object var9_ref_Object = pl.field_n;
            synchronized (var9_ref_Object) {
              var10_double = 0.000244140625 * Math.sqrt((double)var8);
              var5 = (int)((double)var5 / var10_double);
              var4 = (int)((double)var4 / var10_double);
              var12 = ((var6 >> 4) * var4 + var5 * (var7 >> 4)) * qm.field_c / 64 >> 6;
              if (this.field_e == 0 &&
                var8 >= 150994944) {
                pl.field_n.a(rk.field_c, 100, var12 >> 11);
                this.field_W = true;
                this.field_fb.field_l = 0;
              } else {
                this.field_fb.field_l = var12;
                this.field_fb.field_o = var8 / 2304;
              }
            }
          } else {
            this.field_fb.field_l = 0;
          }
          if (this.field_W) {
            this.field_mb = this.field_mb + this.field_Ob;
            this.field_o = this.field_o + this.field_qb;
            this.field_E = this.field_E + this.field_o;
            if (!this.field_Gb) {
              stackIn_543_0 = -this.shipXQ16;
              stackIn_543_1 = this.field_mb;
              double var4_double = (double)(stackIn_543_0 + stackIn_543_1);
              if ((double)(-this.worldWidth << 15) > var4_double) {
                var4_double = var4_double + (double)(this.worldWidth << 16);
              } else if ((double)(this.worldWidth << 15) <= var4_double) {
                var4_double = var4_double - (double)(this.worldWidth << 16);
              }
              var6_double = (double)(this.field_E - this.shipYQ16);
              double var8_double = Math.sqrt(var6_double * var6_double + var4_double * var4_double);
              var4_double = var4_double / var8_double;
              var10_double = var8_double - 3145728.0;
              var6_double = var6_double / var8_double;
              var12 = (int)(var4_double * var10_double);
              var13_int = (int)(var10_double * var6_double);
              if (!this.field_rb) {
                this.shipYQ16 = this.shipYQ16 + (var13_int >> 2);
                this.field_E = this.field_E - (var13_int - (var13_int >> 2));
                this.shipXQ16 = this.shipXQ16 + (var12 >> 2);
                this.field_mb = this.field_mb - (-(var12 >> 2) + var12);
                this.shipXQ16 = ((this.worldWidth << 16) + this.shipXQ16) % (this.worldWidth << 16);
                this.field_M = this.field_M + (var12 >> 2);
              } else {
                this.field_mb = this.field_mb - var12;
                this.field_E = this.field_E - var13_int;
              }
              double var14_double = (double)(this.field_o - this.shipVelocityYQ16) * var6_double + (double)(this.field_Ob - this.shipVelocityXQ16) * var4_double;
              var16 = (int)(var14_double * var4_double);
              var17_int = (int)(var6_double * var14_double);
              if (this.field_rb) {
                this.field_o = this.field_o - var17_int;
                this.field_Ob = this.field_Ob - var16;
              } else {
                this.shipVelocityXQ16 = this.shipVelocityXQ16 + (var16 >> 2);
                this.shipVelocityYQ16 = this.shipVelocityYQ16 + (var17_int >> 2);
                this.field_Ob = this.field_Ob - (-(var16 >> 2) + var16);
                this.field_o = this.field_o - (-(var17_int >> 2) + var17_int);
              }
            }
            this.field_mb = (this.field_mb + (this.worldWidth << 16)) % (this.worldWidth << 16);
            this.field_o = this.field_o - this.field_o / 256;
            this.field_Ob = this.field_Ob - this.field_Ob / 256;
            Sprite var39 = mb.field_f[this.field_Ub];
            var5 = (-(var39.fullWidth << 15) + this.field_mb >> 16) + this.worldWidth;
            var6 = this.field_E - (var39.fullHeight << 15) >> 16;
            if (this.b(var5, var39, var6, -1)) {
              this.k((byte) 9);
            }
          }
        }
        var4 = 0;
        IntrusiveNode var5_ref_hg = this.field_G.first(false);
        var6 = 0;
        while (var6 < this.field_x) {
          vh var40_ref = (vh) (var5_ref_hg);
          int fieldTemp$0 = var40_ref.field_m - 1;
          var40_ref.field_m = var40_ref.field_m - 1;
          int stackIn_608_0 = ~fieldTemp$0;
          int stackIn_608_1 = -1;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_608_0 == stackIn_608_1) {
            var4 = 1;
            var40_ref.field_h = true;
          } else {
            var8 = (var40_ref.field_j + var40_ref.field_n + (this.worldWidth << 16)) % (this.worldWidth << 16);
            int var9Lifetime5 = var40_ref.field_g + var40_ref.field_l;
            var40_ref.field_j = var8;
            var40_ref.field_l = var9Lifetime5;
            var8 = var8 >> 16;
            var9Lifetime5 = var9Lifetime5 >> 16;
            if (var40_ref.field_k == 0) {
              Sprite var41 = s.field_H;
              ic var11_ref_ic = (ic) (this.field_N.first(false));
              while (var11_ref_ic != null) {
                var12 = var41.offsetY + ((var11_ref_ic.field_q >> 16) - 8);
                int stackIn_581_0 = ~var12;
                int stackIn_581_1 = ~var9Lifetime5;
                if (stackIn_581_0 >= stackIn_581_1 &&
                  (var41.height + var12) > var9Lifetime5) {
                  for (var13_int = var8 + (-(var11_ref_ic.field_p >> 16) + (8 - var41.offsetX)); var13_int < 0; var13_int = var13_int + this.worldWidth) {
                  }
                  var13_int = var13_int % this.worldWidth;
                  if (!(var41.width <= var13_int) &&
                    var41.pixels[(var9Lifetime5 - var12) * var41.width + var13_int] != 0) {
                    if (!this.field_Gb) {
                      int var14Lifetime2 = hc.a(this.gameMode, (byte) 112);
                      this.field_J = this.field_J + var14Lifetime2;
                      v.a(8, var14Lifetime2);
                    }
                    this.a(var11_ref_ic, 5);
                    var40_ref.field_h = true;
                    var4 = 1;
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
                var11_ref_ic = (ic) (this.field_N.next((byte) 70));
              }
            }
            if (decompiledFrameCompleted1) {
              int stackIn_581_0Lifetime1 = var8;
              int stackIn_581_1Lifetime1 = 31;
              int var10Lifetime4 = stackIn_581_0Lifetime1 & stackIn_581_1Lifetime1;
              var8 = var8 >> 5;
              int var11Lifetime3 = var9Lifetime5 & 31;
              var9Lifetime5 = var9Lifetime5 >> 5;
              if (0 <= var9Lifetime5) {
                if (this.tilesHigh <= var9Lifetime5) {
                  stackIn_586_0 = QuickChatPhraseDefinition.fullTileMask;
                } else {
                  stackIn_586_0 = this.terrainMasks[var9Lifetime5 * this.tilesWide + var8];
                }
                int[] var46 = stackIn_586_0;
                int[] var42 = var46;
                int[] var12_ref_int__ = var42;
                if (var12_ref_int__ != null && (var12_ref_int__ == QuickChatPhraseDefinition.fullTileMask ||
                  (var46[var11Lifetime3] & 1 << var10Lifetime4) != 0)) {
                  if (0 == var40_ref.field_k) {
                    this.j(-90, var11Lifetime3 | var9Lifetime5 << 5, var10Lifetime4 | var8 << 5);
                  }
                  var4 = 1;
                  var40_ref.field_h = true;
                  decompiledFrameRemainder3 = false;
                }
              }
              if (decompiledFrameRemainder3 && (var40_ref.field_k == 1 &&
                !this.field_Gb && (this.field_Bb &&
                this.d(var8 << 5 | var10Lifetime4, 32, var9Lifetime5 << 5 | var11Lifetime3) ||
                (this.a((byte) 105, var9Lifetime5 << 5 | var11Lifetime3, var8 << 5 | var10Lifetime4) ||
                this.k(-2, var10Lifetime4 | var8 << 5, var9Lifetime5 << 5 | var11Lifetime3))))) {
                var4 = 1;
                var40_ref.field_h = true;
              }
            }
          }
          var5_ref_hg = var5_ref_hg.next;
          var6++;
        }
        if (var4 != 0) {
          this.F(127);
        }
        var4 = this.field_qc * qm.field_c / 32;
        int stackIn_608_0Lifetime1 = var4;
        int stackIn_608_1Lifetime1 = 8192;
        var5 = stackIn_608_0Lifetime1 * stackIn_608_1Lifetime1;
        pi var6_ref_pi = (pi) (this.field_hb.first(false));
        scanLoop3: while (var6_ref_pi != null) {
          var7 = 0;
          while (var7 < 32) {
            boolean stackOut_612_0 = var6_ref_pi.field_i.field_E[var7 + var6_ref_pi.field_q];
            int stackIn_618_0 = stackOut_612_0 ? 1 : 0;
            boolean stackIn_613_0 = stackOut_612_0;
            if (stackIn_613_0) {
              var6_ref_pi.field_l = var6_ref_pi.field_l - 1;
              var6_ref_pi.field_i.field_E[var6_ref_pi.field_q + var7] = false;
            }
            var7++;
          }
          var6_ref_pi.field_i.a();
          int stackIn_618_0Lifetime1 = -1;
          if (stackIn_618_0Lifetime1 > ~var6_ref_pi.field_r) {
            double var7_doubleLifetime1 = 0.02454369260617026 * (double)var6_ref_pi.field_m;
            var6_ref_pi.field_k = var6_ref_pi.field_k + (int)(2000.0 * Math.sin(var7_doubleLifetime1));
            var6_ref_pi.field_p = var6_ref_pi.field_p - (int)(2000.0 * Math.cos(var7_doubleLifetime1));
            for (int var9Lifetime6 = 0; 32 > var9Lifetime6; var9Lifetime6++) {
              var6_ref_pi.field_i.field_E[var9Lifetime6 + var6_ref_pi.field_q] = true;
              var10_double = Math.random() * 0.2 + var7_doubleLifetime1 - 0.1;
              double var12_double = (0.5 + Math.random()) * 524288.0;
              int var14Lifetime3 = -(int)(Math.sin(var10_double) * var12_double);
              int var15_intLifetime1 = (int)(var12_double * Math.cos(var10_double));
              var6_ref_pi.field_i.field_x[var9Lifetime6 + var6_ref_pi.field_q] = var6_ref_pi.field_n + var6_ref_pi.field_k;
              var6_ref_pi.field_i.field_A[var9Lifetime6 + var6_ref_pi.field_q] = var6_ref_pi.field_g + var6_ref_pi.field_p;
              double var16_double = Math.random();
              var6_ref_pi.field_i.field_y[var6_ref_pi.field_q + var9Lifetime6] = (int)(var16_double * (double)var14Lifetime3);
              var6_ref_pi.field_i.field_C[var6_ref_pi.field_q + var9Lifetime6] = (int)(var16_double * (double)var15_intLifetime1);
              var6_ref_pi.field_i.field_w[var9Lifetime6 + var6_ref_pi.field_q] = 0;
              var6_ref_pi.field_i.i(var9Lifetime6 + var6_ref_pi.field_q);
              var6_ref_pi.field_i.field_y[var6_ref_pi.field_q + var9Lifetime6] = var6_ref_pi.field_k + var14Lifetime3;
              var6_ref_pi.field_i.field_C[var6_ref_pi.field_q + var9Lifetime6] = var15_intLifetime1 + var6_ref_pi.field_p;
            }
            var6_ref_pi.field_l = var6_ref_pi.field_l + 32;
          }
          regionExit4: {
            boolean decompiledFrameCompleted0 = true;
            var7 = var6_ref_pi.field_l * this.b(2097152, var6_ref_pi.field_n, 96, var6_ref_pi.field_g) / 1024;
            var4 = var4 + var7;
            var5 = var5 + var7 * this.c(var6_ref_pi.field_n, 124);
            var6_ref_pi.field_q = (32 + var6_ref_pi.field_q) % 256;
            if (0 != var6_ref_pi.field_r) {
              int fieldTemp$1 = var6_ref_pi.field_r - 1;
              var6_ref_pi.field_r = var6_ref_pi.field_r - 1;
              if (fieldTemp$1 != 0) {
                mf.field_a.offsetY = 0;
                Sprite var8_ref_ed = mf.field_a;
                var8_ref_ed.offsetX = 0;
                Sprite var9_ref_ed = mf.field_a;
                Sprite var10_ref_ed = mf.field_a;
                mf.field_a.height = 7;
                Sprite var11_ref_ed = mf.field_a;
                var9_ref_ed.fullWidth = 7;
                var11_ref_ed.width = 7;
                var10_ref_ed.fullHeight = 7;
                mf.field_a.g();
                SoftwareRasterizer.d();
                mf.field_m.a(4, (byte) 34, 4096, -var6_ref_pi.field_m << 8, 4);
                md.field_D.a(120);
                var12 = (int)Math.sqrt((double)var6_ref_pi.field_p * (double)var6_ref_pi.field_p + (double)var6_ref_pi.field_k * (double)var6_ref_pi.field_k);
                var13_int = var12 / 196608 + 1;
                int var14Lifetime3Lifetime1 = var6_ref_pi.field_k;
                int var15_intLifetime1Lifetime1 = var6_ref_pi.field_p;
                var16 = var13_int;
                scanLoop5: while (true) {
                  if (0 >= var16) {
                    if (var6_ref_pi.field_h) {
                      var6_ref_pi.field_h = false;
                      pl.field_n.a(var6_ref_pi.field_o);
                    }
                    var6_ref_pi.field_o.f(this.b(2097152, var6_ref_pi.field_n, 96, var6_ref_pi.field_g), this.c(var6_ref_pi.field_n, 125));
                    break regionExit4;
                  }
                  var17_int = var14Lifetime3Lifetime1 / var16;
                  int var18Lifetime1 = var15_intLifetime1Lifetime1 / var16;
                  var19 = ((this.worldWidth << 16) + var6_ref_pi.field_n + var17_int) % (this.worldWidth << 16);
                  var6_ref_pi.field_n = var19;
                  var20 = var18Lifetime1 + var6_ref_pi.field_g;
                  var14Lifetime3Lifetime1 = var14Lifetime3Lifetime1 - var17_int;
                  var19 = var19 >> 16;
                  var15_intLifetime1Lifetime1 = var15_intLifetime1Lifetime1 - var18Lifetime1;
                  var6_ref_pi.field_g = var20;
                  var19 -= 4;
                  var20 = var20 >> 16;
                  var20 -= 4;
                  ic var21_ref_ic = (ic) (this.field_N.first(false));
                  while (var21_ref_ic != null) {
                    int var22_intLifetime1 = -(var21_ref_ic.field_p >> 16) + var19 + 8;
                    int stackIn_675_0 = -(this.worldWidth >> 1);
                    int stackIn_675_1 = var22_intLifetime1;
                    if (!(stackIn_675_0 <= stackIn_675_1)) {
                      var22_intLifetime1 = var22_intLifetime1 + this.worldWidth;
                    } else if ((this.worldWidth >> 1) < var22_intLifetime1) {
                      var22_intLifetime1 = var22_intLifetime1 - this.worldWidth;
                    }
                    int var23_intLifetime1 = var20 + (-(var21_ref_ic.field_q >> 16) + 8);
                    if (!ln.a(s.field_H, 0, 0, mf.field_a, var22_intLifetime1, var23_intLifetime1)) {
                      var21_ref_ic = (ic) (this.field_N.next((byte) 70));
                      continue;
                    }
                    if (!this.field_Gb) {
                      int var24 = hc.a(this.gameMode, (byte) 105);
                      this.field_J = this.field_J + var24;
                      v.a(8, var24);
                    }
                    this.a(var21_ref_ic, 5);
                    this.a(var6_ref_pi, 82);
                    var6_ref_pi.field_r = 0;
                    break regionExit4;
                  }
                  if (!this.b(this.worldWidth + var19, mf.field_a, var20, -1)) {
                    var16--;
                    continue scanLoop5;
                  }
                  break;
                }
                int var21 = 0;
                while (true) {
                  int stackIn_650_0 = this.levelObjects.size();
                  int stackIn_650_1 = var21;
                  if (stackIn_650_0 <= stackIn_650_1) {
                    this.a(var6_ref_pi, 78);
                    var6_ref_pi.field_r = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  LevelObject var22_ref = (LevelObject) (this.levelObjects.elementAt(var21));
                  Sprite var23 = var22_ref.collisionSprite;
                  for (var24Lifetime1 = -var19 + var22_ref.x; this.worldWidth >> 1 < var24Lifetime1; var24Lifetime1 = var24Lifetime1 - this.worldWidth) {
                  }
                  while ((-this.worldWidth >> 1) > var24Lifetime1) {
                    var24Lifetime1 = var24Lifetime1 + this.worldWidth;
                  }
                  int var25 = var22_ref.y - var20;
                  if (ln.a(mf.field_a, 0, 0, var23, var24Lifetime1, var25)) {
                    this.a(var22_ref, 67, var21);
                    if (var22_ref.objectType == 6 ||
                      var22_ref.objectType == 7) {
                      int var26 = var22_ref.y + 14;
                      IntrusiveNode var27 = this.field_C.first(false);
                      int var28 = 0;
                      while (this.field_ub > var28) {
                        am var29_ref = (am) (var27);
                        int stackIn_650_0Lifetime1 = var29_ref.field_j;
                        int stackIn_650_1Lifetime1 = var26;
                        if (stackIn_650_0Lifetime1 == stackIn_650_1Lifetime1) {
                          this.a(var29_ref, (byte) 27);
                          break;
                        }
                        var28++;
                        var27 = var27.next;
                      }
                    }
                  }
                  var21++;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6_ref_pi, 49);
              }
            } else {
              if (var6_ref_pi.field_l != 0) {
                var6_ref_pi = (pi) (this.field_hb.next((byte) 70));
                continue scanLoop3;
              }
              var6_ref_pi.unlink((byte) -52);
            }
          }
          var6_ref_pi = (pi) (this.field_hb.next((byte) 70));
        }
        if (!this.field_Gb) {
          int stackIn_675_0Lifetime1 = -1;
          int stackIn_675_1Lifetime1 = ~this.field_m;
          if (stackIn_675_0Lifetime1 > stackIn_675_1Lifetime1) {
            this.field_m = this.field_m - 1;
          } else if (!ik.field_p &&
            ik.field_h[82]) {
            var6_double = (double)this.field_I * 0.02454369260617026;
            var8 = (int)(Math.sin(var6_double) * 131072.0);
            int var9Lifetime7 = -(int)(Math.cos(var6_double) * 131072.0);
            this.b(this.shipYQ16 + 5 * var9Lifetime7, this.shipXQ16 + 5 * var8, this.shipVelocityYQ16 + var9Lifetime7, 256, 0, var8 + this.shipVelocityXQ16);
            if (!this.field_lb) {
              pl.field_n.a(ni.field_M, 100, qm.field_c * 6144 / 64, 8192);
            } else {
              this.b(this.shipYQ16 + var9Lifetime7 * 5, this.shipXQ16 + var8 * 5, (var8 >> 3) - (var9Lifetime7 >> 3) + (this.shipVelocityYQ16 + var9Lifetime7), 256, 0, this.shipVelocityXQ16 + (var8 - ((var8 >> 3) + (var9Lifetime7 >> 3))));
              this.b(this.shipYQ16 + var9Lifetime7 * 5, 5 * var8 + this.shipXQ16, -(var8 >> 3) - (var9Lifetime7 >> 3) + (var9Lifetime7 + this.shipVelocityYQ16), 256, 0, (var9Lifetime7 >> 3) + this.shipVelocityXQ16 + (var8 - (var8 >> 3)));
              pl.field_n.a(gn.field_e, 100, 6144 * qm.field_c / 64, 8192);
            }
            this.field_m = 9;
          }
          if (!(0 >= this.field_yb)) {
            this.field_yb = this.field_yb - 1;
          } else if (this.field_tb > 0 &&
            this.d((byte) 61)) {
            var6_double = 0.02454369260617026 * (double)this.field_I;
            var8 = (int)(131072.0 * Math.sin(var6_double));
            int var9Lifetime7Lifetime1 = -(int)(Math.cos(var6_double) * 131072.0);
            pi var43 = new pi();
            var43.field_p = this.shipVelocityYQ16 + var9Lifetime7Lifetime1;
            var43.field_n = (this.shipXQ16 + (5 * var8 + (this.worldWidth << 16))) % (this.worldWidth << 16);
            var43.field_r = 100;
            var43.field_m = this.field_I;
            var43.field_k = this.shipVelocityXQ16 + var8;
            var43.field_g = this.shipYQ16 + 5 * var9Lifetime7Lifetime1;
            var43.field_i = this.i(256, -22944);
            var43.field_o = hl.c(kf.field_p, 100, this.b(2097152, var43.field_n, 96, var43.field_g), this.c(var43.field_n, 116));
            pl.field_n.a(var43.field_o);
            this.field_hb.addLast(-12328, var43);
            this.field_tb = this.field_tb - 1;
            fk.b(0);
            this.field_yb = 24;
          }
        }
        var6 = 0;
        while (var6 < this.levelObjects.size()) {
          LevelObject var44_ref = (LevelObject) (this.levelObjects.elementAt(var6));
          int stackIn_713_0 = var44_ref.objectType;
          int stackIn_713_1 = 2;
          if (stackIn_713_0 == stackIn_713_1) {
            if (var44_ref.field_o > 0) {
              var44_ref.field_o = var44_ref.field_o - 1;
            } else if (!this.field_Gb) {
              fn var45 = rf.a(var44_ref.spriteFrame, 16384);
              if (var45 != null) {
                int var9Lifetime8 = var44_ref.x + var45.field_c << 16;
                int var10Lifetime5 = var45.field_b + var44_ref.y << 16;
                int var11Lifetime4 = this.shipXQ16 - var9Lifetime8;
                var12 = this.shipYQ16 - var10Lifetime5;
                if (!(var11Lifetime4 >= (-this.worldWidth << 15))) {
                  var11Lifetime4 = var11Lifetime4 + (this.worldWidth << 16);
                } else if (var11Lifetime4 >= (this.worldWidth << 15)) {
                  var11Lifetime4 = var11Lifetime4 - (this.worldWidth << 16);
                }
                double var13Lifetime1 = (double)var11Lifetime4;
                double var15Lifetime1 = (double)var12;
                double var17Lifetime1 = Math.sqrt(var15Lifetime1 * var15Lifetime1 + var13Lifetime1 * var13Lifetime1);
                if (13107200.0 > var17Lifetime1) {
                  var13Lifetime1 = var13Lifetime1 / var17Lifetime1;
                  var15Lifetime1 = var15Lifetime1 / var17Lifetime1;
                  int var11Lifetime4Lifetime1 = (int)(131072.0 * var13Lifetime1);
                  var12 = (int)(var15Lifetime1 * 131072.0);
                  if (this.a((int)var17Lifetime1 >> 17, var12, 5 * var12 + var10Lifetime5, 5 * var11Lifetime4Lifetime1 + var9Lifetime8, var11Lifetime4Lifetime1, 0)) {
                    this.b(var10Lifetime5 + 5 * var12, var11Lifetime4Lifetime1 * 5 + var9Lifetime8, var12, 256, 1, var11Lifetime4Lifetime1);
                    var44_ref.field_o = 49;
                    pl.field_n.a(uk.field_j, 100, this.b(6553600, var9Lifetime8, 96, var10Lifetime5), this.c(var9Lifetime8, 120));
                  }
                }
              }
            }
          }
          var6++;
        }
        this.B((byte) 109);
        if (null != this.field_Db) {
          this.field_Db.c(-1);
        }
        this.w(0);
        int stackIn_713_0Lifetime1 = guard;
        int stackIn_713_1Lifetime1 = -7;
        if (stackIn_713_0Lifetime1 > stackIn_713_1Lifetime1) {
          return;
        }
        hl stackIn_717_0 = this.field_Z;
        int stackIn_717_1 = var4;
        if (var4 == 0) {
          stackIn_718_2 = 8192;
        } else {
          stackIn_718_2 = var5 / var4;
        }
        ((hl) (Object) stackIn_717_0).f(stackIn_717_1, stackIn_718_2);
        this.field_Sb = (64 + this.field_Sb) % 512;
        if (this.field_rc &&
          this.levelIndex >= 0) {
          this.f(false);
        }
        this.p((byte) 9);
        if (!ik.field_h[82]) {
          ik.field_p = false;
        }
        if (!ik.field_h[84]) {
          s.field_E = false;
        }
        if (!ik.field_h[83]) {
          bc.field_d = false;
        }
        return;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        Object var18 = null;
        int var19 = EscapeVector.obfuscationControl;
        if (param6 <= 115) {
          return;
        }
        int[] var20 = this.a(param4, -1, param0);
        int[] var22 = var20;
        int[] var21 = var22;
        int[] var10 = var21;
        if (var20 == null &&
          0 == vh.field_i) {
          return;
        }
        param0 = param0 << 16;
        param4 = param4 << 16;
        int var11 = param1;
        while (true) {
          int stackIn_8_0 = ~param8;
          int stackIn_8_1 = ~var11;
          if (stackIn_8_0 > stackIn_8_1) {
            return;
          }
          int var12 = param7;
          while (true) {
            int stackIn_11_0 = ~var12;
            int stackIn_11_1 = ~param2;
            if (stackIn_11_0 < stackIn_11_1) {
              var11++;
              break;
            }
            int var13 = param0 + (var12 << 11) - param3;
            int var14 = -param5 + (var11 << 11) + param4;
            int var15 = var13 * var13 + var14 * var14;
            int stackIn_8_0Lifetime1 = var15;
            int stackIn_8_1Lifetime1 = 603979776;
            if (stackIn_8_0Lifetime1 < stackIn_8_1Lifetime1) {
              if (var10 != null &&
                this.a(var22, var12, (byte) -74, var11)) {
                this.field_Hb = this.field_Hb + var13;
                this.field_pb = this.field_pb + var14;
              } else {
                IntrusiveNode var16 = IntrusiveDeque.field_f.first(false);
                for (int var17 = 0; vh.field_i > var17; var17++) {
                  am var18_ref = (am) (var16);
                  int stackIn_11_0Lifetime1 = ~var18_ref.field_j;
                  int stackIn_11_1Lifetime1 = ~var14;
                  if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                    var18_ref.field_i <= var13 &&
                    var18_ref.field_h > var13) {
                    this.field_Hb = this.field_Hb + var13;
                    this.field_pb = this.field_pb + var14;
                    break;
                  }
                  var16 = var16.next;
                }
              }
            }
            var12++;
          }
        }
    }

    private final void q(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_4 = 0;
        ih var13 = fh.field_g;
        int var3 = var13.b(di.field_b);
        int var4 = var13.b(k.field_p);
        if (var4 > var3) {
          var3 = var4;
        }
        int var5 = var13.b("0000");
        int var6 = 40;
        int var7 = 18;
        if (0 < this.field_tb) {
          int var4Lifetime1 = var13.b(af.field_f);
          var6 = var6 + var7;
          if (var3 < var4Lifetime1) {
            var3 = var4Lifetime1;
          }
        }
        if (this.field_Q == 1) {
          var6 = var6 + var7;
          int var4Lifetime2 = var13.b(IntrusiveNode.field_f);
          if (var3 < var4Lifetime2) {
            var3 = var4Lifetime2;
          }
        }
        int var8 = 0;
        if (var8 >= 20) {
          stackIn_16_0 = 0;
        } else {
          stackIn_16_0 = (-var8 + 20) * 160 / 20;
        }
        int var9 = stackIn_16_0;
        if (param0 != 3) {
          this.field_tb = 30;
        }
        GameAppletShell.a(var9, -4, -4, 6320248, -2, var6 + 6, param0 ^ -2, var5 + var3 + 6 + 10, 12110032, 3160124, 2 * var8);
        int var10 = 22;
        var13.b(di.field_b, var3 + 6, var10, 10004656, -1);
        var13.a(Integer.toString(this.field_ac), 6 + var3, var10, 16777215, -1);
        var10 = var10 + var7;
        var13.b(k.field_p, var3 + 6, var10, 10004656, -1);
        var13.a(Integer.toString(this.field_Tb + this.field_Tb), 6 + var3, var10, 16777215, -1);
        var10 = var10 + var7;
        if (this.field_tb > 0) {
          var13.b(af.field_f, var3 + 6, var10, 10004656, -1);
          var13.a(Integer.toString(this.field_tb), 6 + var3, var10, 16777215, -1);
          var10 = var10 + var7;
        }
        if (this.field_Q == 1) {
          int var11_int = 0;
          if (this.field_k != null) {
            var11_int = this.field_k.size((byte) 49);
          }
          var13.b(IntrusiveNode.field_f, 6 + var3, var10, 10004656, -1);
          var13.a(Integer.toString(var11_int), var3 + 6, var10, 16777215, -1);
          var10 = var10 + var7;
        }
        int var3Lifetime1 = var13.b(jf.field_K);
        int var4Lifetime3 = var13.b(vd.field_c);
        int var5Lifetime1 = var13.b(Integer.toString(this.levelIndex + 1));
        if (var3Lifetime1 < var4Lifetime3) {
          var3Lifetime1 = var4Lifetime3;
        }
        int var4Lifetime4 = var13.b(Integer.toString(this.field_A));
        if (var5Lifetime1 < var4Lifetime4) {
          var5Lifetime1 = var4Lifetime4;
        }
        int var6Lifetime1 = 40;
        String var11 = this.g(true);
        var6Lifetime1 += 18;
        int var4Lifetime5 = var13.b(uk.field_a);
        if (var4Lifetime5 > var3Lifetime1) {
          var3Lifetime1 = var4Lifetime5;
        }
        int var4Lifetime6 = var13.b(Integer.toString(this.field_J + this.score));
        if (var5Lifetime1 < var4Lifetime6) {
          var5Lifetime1 = var4Lifetime6;
        }
        if (SpriteState.field_r ||
          this.field_a) {
          var6Lifetime1 += 18;
          int var4Lifetime7 = var13.b(hn.field_f);
          if (var3Lifetime1 < var4Lifetime7) {
            var3Lifetime1 = var4Lifetime7;
          }
          int var4Lifetime7Lifetime1 = var13.b(var11);
          if (var5Lifetime1 < var4Lifetime7Lifetime1) {
            var5Lifetime1 = var4Lifetime7Lifetime1;
          }
        }
        int var8Lifetime1 = 0;
        if (20 > var8Lifetime1) {
          stackIn_44_0 = (3200 - var8Lifetime1 * 160) / 20;
        } else {
          stackIn_44_0 = 0;
        }
        int var9Lifetime1 = stackIn_44_0;
        GameAppletShell.a(var9Lifetime1, 634 - var5Lifetime1 - var3Lifetime1 - 10, -4, 6320248, -2, var6Lifetime1 + 6, -3, 644, 12110032, 3160124, var8Lifetime1 * 2);
        var13.b(jf.field_K, -var5Lifetime1 + 634, 22, 10004656, -1);
        var13.a(Integer.toString(this.levelIndex + 1), -var5Lifetime1 + 634, 22, 16777215, -1);
        var13.b(vd.field_c, -var5Lifetime1 + 634, 40, 10004656, -1);
        var13.a(Integer.toString(this.field_A), -var5Lifetime1 + 634, 40, 16777215, -1);
        var13.b(uk.field_a, -var5Lifetime1 + 634, 58, 10004656, -1);
        ih stackIn_47_0 = var13;
        String stackIn_47_1 = Integer.toString(this.score + this.field_J);
        int stackIn_47_2 = -var5Lifetime1 + 634;
        int stackIn_47_3 = 58;
        stackIn_48_4 = (!this.timeHackMode &&
          !this.field_rc) ? (4227327) : (16777215);
        ((ih) (Object) stackIn_47_0).a(stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_48_4, -1);
        if (SpriteState.field_r ||
          this.field_a) {
          int var12 = this.a((byte) 114, 50, 16777215, 16711680);
          var13.b(hn.field_f, -var5Lifetime1 + 634, 76, 10004656, -1);
          var13.a(var11, -var5Lifetime1 + 634, 76, var12, -1);
        }
    }

    private final void a(byte param0, int param1) {
        if (param0 != 84) {
          this.field_oc = 82;
        }
        if (1 == param1) {
        }
        if (0 != param1) {
        }
    }

    private final void j(byte param0) {
        this.a(24661, true);
        if (this.levelIndex >= 0) {
          this.k(param0 - 17);
        } else {
          this.buildTutorialTerrain((byte) -120);
        }
        this.initializeLevelObjects(true, 19);
        if (param0 != -110) {
          this.m(110);
        }
    }

    private final boolean d(byte param0) {
        int var2 = -2 / ((param0 + 28) / 60);
        if (!s.field_E &&
          ik.field_h[84]) {
          return true;
        }
        if (ik.field_h[jl.field_a]) {
          return true;
        }
        if (ik.field_h[86]) {
          return true;
        }
        return false;
    }

    final void stopSessionAudio(byte guard) {
        Throwable decompiledCaughtException = null;
        int var5 = EscapeVector.obfuscationControl;
        this.a(guard + 45, this.field_jb);
        if (guard != -41) {
          return;
        }
        this.a(4, this.field_Z);
        this.a(4, this.field_v);
        this.a(4, this.field_R);
        this.a(4, this.field_f);
        if (null != this.field_Eb) {
          this.field_Eb.h(0);
          this.field_Eb = null;
        }
        this.a(4, this.field_Wb);
        this.a(4, this.field_wb);
        if (this.field_r != null) {
          this.field_r.c(ie.field_q / 100, 0);
        }
        if (this.field_lc != null) {
          this.a(guard ^ -45, this.field_lc);
        }
        if (null != this.field_fb) {
          this.field_fb.field_l = 0;
        }
        if (null != this.field_hb) {
          Object var2 = pl.field_n;
          synchronized (var2) {
            pi var3 = (pi) (this.field_hb.first(false));
            while (var3 != null) {
              if (var3.field_r != 0 &&
                var3.field_o.isLinked((byte) 48)) {
                pl.field_n.b(var3.field_o);
                var3.field_h = true;
              }
              var3 = (pi) (this.field_hb.next((byte) 70));
            }
            ic var3_ref = (ic) (this.field_N.first(false));
            while (var3_ref != null) {
              if (null != var3_ref.field_g) {
                pl.field_n.b(var3_ref.field_g);
                pl.field_n.b(var3_ref.field_m);
                var3_ref.field_g = null;
                var3_ref.field_m = null;
              }
              var3_ref = (ic) (this.field_N.next((byte) 70));
            }
          }
        }
    }

    private final void b(byte param0) {
        this.field_Tb = this.field_gc;
        this.field_M = 0;
        this.field_lb = false;
        this.field_tb = 0;
        this.field_Bb = false;
        this.field_ib = 1700;
        this.field_I = 0;
        this.field_e = 0;
        this.field_ac = this.field_U;
        this.field_Kb = 0;
        this.shipVelocityYQ16 = 0;
        if (param0 > -71) {
          this.field_ub = 121;
        }
        this.shipVelocityXQ16 = 0;
        this.shipXQ16 = this.spawnXQ16;
        this.field_ec = false;
        this.field_h = null;
        this.field_Ub = -1;
        this.field_m = -1;
        this.field_ab = 0;
        this.shipYQ16 = this.spawnYQ16;
        this.field_hb = new IntrusiveDeque();
        this.field_jc = false;
        this.field_yb = 0;
        this.field_Gb = false;
        this.field_kc = false;
        this.field_Ib = false;
        this.field_q = false;
        this.field_G = new IntrusiveDeque();
        this.field_x = 0;
        this.field_nb = null;
        this.field_O = 0;
        IntrusiveDeque.field_f = new IntrusiveDeque();
        aa.field_a = 0;
        vh.field_i = 0;
    }

    private final void b(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        IntrusiveNode var4 = this.field_G.first(false);
        for (int var5 = param2; this.field_x > var5; var5++) {
          vh var6 = (vh) (var4);
          var6.a(param0, false, param1);
          var4 = var4.next;
        }
    }

    private final void k(byte param0) {
        if (this.easyMode &&
          this.field_Ub == 1) {
          return;
        }
        if (!this.field_Gb) {
          int var2_int = mf.b(this.gameMode, this.field_Ub, -2);
          this.field_J = this.field_J + var2_int;
          v.a(8, var2_int);
        }
        Sprite var3 = mb.field_f[this.field_Ub];
        Sprite var2 = var3;
        this.a(-(var3.fullWidth << 15) + this.field_mb >> 16, -28311553, var2, -(var3.fullHeight << 15) + this.field_E >> 16, sf.field_e[this.field_Ub]);
        if (this.field_Ub == 1) {
          this.b(0);
        }
        if (param0 < 6) {
          return;
        }
        this.field_Ub = -1;
        if (!this.field_Gb) {
          pl.field_n.a(bc.field_c, 100, qm.field_c * 6144 / 64, 8192);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var12;
        int var13 = EscapeVector.obfuscationControl;
        vh.field_i = 0;
        Object var6 = null;
        if (50 <= this.field_oc) {
          return;
        }
        IntrusiveNode var7 = this.field_C.first(false);
        int var8 = 0;
        while (this.field_ub > var8) {
          am var9_ref_am = (am) (var7);
          int var10 = var9_ref_am.field_j;
          int stackIn_18_0 = param2;
          int stackIn_18_1 = var10;
          if (stackIn_18_0 <= stackIn_18_1 &&
            var10 <= param1) {
            int var11 = var9_ref_am.field_i;
            for (var12 = var9_ref_am.field_h; param3 < var12; var12 = var12 - this.worldWidth) {
              var11 = var11 - this.worldWidth;
            }
            while (param3 >= var12) {
              var12 = var12 + this.worldWidth;
              var11 = var11 + this.worldWidth;
            }
            while (param4 >= var11) {
              var6 = this.a((IntrusiveNode) (var6), var12, var11, true, var10);
              var11 = var11 + this.worldWidth;
              var12 = var12 + this.worldWidth;
            }
          }
          var8++;
          var7 = var7.next;
        }
        int stackIn_18_0Lifetime1 = -42;
        int stackIn_18_1Lifetime1 = (45 - param0) / 34;
        int var9 = stackIn_18_0Lifetime1 / stackIn_18_1Lifetime1;
        return;
    }

    private final void b(int param0) {
        if (this.field_Q != param0) {
          return;
        }
        this.field_ec = true;
        if (!this.field_Gb) {
          this.a(50, 0 > this.levelIndex ? qc.field_xb : hi.field_n);
        }
    }

    private final void k(int param0, int param1) {
        this.c(param1, (byte) -111);
        this.b(param1, (byte) 59);
        this.b(false, param1);
        this.g(320, param1);
        if (param0 > -70) {
          this.d(44);
        }
    }

    private final void l(int param0) {
        int var6 = EscapeVector.obfuscationControl;
        if (this.gameMode != 2) {
          return;
        }
        if (param0 != 10974) {
          this.E(-55);
        }
        Sprite[] var12 = ae.field_c;
        if (this.levelIndex < 4) {
          int[] var35 = uj.field_e;
          String[] var22 = lh.field_c;
          DialogueScreen var23 = new DialogueScreen(var35, var12, var22, false);
          re.a(1820, var23);
        } else if (this.levelIndex < 8) {
          int[] var34 = p.field_j;
          String[] var19 = rb.field_j;
          DialogueScreen var20 = new DialogueScreen(var34, var12, var19, false);
          re.a(1820, var20);
        } else if (this.levelIndex < 12) {
          int[] var33 = ha.field_e;
          String[] var16 = pc.field_b;
          DialogueScreen var17 = new DialogueScreen(var33, var12, var16, false);
          re.a(1820, var17);
        } else {
          int[] var32 = w.field_bb;
          String[] var13 = vd.field_i;
          DialogueScreen var14 = new DialogueScreen(var32, var12, var13, false);
          re.a(param0 - 9154, var14);
        }
    }

    private final void a(int param0, int[] param1, byte param2, int param3, int param4, uk param5) {
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          IntPoint var14 = param5.field_f;
          if (param2 != 43) {
            return;
          }
          IntPoint var8 = param5.field_i;
          int var9 = var14.y * param3;
          int var10 = var14.y;
          while (true) {
            if (var8.y < var10) {
              return;
            }
            int var11 = var14.x;
            while (var11 <= var8.x) {
              int var12 = this.a(param5, (byte) 15, var10, var11);
              int stackIn_15_0 = ~var12;
              int stackIn_15_1 = -1;
              if (stackIn_15_0 < stackIn_15_1) {
                param1[var9 + var11] = param4;
              }
              if (0 > var12) {
                param1[var9 + var11] = param0;
              }
              var11++;
            }
            int stackIn_15_0Lifetime1 = var9;
            int stackIn_15_1Lifetime1 = param3;
            var9 = stackIn_15_0Lifetime1 + stackIn_15_1Lifetime1;
            var10++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var7;
          StringBuilder stackIn_19_1 = new StringBuilder().append("oe.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void v(byte param0) {
        int var11 = EscapeVector.obfuscationControl;
        int var2 = this.shipXQ16 >> 5;
        var2 = var2 + (this.worldWidth << 11);
        int var3 = this.shipYQ16 >> 5;
        int var4 = var2 - 24576;
        int var5 = -24576 + var3;
        int var6 = 24576 + var2;
        var4 = var4 >> 11;
        int var7 = 24576 + var3;
        var6 = var6 >> 11;
        var5 = var5 >> 11;
        var7 = var7 >> 11;
        if (param0 < 55) {
          this.field_hb = (IntrusiveDeque) null;
        }
        this.a(98, var7, var5, var4, var6);
        IntrusiveNode var8 = IntrusiveDeque.field_f.first(false);
        for (int var9 = 0; var9 < vh.field_i; var9++) {
          am var10 = (am) (var8);
          var10.field_i = -var2 + (var10.field_i << 11);
          var10.field_h = -var2 + (var10.field_h << 11);
          var8 = var8.next;
          var10.field_j = (var10.field_j << 11) - var3;
        }
        if ((var6 ^ var4) >> 5 == 0) {
          this.a(var5, 31 & var6, var2, var3, var4 >> 5, true, var7, 31 & var4);
        } else {
          this.a(var5, 31, var2, var3, var4 >> 5, true, var7, var4 & 31);
          this.a(var5, var6 & 31, var2, var3, var6 >> 5, true, var7, 0);
        }
    }

    private final void a(LevelObject param0, PointCloudEffect param1, int param2) {
        String stackIn_27_2 = null;
        String stackIn_30_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (~this.field_Q != param2) {
            return;
          }
          if (this.field_k == null) {
            return;
          }
          if (this.field_k.isEmpty(-113)) {
            return;
          }
          if (param0 == null) {
            return;
          }
          if (!param0.field_r) {
            return;
          }
          IntrusiveNode var4 = this.field_k.first(false);
          while (true) {
            if (var4 == null) {
              return;
            }
            LevelObject var5 = (LevelObject) (var4);
            if (var5.objectId != param0.objectId) {
              var4 = this.field_k.next((byte) 70);
              continue;
            }
            break;
          }
          if (param0.field_p) {
            this.f(27, 2);
          }
          var4.unlink((byte) -101);
          this.field_Ab.a(param2 + 1, param1);
          this.a(-111, oi.field_J);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var4_ref;
          StringBuilder stackIn_26_1 = new StringBuilder().append("oe.UB(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          StringBuilder stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final int c(int param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        for (param0 = param0 - this.shipXQ16; (-this.worldWidth << 15) > param0; param0 = param0 + (this.worldWidth << 16)) {
        }
        while (this.worldWidth << 15 < param0) {
          param0 = param0 - (this.worldWidth << 16);
        }
        if (param0 < -this.worldWidth << 14) {
          param0 = -param0 + (-this.worldWidth << 15);
        }
        if (param0 > this.worldWidth << 14) {
          param0 = (this.worldWidth << 15) - param0;
        }
        if (param0 <= -20971520) {
          return 0;
        }
        if (param0 >= 20971520) {
          return 16384;
        }
        if (param1 <= 94) {
          return 5;
        }
        return 8192 + param0 / 2560;
    }

    private final void h(boolean param0) {
        if (0 == this.field_Q) {
          this.a(164, (byte) 127, tf.field_i);
        }
        if (1 == this.field_Q) {
          this.a(164, (byte) 92, gl.field_r);
        }
        if (param0) {
          this.j(70, -118, 0);
        }
    }

    private final int[] a(int param0, byte param1, int param2) {
        int[] stackIn_7_0 = null;
        if (param1 != -82) {
          return (int[]) null;
        }
        if (param2 < 0) {
          return null;
        }
        if (this.field_nc > param2) {
          stackIn_7_0 = this.initialTerrainMasks[param2 * this.tilesWide + param0 % this.tilesWide];
        } else {
          stackIn_7_0 = QuickChatPhraseDefinition.fullTileMask;
        }
        return stackIn_7_0;
    }

    private final boolean b(int param0, Sprite param1, int param2, int param3) {
        String stackIn_12_2 = null;
        try {
          param0 = param0 + param1.offsetX;
          param2 = param2 + param1.offsetY;
          int var5_int = param3 + (param1.width + param0);
          int var6 = -1 + (param2 + param1.height);
          this.a(96, var6, param2, param0, var5_int);
          if ((var5_int ^ param0) >> 5 == 0) {
            boolean stackIn_8_0 = this.a(param1, param0 >> 5, param2, 31 & param0, -(31 & param0), var6, 31, 31 & var5_int);
            return stackIn_8_0;
          }
          if (this.a(param1, param0 >> 5, param2, 31 & param0, -(31 & param0), var6, 31, 31)) {
            return true;
          }
          boolean stackIn_6_0 = this.a(param1, var5_int >> 5, param2, 0, -param0 & 31, var6, 31, 31 & var5_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("oe.EE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(byte param0, int param1, int param2) {
        regionExit1: {
          if (this.field_rc) {
            if (param1 <= 0) {
              int var4 = -40 % ((param0 - 78) / 38);
              break regionExit1;
            }
            if (param2 < 0) {
              pf.a(false, "EV1: " + param1, (Throwable) null);
              return;
            }
            int var4Lifetime2 = this.field_Rb;
            if (var4Lifetime2 < 0) {
              var4Lifetime2 = 0;
            }
            param1 = DialogueScreen.a(this.gameMode, (byte) 126, param1);
            int var5 = -var4Lifetime2 + param2;
            int var6 = var5 + 50 * (param2 + param1 * 50);
            int var7 = al.a(this.gameMode, 26504);
            if (var7 < 0) {
              return;
            }
            lh.a((byte) 99, param1);
            int[] var11 = jm.j(-3282);
            int[] var10 = var11;
            int[] var8 = var10;
            if (var8 == null) {
              return;
            }
            if (4 != var11.length) {
              return;
            }
            IntValueNode.field_i = new ik(var7, var7 ^ 65535, var11[0], var11[1], var11[2], var11[3], new int[]{var6});
            if (!aj.b(-98)) {
              ml.a(IntValueNode.field_i, 3, (byte) 101);
            }
          }
          int var4Lifetime1 = -40 % ((param0 - 78) / 38);
        }
    }

    private final void f(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        if (this.field_Ab == null) {
          return;
        }
        if (this.field_Ab.b(-182442704)) {
          return;
        }
        DualLinkNode var2 = this.field_Ab.a(0);
        while (var2 != null) {
          PointCloudEffect var3 = (PointCloudEffect) (var2);
          boolean stackOut_5_0 = var3.field_B;
          int stackIn_10_0 = stackOut_5_0 ? 1 : 0;
          boolean stackIn_6_0 = stackOut_5_0;
          if (!stackIn_6_0) {
            var2 = this.field_Ab.a((byte) 124);
            continue;
          }
          var2.unlinkSecondary(param0 ^ 20281);
          return;
        }
        int stackIn_10_0Lifetime1 = param0;
        if (stackIn_10_0Lifetime1 != -20320) {
          this.x((byte) 44);
        }
        return;
    }

    private final void B(byte param0) {
        if (this.field_l == 0) {
          return;
        }
        if (param0 <= 99) {
          return;
        }
        if (this.field_a &&
          0 <= this.field_X) {
          this.field_X = this.field_X - 1;
          if (this.field_X < 0 &&
            !this.field_Gb) {
            this.h((byte) -79);
          }
        }
    }

    private final boolean r(byte param0) {
        if (this.levelIndex < 0) {
          return true;
        }
        if (param0 != 90) {
          return true;
        }
        if (this.secondaryTheme != 6) {
          return false;
        }
        return true;
    }

    private final void buildTutorialTerrain(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.field_y >= 2) {
          this.field_y = 2;
        } else {
          this.field_y = 0;
        }
        this.field_dc = -1;
        this.tilesWide = 32;
        this.worldWidth = this.tilesWide << 5;
        this.tilesHigh = 32;
        this.worldHeight = this.tilesHigh << 5;
        this.secondaryTheme = 5;
        this.terrainTheme = 5;
        vl.b(1, 0);
        this.terrainMasks = new int[this.tilesHigh * this.tilesWide][];
        for (int var2 = 0; 4 > var2; var2++) {
          for (int var3 = 0; var3 < 15; var3++) {
            this.terrainMasks[this.tilesWide * var2 + var3] = QuickChatPhraseDefinition.fullTileMask;
          }
          for (int var3Lifetime3 = 17; 32 > var3Lifetime3; var3Lifetime3++) {
            this.terrainMasks[var3Lifetime3 + this.tilesWide * var2] = QuickChatPhraseDefinition.fullTileMask;
          }
        }
        if (guard > -29) {
          this.spawnXQ16 = -97;
        }
        for (int var2Lifetime1 = 4; var2Lifetime1 < 32; var2Lifetime1++) {
          for (int var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.terrainMasks[var2Lifetime1 * this.tilesWide + var3Lifetime1] = QuickChatPhraseDefinition.fullTileMask;
          }
          for (int var3Lifetime1Lifetime1 = 24; var3Lifetime1Lifetime1 < 32; var3Lifetime1Lifetime1++) {
            this.terrainMasks[var2Lifetime1 * this.tilesWide + var3Lifetime1Lifetime1] = QuickChatPhraseDefinition.fullTileMask;
          }
        }
        for (int var2Lifetime2 = 14; var2Lifetime2 < 18; var2Lifetime2++) {
          this.terrainMasks[9 * this.tilesWide + var2Lifetime2] = QuickChatPhraseDefinition.fullTileMask;
        }
        for (int var2Lifetime3 = 14; var2Lifetime3 < 18; var2Lifetime3++) {
          this.terrainMasks[var2Lifetime3 + this.tilesWide * 15] = QuickChatPhraseDefinition.fullTileMask;
        }
        this.snapshotTerrain((byte) 124);
        int var2Lifetime4 = 2;
        int var3Lifetime2 = 0;
        this.levelObjects.setSize(var2Lifetime4);
        int incrementValue$0 = var3Lifetime2;
        var3Lifetime2++;
        LevelObject var6 = new LevelObject(incrementValue$0, 8, 480, -mb.field_f[8].fullHeight + 128);
        this.levelObjects.setElementAt(var6, 0);
        int incrementValue$1 = var3Lifetime2;
        var3Lifetime2++;
        LevelObject var7 = new LevelObject(incrementValue$1, 1, 512 - mb.field_f[1].fullWidth / 2, 480 - mb.field_f[1].fullHeight);
        this.levelObjects.setElementAt(var7, 1);
        this.field_N = new IntrusiveDeque();
        this.spawnYQ16 = 66715648;
        this.field_qb = 512;
        this.spawnXQ16 = this.worldWidth << 15;
        this.field_gc = 150;
        this.field_U = 2500;
        this.field_rb = true;
    }

    private final void a(int param0, Sprite param1, int param2, int param3) {
        String stackIn_46_2 = null;
        int[] var25 = null;
        int var26 = 0;
        int var33 = EscapeVector.obfuscationControl;
        try {
          double var5_double = (double)this.field_I * 0.02454369260617026;
          int var7 = (int)(Math.sin(var5_double) * 2048.0);
          int var8 = -(int)(Math.cos(var5_double) * 2048.0);
          int var9 = -var8;
          int var10 = var7;
          int var11 = this.shipXQ16 >> 5;
          int var12 = this.shipYQ16 >> 5;
          int var13 = var11 + 10 * var7;
          int var14 = -(var7 * 2) + var11;
          int var15 = var12 + var8 * 10;
          int var16 = -(var8 * 2) + var12;
          int var17 = -(6 * var7) + (var11 - 8 * var9);
          int var18 = var11 + (-(6 * var7) + 8 * var9);
          int var19 = -(var10 * 8) + (-(6 * var8) + var12);
          int var20 = 8 * var10 - var8 * 6 + var12;
          int var21 = var13;
          if (var21 > var17) {
            var21 = var17;
          }
          if (var18 < var21) {
            var21 = var18;
          }
          int var22 = var15;
          if (var19 < var22) {
            var22 = var19;
          }
          if (var22 > var20) {
            var22 = var20;
          }
          int var23 = var13;
          if (var23 < var17) {
            var23 = var17;
          }
          if (var18 > var23) {
            var23 = var18;
          }
          int var24 = var15;
          if (var19 > var24) {
            var24 = var19;
          }
          var21 = -param3 + (var21 >> 11);
          if (var24 < var20) {
            var24 = var20;
          }
          var22 = -param0 + (var22 >> 11);
          var23 = -param3 + (var23 >> 11);
          var24 = -param0 + (var24 >> 11);
          if (param1 != null) {
            param1.offsetY = var22;
            var23 = var23 - var21;
            param1.offsetX = var21;
            var24 = var24 - var22;
            var21 = var21 << 11;
            var22 = var22 << 11;
            var13 = var13 - var21;
            var11 = var11 - var21;
            var18 = var18 - var21;
            var14 = var14 - var21;
            var15 = var15 - var22;
            var20 = var20 - var22;
            var19 = var19 - var22;
            var16 = var16 - var22;
            var12 = var12 - var22;
            var17 = var17 - var21;
            param1.height = 1 + var24;
            var21 = 0;
            param1.width = var23 + 1;
            var22 = 0;
            param1.fullHeight = param1.height + param1.offsetY;
            param1.fullWidth = param1.offsetX + param1.width;
            int var27 = param1.width * param1.height;
            if (param1.pixels.length >= var27) {
              for (int var28 = 0; var28 < var27; var28++) {
                param1.pixels[var28] = 0;
              }
            } else {
              param1.pixels = new int[var27];
            }
            var25 = param1.pixels;
            var26 = param1.width;
          } else {
            if (var22 < 0) {
              var22 = 0;
            }
            if (var23 > 639) {
              var23 = 639;
            }
            var25 = SoftwareRasterizer.pixels;
            if (var24 > 479) {
              var24 = 479;
            }
            var26 = 640;
            if (var21 < 0) {
              var21 = 0;
            }
          }
          int var27Lifetime1 = -(var9 >> 5) + (var7 >> 7);
          int var28Lifetime1 = -(var10 >> 5) + (var8 >> 7);
          int var29 = param2 * (-(var27Lifetime1 >> 1) + (128 - var28Lifetime1));
          int var27Lifetime2 = (var7 >> 7) + (var9 >> 5);
          int var28Lifetime2 = (var8 >> 7) + (var10 >> 5);
          int var30 = 65793 * (-var28Lifetime2 + (128 - (var27Lifetime2 >> 1)));
          if (this.usesDynamicTerrain(8192) &&
            se.field_b != null) {
            var30 = se.field_b.field_b;
            var29 = se.field_b.field_b;
          }
          uk var32 = ae.field_b;
          var32.field_e.set(param3, param2 ^ 65913, param0);
          var32.field_k.set(var13, 126, var15);
          var32.field_d.set(var14, param2 ^ 65914, var16);
          var32.field_g.set(var17, 124, var19);
          var32.field_c.set(var18, 125, var20);
          var32.field_f.set(var21, 127, var22);
          var32.field_i.set(var23, 122, var24);
          this.a(var29, var25, (byte) 43, var26, var30, var32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_45_0 = var5;
          StringBuilder stackIn_45_1 = new StringBuilder().append("oe.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    GameplaySession(byte[][] param0, int param1, int param2, int param3) {
        try {
          this.easyMode = false;
          this.field_rc = true;
          this.timeHackMode = false;
          this.field_Q = 0;
          this.levelObjects = new Vector();
          this.field_vb = new IntrusiveDeque();
          this.field_Db = new od(this);
          this.field_Xb = new PointCloudEffect(512);
          this.field_Sb = 0;
          this.field_qc = 0;
          this.field_nb = null;
          this.field_G = new IntrusiveDeque();
          this.field_A = 3;
          this.field_tc = new IntrusiveDeque();
          this.field_X = 0;
          this.field_a = false;
          this.field_g = new int[3];
          this.field_sb = 0;
          this.field_l = 0;
          this.field_Lb = new int[32];
          this.field_i = new Sprite(638, 60);
          this.field_s = new IntrusiveDeque();
          this.field_C = new IntrusiveDeque();
          try {
            od.field_k = l.a((byte) -111);
            if (od.field_k) {
              System.out.println("Mod logged in: Cheats activated");
            }
            this.field_jb = hl.a(oj.field_N, 100, 0);
            this.field_jb.h(-1);
            pl.field_n.a(this.field_jb);
            this.field_Z = hl.a(ng.field_mb, 100, 0);
            this.field_Z.h(-1);
            pl.field_n.a(this.field_Z);
            this.field_v = hl.a(th.field_G, 100, 0);
            this.field_v.h(-1);
            pl.field_n.a(this.field_v);
            this.field_Wb = hl.a(vi.field_c, 100, 0);
            this.field_Wb.h(-1);
            pl.field_n.a(this.field_Wb);
            this.field_wb = hl.a(w.field_hb, 100, 0);
            this.field_wb.h(-1);
            pl.field_n.a(this.field_wb);
            this.field_r = hl.a(of.field_h, 100, 0);
            this.field_r.h(-1);
            pl.field_n.a(this.field_r);
            this.field_lc = hl.a(pa.field_a, 100, 0);
            this.field_lc.h(-1);
            pl.field_n.a(this.field_lc);
            this.field_fb = new m();
            pl.field_n.a(this.field_fb);
            NetworkGameClient.a(127, param3);
            this.levelData = param0;
            this.levelIndex = param3;
            this.gameMode = param2;
            this.field_Rb = param3;
            this.j((byte) -110);
            this.field_c = 64;
            if (param3 >= 0) {
              this.a(164, (byte) 122, m.field_n);
              this.field_j = 314;
            }
            this.a((byte) 84, param1);
            this.o(0);
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    GameplaySession(byte[][] param0) {
        try {
          this.easyMode = false;
          this.field_rc = true;
          this.timeHackMode = false;
          this.field_Q = 0;
          this.levelObjects = new Vector();
          this.field_vb = new IntrusiveDeque();
          this.field_Db = new od(this);
          this.field_Xb = new PointCloudEffect(512);
          this.field_Sb = 0;
          this.field_qc = 0;
          this.field_nb = null;
          this.field_G = new IntrusiveDeque();
          this.field_A = 3;
          this.field_tc = new IntrusiveDeque();
          this.field_X = 0;
          this.field_a = false;
          this.field_g = new int[3];
          this.field_sb = 0;
          this.field_l = 0;
          this.field_Lb = new int[32];
          this.field_i = new Sprite(638, 60);
          this.field_s = new IntrusiveDeque();
          this.field_C = new IntrusiveDeque();
          try {
            this.levelData = param0;
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_cc = "...";
        field_xb = new int[8192];
    }
}
