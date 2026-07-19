/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vj {
    private int[] field_a;
    static String field_c;
    private int field_e;
    static String field_i;
    private int[] field_g;
    static int[] field_d;
    private int field_h;
    private int field_j;
    private int field_b;
    private int field_f;

    final static bo a(String param0, int param1) {
        bo discarded$2 = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        bo var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        bo stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        bo stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (lh.field_p != null) {
              L1: {
                if (param1 >= 41) {
                  break L1;
                } else {
                  var6 = (String) null;
                  discarded$2 = vj.a((String) null, -65);
                  break L1;
                }
              }
              L2: {
                var7 = (CharSequence) ((Object) param0);
                var2 = jm.a((byte) 59, var7);
                if (var2 == null) {
                  var2 = param0;
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = (bo) ((Object) lh.field_p.a((byte) 26, (long)var2.hashCode()));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var8 = (CharSequence) ((Object) var3.field_Hb);
                    var4 = jm.a((byte) 59, var8);
                    if (var4 == null) {
                      var4 = var3.field_Hb;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackOut_17_0 = (bo) (var3);
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    var3 = (bo) ((Object) lh.field_p.c((byte) 72));
                    continue L3;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2_ref);
            stackOut_21_1 = new StringBuilder().append("vj.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(int param0) {
        if (param0 != 24243) {
            return;
        }
        field_i = null;
        field_c = null;
        field_d = null;
    }

    final void a(boolean param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        if (param0) {
          param1 = param1 * 9;
          var3 = gf.field_b;
          var4 = gf.field_i;
          var5 = param1 - -9;
          var6 = this.field_j + this.field_e * var4;
          var7 = -this.field_b + var4;
          var8 = 0;
          var9 = 0;
          L0: while (true) {
            if (var9 >= this.field_f) {
              return;
            } else {
              var10 = 0;
              L1: while (true) {
                if (var10 >= this.field_b) {
                  var6 = var6 + var7;
                  var9++;
                  continue L0;
                } else {
                  var11 = this.field_a[var8];
                  if (param1 < var11) {
                    if (var11 <= var5) {
                      var3[var6] = ok.field_X[-param1 + var11];
                      var8++;
                      var6++;
                      var10++;
                      continue L1;
                    } else {
                      var3[var6] = this.field_g[var8];
                      var8++;
                      var6++;
                      var10++;
                      continue L1;
                    }
                  } else {
                    var8++;
                    var6++;
                    var10++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        vl.field_m = param1;
        if (param0 <= 5) {
            field_c = (String) null;
        }
        mm.field_q = param2;
    }

    vj(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        this.field_f = param3;
        this.field_h = param4;
        this.field_j = param0;
        this.field_e = param1;
        this.field_b = param2;
        this.field_g = new int[this.field_b * this.field_f];
        this.field_a = new int[this.field_f * this.field_b];
        var6 = uj.a(md.field_d, 37, 640);
        var7 = uj.a(md.field_d, 37, 640);
        var8 = uj.a(md.field_d, 37, 480);
        var9 = uj.a(md.field_d, 37, 480);
        var20 = new int[this.field_b];
        var18 = var20;
        var10 = var18;
        var21 = new int[this.field_f];
        var19 = var21;
        var11 = var19;
        var12 = 1;
        L0: while (true) {
          if (var12 >= this.field_b) {
            var12 = 1;
            L1: while (true) {
              if (this.field_f <= var12) {
                var12 = 0;
                L2: while (true) {
                  if (var12 >= this.field_b) {
                    return;
                  } else {
                    var13 = 0;
                    L3: while (true) {
                      if (this.field_f <= var13) {
                        var12++;
                        continue L2;
                      } else {
                        L4: {
                          var14 = (int)Math.sqrt((double)((-var6 + var12) * (-var6 + var12) + (-var8 + var13) * (-var8 + var13)));
                          var15 = (int)Math.sqrt((double)((-var9 + var13) * (var13 + -var9) + (-var7 + var12) * (var12 + -var7)));
                          stackOut_10_0 = var20[var12];
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var14 >= var15) {
                            stackOut_12_0 = stackIn_12_0;
                            stackOut_12_1 = var15;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L4;
                          } else {
                            stackOut_11_0 = stackIn_11_0;
                            stackOut_11_1 = var14;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L4;
                          }
                        }
                        var16 = (stackIn_13_0 + stackIn_13_1 - -var21[var13]) * this.field_h * 9 / 640;
                        this.field_g[var12 + this.field_b * var13] = gf.field_b[var12 - -this.field_j - -((var13 - -this.field_e) * gf.field_i)];
                        this.field_a[this.field_b * var13 + var12] = var16;
                        var13++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var11[var12] = (int)(Math.sin(6.0 * ((double)var12 * 3.141592653589793 / (double)this.field_f)) * 40.0 + 15.0 * Math.cos(3.141592653589793 * (double)var12 / (double)this.field_f * 14.0)) / 3;
                var12++;
                continue L1;
              }
            }
          } else {
            var10[var12] = (int)(30.0 * Math.sin(5.0 * ((double)var12 * 3.141592653589793 / (double)this.field_b)) + 10.0 * Math.cos((double)var12 * 3.141592653589793 / (double)this.field_b * 9.0)) / 3;
            var12++;
            continue L0;
          }
        }
    }

    static {
        field_c = null;
        field_i = "You must have had your dungeon reset by an Orb of Mastery <%0> times to earn the title of <%1>.";
        field_d = new int[8192];
    }
}
