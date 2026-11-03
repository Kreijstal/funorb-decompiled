/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameState {
    int field_w;
    int field_k;
    private int field_C;
    int field_f;
    boolean field_z;
    Player[] field_v;
    private int[] field_N;
    GalaxyMap field_g;
    int[] field_m;
    int field_e;
    private int field_M;
    private int[] field_u;
    String[] field_I;
    int field_y;
    private int[] field_B;
    static IntrusiveDeque field_E;
    private int[] field_j;
    private int field_b;
    int field_O;
    int field_J;
    VictoryChecker field_x;
    GameRules field_o;
    private int field_n;
    TertiaryNodeList field_p;
    private int[][] field_t;
    IntrusiveDeque field_i;
    IntrusiveDeque field_A;
    int field_r;
    int[] field_D;
    private int[] field_d;
    static Sprite field_F;
    private int[] field_K;
    private int field_G;
    private Random field_L;
    static int[] field_c;
    IntrusiveDeque field_q;
    static int[] field_s;
    private int[] field_h;
    static np field_l;
    private int[] field_H;
    static String field_a;

    private final void applyPlacementsAndIncome(boolean param0, TurnEventLog param1, int param2) {
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        PlacementOrder var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        Territory var8 = null;
        lo var8_ref = null;
        int var9 = 0;
        Player var10 = null;
        int var11 = 0;
        Territory var11_ref_sd = null;
        int var12 = 0;
        int var13 = 0;
        Player[] var14 = null;
        Player var15 = null;
        Player[] var16 = null;
        Player var17 = null;
        Player[] var18 = null;
        int[] var19 = null;
        lo var20 = null;
        int[] var21 = null;
        PlacementOrder var4Lifetime1;
        int[] var5Lifetime1;
        Territory var8Lifetime1;
        Player var10Lifetime1;
        Territory var11_ref_sdLifetime1;
        Player[] var18Lifetime1;
        int[] var19Lifetime1;
        lo var20Lifetime1;
        int[] var21Lifetime1;
        Territory var11_ref_sdLifetime1Lifetime1;
        lo var20Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var11Lifetime2;
        int var12Lifetime2;
        int var6Lifetime1Lifetime1;
        int var6Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var12Lifetime1Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = (PlacementOrder) (this.field_q.startForward(0));
          while (var4 != null) {
            if (this.field_o.field_i) {
              var4.field_u.field_y.field_m.field_x = var4.field_u.field_y.field_m.field_x - var4.field_v;
            } else {
              var4.field_u.field_R.field_x = var4.field_u.field_R.field_x - var4.field_v;
            }
            var4.field_u.field_x = var4.field_u.field_x + var4.field_v;
            var4 = (PlacementOrder) (this.field_q.nextForward((byte) -71));
          }
          var14 = this.field_v;
          for (var6 = 0; var14.length > var6; var6++) {
            var15 = var14[var6];
            if (!this.field_o.field_i) {
              var8 = (Territory) (var15.field_i.startForward(0));
              while (var8 != null) {
                if (0 < var8.field_x) {
                  var8.field_q.field_x = var8.field_q.field_x + var8.field_x;
                }
                var8 = (Territory) (var15.field_i.nextForward((byte) -71));
              }
            } else {
              var8_ref = var15.field_m;
              if (((Territory) ((Object) var8_ref)).field_x > 0) {
                ((Territory) ((Object) var8_ref)).field_q.field_x = ((Territory) ((Object) var8_ref)).field_q.field_x + ((Territory) ((Object) var8_ref)).field_x;
              }
            }
          }
          if (!param0) {
            field_s = (int[]) null;
          }
          if (param1 != null) {
            var4Lifetime1 = (PlacementOrder) (this.field_q.startForward(0));
            while (var4Lifetime1 != null) {
              param1.recordPlacement(var4Lifetime1.field_v, var4Lifetime1.field_u, -4900);
              var4Lifetime1 = (PlacementOrder) (this.field_q.nextForward((byte) -71));
            }
            var16 = this.field_v;
            for (var6Lifetime1 = 0; var16.length > var6Lifetime1; var6Lifetime1++) {
              var17 = var16[var6Lifetime1];
              if (!this.field_o.field_i) {
                var8Lifetime1 = (Territory) (var17.field_i.startForward(0));
                while (var8Lifetime1 != null) {
                  if (var8Lifetime1.field_x > 0) {
                    param1.recordPlacement(var8Lifetime1.field_x, var8Lifetime1.field_q, -4900);
                  }
                  var8Lifetime1 = (Territory) (var17.field_i.nextForward((byte) -71));
                }
              } else {
                if (var17.field_m.field_x > 0) {
                  param1.recordPlacement(var17.field_m.field_x, var17.field_m.field_q, -4900);
                }
              }
            }
            if (!this.field_o.field_h) {
              return;
            }
            if (this.field_x instanceof TutorialVictoryChecker) {
              return;
            }
            var21 = new int[4];
            var19 = var21;
            var5 = var19;
            var18 = this.field_v;
            for (var9 = 0; var18.length > var9; var9++) {
              var10 = var18[var9];
              if ((1 << var10.field_x & this.field_w) == 0) {
                var7 = 0;
                for (var11 = 0; var11 < 4; var11++) {
                  var21[var11] = 0;
                }
                var6Lifetime1Lifetime1 = 0;
                if (this.field_o.field_i) {
                  var20 = var10.field_m;
                  for (var12 = 0; var12 < 4; var12++) {
                    var5[var12] = var20.field_u[var12];
                    if (var21[var12] > var7) {
                      var7 = var21[var12];
                    }
                    var5[var12] = var5[var12] + 1;
                    var6Lifetime1Lifetime1 = var6Lifetime1Lifetime1 + var21[var12];
                  }
                } else {
                  var11_ref_sd = (Territory) (var10.field_i.startForward(0));
                  while (var11_ref_sd != null) {
                    for (var12 = 0; var12 < 4; var12++) {
                      var5[var12] = var5[var12] + var11_ref_sd.field_u[var12];
                      if (var21[var12] > var7) {
                        var7 = var21[var12];
                      }
                    }
                    var11_ref_sd = (Territory) (var10.field_i.nextForward((byte) -71));
                  }
                  for (var12 = 0; var12 < 4; var12++) {
                    var5[var12] = var5[var12] + 1;
                    var6Lifetime1Lifetime1 = var6Lifetime1Lifetime1 + var21[var12];
                  }
                }
                this.field_L.setSeed((long)(1 + var10.field_x ^ param2));
                var11Lifetime2 = qf.a((byte) 81, var6Lifetime1Lifetime1, this.field_L);
                var12Lifetime2 = 0;
                while (4 > var12Lifetime2) {
                  if (var21[var12Lifetime2] <= var11Lifetime2) {
                    var11Lifetime2 = var11Lifetime2 - var21[var12Lifetime2];
                    var12Lifetime2++;
                    continue;
                  }
                  if (var10.field_u[var12Lifetime2] < 5) {
                    var10.field_u[var12Lifetime2] = var10.field_u[var12Lifetime2] + 1;
                    break;
                  }
                  if (var10.field_q == null) {
                    break;
                  }
                  var10.field_q.field_d = var10.field_q.field_d + 1;
                  break;
                }
              }
            }
            return;
          }
          if (this.field_o.field_h &&
            !(this.field_x instanceof TutorialVictoryChecker)) {
            var21Lifetime1 = new int[4];
            var19Lifetime1 = var21Lifetime1;
            var5Lifetime1 = var19Lifetime1;
            var18Lifetime1 = this.field_v;
            var9Lifetime1 = 0;
            if (var18Lifetime1.length > var9Lifetime1) {
              var10Lifetime1 = var18Lifetime1[var9Lifetime1];
              if ((1 << var10Lifetime1.field_x & this.field_w) != 0) {
                scanLoop1: while (true) {
                  var9Lifetime1++;
                  if (var18Lifetime1.length <= var9Lifetime1) {
                    return;
                  }
                  var10Lifetime1 = var18Lifetime1[var9Lifetime1];
                  if ((1 << var10Lifetime1.field_x & this.field_w) != 0) {
                    continue;
                  }
                  var7Lifetime1 = 0;
                  for (var11Lifetime1 = 0; var11Lifetime1 < 4; var11Lifetime1++) {
                    var21Lifetime1[var11Lifetime1] = 0;
                  }
                  var6Lifetime2 = 0;
                  if (this.field_o.field_i) {
                    var20Lifetime1 = var10Lifetime1.field_m;
                    for (var12Lifetime1 = 0; var12Lifetime1 < 4; var12Lifetime1++) {
                      var5Lifetime1[var12Lifetime1] = var20Lifetime1.field_u[var12Lifetime1];
                      if (var21Lifetime1[var12Lifetime1] > var7Lifetime1) {
                        var7Lifetime1 = var21Lifetime1[var12Lifetime1];
                      }
                      var5Lifetime1[var12Lifetime1] = var5Lifetime1[var12Lifetime1] + 1;
                      var6Lifetime2 = var6Lifetime2 + var21Lifetime1[var12Lifetime1];
                    }
                  } else {
                    var11_ref_sdLifetime1 = (Territory) (var10Lifetime1.field_i.startForward(0));
                    while (var11_ref_sdLifetime1 != null) {
                      for (var12Lifetime1 = 0; var12Lifetime1 < 4; var12Lifetime1++) {
                        var5Lifetime1[var12Lifetime1] = var5Lifetime1[var12Lifetime1] + var11_ref_sdLifetime1.field_u[var12Lifetime1];
                        if (var21Lifetime1[var12Lifetime1] > var7Lifetime1) {
                          var7Lifetime1 = var21Lifetime1[var12Lifetime1];
                        }
                      }
                      var11_ref_sdLifetime1 = (Territory) (var10Lifetime1.field_i.nextForward((byte) -71));
                    }
                    for (var12Lifetime1 = 0; var12Lifetime1 < 4; var12Lifetime1++) {
                      var5Lifetime1[var12Lifetime1] = var5Lifetime1[var12Lifetime1] + 1;
                      var6Lifetime2 = var6Lifetime2 + var21Lifetime1[var12Lifetime1];
                    }
                  }
                  this.field_L.setSeed((long)(1 + var10Lifetime1.field_x ^ param2));
                  var11Lifetime1 = qf.a((byte) 81, var6Lifetime2, this.field_L);
                  var12Lifetime1 = 0;
                  while (true) {
                    if (4 <= var12Lifetime1) {
                      continue scanLoop1;
                    }
                    if (var21Lifetime1[var12Lifetime1] <= var11Lifetime1) {
                      var11Lifetime1 = var11Lifetime1 - var21Lifetime1[var12Lifetime1];
                      var12Lifetime1++;
                      continue;
                    }
                    break;
                  }
                  if (var10Lifetime1.field_u[var12Lifetime1] < 5) {
                    var10Lifetime1.field_u[var12Lifetime1] = var10Lifetime1.field_u[var12Lifetime1] + 1;
                    continue scanLoop1;
                  }
                  if (var10Lifetime1.field_q == null) {
                    continue scanLoop1;
                  }
                  var10Lifetime1.field_q.field_d = var10Lifetime1.field_q.field_d + 1;
                }
              }
              var7Lifetime1Lifetime1 = 0;
              for (var11Lifetime1Lifetime1 = 0; var11Lifetime1Lifetime1 < 4; var11Lifetime1Lifetime1++) {
                var21Lifetime1[var11Lifetime1Lifetime1] = 0;
              }
              while (true) {
                var6Lifetime2Lifetime1 = 0;
                if (this.field_o.field_i) {
                  var20Lifetime1Lifetime1 = var10Lifetime1.field_m;
                  for (var12Lifetime1Lifetime1 = 0; var12Lifetime1Lifetime1 < 4; var12Lifetime1Lifetime1++) {
                    var5Lifetime1[var12Lifetime1Lifetime1] = var20Lifetime1Lifetime1.field_u[var12Lifetime1Lifetime1];
                    if (var21Lifetime1[var12Lifetime1Lifetime1] > var7Lifetime1Lifetime1) {
                      var7Lifetime1Lifetime1 = var21Lifetime1[var12Lifetime1Lifetime1];
                    }
                    var5Lifetime1[var12Lifetime1Lifetime1] = var5Lifetime1[var12Lifetime1Lifetime1] + 1;
                    var6Lifetime2Lifetime1 = var6Lifetime2Lifetime1 + var21Lifetime1[var12Lifetime1Lifetime1];
                  }
                } else {
                  var11_ref_sdLifetime1Lifetime1 = (Territory) (var10Lifetime1.field_i.startForward(0));
                  while (var11_ref_sdLifetime1Lifetime1 != null) {
                    for (var12Lifetime1Lifetime1 = 0; var12Lifetime1Lifetime1 < 4; var12Lifetime1Lifetime1++) {
                      var5Lifetime1[var12Lifetime1Lifetime1] = var5Lifetime1[var12Lifetime1Lifetime1] + var11_ref_sdLifetime1Lifetime1.field_u[var12Lifetime1Lifetime1];
                      if (var21Lifetime1[var12Lifetime1Lifetime1] > var7Lifetime1Lifetime1) {
                        var7Lifetime1Lifetime1 = var21Lifetime1[var12Lifetime1Lifetime1];
                      }
                    }
                    var11_ref_sdLifetime1Lifetime1 = (Territory) (var10Lifetime1.field_i.nextForward((byte) -71));
                  }
                  for (var12Lifetime1Lifetime1 = 0; var12Lifetime1Lifetime1 < 4; var12Lifetime1Lifetime1++) {
                    var5Lifetime1[var12Lifetime1Lifetime1] = var5Lifetime1[var12Lifetime1Lifetime1] + 1;
                    var6Lifetime2Lifetime1 = var6Lifetime2Lifetime1 + var21Lifetime1[var12Lifetime1Lifetime1];
                  }
                }
                this.field_L.setSeed((long)(1 + var10Lifetime1.field_x ^ param2));
                var11Lifetime1Lifetime2 = qf.a((byte) 81, var6Lifetime2Lifetime1, this.field_L);
                for (var12Lifetime1Lifetime1 = 0; 4 > var12Lifetime1Lifetime1; var12Lifetime1Lifetime1++) {
                  if (var21Lifetime1[var12Lifetime1Lifetime1] <= var11Lifetime1Lifetime2) {
                    var11Lifetime1Lifetime2 = var11Lifetime1Lifetime2 - var21Lifetime1[var12Lifetime1Lifetime1];
                    continue;
                  }
                  if (var10Lifetime1.field_u[var12Lifetime1Lifetime1] < 5) {
                    var10Lifetime1.field_u[var12Lifetime1Lifetime1] = var10Lifetime1.field_u[var12Lifetime1Lifetime1] + 1;
                  } else {
                    if (var10Lifetime1.field_q != null) {
                      var10Lifetime1.field_q.field_d = var10Lifetime1.field_q.field_d + 1;
                    }
                  }
                  break;
                }
                while (true) {
                  var9Lifetime1++;
                  if (var18Lifetime1.length <= var9Lifetime1) {
                    return;
                  }
                  var10Lifetime1 = var18Lifetime1[var9Lifetime1];
                  if ((1 << var10Lifetime1.field_x & this.field_w) != 0) {
                    continue;
                  }
                  break;
                }
                var7Lifetime1Lifetime1 = 0;
                for (var11Lifetime1Lifetime2 = 0; var11Lifetime1Lifetime2 < 4; var11Lifetime1Lifetime2++) {
                  var21Lifetime1[var11Lifetime1Lifetime2] = 0;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_85_0 = var4_ref;
          stackIn_85_1 = new StringBuilder().append("dc.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_85_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void d(int param0) {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0 != 22943) {
              field_a = (String) null;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                QuickChatCategoryRegistry.field_a = 1 + (int)(var3.longValue() / 1048576L);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void setYearNameIndices(int param0, int param1, boolean param2) {
        if (param2) {
          this.field_f = 124;
        }
        this.field_G = param1;
        this.field_n = param0;
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
          this.field_g = (GalaxyMap) null;
        }
        var2 = 0;
        while (var2 < this.field_C) {
          if (this.field_H[var2] != 0) {
            var2++;
            continue;
          }
          this.c(var2, -40);
        }
    }

    final boolean isWithinMovementRange(Star param0, Star param1, int param2) {
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != -1) {
            return true;
          }
          stackIn_8_0 = (this.field_o.field_b == 0) || !(this.field_o.field_b < this.field_g.field_h[param0.field_p][param1.field_p]);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("dc.T(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var3;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 > -15) {
          this.b((byte) -59);
        }
        var3 = this.field_K[param0];
        this.field_C = this.field_C - 1;
        this.field_K[param0] = this.field_K[this.field_C];
        this.field_t[param0] = this.field_t[this.field_C];
        this.field_H[param0] = this.field_H[this.field_C];
        for (var4 = 0; var4 < this.field_C; var4++) {
          for (var5 = 0; var5 < this.field_H[var4]; var5++) {
            if (var3 == this.field_t[var4][var5]) {
              this.field_H[var4] = this.field_H[var4] - 1;
              this.field_t[var4][var5] = this.field_t[var4][this.field_H[var4]];
            }
          }
        }
    }

    final void c(int param0) {
        int var3 = 0;
        Player[] var2;
        Player var4;
        Territory var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_v;
        for (var3 = param0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (!this.field_o.field_i) {
            var5 = (Territory) (var4.field_i.startForward(0));
            while (var5 != null) {
              QuaternaryListSequence.a(127, var5);
              var5 = (Territory) (var4.field_i.nextForward((byte) -71));
            }
          } else {
            QuaternaryListSequence.a(127, var4.field_m);
          }
        }
    }

    public static void clearStatics(byte param0) {
        field_F = null;
        int var1 = -53 % ((70 - param0) / 38);
        field_l = null;
        field_a = null;
        field_c = null;
        field_E = null;
        field_s = null;
    }

    final void recomputePlayerTotals(int param0) {
        int var2_int = 0;
        int var3 = 0;
        Player var3_ref_fs;
        int var5;
        Star[] var2;
        Territory var4;
        Star[] var6;
        Star var7;
        Star var8;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 > -2) {
          return;
        }
        for (var2_int = 0; this.field_r > var2_int; var2_int++) {
          var3_ref_fs = this.field_v[var2_int];
          this.field_D[var2_int] = 0;
          if (!this.field_o.field_i) {
            var4 = (Territory) (var3_ref_fs.field_i.startForward(0));
            while (var4 != null) {
              this.field_D[var2_int] = this.field_D[var2_int] + var4.field_r;
              var4 = (Territory) (var3_ref_fs.field_i.nextForward((byte) -71));
            }
          } else {
            this.field_D[var2_int] = var3_ref_fs.field_m.field_r;
          }
        }
        var6 = this.field_g.field_e;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var7 = var6[var3];
          var8 = var7;
          if (var8.field_y != null) {
            this.field_D[var7.field_y.field_x] = this.field_D[var7.field_y.field_x] + var7.field_x;
          }
        }
        this.field_m = nf.a(this.field_D, 3718);
        return;
    }

    final void readMap(PacketBuffer param0, Player param1, boolean param2) throws jn, kr {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_g = uk.a(this.field_M, this, param0, this.field_A, this.field_v, param1, (byte) -7, this.field_o);
          if (param2) {
            this.field_L = (Random) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("dc.KA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int var4 = 0;
        int dupTemp$0 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 15) {
          this.field_h = (int[]) null;
        }
        do {
          if (1 >= this.field_C) {
            return;
          }
          var2 = 0;
          var3 = this.field_L.nextInt();
          for (var4 = 1; var4 < this.field_C; var4++) {
            var5 = this.field_L.nextInt();
            if (var5 > var3) {
              var3 = var5;
              var2 = var4;
            }
          }
          var2 = this.field_K[var2];
          dupTemp$0 = this.field_u[var2] - 1;
          this.field_u[var2] = dupTemp$0;
          if (0 == dupTemp$0) {
            this.c(this.a((byte) 94, var2), -119);
          }
        } while (this.field_u[var2] >= 0);
        throw new RuntimeException();
    }

    private final void buildHostilePairs(byte param0, boolean[][] param1) {
        int var5 = 0;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int dupTemp$2 = 0;
        int[] arrayValue$3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3_intLifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_t = new int[1 + this.field_r][this.field_r];
          for (var3_int = 0; this.field_C > var3_int; var3_int++) {
            this.field_H[var3_int] = 0;
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < this.field_C; var3_intLifetime1++) {
            var4 = this.field_K[var3_intLifetime1];
            for (var5 = var3_intLifetime1 + 1; var5 < this.field_C; var5++) {
              var6 = this.field_K[var5];
              if (~var4 == ~this.field_r ||
                var6 == this.field_r ||
                !param1[var4][var6]) {
                dupTemp$0 = this.field_H[var3_intLifetime1];
                arrayValue$1 = this.field_t[var3_intLifetime1];
                this.field_H[var3_intLifetime1] = dupTemp$0 + 1;
                arrayValue$1[dupTemp$0] = var6;
                dupTemp$2 = this.field_H[var5];
                arrayValue$3 = this.field_t[var5];
                this.field_H[var5] = dupTemp$2 + 1;
                arrayValue$3[dupTemp$2] = var4;
              }
            }
          }
          if (param0 != -114) {
            return;
          }
          this.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("dc.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void declareWinner(int param0, int param1) {
        this.field_z = true;
        this.field_k = param0;
        if (param1 != 3) {
          this.c(-66);
        }
    }

    final void processTurn(int param0, int param1, TurnEventLog param2, AchievementProgress param3) {
        boolean[] array$0 = null;
        int var10 = 0;
        int var12 = 0;
        int stackIn_34_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[][] var5 = null;
        RuntimeException var5_ref = null;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        Star[] var10_ref_ln__ = null;
        int var11 = 0;
        Star var12_ref_ln = null;
        int var13 = 0;
        Star[] var14 = null;
        Star var15 = null;
        boolean[][] var16 = null;
        Star[] var17 = null;
        boolean[][] var18 = null;
        Object var8Lifetime1;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var11Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var18 = new boolean[this.field_r][];
          var16 = var18;
          var5 = var16;
          if (this.field_o.field_j) {
            for (var6_int = 0; var6_int < this.field_r; var6_int++) {
              var5[var6_int] = this.field_v[var6_int].field_h;
            }
          } else {
            for (var6_int = 0; this.field_r > var6_int; var6_int++) {
              array$0 = new boolean[this.field_r];
              var5[var6_int] = array$0;
            }
          }
          this.applyPlacementsAndIncome(true, param2, param0);
          if (param3 != null) {
            for (var6_intLifetime1 = 0; this.field_r > var6_intLifetime1; var6_intLifetime1++) {
              param3.field_l[var6_intLifetime1] = 0;
              param3.field_b[var6_intLifetime1] = 0;
              param3.field_f[var6_intLifetime1] = 0;
              param3.field_h[var6_intLifetime1] = 0;
            }
            var14 = this.field_g.field_e;
            for (var7 = 0; var7 < var14.length; var7++) {
              var15 = var14[var7];
              if (var15.field_y != null) {
                param3.field_l[var15.field_y.field_x] = param3.field_l[var15.field_y.field_x] + var15.field_x;
              }
            }
          }
          this.applyDefensiveNetAndStellarBombProjects(param2, 82, param3);
          this.resolveAllStarCombats(param1 + 12268, param2, var18, param3, param0);
          this.a(param2, param0, 14389);
          this.applyTannhauserAndTerraformProjects(param3, param0, 7377, param2);
          this.expireAlliancesAndWormholes(param1, param2);
          this.e(0);
          this.markDefeatedPlayers(param2, 0);
          this.checkVictory(param1 ^ -6);
          if (param3 != null) {
            for (var6_intLifetime2 = 0; var6_intLifetime2 < this.field_r; var6_intLifetime2++) {
              if (param3.field_f[var6_intLifetime2] < 1) {
              }
              if (param3.field_h[var6_intLifetime2] == 4) {
                param3.field_j[var6_intLifetime2][22] = true;
              }
            }
            var6 = null;
            var7Lifetime1 = 1;
            var8 = null;
            var9 = 1;
            var10_ref_ln__ = this.field_g.field_e;
            for (var11 = 0; var10_ref_ln__.length > var11; var11++) {
              var12_ref_ln = var10_ref_ln__[var11];
              if (var12_ref_ln.field_L == 2) {
                stackIn_34_0 = (var9 != 0) ? 0 : 1;
                if (stackIn_34_0 != 1) {
                  if (var12_ref_ln.field_y != null) {
                    if (var8 == null) {
                      var8 = var12_ref_ln.field_y;
                    } else {
                      if (var12_ref_ln.field_y != var8) {
                        var9 = 0;
                      }
                    }
                  } else {
                    var9 = 0;
                  }
                }
              }
              if (var12_ref_ln.field_L == 3 &&
                var7Lifetime1 != 0) {
                if (null == var12_ref_ln.field_y) {
                  var7Lifetime1 = 0;
                } else {
                  if (var6 != null) {
                    if (var6 != var12_ref_ln.field_y) {
                      var7Lifetime1 = 0;
                    }
                  } else {
                    var6 = var12_ref_ln.field_y;
                  }
                }
              }
            }
            if (var7Lifetime1 != 0 &&
              4 <= this.field_r) {
              param3.field_j[((Player) (var6)).field_x][21] = true;
            }
            if (var9 != 0) {
              stackIn_62_0 = ~this.field_r;
              stackIn_62_1 = -5;
              if (stackIn_62_0 <= stackIn_62_1 &&
                this.field_x instanceof DerelictVictoryChecker) {
                param3.field_j[((Player) (var8)).field_x][19] = true;
              }
            }
            for (var10 = 0; var10 < this.field_v.length; var10++) {
              var11Lifetime1 = 1;
              for (var12 = 0; var12 < 4; var12++) {
                if (param3.field_d[var10][var12]) {
                  continue;
                }
                var11Lifetime1 = 0;
                break;
              }
              if (var11Lifetime1 != 0) {
                param3.field_j[var10][24] = true;
              }
            }
          }
          var17 = this.field_g.field_e;
          for (var7Lifetime2 = 0; var17.length > var7Lifetime2; var7Lifetime2++) {
            var8Lifetime1 = var17[var7Lifetime2];
            ((Star) (var8Lifetime1)).field_Q = 0;
            ((Star) (var8Lifetime1)).field_C = 0;
          }
          this.recomputePlayerTotals(-60);
          this.field_O = this.field_O + 1;
          this.field_g.computeDistances((byte) 80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_83_0 = var5_ref;
          stackIn_83_1 = new StringBuilder().append("dc.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param3 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(')').toString());
        }
    }

    private final void applyDefensiveNetAndStellarBombProjects(TurnEventLog param0, int param1, AchievementProgress param2) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        ProjectUse var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ProjectUse var4Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 <= 40) {
            this.b((byte) 111);
          }
          if (!this.field_o.field_h) {
            return;
          }
          var4 = (ProjectUse) (this.field_i.startForward(0));
          while (var4 != null) {
            if (0 != var4.field_o) {
              var4 = (ProjectUse) (this.field_i.nextForward((byte) -71));
              continue;
            }
            this.setDefensiveNet(var4.field_q, true);
            if (param0 != null) {
              param0.recordProject(0, var4.field_q, var4.field_p);
            }
            if (param2 != null) {
              param2.field_h[var4.field_p.field_x] = param2.field_h[var4.field_p.field_x] + 1;
              if (this.field_O > 0 && (0 == ab.field_c[this.field_G] ||
                lr.field_b[this.field_n] == 0)) {
                param2.field_d[var4.field_p.field_x][0] = true;
              }
            }
            var4 = (ProjectUse) (this.field_i.nextForward((byte) -71));
          }
          var4Lifetime1 = (ProjectUse) (this.field_i.startForward(0));
          while (var4Lifetime1 != null) {
            stackIn_23_0 = var4Lifetime1.field_o;
            stackIn_23_1 = 2;
            if (stackIn_23_0 == stackIn_23_1 &&
              var4Lifetime1.field_q.field_y != var4Lifetime1.field_p && (null == var4Lifetime1.field_q.field_y ||
              !var4Lifetime1.field_p.field_h[var4Lifetime1.field_q.field_y.field_x])) {
              var4Lifetime1.field_p.field_u[2] = 0;
              var5 = this.applyStellarBomb((byte) 95, var4Lifetime1.field_q);
              if (param0 != null) {
                param0.recordStellarBomb(var5, var4Lifetime1.field_q, var4Lifetime1.field_p, -81);
              }
              if (param2 != null) {
                param2.field_b[var4Lifetime1.field_p.field_x] = param2.field_b[var4Lifetime1.field_p.field_x] + var5;
                param2.field_h[var4Lifetime1.field_p.field_x] = param2.field_h[var4Lifetime1.field_p.field_x] + 1;
                if (this.field_O > 0 && (ab.field_c[this.field_G] == 2 ||
                  lr.field_b[this.field_n] == 2)) {
                  param2.field_d[var4Lifetime1.field_p.field_x][2] = true;
                }
              }
            }
            if (var4Lifetime1.field_o != 2) {
              var4Lifetime1.field_p.field_u[var4Lifetime1.field_o] = 0;
            }
            var4Lifetime1 = (ProjectUse) (this.field_i.nextForward((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_45_0 = var4_ref;
          stackIn_45_1 = new StringBuilder().append("dc.HB(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final void rebindMap(int param0, GalaxyMap param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        PlacementOrder var3 = null;
        RuntimeException var3_ref = null;
        FleetMove var4 = null;
        ProjectUse var5 = null;
        Wormhole var6 = null;
        int var7 = 0;
        AchievementProgress var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_g = param1;
          var3 = (PlacementOrder) (this.field_q.startForward(0));
          while (var3 != null) {
            var3.field_u = this.field_g.field_e[var3.field_u.field_p];
            var3 = (PlacementOrder) (this.field_q.nextForward((byte) -71));
          }
          if (param0 <= 55) {
            var8 = (AchievementProgress) null;
            this.processTurn(-110, -110, (TurnEventLog) null, (AchievementProgress) null);
          }
          var4 = (FleetMove) (this.field_p.startForward(true));
          while (var4 != null) {
            var4.field_y = this.field_g.field_e[var4.field_y.field_p];
            var4.field_B = this.field_g.field_e[var4.field_B.field_p];
            var4.field_B.field_s.addLast(var4, 32);
            var4.field_y.field_T.addLast((byte) -113, var4);
            var4 = (FleetMove) (this.field_p.a((byte) -68));
          }
          var5 = (ProjectUse) (this.field_i.startForward(0));
          while (var5 != null) {
            var5.field_q = this.field_g.field_e[var5.field_q.field_p];
            if (var5.field_r != null) {
              var5.field_r = this.field_g.field_e[var5.field_r.field_p];
            }
            var5 = (ProjectUse) (this.field_i.nextForward((byte) -71));
          }
          var6 = (Wormhole) (this.field_A.startForward(0));
          while (var6 != null) {
            var6.field_n = this.field_g.field_e[var6.field_n.field_p];
            var6.field_k = this.field_g.field_e[var6.field_k.field_p];
            var6 = (Wormhole) (this.field_A.nextForward((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("dc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void checkVictory(int param0) {
        Player[] var3 = null;
        Player[] var2 = null;
        if (param0 != -5) {
          this.field_t = (int[][]) null;
        }
        if (!this.field_x.detectWinners(this, (byte) 121)) {
        } else {
          var3 = this.field_x.getWinners((byte) -23);
          var2 = var3;
          if (var2 == null) {
            throw new RuntimeException("VictoryChecker claims someone has won, but winners array is null.");
          }
          if (var3.length != 1) {
            this.declareWinner(-1, param0 + 8);
          } else {
            this.declareWinner(var2[0].field_x, param0 + 8);
          }
        }
    }

    private final void a(Star param0, BattleEvent param1, int param2) {
        FleetMove var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        AchievementProgress var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 != -30724) {
            var9 = (AchievementProgress) null;
            this.processTurn(-115, 106, (TurnEventLog) null, (AchievementProgress) null);
          }
          var4 = (FleetMove) (param0.field_s.startForward(-127));
          while (var4 != null) {
            if (var4.field_G != param0.field_y) {
              var5 = this.field_h[var4.field_G.field_x];
              var6 = this.field_u[var4.field_G.field_x];
              var7 = var6 * var4.field_z / var5;
              if (0 != var7 &&
                param1 != null) {
                param1.a(var7, 0, var4, 0);
              }
              var4.field_y.field_C = var4.field_y.field_C + var7;
            }
            var4 = (FleetMove) (param0.field_s.nextForward(32));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("dc.SA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static DisplayModeInfo[] queryDisplayModes(PlatformTaskDispatcher param0, byte param1) {
        int var5 = 0;
        DisplayModeInfo[] stackIn_3_0 = null;
        DisplayModeInfo[] stackIn_10_0 = null;
        DisplayModeInfo[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        DisplayModeInfo[] var4 = null;
        DisplayModeInfo var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param0.isReady(false)) {
            stackIn_3_0 = new DisplayModeInfo[]{};
            return stackIn_3_0;
          }
          var8 = param0.requestDisplayModes(12);
          while (0 == var8.field_d) {
            jb.sleep((byte) -100, 10L);
          }
          if (var8.field_d == 2) {
            stackIn_10_0 = new DisplayModeInfo[]{};
            return stackIn_10_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          var4 = new DisplayModeInfo[var10.length >> 2];
          if (param1 != -57) {
            field_a = (String) null;
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new DisplayModeInfo();
            var4[var5] = var6;
            var6.field_g = var3[var5 << 2];
            var6.field_c = var3[1 + (var5 << 2)];
            var6.field_d = var3[(var5 << 2) + 2];
            var6.field_f = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("dc.AA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void abandonStar(int param0, Star param1) {
        try {
          if (param0 != -21031) {
            this.field_n = 59;
          }
          this.detachStarFromTerritory((byte) 98, param1);
          param1.field_y = null;
          param1.field_N = 0;
          param1.field_x = 0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dc.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String getYearName(byte param0) {
        if (param0 >= -3) {
          return (String) null;
        }
        if (0 >= this.field_O) {
          return ArrayWidgetGroup.field_H;
        }
        return QuickChatCategoryRegistry.a(tq.field_i, 4371, new String[]{QuickChatCategoryRegistry.a(BattleEvent.field_x[this.field_G], 4371, new String[]{ScrollBar.field_Bb[this.field_n]})});
    }

    final static void a(int param0) {
        NetworkArchiveRequest.field_z = pr.currentTimeMillis(14274);
        vj.field_C = 0;
        if (param0 != -5883) {
          GameState.clearStatics((byte) 95);
        }
    }

    private final void resolveAllStarCombats(int param0, TurnEventLog param1, boolean[][] param2, AchievementProgress param3, int param4) {
        int var7 = 0;
        Star[] var6 = null;
        Star var8 = null;
        int var9 = 0;
        Star[] var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var10 = this.field_g.field_e;
          var6 = var10;
          for (var7 = 0; var10.length > var7; var7++) {
            var8 = var10[var7];
            this.resolveStarCombat(param4, var8, param3, param1, param2, (byte) 77);
          }
          if (param0 != 12269) {
            this.field_k = -29;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("dc.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void captureStar(Player param0, Star param1, int param2) {
        int var4_int = 0;
        int dupTemp$0 = 0;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Star[] var4 = null;
        RuntimeException var4_ref = null;
        Star var6 = null;
        int var7 = 0;
        Star[] var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1.field_y == param0) {
            return;
          }
          param1.field_y = param0;
          if (param0 != param1.field_t &&
            param1.field_G[0] >= 0) {
            for (var4_int = 0; var4_int < 4; var4_int++) {
              dupTemp$0 = param0.field_u[var4_int] + param1.field_G[var4_int];
              param0.field_u[var4_int] = dupTemp$0;
              if (5 < dupTemp$0) {
                if (null != param0.field_q) {
                  param0.field_q.field_d = param0.field_q.field_d + (param0.field_u[var4_int] - 5);
                }
                param0.field_u[var4_int] = 5;
              }
            }
          }
          if (null != param1.field_R) {
            this.detachStarFromTerritory((byte) 122, param1);
          }
          this.updateTerritoryMembership(param2, param1);
          this.a(param1, false, (byte) 117);
          var8 = param1.field_D;
          var4 = var8;
          for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            this.a(var6, false, (byte) 119);
          }
          param1.field_y.field_m.addStar(-21771, param1);
          if (null == param1.field_y.field_m.field_q) {
            param1.field_y.field_m.field_q = param1;
          }
          SolMapReader.a(param1.field_y.field_m, -5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("dc.VA(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean[][] b(int param0, int param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        boolean[][] var3 = new boolean[this.field_r][this.field_r];
        int var4 = -2 + this.field_r;
        if (param1 != 0) {
          return (boolean[][]) null;
        }
        while (0 <= var4) {
          for (var5 = this.field_r - 1; var5 > var4; var5--) {
            this.field_v[var4].field_h[var5] = we.intAnd(param0, 1) != 0 ? true : false;
            param0 = param0 >> 1;
          }
          var4--;
        }
        return var3;
    }

    private final void a(int param0, BattleEvent param1, Star param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        FleetMove var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Star var9 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != 0) {
            var9 = (Star) null;
            this.createTannhauserWormhole((Star) null, 79, (Star) null);
          }
          var4 = (FleetMove) (param2.field_s.startForward(-128));
          while (var4 != null) {
            var5 = this.field_h[var4.field_G.field_x];
            var6 = this.field_B[var4.field_G.field_x];
            var7 = var6 * var4.field_z / var5;
            if (param2.field_y == var4.field_G) {
              var7 = var4.field_z * (-param2.field_x + var6) / var5;
            }
            if (var7 != 0 &&
              param1 != null) {
              param1.a(var7, 0, var4, 0);
            }
            var4.field_y.field_C = var4.field_y.field_C + var7;
            var4 = (FleetMove) (param2.field_s.nextForward(32));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("dc.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final boolean tallyShipsAtStar(byte param0, TurnEventLog param1, Star param2) {
        int var7 = 0;
        TurnEventLog stackIn_18_0;
        Star stackIn_18_1;
        Player stackIn_18_2;
        int stackIn_18_3;
        boolean stackIn_19_4;
        Player stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        FleetMove var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        FleetMove var4Lifetime1;
        FleetMove var4Lifetime2;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = -118 % ((-37 - param0) / 36);
          for (var7 = 0; this.field_r > var7; var7++) {
            this.field_h[var7] = 0;
          }
          var6 = 0;
          if (null != param2.field_y) {
            this.field_h[param2.field_y.field_x] = param2.field_x;
          }
          var4 = (FleetMove) (param2.field_s.startForward(-128));
          while (var4 != null) {
            if (var4.field_G != null) {
              this.field_h[var4.field_G.field_x] = this.field_h[var4.field_G.field_x] + var4.field_z;
              if (param2.field_y != var4.field_G) {
                var6 = 1;
              }
            }
            var4 = (FleetMove) (param2.field_s.nextForward(32));
          }
          if (param1 != null) {
            var4Lifetime1 = (FleetMove) (param2.field_s.startForward(-127));
            while (var4Lifetime1 != null) {
              stackIn_18_0 = (TurnEventLog) (param1);
              stackIn_18_1 = var4Lifetime1.field_B;
              stackIn_18_2 = var4Lifetime1.field_G;
              stackIn_18_3 = -62;
              stackIn_19_4 = (var4Lifetime1.field_G != var4Lifetime1.field_B.field_y);
              ((TurnEventLog) (Object) stackIn_18_0).recordFleetMove(stackIn_18_1, stackIn_18_2, (byte) stackIn_18_3, stackIn_19_4, var4Lifetime1.field_z, var4Lifetime1.field_y);
              var4Lifetime1 = (FleetMove) (param2.field_s.nextForward(32));
            }
          }
          var4Lifetime2 = (FleetMove) (param2.field_T.startForward(0));
          while (var4Lifetime2 != null) {
            stackIn_23_0 = var4Lifetime2.field_G;
            if (stackIn_23_0 != null) {
              this.field_h[var4Lifetime2.field_G.field_x] = this.field_h[var4Lifetime2.field_G.field_x] - var4Lifetime2.field_z;
            }
            var4Lifetime2 = (FleetMove) (param2.field_T.nextForward((byte) -71));
          }
          stackIn_27_0 = var6;
          return stackIn_27_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("dc.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void readTurnOrders(int param0, byte param1, PacketBuffer param2) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Player var6_ref_fs = null;
        Star var8 = null;
        int var9 = 0;
        Star var10 = null;
        FleetMove var11 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.clearTurnState(-7954);
          if (param1 > -121) {
            this.field_g = (GalaxyMap) null;
          }
          while (param0 > 0) {
            var4_int = param2.readUnsignedByte(-70);
            param0--;
            if (var4_int == 255) {
              throw new RuntimeException();
            }
            if (var4_int >= 251) {
              var5 = var4_int - 251;
              var6_ref_fs = ScrollBar.readGamePlayer(this, 78, param2);
              var10 = FleetMove.readStar(this, param2, 20);
              if (var5 != 3) {
                param0 -= 2;
                this.field_i.addLast((byte) -113, new ProjectUse(var5, var6_ref_fs, var10));
                continue;
              }
              var8 = FleetMove.readStar(this, param2, 20);
              this.field_i.addLast((byte) -113, new ProjectUse(var5, var6_ref_fs, var10, var8));
              param0 -= 3;
              continue;
            }
            if (var4_int >= 192) {
              var5Lifetime1 = -191 + var4_int;
              param0 = param0 - 3 * var5Lifetime1;
              for (var6 = 0; var5Lifetime1 > var6; var6++) {
                this.field_q.addLast((byte) -113, qj.readPlacementOrder((byte) -85, this, param2));
              }
              continue;
            }
            var5Lifetime2 = 1 + var4_int;
            for (var6Lifetime1 = 0; var6Lifetime1 < var5Lifetime2; var6Lifetime1++) {
              var11 = MusicVoice.readFleetMove(this, 65, param2);
              this.field_p.addLast((byte) 48, var11);
              var11.field_y.field_T.addLast((byte) -113, var11);
              var11.field_B.field_s.addLast(var11, 32);
            }
            param0 = param0 - var5Lifetime2 * 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("dc.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void terraformStar(Star param0, byte param1, Random param2) {
        int var4_int = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (0 < param0.field_L) {
          return;
        }
        try {
          if (param1 <= 100) {
            Player var6 = (Player) null;
            this.a((PacketBuffer) null, (byte) -70, (Player) null);
          }
          for (var4_int = 0; var4_int < 4; var4_int++) {
            param0.field_G[var4_int] = 1;
          }
          dupTemp$0 = qf.a((byte) 109, 4, param2);
          param0.field_G[dupTemp$0] = param0.field_G[dupTemp$0] + 1;
          dupTemp$1 = qf.a((byte) 38, 4, param2);
          param0.field_G[dupTemp$1] = param0.field_G[dupTemp$1] + 1;
          param0.field_L = 1;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dc.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void resolveStarCombat(int param0, Star param1, AchievementProgress param2, TurnEventLog param3, boolean[][] param4, byte param5) {
        int fieldTemp$2 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_16_0 = 0;
        Player[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Player stackIn_56_2 = null;
        int stackIn_71_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        String stackIn_140_2 = null;
        StringBuilder stackIn_142_1 = null;
        String stackIn_143_2 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_146_2 = null;
        StringBuilder stackIn_148_1 = null;
        String stackIn_149_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10_int = 0;
        Player[] var10 = null;
        int var11 = 0;
        Object var12_ref = null;
        int var12 = 0;
        FleetMove var12_ref_mg = null;
        int var13 = 0;
        int[] var14 = null;
        Player var15 = null;
        Player[] var16 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var22 = null;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        var12_ref = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!this.tallyShipsAtStar((byte) 38, param3, param1)) {
            if (param1.field_y != null) {
              param1.field_x = this.field_h[param1.field_y.field_x];
            }
            return;
          }
          this.field_L.setSeed((long)(param1.field_p ^ param0));
          this.field_C = 0;
          for (var8 = 0; this.field_r > var8; var8++) {
            var9_int = this.field_h[var8];
            this.field_u[var8] = var9_int;
            if (var9_int > 0) {
              fieldTemp$2 = this.field_C;
              this.field_C = this.field_C + 1;
              this.field_K[fieldTemp$2] = var8;
            }
          }
          if (param1.field_y == null) {
            stackIn_16_0 = this.field_r;
          } else {
            stackIn_16_0 = param1.field_y.field_x;
          }
          var8Lifetime1 = stackIn_16_0;
          if (param2 != null &&
            null != param1.field_y) {
            for (var9_intLifetime1 = 0; this.field_r > var9_intLifetime1; var9_intLifetime1++) {
              if (~var9_intLifetime1 != ~var8Lifetime1) {
                var10_int = this.field_h[var9_intLifetime1];
                if (var10_int != 0) {
                  if (!param2.field_j[var9_intLifetime1][0] &&
                    var10_int >= 50 &&
                    95 * param2.field_l[var9_intLifetime1] <= 100 * var10_int) {
                    param2.field_j[var9_intLifetime1][0] = true;
                  }
                  if (!param2.field_j[var9_intLifetime1][1] &&
                    var10_int >= 50 &&
                    var10_int >= param1.field_x * 10) {
                    param2.field_j[var9_intLifetime1][1] = true;
                  }
                  if (!param2.field_j[var9_intLifetime1][9] &&
                    null != param1.field_y &&
                    !param4[var9_intLifetime1][var8Lifetime1]) {
                    for (var11 = 0; this.field_C > var11; var11++) {
                      var12 = this.field_K[var11];
                      if (var9_intLifetime1 != var12 &&
                        param4[var9_intLifetime1][var12] &&
                        !param4[var8Lifetime1][var12]) {
                        param2.field_j[var9_intLifetime1][9] = true;
                      }
                    }
                  }
                }
              }
            }
          }
          if (param1.field_y == null) {
            this.field_u[this.field_r] = param1.field_x;
            if (0 < param1.field_x) {
              fieldTemp$0 = this.field_C;
              this.field_C = this.field_C + 1;
              this.field_K[fieldTemp$0] = this.field_r;
            }
          }
          var9 = null;
          if (param3 != null) {
            var16 = new Player[this.field_C];
            var10 = var16;
            for (var11Lifetime1 = 0; var11Lifetime1 < this.field_C; var11Lifetime1++) {
              var12Lifetime1 = this.field_K[var11Lifetime1];
              stackIn_55_0 = var10;
              stackIn_55_1 = var11Lifetime1;
              if (this.field_r <= var12Lifetime1) {
                stackIn_56_2 = null;
              } else {
                stackIn_56_2 = this.field_v[var12Lifetime1];
              }
              stackIn_55_0[stackIn_55_1] = stackIn_56_2;
            }
            var9 = param3.recordBattle(this.field_u, param1, 0, var16);
          }
          if (param1.field_u) {
            this.field_u[var8Lifetime1] = this.field_u[var8Lifetime1] * 2;
          }
          this.buildHostilePairs((byte) -114, param4);
          var20 = this.simulateCombat((byte) 20);
          var18 = var20;
          var14 = var18;
          var22 = var14;
          if (var9 != null) {
            ((BattleEvent) (var9)).a((byte) 74, var22);
          }
          regionExit1: {
            if (param2 != null) {
              for (var11Lifetime2 = 0; this.field_r > var11Lifetime2; var11Lifetime2++) {
                param2.field_b[var11Lifetime2] = param2.field_b[var11Lifetime2] + var20[var11Lifetime2];
              }
              if (param1.field_u) {
                var11Lifetime2 = this.field_u[var8Lifetime1] / 2;
                if (param1.field_y != null) {
                  stackIn_98_0 = (this.field_u[var8Lifetime1] > 0) ? 1 : 0;
                } else {
                  stackIn_98_0 = 0;
                }
                var12Lifetime2 = stackIn_98_0;
                if (var12Lifetime2 > var11Lifetime2) {
                  var11Lifetime2 = var12Lifetime2;
                }
                this.field_u[var8Lifetime1] = var11Lifetime2;
              }
              this.a((byte) -124, param1, (BattleEvent) (var9));
              if (this.field_u[var8Lifetime1] > 0) {
                param1.field_x = this.field_u[var8Lifetime1];
                this.a(param1, (BattleEvent) (var9), -30724);
                if (var9 != null) {
                  ((BattleEvent) (var9)).field_m = param1.field_R;
                  ((BattleEvent) (var9)).field_i = param1.field_y;
                  ((BattleEvent) (var9)).field_l = param1.field_x;
                }
                if (param2 == null) {
                  return;
                }
                if (null == param1.field_y) {
                  return;
                }
                if (param2.field_j[var8Lifetime1][3]) {
                  return;
                }
                var11Lifetime2 = 0;
                var12_ref_mg = (FleetMove) (param1.field_s.startForward(-127));
                while (var12_ref_mg != null) {
                  if (param1.field_y != var12_ref_mg.field_G) {
                    var11Lifetime2++;
                  }
                  var12_ref_mg = (FleetMove) (param1.field_s.nextForward(32));
                }
                break regionExit1;
              }
            } else {
              if (param1.field_u) {
                var11Lifetime2 = this.field_u[var8Lifetime1] / 2;
                if (param1.field_y != null) {
                  stackIn_71_0 = (this.field_u[var8Lifetime1] > 0) ? 1 : 0;
                } else {
                  stackIn_71_0 = 0;
                }
                var12Lifetime2 = stackIn_71_0;
                if (var12Lifetime2 > var11Lifetime2) {
                  var11Lifetime2 = var12Lifetime2;
                }
                this.field_u[var8Lifetime1] = var11Lifetime2;
              }
              this.a((byte) -124, param1, (BattleEvent) (var9));
              if (this.field_u[var8Lifetime1] > 0) {
                param1.field_x = this.field_u[var8Lifetime1];
                this.a(param1, (BattleEvent) (var9), -30724);
                if (var9 != null) {
                  ((BattleEvent) (var9)).field_m = param1.field_R;
                  ((BattleEvent) (var9)).field_i = param1.field_y;
                  ((BattleEvent) (var9)).field_l = param1.field_x;
                }
                if (param2 == null) {
                  return;
                }
                if (null == param1.field_y) {
                  return;
                }
                if (param2.field_j[var8Lifetime1][3]) {
                  return;
                }
                var11Lifetime2 = 0;
                var12_ref_mg = (FleetMove) (param1.field_s.startForward(-127));
                while (var12_ref_mg != null) {
                  if (param1.field_y != var12_ref_mg.field_G) {
                    var11Lifetime2++;
                  }
                  var12_ref_mg = (FleetMove) (param1.field_s.nextForward(32));
                }
                break regionExit1;
              }
            }
            for (var11Lifetime2 = 0; var11Lifetime2 < this.field_r + 1; var11Lifetime2++) {
              this.field_B[var11Lifetime2] = this.field_u[var11Lifetime2];
            }
            this.field_C = 0;
            for (var11Lifetime2 = 0; this.field_r > var11Lifetime2; var11Lifetime2++) {
              var12Lifetime2Lifetime1 = this.field_B[var11Lifetime2];
              this.field_u[var11Lifetime2] = var12Lifetime2Lifetime1;
              if (var12Lifetime2Lifetime1 != 0) {
                fieldTemp$1 = this.field_C;
                this.field_C = this.field_C + 1;
                this.field_K[fieldTemp$1] = var11Lifetime2;
              }
            }
            if (param5 <= 15) {
              this.buildHostilePairs((byte) -65, (boolean[][]) null);
            }
            if (this.field_C == 0) {
              this.abandonStar(-21031, param1);
              return;
            }
            this.b((byte) 15);
            var11Lifetime2 = this.field_K[0];
            var15 = this.field_v[var11Lifetime2];
            this.captureStar(var15, param1, 0);
            param1.field_x = this.field_u[var11Lifetime2];
            if (var9 != null) {
              ((BattleEvent) (var9)).field_i = var15;
              ((BattleEvent) (var9)).field_l = param1.field_x;
              ((BattleEvent) (var9)).field_m = param1.field_R;
            }
            if (param2 != null) {
              param2.field_f[var11Lifetime2] = param2.field_f[var11Lifetime2] + 1;
            }
            this.a(0, (BattleEvent) (var9), param1);
            return;
          }
          if (var11Lifetime2 >= 3) {
            param2.field_j[var8Lifetime1][3] = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_139_0 = var7;
          stackIn_139_1 = new StringBuilder().append("dc.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_140_2 = "null";
          } else {
            stackIn_140_2 = "{...}";
          }
          stackIn_142_1 = ((StringBuilder) (Object) stackIn_139_1).append(stackIn_140_2).append(',');
          if (param2 == null) {
            stackIn_143_2 = "null";
          } else {
            stackIn_143_2 = "{...}";
          }
          stackIn_145_1 = ((StringBuilder) (Object) stackIn_142_1).append(stackIn_143_2).append(',');
          if (param3 == null) {
            stackIn_146_2 = "null";
          } else {
            stackIn_146_2 = "{...}";
          }
          stackIn_148_1 = ((StringBuilder) (Object) stackIn_145_1).append(stackIn_146_2).append(',');
          if (param4 == null) {
            stackIn_149_2 = "null";
          } else {
            stackIn_149_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_139_0), ((StringBuilder) (Object) stackIn_148_1).append(stackIn_149_2).append(',').append(param5).append(')').toString());
        }
    }

    final void clearTurnState(int param0) {
        Star var4 = null;
        Player var4_ref = null;
        Player var5 = null;
        int var3 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3Lifetime1;
        this.field_q = new IntrusiveDeque();
        this.field_p = new TertiaryNodeList();
        this.field_i = new IntrusiveDeque();
        Star[] var7 = this.field_g.field_e;
        Star[] var2 = var7;
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          var4.field_T.clear(0);
          var4.field_s.clear((byte) 117);
        }
        if (param0 != -7954) {
          field_E = (IntrusiveDeque) null;
        }
        Player[] var8 = this.field_v;
        Player[] var2_array = var8;
        int var9 = 0;
        var3Lifetime1 = var9;
        while (var9 < var8.length) {
          var4_ref = var8[var9];
          var5 = var4_ref;
          var4_ref.field_w = 0;
          var5.field_A = 0;
          var9++;
        }
    }

    private final void applyTannhauserAndTerraformProjects(AchievementProgress param0, int param1, int param2, TurnEventLog param3) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        ProjectUse var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!this.field_o.field_h) {
            return;
          }
          if (param2 != 7377) {
            field_E = (IntrusiveDeque) null;
          }
          var5 = (ProjectUse) (this.field_i.startForward(0));
          while (var5 != null) {
            var6 = var5.field_o;
            if (var6 == 3) {
              this.createTannhauserWormhole(var5.field_r, 4, var5.field_q);
              if (param3 != null) {
                param3.recordTannhauser(param2 - 7500, var5.field_q, var5.field_r, var5.field_p);
              }
              if (param0 != null) {
                param0.field_h[var5.field_p.field_x] = param0.field_h[var5.field_p.field_x] + 1;
                if (this.field_O > 0 && (ab.field_c[this.field_G] == 3 ||
                  lr.field_b[this.field_n] == 3)) {
                  param0.field_d[var5.field_p.field_x][3] = true;
                }
              }
            } else {
              if (var6 == 1) {
                this.field_L.setSeed((long)(var5.field_q.field_p ^ param1));
                this.terraformStar(var5.field_q, (byte) 112, this.field_L);
                if (param3 != null) {
                  param3.recordTerraform(var5.field_p, var5.field_q, (byte) 120);
                }
                if (param0 == null) {
                  var5 = (ProjectUse) (this.field_i.nextForward((byte) -71));
                  continue;
                }
                param0.field_h[var5.field_p.field_x] = param0.field_h[var5.field_p.field_x] + 1;
                if (0 < this.field_O && (ab.field_c[this.field_G] == 1 ||
                  lr.field_b[this.field_n] == 1)) {
                  param0.field_d[var5.field_p.field_x][1] = true;
                }
              }
            }
            var5 = (ProjectUse) (this.field_i.nextForward((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_32_0 = var5_ref;
          stackIn_32_1 = new StringBuilder().append("dc.GA(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void createTannhauserWormhole(Star param0, int param1, Star param2) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Star var4 = null;
        Territory var4_ref = null;
        RuntimeException var4_ref2 = null;
        Territory var5 = null;
        Territory var6 = null;
        Star var6_ref = null;
        int var7 = 0;
        Territory var8 = null;
        Territory var9 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2.isNeighbour(param0, (byte) 10)) {
            return;
          }
          if (param0.field_p < param2.field_p) {
            var4 = param2;
            param2 = param0;
            param0 = var4;
          }
          this.field_A.addLast((byte) -113, new Wormhole(param2, param0, param1));
          param2.addNeighbour((byte) -127, param0);
          param0.addNeighbour((byte) -81, param2);
          param2.sortNeighboursByIndex((byte) -122);
          param0.sortNeighboursByIndex((byte) -110);
          if (param2.field_y == param0.field_y &&
            param2.field_R != param0.field_R) {
            var9 = param2.field_R;
            var4_ref = var9;
            var8 = param0.field_R;
            var5 = var8;
            if (var8.field_r > var9.field_r) {
              var6 = var9;
              var4_ref = var8;
              var5 = var6;
            }
            var6_ref = var5.firstStar(18229);
            while (var6_ref != null) {
              var6_ref.field_R = var4_ref;
              var4_ref.addStar(-21771, var6_ref);
              var6_ref = var5.nextStar(param1 ^ -23414);
            }
            var5.unlink((byte) -118);
            SolMapReader.a(var4_ref, -5);
          }
          this.a(param2, false, (byte) 125);
          this.a(param0, false, (byte) 114);
          this.field_g.a(param1 ^ 26249);
          this.field_g.computeDistances((byte) 80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          stackIn_19_0 = var4_ref2;
          stackIn_19_1 = new StringBuilder().append("dc.PA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void updateTerritoryMembership(int param0, Star param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Star[] var4 = null;
        Star var5_ref_ln = null;
        Star var6 = null;
        Territory var7 = null;
        Star var8 = null;
        int var9 = 0;
        Star[] var10 = null;
        Territory var11 = null;
        Star var8Lifetime1;
        Star var8Lifetime2;
        Star var8Lifetime1Lifetime1;
        Star var8Lifetime1Lifetime2;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var10 = param1.field_D;
          for (var4_int = param0; var10.length > var4_int; var4_int++) {
            var5_ref_ln = var10[var4_int];
            var8 = var5_ref_ln;
            var8Lifetime2 = var5_ref_ln;
            if (param1.field_y != var5_ref_ln.field_y) {
              continue;
            }
            param1.field_R = var5_ref_ln.field_R;
            param1.field_R.addStar(-21771, param1);
            break;
          }
          if (param1.field_R == null) {
            param1.field_R = new Territory(param1.field_y, param1);
            param1.field_R.addStar(param0 - 21771, param1);
            param1.field_y.field_i.addLast((byte) -113, param1.field_R);
            SolMapReader.a(param1.field_R, -5);
            return;
          }
          var11 = param1.field_R;
          var4 = param1.field_D;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var8Lifetime1 = var6;
            var8Lifetime1Lifetime1 = var6;
            var7 = var6.field_R;
            if (param1.field_y == var6.field_y &&
              var11 != var7) {
              var8Lifetime1Lifetime2 = var7.firstStar(param0 ^ 18229);
              while (var8Lifetime1Lifetime2 != null) {
                var8Lifetime1Lifetime2.field_R = param1.field_R;
                var11.addStar(param0 ^ -21771, var8Lifetime1Lifetime2);
                var8Lifetime1Lifetime2 = var7.nextStar(-23410);
              }
              var7.unlink((byte) -118);
            }
          }
          SolMapReader.a(param1.field_R, -5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("dc.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void chooseYearName(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = BattleEvent.field_x.length;
        var3 = ScrollBar.field_Bb.length;
        var4 = var2 * var3 / 2;
        var5 = var2 / 2;
        var6 = var3 / 2;
        if (null == this.field_d) {
          this.field_N = new int[var5];
          this.field_j = new int[var6];
          this.field_b = 0;
          this.field_d = new int[var4];
        }
        if (0 == this.field_O) {
          return;
        }
        if (this.field_b >= var4) {
          stackIn_9_0 = var4;
        } else {
          stackIn_9_0 = this.field_b;
        }
        var10 = stackIn_9_0;
        if (var5 > this.field_b) {
          stackIn_12_0 = this.field_b;
        } else {
          stackIn_12_0 = var5;
        }
        var11 = stackIn_12_0;
        if (this.field_b < var6) {
          stackIn_15_0 = this.field_b;
        } else {
          stackIn_15_0 = var6;
        }
        var12 = stackIn_15_0;
        scanLoop1: while (true) {
          var7 = vc.a((byte) -39, var2);
          var13 = 0;
          while (var11 > var13) {
            if (this.field_N[var13] == var7) {
              continue scanLoop1;
            }
            var13++;
          }
          scanLoop2: while (true) {
            var8 = vc.a((byte) -39, var3);
            var13Lifetime2 = 0;
            while (var12 > var13Lifetime2) {
              if (this.field_j[var13Lifetime2] == var8) {
                continue scanLoop2;
              }
              var13Lifetime2++;
            }
            break;
          }
          var9 = var3 * var7 + var8;
          var13Lifetime3 = 0;
          while (var13Lifetime3 < var10) {
            if (~this.field_d[var13Lifetime3] == ~var9) {
              continue scanLoop1;
            }
            var13Lifetime3++;
          }
          break;
        }
        this.field_N[this.field_b % var5] = var7;
        this.field_j[this.field_b % var6] = var8;
        this.field_d[this.field_b % var4] = var9;
        this.field_n = var8;
        var13Lifetime1 = -30 % ((18 - param0) / 42);
        this.field_b = this.field_b + 1;
        this.field_G = var7;
        return;
    }

    final void restorePendingOrders(IntrusiveDeque param0, int param1, IntrusiveDeque param2, IntrusiveDeque param3) {
        FleetMove var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param3.transferAllTo((byte) -90, this.field_i);
          param2.transferAllTo((byte) -90, this.field_q);
          var5 = (FleetMove) (param0.startForward(param1));
          while (var5 != null) {
            this.field_p.addLast((byte) 36, var5);
            var5.field_y.field_T.addLast((byte) -113, var5);
            var5.field_B.field_s.addLast(var5, 32);
            var5 = (FleetMove) (param0.nextForward((byte) -71));
          }
          param3.clear(0);
          param2.clear(0);
          param0.clear(0);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dc.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Star param0, boolean param1, byte param2) {
        try {
          kd.a(this.field_o, param1, param0, (byte) -2);
          if (param2 <= 113) {
            BattleEvent var5 = (BattleEvent) null;
            this.a((Star) null, (BattleEvent) null, 39);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dc.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(PacketBuffer param0, byte param1, Player param2) {
        if (param1 <= 49) {
          return;
        }
        try {
          StrongCacheEntry.a((byte) -80, this.field_v, param0, this.field_n, this.field_A, this.field_G, this.field_x, param2, this.field_g, false);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dc.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final int[] simulateCombat(byte param0) {
        int var5_int = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] var2;
        int var3;
        int var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var6Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = new int[this.field_r];
        var2 = var9;
        while (true) {
          if (1 >= this.field_C) {
            if (param0 != 20) {
              this.field_H = (int[]) null;
            }
            return var9;
          }
          var3 = 0;
          var4 = this.field_L.nextInt();
          for (var5_int = 1; var5_int < this.field_C; var5_int++) {
            var6 = this.field_L.nextInt();
            if (var6 > var4) {
              var4 = var6;
              var3 = var5_int;
            }
          }
          var5 = this.field_t[var3];
          var6Lifetime1 = this.field_H[var3];
          if (var6Lifetime1 == 0) {
            throw new RuntimeException();
          }
          var7 = var5[qf.a((byte) 11, this.field_H[var3], this.field_L)];
          if (this.field_r > this.field_K[var3]) {
            dupTemp$0 = this.field_K[var3];
            var9[dupTemp$0] = var9[dupTemp$0] + 1;
          }
          dupTemp$1 = this.field_u[var7] - 1;
          this.field_u[var7] = dupTemp$1;
          if (0 == dupTemp$1) {
            this.c(this.a((byte) 98, var7), -32);
            this.a(false);
          }
          if (this.field_u[var7] < 0) {
            throw new RuntimeException();
          }
        }
    }

    private final void setDefensiveNet(Star param0, boolean param1) {
        try {
          param0.field_u = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var3 = 0; this.field_C > var3; var3++) {
          if (~this.field_K[var3] == ~param1) {
            return var3;
          }
        }
        if (param0 <= 57) {
          IntrusiveDeque var5 = (IntrusiveDeque) null;
          this.validatePlayerOrders((IntrusiveDeque) null, (Player) null, -20, (IntrusiveDeque) null, (IntrusiveDeque) null);
        }
        throw new RuntimeException();
    }

    final void addPlayer(int param0, Player param1) {
        Player[] var11 = null;
        int var4_int = 0;
        Player var12 = null;
        int[] var6_ref_int__ = null;
        boolean[] var7 = null;
        int var8 = 0;
        Player[] var3 = null;
        String[] var4 = null;
        int[] var10 = null;
        int[] var5 = null;
        int var6 = 0;
        int var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var11 = this.field_v;
          for (var4_int = 0; var4_int < var11.length; var4_int++) {
            var12 = var11[var4_int];
            var6_ref_int__ = new int[this.field_v.length + 1];
            var7 = new boolean[this.field_v.length + 1];
            for (var8 = 0; var8 < var12.field_h.length; var8++) {
              var6_ref_int__[var8] = var12.field_f[var8];
              var7[var8] = var12.field_h[var8];
            }
            var12.field_h = var7;
            var12.field_f = var6_ref_int__;
          }
          param1.field_f = new int[this.field_r + 1];
          param1.field_h = new boolean[this.field_r + 1];
          QuaternaryListSequence.a(126, param1.field_m);
          SolMapReader.a(param1.field_m, param0);
          var3 = new Player[this.field_r + 1];
          var4 = new String[this.field_r + 1];
          var10 = new int[1 + this.field_r];
          var5 = var10;
          for (var6 = 0; this.field_v.length > var6; var6++) {
            var3[var6] = this.field_v[var6];
            var4[var6] = this.field_I[var6];
            var10[var6] = this.field_D[var6];
          }
          var3[var6] = param1;
          var4[var6] = param1.name;
          this.field_D = var5;
          this.field_r = this.field_r + 1;
          this.field_v = var3;
          this.field_I = var4;
          this.field_B = new int[1 + this.field_r];
          this.field_u = new int[1 + this.field_r];
          this.field_H = new int[this.field_r + 1];
          this.field_K = new int[1 + this.field_r];
          this.field_h = new int[this.field_r];
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dc.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void expireAlliancesAndWormholes(int param0, TurnEventLog param1) {
        int var4_int = 0;
        int var6 = 0;
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Player[] var3 = null;
        Wormhole var3_ref = null;
        RuntimeException var3_ref2 = null;
        Territory var4 = null;
        Player var5 = null;
        int var7 = 0;
        Player[] var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_o.field_j) {
            var8 = this.field_v;
            var3 = var8;
            for (var4_int = 0; var8.length > var4_int; var4_int++) {
              var5 = var8[var4_int];
              for (var6 = 0; this.field_r > var6; var6++) {
                if (var5.field_f[var6] > 0) {
                  dupTemp$0 = var5.field_f[var6] - 1;
                  var5.field_f[var6] = dupTemp$0;
                  if (dupTemp$0 == 0) {
                    var5.field_h[var6] = false;
                    if (param1 != null &&
                      var5.field_x < var6) {
                      param1.recordAllianceExpired(255, var5, this.field_v[var6]);
                    }
                  }
                }
              }
            }
          }
          if (this.field_o.field_h) {
            var3_ref = (Wormhole) (this.field_A.startForward(0));
            while (var3_ref != null) {
              fieldTemp$1 = var3_ref.field_m - 1;
              var3_ref.field_m = var3_ref.field_m - 1;
              if (0 >= fieldTemp$1) {
                var3_ref.field_n.removeNeighbour(var3_ref.field_k, (byte) -124);
                var3_ref.field_n.sortNeighboursByIndex((byte) -98);
                var3_ref.field_k.sortNeighboursByIndex((byte) -100);
                var4 = var3_ref.field_n.field_R;
                if (var4 != null &&
                  var4 == var3_ref.field_k.field_R) {
                  this.splitTerritory(80, var4);
                }
                this.a(var3_ref.field_n, false, (byte) 123);
                this.a(var3_ref.field_k, false, (byte) 118);
                this.field_g.a(26253);
                this.field_g.computeDistances((byte) 80);
                var3_ref.unlink((byte) -101);
              }
              var3_ref = (Wormhole) (this.field_A.nextForward((byte) -71));
            }
          }
          if (param0 != 1) {
            this.recomputePlayerTotals(40);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_35_0 = var3_ref2;
          stackIn_35_1 = new StringBuilder().append("dc.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void releasePlayerStars(Player param0, byte param1) {
        int var4 = 0;
        Star[] var3 = null;
        Star var5 = null;
        int var6 = 0;
        Star[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 > -90) {
            this.chooseYearName((byte) 63);
          }
          var7 = this.field_g.field_e;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_y == param0) {
              var5.field_R = null;
              var5.field_y = null;
              var5.unlink((byte) -71);
              var5.unlinkSecondary(16);
            }
          }
          param0.field_i.clear(0);
          if (param0.field_m != null) {
            param0.field_m.k(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("dc.JA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int applyStellarBomb(byte param0, Star param1) {
        int var3_int = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        FleetMove var4 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 < 88) {
            this.field_e = 2;
          }
          if (param1.field_u &&
            this.field_o.field_f) {
            var3_int = 0;
            param1.field_u = false;
          } else {
            var3_int = 1 + param1.field_x >> 1;
            param1.field_x = param1.field_x - var3_int;
          }
          var4 = (FleetMove) (param1.field_T.startForward(0));
          while (var4 != null) {
            var4.unlink((byte) -113);
            var4.unlinkSecondary(16);
            var4.unlinkTertiary(true);
            var4 = (FleetMove) (param1.field_T.nextForward((byte) -71));
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("dc.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void e(int param0) {
        int var3 = 0;
        Player[] var2;
        Player var4;
        Territory var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_v;
        for (var3 = param0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (!this.field_o.field_i) {
            var5 = (Territory) (var4.field_i.startForward(0));
            while (var5 != null) {
              QuaternaryListSequence.a(param0 ^ 127, var5);
              SolMapReader.a(var5, param0 - 5);
              var5 = (Territory) (var4.field_i.nextForward((byte) -71));
            }
          } else {
            QuaternaryListSequence.a(param0 ^ 125, var4.field_m);
            SolMapReader.a(var4.field_m, -5);
          }
        }
    }

    final int computeChecksum(int param0) {
        int stackIn_13_0 = 0;
        int var2;
        Wormhole var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        Player var10;
        Star var11;
        int var12;
        Player[] var13;
        Player var14;
        Star[] var15;
        Star var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var6Lifetime1;
        int var8Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 305494461;
        var2 = var2 ^ this.field_f << 11;
        var2 = var2 ^ this.field_w * 5 << 7;
        var2 = var2 ^ this.field_y * 13 << 19;
        if (param0 != -28824) {
          return 22;
        }
        var13 = this.field_v;
        for (var4 = 0; var13.length > var4; var4++) {
          var10 = var13[var4];
          var14 = var10;
          var2 = var2 + (var10.field_u[0] << var14.field_x);
          var2 = var2 + (var10.field_u[1] << var14.field_x + 3);
          var2 = var2 + (var10.field_u[2] << var14.field_x + 7);
          var2 = var2 + (var10.field_u[3] << var14.field_x + 19);
          for (var6 = 0; var6 < this.field_v.length; var6++) {
            var2 = var2 + (var10.field_f[var6] << (var6 * 5 + 7 * var14.field_x) % 11);
          }
        }
        var15 = this.field_g.field_e;
        for (var4Lifetime1 = 0; var15.length > var4Lifetime1; var4Lifetime1++) {
          var11 = var15[var4Lifetime1];
          var16 = var11;
          var6Lifetime1 = 1 + var16.field_p;
          stackIn_13_0 = (var16.field_u) ? 79 : 0;
          var7 = stackIn_13_0;
          for (var8 = 0; var16.field_D.length > var8; var8++) {
            var7 = var7 + 23 * (var8 + 1) * var11.field_D[var8].field_p;
          }
          var12 = 0;
          var8Lifetime1 = var12;
          while (4 > var12) {
            var7 = var7 + var16.field_G[var12] * (13 << var12 * 3);
            var12++;
          }
          var7 = var7 + 37 * var16.field_x;
          var2 = var2 + 17 * (var6Lifetime1 * var7);
        }
        var3 = (Wormhole) (this.field_A.startForward(0));
        while (var3 != null) {
          var4Lifetime2 = (var3.field_k.field_p + 17) * (13 + var3.field_n.field_p) ^ var3.field_m * 31;
          var2 = var2 + 23 * var4Lifetime2;
          var3 = (Wormhole) (this.field_A.nextForward((byte) -71));
        }
        var2 = var2 ^ 47 * this.field_G;
        var2 = var2 ^ 61 * this.field_n;
        return var2;
    }

    final boolean validatePlayerOrders(IntrusiveDeque param0, Player param1, int param2, IntrusiveDeque param3, IntrusiveDeque param4) {
        int var8_int = 0;
        int var14 = 0;
        int stackIn_33_0 = 0;
        Player stackIn_59_0 = null;
        Player stackIn_59_1 = null;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_112_2 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        PlacementOrder var8 = null;
        int var9 = 0;
        ProjectUse var10 = null;
        FleetMove var11 = null;
        int var11_int = 0;
        int var12 = 0;
        Object var12_ref = null;
        int var13 = 0;
        Star[] var13_ref_ln__ = null;
        Star var15 = null;
        int var16 = 0;
        Object var17 = null;
        Territory var18 = null;
        PlacementOrder var8Lifetime1;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var12Lifetime2;
        var17 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6_int = this.field_g.field_e.length;
          var7 = new int[var6_int];
          for (var8_int = 0; var8_int < var6_int; var8_int++) {
            var7[var8_int] = this.field_g.field_e[var8_int].field_x;
          }
          var8 = (PlacementOrder) (param3.startForward(0));
          while (var8 != null) {
            if (null != var8.field_u) {
              var7[var8.field_u.field_p] = var7[var8.field_u.field_p] + var8.field_v;
            }
            var8 = (PlacementOrder) (param3.nextForward((byte) -71));
          }
          var9 = 0;
          var10 = (ProjectUse) (param4.startForward(0));
          while (var10 != null) {
            boolean decompiledFrameRemainder0 = true;
            var11_int = 1;
            if (this.field_o.field_h) {
              if (var10.field_p != param1) {
                var11_int = 0;
              } else {
                if (null == var10.field_q) {
                  var11_int = 0;
                } else {
                  if (param1.field_u[var10.field_o] < 5) {
                    var11_int = 0;
                  } else {
                    var12 = 0;
                    var13 = var10.field_o;
                    if (0 == var13) {
                      if (var10.field_q.field_y != param1) {
                        var11_int = 0;
                      }
                    } else {
                      if (var13 != 1) {
                        if (var13 == 2) {
                          stackIn_33_0 = (param1 != var10.field_q.field_y) ? 0 : 1;
                          var12Lifetime2 = stackIn_33_0;
                          var13_ref_ln__ = var10.field_q.field_D;
                          for (var14 = 0; var13_ref_ln__.length > var14; var14++) {
                            var15 = var13_ref_ln__[var14];
                            if (var15.field_y == param1) {
                              var12Lifetime2 = 1;
                            }
                          }
                          if ((var12Lifetime2 == 0)) {
                            var11_int = 0;
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var13 == 3) {
                            if (null == var10.field_r) {
                              var11_int = 0;
                            } else {
                              if (var10.field_q.field_y != param1) {
                                var11_int = 0;
                              } else {
                                if (var10.field_q == var10.field_r) {
                                  var11_int = 0;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (var10.field_q.field_y != param1) {
                          var11_int = 0;
                        }
                        if (var10.field_q.field_L != 0) {
                          var11_int = 0;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var11_int = 0;
            }
            if (var11_int == 0) {
              var9 = 1;
              var10.unlink((byte) -71);
            }
            var10 = (ProjectUse) (param4.nextForward((byte) -71));
          }
          var8Lifetime1 = (PlacementOrder) (param3.startForward(param2 ^ param2));
          while (var8Lifetime1 != null) {
            boolean decompiledFrameRemainder1 = true;
            var11_intLifetime1 = 1;
            if (null != var8Lifetime1.field_u) {
              stackIn_59_0 = var8Lifetime1.field_u.field_y;
              stackIn_59_1 = (Player) (param1);
              if (stackIn_59_0 == stackIn_59_1) {
                if (!this.field_o.field_i) {
                  var12_ref = var8Lifetime1.field_u.field_R;
                } else {
                  var12_ref = var8Lifetime1.field_u.field_y.field_m;
                }
                ((Territory) (var12_ref)).field_x = ((Territory) (var12_ref)).field_x - var8Lifetime1.field_v;
                if (!(((Territory) (var12_ref)).field_x >= 0)) {
                  var11_intLifetime1 = 0;
                }
                decompiledFrameRemainder1 = false;
              }
            }
            if (decompiledFrameRemainder1) {
              var11_intLifetime1 = 0;
            }
            if (var11_intLifetime1 == 0) {
              var8Lifetime1.unlink((byte) -93);
              var9 = 1;
            }
            var8Lifetime1 = (PlacementOrder) (param3.nextForward((byte) -71));
          }
          if (!this.field_o.field_i) {
            var18 = (Territory) (param1.field_i.startForward(0));
            while (var18 != null) {
              QuaternaryListSequence.a(120, var18);
              SolMapReader.a(var18, -5);
              var18 = (Territory) (param1.field_i.nextForward((byte) -71));
            }
          } else {
            QuaternaryListSequence.a(122, param1.field_m);
            SolMapReader.a(param1.field_m, -5);
          }
          var11 = (FleetMove) (param0.startForward(0));
          while (var11 != null) {
            var12Lifetime1 = 1;
            if (var11.field_y != null &&
              var11.field_B != null &&
              var11.field_y.field_y == param1) {
              var7[var11.field_y.field_p] = var7[var11.field_y.field_p] - var11.field_z;
              if (!this.field_o.field_e) {
                stackIn_85_0 = var11.field_y.field_N;
              } else {
                stackIn_85_0 = 0;
              }
              var13Lifetime1 = stackIn_85_0;
              if (0 >= var11.field_z) {
                var12Lifetime1 = 0;
              } else if (var13Lifetime1 > var7[var11.field_y.field_p]) {
                var12Lifetime1 = 0;
              } else if (var11.field_y.field_R == var11.field_B.field_R) {
                if (!this.isWithinMovementRange(var11.field_y, var11.field_B, -1)) {
                  var12Lifetime1 = 0;
                }
              } else if (!var11.field_y.isNeighbour(var11.field_B, (byte) 10)) {
                var12Lifetime1 = 0;
              }
            } else {
              var12Lifetime1 = 0;
            }
            if (var12Lifetime1 == 0) {
              var11.unlink((byte) -103);
              var9 = 1;
            }
            var11 = (FleetMove) (param0.nextForward((byte) -71));
          }
          return (var9 == 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_105_0 = var6;
          stackIn_105_1 = new StringBuilder().append("dc.H(");
          if (param0 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',');
          if (param1 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          stackIn_111_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_112_2 = "null";
          } else {
            stackIn_112_2 = "{...}";
          }
          stackIn_114_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',');
          if (param4 == null) {
            stackIn_115_2 = "null";
          } else {
            stackIn_115_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
        }
    }

    private final void markDefeatedPlayers(TurnEventLog param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var3_int = param1; this.field_r > var3_int; var3_int++) {
            if ((this.field_w & 1 << var3_int) == 0 &&
              this.field_v[var3_int].field_i.isEmpty(param1 - 98)) {
              this.field_w = this.field_w | 1 << var3_int;
              if (param0 != null) {
                param0.recordElimination(this.field_v[var3_int], false);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dc.Q(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void splitTerritory(int param0, Territory param1) {
        int var7_int = 0;
        Star dupTemp$0 = null;
        int var9 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Star var5 = null;
        Star var6 = null;
        Star[] var6_array = null;
        Territory var7 = null;
        Star var10 = null;
        int var11 = 0;
        Star[] var12 = null;
        Star[] var13 = null;
        IntrusiveDeque var14 = null;
        Star var15 = null;
        Star var16 = null;
        Star var17 = null;
        Star var18 = null;
        Star var19 = null;
        Star var6Lifetime1;
        Star var18Lifetime1;
        Star var6Lifetime2;
        Star var18Lifetime2;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var14 = new IntrusiveDeque();
          var4 = new IntrusiveDeque();
          var4.addLast((byte) -113, param1.field_q);
          param1.field_q.field_R = null;
          if (param0 <= 45) {
            return;
          }
          while (!var4.isEmpty(-105)) {
            var15 = (Star) (var4.pollFirst(118));
            var14.addLast((byte) -113, var15);
            if (var15.field_D == null) {
              continue;
            }
            var12 = var15.field_D;
            var6_array = var12;
            for (var7_int = 0; var7_int < var12.length; var7_int++) {
              var16 = var12[var7_int];
              var18 = var16;
              var18Lifetime2 = var16;
              if (var16.field_R == param1) {
                var16.field_R = null;
                var4.addLast((byte) -113, var16);
              }
            }
          }
          var5 = (Star) (var14.startForward(0));
          while (var5 != null) {
            var5.field_R = param1;
            var5 = (Star) (var14.nextForward((byte) -71));
          }
          if (!param1.isEmpty(27650)) {
            while (true) {
              dupTemp$0 = param1.removeFirstStar(-40);
              var17 = dupTemp$0;
              var19 = var17;
              var6 = var19;
              if (dupTemp$0 == null) {
                break;
              }
              if (var17.field_R != param1) {
                continue;
              }
              var7 = new Territory(param1.field_o, var19);
              var4.addLast((byte) -113, var19);
              var6.field_R = var7;
              {
                while (!(var4.isEmpty(121))) {
                  var18Lifetime1 = (Star) (var4.pollFirst(73));
                  var7.addStar(-21771, var18Lifetime1);
                  if (var18Lifetime1.field_D == null) {
                    continue;
                  }
                  var13 = var18Lifetime1.field_D;
                  for (var9 = 0; var13.length > var9; var9++) {
                    var10 = var13[var9];
                    var6Lifetime2 = var10;
                    var6Lifetime2 = var10;
                    if (var10.field_R == param1) {
                      var10.field_R = var7;
                      var4.addLast((byte) -113, var10);
                    }
                  }
                }
                {
                  SolMapReader.a(var7, -5);
                  param1.field_o.field_i.addLast((byte) -113, var7);
                }
              }
            }
          }
          param1.setStars(var14, -9332);
          var6Lifetime1 = param1.field_o.field_m.firstStar(18229);
          while (var6Lifetime1 != null) {
            if (var6Lifetime1.field_y != param1.field_o) {
              var6Lifetime1.unlinkSecondary(16);
            }
            var6Lifetime1 = param1.field_o.field_m.nextStar(-23410);
          }
          SolMapReader.a(param1.field_o.field_m, -5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("dc.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    private final void detachStarFromTerritory(byte param0, Star param1) {
        Territory var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 <= 57) {
            return;
          }
          var3 = param1.field_R;
          if (var3 == null) {
            return;
          }
          param1.field_R = null;
          param1.unlink((byte) -111);
          param1.unlinkSecondary(16);
          if (param1 == var3.field_o.field_m.field_q) {
            var3.field_o.field_m.field_q = var3.field_o.field_m.firstStar(18229);
          }
          if (var3.field_q == param1) {
            if (var3.isEmpty(27650)) {
              var3.unlink((byte) -81);
            } else {
              var3.field_q = var3.firstStar(18229);
            }
          }
          if (!var3.isEmpty(27650)) {
            this.splitTerritory(72, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("dc.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(TurnEventLog param0, int param1, int param2) {
        int incrementValue$4 = 0;
        Star dupTemp$3 = null;
        int incrementValue$2 = 0;
        Star dupTemp$1 = null;
        Star dupTemp$0 = null;
        int var9 = 0;
        Player stackIn_42_0 = null;
        Player stackIn_42_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Star[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        Star var8_ref_ln = null;
        Star[] var9_ref_ln__ = null;
        int var10 = 0;
        Star var11 = null;
        Star[] var12_ref_ln__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Star var14_ref_ln = null;
        int var15 = 0;
        int[] var16 = null;
        Star[] var17 = null;
        Star[] var18 = null;
        Star var19 = null;
        Star var20 = null;
        Star[] var21 = null;
        Star var22 = null;
        Star var23 = null;
        Star var24 = null;
        int[] var28 = null;
        Star[] var12_ref_ln__Lifetime1;
        Star var14_ref_lnLifetime1;
        Star var19Lifetime1;
        Star var19Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        int var8Lifetime1;
        int var13Lifetime1Lifetime1;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = this.field_g.field_e.length;
          if (UsernameAvailabilityValidator.field_r != null &&
            UsernameAvailabilityValidator.field_r.length >= var4_int) {
            for (var5 = 0; var4_int > var5; var5++) {
              UsernameAvailabilityValidator.field_r[var5] = false;
            }
          } else {
            UsernameAvailabilityValidator.field_r = new boolean[var4_int];
          }
          do {
            var5 = 0;
            var17 = this.field_g.field_e;
            var6 = var17;
            for (var7 = 0; var7 < var17.length; var7++) {
              var8_ref_ln = var17[var7];
              var19 = var8_ref_ln;
              var23 = var19;
              var11 = var23;
              var19Lifetime1 = var8_ref_ln;
              var11 = var19Lifetime1;
              if (var8_ref_ln.field_y != null &&
                !UsernameAvailabilityValidator.field_r[var8_ref_ln.field_p] &&
                var8_ref_ln.field_N > var8_ref_ln.field_x) {
                UsernameAvailabilityValidator.field_r[var8_ref_ln.field_p] = true;
                var5 = 1;
                var18 = var8_ref_ln.field_D;
                var9_ref_ln__ = var18;
                for (var10 = 0; var18.length > var10; var10++) {
                  var19Lifetime2 = var18[var10];
                  var23 = var19Lifetime2;
                  var11 = var23;
                  var23 = var19Lifetime2;
                  var11 = var23;
                  var11 = var19Lifetime2;
                  if (var8_ref_ln.field_y == var19Lifetime2.field_y &&
                    !UsernameAvailabilityValidator.field_r[var19Lifetime2.field_p]) {
                    this.a(var19Lifetime2, true, (byte) 125);
                  }
                }
              }
            }
          } while (var5 != 0 &&
            !this.field_o.field_k);
          var6 = new Star[16];
          var7 = 16;
          var9_ref_ln__ = this.field_g.field_e;
          for (var10 = 0; var9_ref_ln__.length > var10; var10++) {
            var20 = var9_ref_ln__[var10];
            var23 = var20;
            var11 = var23;
            var23 = var20;
            var11 = var23;
            var11 = var20;
            if (var20.field_Q > 0) {
              var8 = 0;
              var21 = var20.field_D;
              var12_ref_ln__ = var21;
              for (var13 = 0; var13 < var21.length; var13++) {
                var22 = var21[var13];
                var23 = var22;
                var11 = var23;
                var23 = var22;
                var11 = var23;
                var14_ref_ln = var22;
                if (var22.field_y == var20.field_t &&
                  !UsernameAvailabilityValidator.field_r[var22.field_p]) {
                  incrementValue$4 = var8;
                  var8++;
                  var6[incrementValue$4] = var22;
                }
              }
              if (var8 != 0) {
                this.field_L.setSeed((long)(param1 ^ var20.field_p));
                for (var12 = 0; var12 < var20.field_Q; var12++) {
                  dupTemp$3 = var6[qf.a((byte) 78, var8, this.field_L)];
                  dupTemp$3.field_x = dupTemp$3.field_x + 1;
                }
              }
            }
            if (0 < var20.field_C) {
              stackIn_42_0 = var20.field_t;
              stackIn_42_1 = var20.field_y;
              if (stackIn_42_0 == stackIn_42_1 &&
                !UsernameAvailabilityValidator.field_r[var11.field_p]) {
                var11.field_x = var11.field_x + var11.field_C;
              }
            }
            if (null != var11.field_y) {
              var11.field_t = var11.field_y;
            }
          }
          var9_ref_ln__ = this.field_g.field_e;
          for (var10 = 0; var9_ref_ln__.length > var10; var10++) {
            var23 = var9_ref_ln__[var10];
            var11 = var23;
            if (var23.field_D.length > var7) {
              var6 = new Star[var23.field_D.length];
              var7 = var23.field_D.length;
            }
            if (var23.field_y != null &&
              UsernameAvailabilityValidator.field_r[var23.field_p]) {
              var8Lifetime1 = 0;
              var12_ref_ln__Lifetime1 = var23.field_D;
              for (var13Lifetime1 = 0; var13Lifetime1 < var12_ref_ln__Lifetime1.length; var13Lifetime1++) {
                var24 = var12_ref_ln__Lifetime1[var13Lifetime1];
                var14_ref_lnLifetime1 = var24;
                if (var11.field_y == var24.field_y &&
                  !UsernameAvailabilityValidator.field_r[var14_ref_lnLifetime1.field_p]) {
                  incrementValue$2 = var8Lifetime1;
                  var8Lifetime1++;
                  var6[incrementValue$2] = var14_ref_lnLifetime1;
                }
              }
              if (0 != var8Lifetime1) {
                this.field_L.setSeed((long)(param1 ^ var11.field_p));
                if (param0 == null) {
                  for (var12Lifetime1 = 0; var12Lifetime1 < var11.field_x; var12Lifetime1++) {
                    dupTemp$1 = var6[qf.a((byte) 27, var8Lifetime1, this.field_L)];
                    dupTemp$1.field_x = dupTemp$1.field_x + 1;
                  }
                } else {
                  var16 = new int[var8Lifetime1];
                  var28 = var16;
                  for (var13Lifetime1Lifetime1 = 0; var11.field_x > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                    var14 = qf.a((byte) 115, var8Lifetime1, this.field_L);
                    var16[var14] = var16[var14] + 1;
                    dupTemp$0 = var6[var14];
                    dupTemp$0.field_x = dupTemp$0.field_x + 1;
                  }
                  param0.recordStarAbandoned(var11, param2 - 14316, var28, var6);
                }
              } else {
                if (param0 != null) {
                  param0.recordStarAbandonedWithoutNeighbours(var11.field_x, var11, true);
                }
              }
              this.abandonStar(-21031, var11);
              if (var11.field_R != null) {
                throw new RuntimeException();
              }
            }
          }
          if (param2 != 14389) {
            this.field_u = (int[]) null;
          }
          for (var9 = 0; var4_int > var9; var9++) {
            UsernameAvailabilityValidator.field_r[var9] = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_88_0 = var4;
          stackIn_88_1 = new StringBuilder().append("dc.HA(");
          if (param0 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void setTurnNumber(int param0, int param1) {
        this.field_O = param1;
        if (param0 != -9778) {
          this.field_r = -91;
        }
    }

    GameState(int param0, GameRules param1, int param2, String[] param3) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var5_intLifetime1;
        this.field_n = 0;
        this.field_G = 0;
        try {
          this.field_J = param0;
          this.field_o = param1;
          this.field_M = param2;
          this.field_r = param3.length;
          this.field_v = new Player[this.field_r];
          this.field_k = -1;
          this.field_D = new int[this.field_r];
          this.field_I = param3;
          for (var5_int = 0; this.field_r > var5_int; var5_int++) {
            this.field_v[var5_int] = new Player(var5_int, this.field_I[var5_int], or.field_b[var5_int], DualLinkNode.field_k[var5_int], ho.field_e[var5_int]);
            this.field_v[var5_int].field_f = new int[this.field_r];
            this.field_v[var5_int].field_h = new boolean[this.field_r];
          }
          var5_intLifetime1 = this.field_M;
          if (0 == var5_intLifetime1) {
            this.field_x = (VictoryChecker) ((Object) new ConquestVictoryChecker(this.field_v));
          } else {
            if (1 == var5_intLifetime1) {
              this.field_x = (VictoryChecker) ((Object) new SolVictoryChecker(this.field_v));
            } else {
              if (var5_intLifetime1 == 2) {
                this.field_x = (VictoryChecker) ((Object) new PointsVictoryChecker(this.field_v));
              } else {
                if (var5_intLifetime1 == 3) {
                  this.field_x = (VictoryChecker) ((Object) new DerelictVictoryChecker(this.field_v));
                } else {
                  if (var5_intLifetime1 != -1) {
                    throw new RuntimeException("No VictoryChecker known for gametype " + this.field_M);
                  }
                  this.field_x = (VictoryChecker) ((Object) new TutorialVictoryChecker(this.field_v));
                }
              }
            }
          }
          this.field_p = new TertiaryNodeList();
          this.field_q = new IntrusiveDeque();
          this.field_i = new IntrusiveDeque();
          this.field_B = new int[this.field_r + 1];
          this.field_H = new int[this.field_r + 1];
          this.field_h = new int[this.field_r];
          this.field_K = new int[1 + this.field_r];
          this.field_u = new int[1 + this.field_r];
          this.field_A = new IntrusiveDeque();
          this.field_L = (Random) ((Object) new IsaacBackedRandom());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void a(byte param0, Star param1, BattleEvent param2) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        FleetMove var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Star var11 = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null != param1.field_y) {
            var4_int = this.field_h[param1.field_y.field_x];
            var5 = this.field_u[param1.field_y.field_x];
            var6 = var4_int - var5;
            if (var5 > 0) {
              var7 = var6 / 2;
              if (param2 != null) {
                param2.a(var6, var4_int, var7, 124);
              }
              param1.field_C = param1.field_C + var7;
            } else {
              if (param2 != null) {
                param2.a(var4_int, 14775, var6);
              }
              param1.field_Q = var4_int / 2;
            }
          }
          var4 = (FleetMove) (param1.field_s.startForward(-128));
          if (param0 > -122) {
            var11 = (Star) null;
            this.createTannhauserWormhole((Star) null, -35, (Star) null);
          }
          while (var4 != null) {
            if (var4.field_G != param1.field_y) {
              var5Lifetime1 = this.field_h[var4.field_G.field_x];
              var6Lifetime1 = this.field_u[var4.field_G.field_x];
              var7Lifetime1 = -var6Lifetime1 + var5Lifetime1;
              var8 = var4.field_z * var7Lifetime1 / var5Lifetime1;
              var9 = var8 / 2;
              var8 = var8 - var9;
              if (param2 != null) {
                param2.a(var9, 0, var4, var8);
              }
              var4.field_y.field_C = var4.field_y.field_C + var9;
            }
            var4 = (FleetMove) (param1.field_s.nextForward(32));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_24_0 = var4_ref;
          stackIn_24_1 = new StringBuilder().append("dc.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_E = new IntrusiveDeque();
        field_s = new int[8192];
        field_a = "This game has started.";
        field_l = new np(1);
    }
}
