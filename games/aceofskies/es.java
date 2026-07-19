/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es {
    static String[] field_a;
    private wt field_d;
    static int field_c;
    private int field_f;
    static pa[] field_b;
    static String field_g;
    private wt[] field_e;
    private long field_h;
    static vd field_i;

    final wt a(boolean param0) {
        wt var2 = null;
        wt var3 = null;
        if (null != this.field_d) {
          if (!param0) {
            var2 = this.field_e[(int)((long)(this.field_f - 1) & this.field_h)];
            L0: while (true) {
              if (var2 != this.field_d) {
                if ((this.field_d.field_i ^ -1L) != (this.field_h ^ -1L)) {
                  this.field_d = this.field_d.field_j;
                  continue L0;
                } else {
                  var3 = this.field_d;
                  this.field_d = this.field_d.field_j;
                  return var3;
                }
              } else {
                this.field_d = null;
                return null;
              }
            }
          } else {
            return (wt) null;
          }
        } else {
          return null;
        }
    }

    final wt a(int param0, long param1) {
        wt var4 = null;
        wt var5 = null;
        this.field_h = param1;
        var4 = this.field_e[(int)((long)(this.field_f - 1) & param1)];
        if (param0 >= 87) {
          this.field_d = var4.field_j;
          L0: while (true) {
            if (var4 != this.field_d) {
              if ((this.field_d.field_i ^ -1L) != (param1 ^ -1L)) {
                this.field_d = this.field_d.field_j;
                continue L0;
              } else {
                var5 = this.field_d;
                this.field_d = this.field_d.field_j;
                return var5;
              }
            } else {
              this.field_d = null;
              return null;
            }
          }
        } else {
          field_b = (pa[]) null;
          this.field_d = var4.field_j;
          L1: while (true) {
            if (var4 != this.field_d) {
              if ((this.field_d.field_i ^ -1L) != (param1 ^ -1L)) {
                this.field_d = this.field_d.field_j;
                continue L1;
              } else {
                var5 = this.field_d;
                this.field_d = this.field_d.field_j;
                return var5;
              }
            } else {
              this.field_d = null;
              return null;
            }
          }
        }
    }

    final void a(wt param0, long param1, byte param2) {
        wt var5 = null;
        wt discarded$0 = null;
        try {
            if (null != param0.field_f) {
                param0.d(-122);
            }
            var5 = this.field_e[(int)(param1 & (long)(this.field_f - 1))];
            param0.field_f = var5.field_f;
            param0.field_j = var5;
            param0.field_f.field_j = param0;
            if (param2 != 56) {
                discarded$0 = this.a(false);
            }
            param0.field_i = param1;
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "es.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(Class param0, int param1, String param2) {
        try {
            Object discarded$5 = null;
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Class var3 = null;
            RuntimeException var3_ref = null;
            Object var4 = null;
            NoSuchMethodException var5 = null;
            Throwable var5_ref = null;
            Class var5_ref2 = null;
            Class var6 = null;
            java.lang.reflect.Method var7 = null;
            java.lang.reflect.Method var8 = null;
            File var9 = null;
            int stackIn_4_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_8_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            try {
              L0: {
                var3 = (Class) (sk.field_e.get(param2));
                if (var3 != null) {
                  if (var3.getClassLoader() == param0.getClassLoader()) {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  var4 = null;
                  if (param1 <= -38) {
                    L1: {
                      if (var4 != null) {
                        break L1;
                      } else {
                        var4 = (File) (vg.field_j.get(param2));
                        break L1;
                      }
                    }
                    if (var4 != null) {
                      try {
                        L2: {
                          var9 = new File(((File) (var4)).getCanonicalPath());
                          var4 = var9;
                          var5_ref2 = Class.forName("java.lang.Runtime");
                          var6 = Class.forName("java.lang.reflect.AccessibleObject");
                          var7 = var6.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
                          var8 = var5_ref2.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
                          discarded$5 = var7.invoke((Object) (var8), new Object[]{Boolean.TRUE});
                          discarded$6 = var8.invoke((Object) (Runtime.getRuntime()), new Object[]{param0, var9.getPath()});
                          discarded$7 = var7.invoke((Object) (var8), new Object[]{Boolean.FALSE});
                          discarded$8 = sk.field_e.put(param2, param0);
                          stackOut_14_0 = 1;
                          stackIn_15_0 = stackOut_14_0;
                          break L2;
                        }
                      } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                        System.load(((File) (var4)).getPath());
                        discarded$9 = sk.field_e.put(param2, ln.class);
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
                      } catch (java.lang.Throwable decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        var5_ref = decompiledCaughtException;
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) (var3_ref);
                stackOut_20_1 = new StringBuilder().append("es.E(");
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param0 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L3;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L3;
                }
              }
              L4: {
                stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param2 == null) {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L4;
                } else {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "{...}";
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L4;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_6_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_9_0 != 0;
                } else {
                  return stackIn_15_0 != 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    es(int param0) {
        wt dupTemp$0 = null;
        wt var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        this.field_f = param0;
        this.field_e = new wt[param0];
        int var2 = 0;
        while (var2 < param0) {
            dupTemp$0 = new wt();
            var3 = dupTemp$0;
            this.field_e[var2] = dupTemp$0;
            var3.field_f = var3;
            var3.field_j = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 1020) {
          field_g = (String) null;
          field_b = null;
          field_g = null;
          field_i = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_i = null;
          field_a = null;
          return;
        }
    }

    static {
        field_c = 0;
        field_g = "Player Name: ";
    }
}
