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
        wt var2;
        wt var3;
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
        wt var4;
        wt var5;
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
        try {
            if (null != param0.field_f) {
                param0.d(-122);
            }
            var5 = this.field_e[(int)(param1 & (long)(this.field_f - 1))];
            param0.field_f = var5.field_f;
            param0.field_j = var5;
            param0.field_f.field_j = param0;
            if (param2 != 56) {
                this.a(false);
            }
            param0.field_i = param1;
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "es.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(Class param0, int param1, String param2) {
        try {
            int stackIn_4_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            StringBuilder stackIn_25_1 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Class var3 = null;
            RuntimeException var3_ref = null;
            Object var4 = null;
            Class var5 = null;
            NoSuchMethodException var5_ref = null;
            Throwable var5_ref2 = null;
            Class var6 = null;
            java.lang.reflect.Method var7 = null;
            java.lang.reflect.Method var8 = null;
            File var9 = null;
            try {
              L0: {
                var3 = (Class) (sk.field_e.get(param2));
                if (var3 != null) {
                  if (var3.getClassLoader() == param0.getClassLoader()) {
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_4_0 = 0;
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
                          var5 = Class.forName("java.lang.Runtime");
                          var6 = Class.forName("java.lang.reflect.AccessibleObject");
                          var7 = var6.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
                          var8 = var5.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
                          var7.invoke((Object) (var8), new Object[]{Boolean.TRUE});
                          var8.invoke((Object) (Runtime.getRuntime()), new Object[]{param0, var9.getPath()});
                          var7.invoke((Object) (var8), new Object[]{Boolean.FALSE});
                          sk.field_e.put(param2, param0);
                          stackIn_15_0 = 1;
                          break L2;
                        }
                      } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var5_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
                        System.load(((File) (var4)).getPath());
                        sk.field_e.put(param2, ln.class);
                        stackIn_17_0 = 1;
                        return stackIn_17_0 != 0;
                      } catch (java.lang.Throwable decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        var5_ref2 = decompiledCaughtException;
                        stackIn_19_0 = 0;
                        return stackIn_19_0 != 0;
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return false;
                    }
                  } else {
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var3_ref);

                stackIn_22_1 = new StringBuilder().append("es.E(");

                if (param0 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L3;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "null";
                  break L4;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "{...}";
                  break L4;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
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
        wt dupTemp$1 = null;
        int var2 = 0;
        wt var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = AceOfSkies.field_G ? 1 : 0;
                    this.field_f = param0;
                    this.field_e = new wt[param0];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= param0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    dupTemp$1 = new wt();
                    var3 = dupTemp$1;
                    this.field_e[var2] = dupTemp$1;
                    var3.field_f = var3;
                    var3.field_j = var3;
                    var2++;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
