/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c implements Iterator {
    private ce field_h;
    static String field_b;
    private uf field_g;
    static String field_c;
    private uf field_e;
    static String field_i;
    private int field_f;
    static String field_d;
    static char[] field_a;

    final static void a(byte param0, ci param1, int param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var12 = param1.field_z;
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var3_array = var9;
            var4 = 0;
            var5 = -1 + param1.field_t;
            L1: while (true) {
              if (var5 < 0) {
                var4 = 0;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= param1.field_t) {
                    var4 = 0;
                    var5 = -1 + param1.field_t;
                    L3: while (true) {
                      if (var5 < 0) {
                        L4: {
                          if (param0 == -86) {
                            break L4;
                          } else {
                            var8 = null;
                            c.a((byte) 118, (java.applet.Applet) null);
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        var6 = param1.field_r - 1;
                        L5: while (true) {
                          if (0 > var6) {
                            var5--;
                            continue L3;
                          } else {
                            L6: {
                              if (var12[var4] != 1) {
                                var4++;
                                break L6;
                              } else {
                                int incrementValue$2 = var4;
                                var4++;
                                var3_array[incrementValue$2] = param2;
                                break L6;
                              }
                            }
                            var6--;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var6 = 0;
                    L7: while (true) {
                      if (param1.field_r <= var6) {
                        var5++;
                        continue L2;
                      } else {
                        L8: {
                          if (var12[var4] == 0) {
                            L9: {
                              if (0 >= var6) {
                                break L9;
                              } else {
                                if (var3_array[-1 + var4] <= 1) {
                                  break L9;
                                } else {
                                  var12[var4] = 1;
                                  break L8;
                                }
                              }
                            }
                            L10: {
                              if (var5 <= 0) {
                                break L10;
                              } else {
                                if (var3_array[-param1.field_r + var4] <= 1) {
                                  break L10;
                                } else {
                                  var12[var4] = 1;
                                  break L8;
                                }
                              }
                            }
                            L11: {
                              if (param1.field_r - 1 <= var6) {
                                break L11;
                              } else {
                                if (var3_array[var4 + 1] <= 1) {
                                  break L11;
                                } else {
                                  var12[var4] = 1;
                                  break L8;
                                }
                              }
                            }
                            L12: {
                              if (param1.field_t - 1 <= var5) {
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var4++;
                            var6++;
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                        var4++;
                        var6++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var6 = param1.field_r + -1;
                L13: while (true) {
                  if (0 > var6) {
                    var5--;
                    continue L1;
                  } else {
                    L14: {
                      if (1 == var12[var4]) {
                        int incrementValue$3 = var4;
                        var4++;
                        var3_array[incrementValue$3] = 2;
                        break L14;
                      } else {
                        var4++;
                        break L14;
                      }
                    }
                    var6--;
                    continue L13;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("c.C(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L15;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L15;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_i = null;
        field_d = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Terraphoenix.field_V;
        if (((c) this).field_e != ((c) this).field_h.field_a[-1 + ((c) this).field_f]) {
          return true;
        } else {
          L0: while (true) {
            if (((c) this).field_h.field_c <= ((c) this).field_f) {
              return false;
            } else {
              int fieldTemp$8 = ((c) this).field_f;
              ((c) this).field_f = ((c) this).field_f + 1;
              if (((c) this).field_h.field_a[fieldTemp$8].field_d != ((c) this).field_h.field_a[((c) this).field_f - 1]) {
                ((c) this).field_e = ((c) this).field_h.field_a[-1 + ((c) this).field_f].field_d;
                return true;
              } else {
                ((c) this).field_e = ((c) this).field_h.field_a[((c) this).field_f - 1];
                continue L0;
              }
            }
          }
        }
    }

    public final void remove() {
        if (!(((c) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((c) this).field_g.b((byte) 12);
        ((c) this).field_g = null;
    }

    public final Object next() {
        uf var1 = null;
        int var2 = Terraphoenix.field_V;
        if (!(((c) this).field_h.field_a[-1 + ((c) this).field_f] == ((c) this).field_e)) {
            var1 = ((c) this).field_e;
            ((c) this).field_g = var1;
            ((c) this).field_e = var1.field_d;
            return (Object) (Object) var1;
        }
        do {
            if (((c) this).field_f >= ((c) this).field_h.field_c) {
                return null;
            }
            int fieldTemp$0 = ((c) this).field_f;
            ((c) this).field_f = ((c) this).field_f + 1;
            var1 = ((c) this).field_h.field_a[fieldTemp$0].field_d;
        } while (((c) this).field_h.field_a[((c) this).field_f - 1] == var1);
        ((c) this).field_g = var1;
        ((c) this).field_e = var1.field_d;
        return (Object) (Object) var1;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  if (param0 == -110) {
                    var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(bb.a((byte) 126, var2, param1), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("c.D(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        ((c) this).field_e = ((c) this).field_h.field_a[0].field_d;
        ((c) this).field_f = 1;
        ((c) this).field_g = null;
    }

    c(ce param0) {
        ((c) this).field_g = null;
        try {
            ((c) this).field_h = param0;
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "c.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -60) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (20 > uh.field_H) {
              break L2;
            } else {
              if (!wf.a(31996)) {
                break L2;
              } else {
                L3: {
                  if (0 >= db.field_b) {
                    break L3;
                  } else {
                    if (mi.a((byte) -95)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "6000pts";
        field_b = "Build ";
        field_d = "Options Menu";
        field_a = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
