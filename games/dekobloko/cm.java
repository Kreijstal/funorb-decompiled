/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cm implements Iterator {
    private int field_e;
    private bh field_c;
    private bh field_j;
    private si field_k;
    static int[] field_a;
    static int[] field_h;
    static int[] field_g;
    static int[] field_b;
    static String field_i;
    static String field_d;
    static ie field_f;

    public final Object next() {
        bh var1 = null;
        int var2 = client.field_A ? 1 : 0;
        if (!(((cm) this).field_c == ((cm) this).field_k.field_h[((cm) this).field_e + -1])) {
            var1 = ((cm) this).field_c;
            ((cm) this).field_c = var1.field_b;
            ((cm) this).field_j = var1;
            return (Object) (Object) var1;
        }
        do {
            if (((cm) this).field_k.field_a <= ((cm) this).field_e) {
                return null;
            }
            int fieldTemp$0 = ((cm) this).field_e;
            ((cm) this).field_e = ((cm) this).field_e + 1;
            var1 = ((cm) this).field_k.field_h[fieldTemp$0].field_b;
        } while (var1 == ((cm) this).field_k.field_h[-1 + ((cm) this).field_e]);
        ((cm) this).field_c = var1.field_b;
        ((cm) this).field_j = var1;
        return (Object) (Object) var1;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sb var4_ref_sb = null;
        int var4 = 0;
        ff var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        uf var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = de.field_V;
              if (param0 == 53) {
                break L1;
              } else {
                cm.a(20);
                break L1;
              }
            }
            L2: {
              var2 = var9.d((byte) -44);
              var3 = var9.d((byte) -117);
              if (var2 != 0) {
                if (var2 != 1) {
                  qb.a((Throwable) null, 16408, "LR1: " + qk.d((byte) 74));
                  si.a(100);
                  break L2;
                } else {
                  var4 = var9.e((byte) -2);
                  var5 = (ff) (Object) cd.field_c.c((byte) -124);
                  L3: while (true) {
                    L4: {
                      if (var5 == null) {
                        break L4;
                      } else {
                        L5: {
                          if (var3 != var5.field_q) {
                            break L5;
                          } else {
                            if (var4 != var5.field_r) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = (ff) (Object) cd.field_c.d(true);
                        continue L3;
                      }
                    }
                    if (var5 == null) {
                      si.a(71);
                      return;
                    } else {
                      var5.b((byte) 124);
                      break L2;
                    }
                  }
                }
              } else {
                var4_ref_sb = (sb) (Object) ef.field_S.c((byte) -68);
                if (var4_ref_sb == null) {
                  si.a(78);
                  return;
                } else {
                  L6: {
                    var5_int = sm.field_e - var9.field_n;
                    var13 = var4_ref_sb.field_q;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var13.length << 2 < var5_int) {
                      var5_int = var13.length << 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var7 = 0;
                  L7: while (true) {
                    if (var7 >= var5_int) {
                      var4_ref_sb.field_s = true;
                      var4_ref_sb.b((byte) 118);
                      break L2;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -108) << (lb.a(3, var7) << 8));
                      var7++;
                      continue L7;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "cm.A(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 4;
        ((cm) this).field_e = 1;
        ((cm) this).field_j = null;
        ((cm) this).field_c = ((cm) this).field_k.field_h[0].field_b;
    }

    public final boolean hasNext() {
        int var2 = client.field_A ? 1 : 0;
        if (!(((cm) this).field_c == ((cm) this).field_k.field_h[-1 + ((cm) this).field_e])) {
            return true;
        }
        while (((cm) this).field_e < ((cm) this).field_k.field_a) {
            int fieldTemp$0 = ((cm) this).field_e;
            ((cm) this).field_e = ((cm) this).field_e + 1;
            if (((cm) this).field_k.field_h[fieldTemp$0].field_b != ((cm) this).field_k.field_h[((cm) this).field_e - 1]) {
                ((cm) this).field_c = ((cm) this).field_k.field_h[-1 + ((cm) this).field_e].field_b;
                return true;
            }
            ((cm) this).field_c = ((cm) this).field_k.field_h[((cm) this).field_e + -1];
        }
        return false;
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
        field_d = null;
        if (param0 != 1714134600) {
            field_a = null;
        }
    }

    public final void remove() {
        if (((cm) this).field_j == null) {
            throw new IllegalStateException();
        }
        ((cm) this).field_j.b((byte) 112);
        ((cm) this).field_j = null;
    }

    final static String a(byte param0, String param1, String[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = 2 + var6_int;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!fl.a(param1.charAt(var5), (byte) 23)) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (be.a((byte) 98, (CharSequence) (Object) var7_ref_String)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = cb.a((byte) -72, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (var6_int - (var5 - param2[var8].length()));
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                L4: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  if (param0 > 80) {
                    break L4;
                  } else {
                    cm.a((byte) -121);
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (var8 >= 0) {
                    var5 = var8 - -2;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!fl.a(param1.charAt(var5), (byte) 23)) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param1.substring(2 + var8, var5);
                      if (be.a((byte) 98, (CharSequence) (Object) var9)) {
                        if (var5 >= var3_int) {
                          continue L5;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = cb.a((byte) 100, (CharSequence) (Object) var9);
                            StringBuilder discarded$3 = var6.append(param1.substring(var7, var8));
                            var7 = var5;
                            StringBuilder discarded$4 = var6.append(param2[var10]);
                            continue L5;
                          }
                        }
                      } else {
                        continue L5;
                      }
                    }
                  } else {
                    StringBuilder discarded$5 = var6.append(param1.substring(var7));
                    stackOut_27_0 = var6.toString();
                    stackIn_28_0 = stackOut_27_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("cm.D(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          L9: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_28_0;
    }

    cm(si param0) {
        ((cm) this).field_j = null;
        try {
            ((cm) this).field_k = param0;
            this.b((byte) -117);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        field_a = b.h(-126);
        field_h = b.h(80);
        field_g = b.h(-125);
        field_b = b.h(86);
        var0 = 0;
        L0: while (true) {
          if (var0 >= 15) {
            var0 = 15;
            L1: while (true) {
              if (31 <= var0) {
                var13 = field_g;
                var8 = var13;
                var3 = var8;
                var3[0] = de.b(var13[0], 8);
                var14 = field_g;
                var9 = var14;
                var4 = var9;
                var4[0] = de.b(var14[0], 128);
                var15 = field_g;
                var10 = var15;
                var5 = var10;
                var5[0] = de.b(var15[0], 4194304);
                var16 = field_b;
                var11 = var16;
                var6 = var11;
                var6[0] = de.b(var16[0], 1);
                var17 = field_b;
                var12 = var17;
                var7 = var12;
                var7[0] = de.b(var17[0], 2048);
                field_i = "Creating your account";
                field_d = "Connection lost. <%0>";
                return;
              } else {
                var1 = field_h;
                var2 = var0;
                var1[var2 >> 5] = de.b(var1[var2 >> 5], 1 << lb.a(31, var2));
                var0++;
                continue L1;
              }
            }
          } else {
            var1 = field_a;
            var2 = var0;
            var1[var2 >> 5] = de.b(var1[var2 >> 5], 1 << lb.a(var2, 31));
            var0++;
            continue L0;
          }
        }
    }
}
