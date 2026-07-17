/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lg {
    private int field_c;
    private Random field_o;
    static String field_s;
    private int[] field_i;
    private int[] field_k;
    private int[] field_g;
    private int[] field_q;
    private int field_y;
    int field_j;
    private int field_f;
    static ad field_n;
    private int[] field_p;
    static String[] field_d;
    private int field_b;
    static mj[] field_x;
    private int field_a;
    private int field_B;
    static String field_r;
    static String field_e;
    int field_t;
    private int field_z;
    static cn field_u;
    static String field_m;
    q field_v;
    static String field_l;
    private int field_A;
    static ji field_w;
    static String field_h;

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = DungeonAssault.field_K;
        var3 = -1 + ((lg) this).field_g.length;
        L0: while (true) {
          if (var3 < 0) {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var5 = null;
                lg.a(54, -127, 107, -64, -29, (cn) null);
                break L1;
              }
            }
            return;
          } else {
            if (((lg) this).field_k[var3] <= 0) {
              param0--;
              if (0 <= param0) {
                ((lg) this).field_g[var3] = ((lg) this).field_t + uj.a(((lg) this).field_o, 37, ((lg) this).field_f);
                ((lg) this).field_i[var3] = ((lg) this).field_j + uj.a(((lg) this).field_o, 37, ((lg) this).field_B);
                ((lg) this).field_q[var3] = ((lg) this).field_b - -uj.a(((lg) this).field_o, 37, ((lg) this).field_y);
                ((lg) this).field_p[var3] = ((lg) this).field_A - -uj.a(((lg) this).field_o, 37, ((lg) this).field_z);
                ((lg) this).field_k[var3] = 50;
                var3--;
                continue L0;
              } else {
                var3--;
                continue L0;
              }
            } else {
              ((lg) this).field_k[var3] = ((lg) this).field_k[var3] - 1;
              ((lg) this).field_g[var3] = ((lg) this).field_g[var3] + ((lg) this).field_q[var3];
              ((lg) this).field_i[var3] = ((lg) this).field_i[var3] + ((lg) this).field_p[var3];
              ((lg) this).field_q[var3] = ((lg) this).field_q[var3] + ((lg) this).field_c;
              ((lg) this).field_p[var3] = ((lg) this).field_p[var3] + ((lg) this).field_a;
              var3--;
              continue L0;
            }
          }
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 <= var2) {
            if (!(var2 >= 160)) {
                var3 = mh.field_d[-128 + var2];
                if (!(0 != var3)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        if (param1 <= 92) {
            lg.a(-80);
        }
        return (char)var2;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        L0: {
          var10 = DungeonAssault.field_K;
          var2 = ((lg) this).field_v.field_h;
          var3 = ((lg) this).field_v.field_e;
          ((lg) this).field_v.b();
          var14 = ((lg) this).field_v.field_j;
          var13 = var14;
          var12 = var13;
          var11 = var12;
          var4 = var11;
          if (param0 == 486513968) {
            break L0;
          } else {
            ((lg) this).field_o = null;
            break L0;
          }
        }
        var5 = -1 + ((lg) this).field_g.length;
        L1: while (true) {
          if (0 > var5) {
            return;
          } else {
            if (((lg) this).field_k[var5] > 0) {
              var6 = ((lg) this).field_g[var5] >> 16;
              var7 = ((lg) this).field_i[var5] >> 16;
              if (var6 >= 0) {
                if (var2 > var6) {
                  if (var7 >= 0) {
                    if (var3 > var7) {
                      L2: {
                        var8 = var6 + var2 * var7;
                        var9 = (((lg) this).field_k[var5] >> 2) + var14[var8];
                        if (var9 > 255) {
                          var9 = 255;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var4[var8] = (byte)var9;
                      var5--;
                      continue L1;
                    } else {
                      var5--;
                      continue L1;
                    }
                  } else {
                    var5--;
                    continue L1;
                  }
                } else {
                  var5--;
                  continue L1;
                }
              } else {
                var5--;
                continue L1;
              }
            } else {
              var5--;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0) {
        jd var1 = (jd) (Object) ta.field_f.e(-24172);
        if (!(var1 != null)) {
            tl.a(-63);
            return;
        }
        wj var2 = ra.field_c;
        int discarded$0 = var2.h(-125);
        int discarded$1 = var2.h(-122);
        int discarded$2 = var2.h(-38);
        int discarded$3 = var2.h(-39);
        int var3 = 71 / ((33 - param0) / 33);
        var1.a(false);
    }

    public static void a(boolean param0) {
        field_n = null;
        field_w = null;
        field_h = null;
        field_l = null;
        field_s = null;
        field_e = null;
        field_r = null;
        field_x = null;
        field_d = null;
        field_u = null;
        field_m = null;
        if (!param0) {
            field_l = null;
        }
    }

    final static void a(int param0, int param1, String param2, int param3) {
        if (param0 != 63) {
            char discarded$0 = lg.a((byte) 23, 52);
        }
        ac var4 = gh.field_i[param3];
        if (var4 == null) {
            return;
        }
        try {
            cf dupTemp$1 = hd.a(false, param1, "da_trap_" + param2);
            var4.field_a = dupTemp$1;
            var4.field_x = dupTemp$1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lg.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, cn param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var20 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var6_int = (-param2 + param0 << 8) / param5.field_E;
              param3 = param3 + param5.field_A;
              if (param1 == 65280) {
                break L1;
              } else {
                lg.a(false);
                break L1;
              }
            }
            L2: {
              var7 = var6_int * param5.field_w + (param2 << 8);
              param4 = param4 + param5.field_w;
              var8 = param4 - -(param3 * gf.field_i);
              var9 = 0;
              var10 = param5.field_v;
              var11 = param5.field_y;
              var12 = -var11 + gf.field_i;
              var13 = 0;
              if (param3 < gf.field_f) {
                var14 = gf.field_f + -param3;
                param3 = gf.field_f;
                var8 = var8 + gf.field_i * var14;
                var10 = var10 - var14;
                var9 = var9 + var14 * var11;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~(param3 + var10) < ~gf.field_e) {
                var10 = var10 - (-gf.field_e + param3 - -var10);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (gf.field_j > param4) {
                var14 = gf.field_j - param4;
                var12 = var12 + var14;
                param4 = gf.field_j;
                var7 = var7 + var6_int * var14;
                var13 = var13 + var14;
                var8 = var8 + var14;
                var9 = var9 + var14;
                var11 = var11 - var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (gf.field_h >= param4 - -var11) {
                break L5;
              } else {
                var14 = -gf.field_h + (param4 - -var11);
                var13 = var13 + var14;
                var12 = var12 + var14;
                var11 = var11 - var14;
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if (var10 <= 0) {
                  break L6;
                } else {
                  param3 = -var10;
                  L7: while (true) {
                    if (0 <= param3) {
                      break L0;
                    } else {
                      var14 = var7;
                      param4 = -var11;
                      L8: while (true) {
                        if (param4 >= 0) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param3++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 8;
                            var16 = -var15 + 256;
                            var14 = var14 + var6_int;
                            if (var15 >= 0) {
                              L10: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param5.field_B[incrementValue$1];
                                if (var17 == 0) {
                                  break L10;
                                } else {
                                  if (var15 <= 255) {
                                    var18 = gf.field_b[var8];
                                    var19 = 16711935 & var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8;
                                    gf.field_b[var8] = (nb.a(16711772, nb.a(var17, 65280) * var15 + nb.a(65280, var18) * var16) >> 8) + var19;
                                    break L10;
                                  } else {
                                    gf.field_b[var8] = var17;
                                    break L10;
                                  }
                                }
                              }
                              var8++;
                              break L9;
                            } else {
                              var8++;
                              var9++;
                              break L9;
                            }
                          }
                          param4++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("lg.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
    }

    lg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        ((lg) this).field_B = param3;
        ((lg) this).field_k = new int[10000];
        ((lg) this).field_f = param2;
        ((lg) this).field_c = param8;
        ((lg) this).field_p = new int[10000];
        ((lg) this).field_t = param0;
        ((lg) this).field_g = new int[10000];
        ((lg) this).field_q = new int[10000];
        ((lg) this).field_z = param7;
        ((lg) this).field_i = new int[10000];
        ((lg) this).field_y = param6;
        ((lg) this).field_a = param9;
        ((lg) this).field_A = param5;
        ((lg) this).field_b = param4;
        ((lg) this).field_j = param1;
        ((lg) this).field_o = new Random(100L);
        ((lg) this).field_v = new q(param10, param11, 256);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_s = "<col=FF0000>Lethal</col>";
        field_n = new ad(15, 0, 1, 0);
        field_x = new mj[255];
        field_r = "Found openly only in the courts of some of the more power-hungry human nobles, the dark spells of the necromancer grant her the ability to tackle a variety of situations.";
        field_e = "<%col_detect>Detect +2</col> in adjacent rooms.";
        field_d = new String[]{"Offering", "In a desperate barter with the spirits of his tribal elders, should the <%0> be about to die or be otherwise incapacitated, he can send another orc or goblin into the afterlife and gain another chance at life. (Multiple use)"};
        field_l = "Accept";
        for (var0 = 0; field_x.length > var0; var0++) {
            field_x[var0] = new mj();
        }
        field_h = "RAIDER RECRUITMENT";
    }
}
