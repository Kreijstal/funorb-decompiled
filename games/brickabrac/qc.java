/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qc extends nm {
    static jp[] field_l;
    static vl field_n;
    static volatile boolean field_i;
    static int field_o;
    int field_j;
    static mf field_k;
    int field_m;

    final static oh a(String param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (ka.field_l != jm.field_f) {
            return null;
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qc.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 0 + ')');
        }
    }

    public static void d() {
        field_n = null;
        field_l = null;
        field_k = null;
    }

    final static void a() {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != vd.field_f) {
                    vd.field_f.b((byte) 30);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (on.field_x != null) {
                    on.field_x.a((byte) 68);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (oc.field_k == null) {
                    break L3;
                  } else {
                    {
                      L4: {
                        oc.field_k.a(false);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (null != v.field_g) {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= v.field_g.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null == v.field_g[var1_int]) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw qb.a((Throwable) (Object) var1, "qc.E(" + 14676 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            int discarded$19 = 2;
            if (m.a()) {
              boolean discarded$20 = wo.field_b.a(rj.field_b, fh.field_g, -124, true);
              wo.field_b.i(82);
              L1: while (true) {
                int discarded$21 = 5;
                if (!jl.a()) {
                  break L0;
                } else {
                  boolean discarded$22 = wo.field_b.a(go.field_b, dc.field_b, true);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == ua.field_d) {
                  break L2;
                } else {
                  if (!ua.field_d.field_e) {
                    break L2;
                  } else {
                    nc.b(109);
                    wo.field_b.a(-80, (oc) (Object) new ek(wo.field_b, ch.field_a));
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "qc.D(" + 27144 + ')');
        }
    }

    qc(int param0) {
        this(param0, -1);
    }

    final static String a(long param0) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = BrickABrac.field_J ? 1 : 0;
        if (0L >= param0) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (0L == param0 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (var4 != 0L) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = af.field_B[(int)(var7 + -(37L * param0))];
            if (!(var9 != 95)) {
                var10 = var6.length() - 1;
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            StringBuilder discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    qc(int param0, int param1) {
        ((qc) this).field_j = param1;
        ((qc) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = true;
        field_n = new vl();
    }
}
