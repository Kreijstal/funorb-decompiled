/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    byte field_n;
    byte field_g;
    or field_d;
    static int field_b;
    static int field_l;
    boolean field_c;
    or field_f;
    private byte field_e;
    static String field_j;
    or field_i;
    static String field_m;
    static int field_a;
    static int field_h;
    static String[] field_k;

    public static void a(boolean param0) {
        field_m = null;
        if (param0) {
            return;
        }
        field_k = null;
        field_j = null;
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        mb var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_7_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param1 == -19261) {
              break L0;
            } else {
              field_j = null;
              break L0;
            }
          }
          if (param0 != null) {
            if (!(param0 instanceof byte[])) {
              if (!(param0 instanceof mb)) {
                throw new IllegalArgumentException();
              } else {
                var4 = (mb) param0;
                stackOut_12_0 = var4.a(33);
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            } else {
              var3 = (byte[]) param0;
              if (param2) {
                stackOut_9_0 = jj.a(var3, (byte) 91);
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_7_0 = (byte[]) var3;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          } else {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("or.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String b(byte param0) {
        int var2 = 0;
        if (param0 >= 108) {
          var2 = ((or) this).field_n;
          if (var2 != 0) {
            if (var2 != 1) {
              if (2 != var2) {
                if (var2 != 3) {
                  if (var2 != 4) {
                    if (var2 == 5) {
                      return "pocket " + ((or) this).field_e;
                    } else {
                      return "invalid";
                    }
                  } else {
                    return "point " + ((or) this).field_e;
                  }
                } else {
                  return "wall " + ((or) this).field_e;
                }
              } else {
                return "ball " + ((or) this).field_e;
              }
            } else {
              return "stop";
            }
          } else {
            return "unresolved";
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0, pq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((or) this).field_n = (byte) 1;
              if (!param0) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("or.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, pq param2) {
        ((or) this).field_n = (byte) 3;
        ((or) this).field_e = (byte)param0;
        ((or) this).field_i = new or((int) ((or) this).field_g, (or) this);
        if (param1 != -26401) {
            return;
        }
        try {
            param2.field_q = ((or) this).field_i;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "or.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(pq[] param0, int param1, int param2) {
        pq var6 = param0[param1];
        pq var4 = var6;
        pq var5 = param0[((or) this).field_g];
        ((or) this).field_i = new or((int) ((or) this).field_g, (or) this);
        if (param2 != -5) {
            return;
        }
        try {
            ((or) this).field_d = new or(param1, (or) this);
            ((or) this).field_e = (byte)param1;
            ((or) this).field_n = (byte) 2;
            if (var6.field_q != null) {
                if (var6.field_q.field_n == 0) {
                    var6.field_q.field_e = ((or) this).field_g;
                    var6.field_q.field_n = (byte) 2;
                    var6.field_q.field_d = ((or) this).field_i;
                }
            }
            var5.field_q = ((or) this).field_i;
            var4.field_q = ((or) this).field_d;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "or.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(pq param0, int param1, byte param2) {
        ((or) this).field_e = (byte)param1;
        ((or) this).field_n = (byte) 4;
        ((or) this).field_i = new or((int) ((or) this).field_g, (or) this);
        if (param2 != 5) {
            return;
        }
        try {
            param0.field_q = ((or) this).field_i;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "or.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param1;
            stackOut_0_0 = oj.field_y.equals((Object) (Object) hq.a(73, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("or.J(").append(3).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (0 == ((or) this).field_g) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (((or) this).field_i != null) {
            var2 = var2 + ((or) this).field_i.a((byte) 2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((or) this).field_d != null) {
            var2 = var2 + ((or) this).field_d.a((byte) 2);
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 != 2) {
          or.a(true);
          return var2;
        } else {
          return var2;
        }
    }

    final boolean a(int param0, bf[] param1) {
        bf var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -5877) {
                break L1;
              } else {
                int discarded$2 = ((or) this).a((byte) -36);
                break L1;
              }
            }
            if (3 != ((or) this).field_n) {
              if (((or) this).field_n == 4) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
              }
            } else {
              L2: {
                L3: {
                  var3 = param1[((or) this).field_e];
                  if (1 == var3.field_b) {
                    break L3;
                  } else {
                    if (var3.field_d != 1) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("or.L(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void c(byte param0) {
        String var2 = null;
        if (!(null == nl.field_d)) {
            var2 = nl.field_d;
            String var1 = var2;
            pn.a((byte) 75, nr.a(new String[1], -1, lf.field_e));
            nl.field_d = null;
        }
    }

    final void a(int param0, pq param1, int param2) {
        try {
            if (param0 != 23655) {
                Object var5 = null;
                ((or) this).a((pq) null, 49, (byte) -122);
            }
            ((or) this).field_n = (byte) 5;
            ((or) this).field_e = (byte)param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "or.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    or(int param0, or param1) {
        ((or) this).field_d = null;
        ((or) this).field_c = false;
        ((or) this).field_n = (byte) 0;
        ((or) this).field_e = (byte) 0;
        ((or) this).field_i = null;
        try {
            ((or) this).field_g = (byte)param0;
            ((or) this).field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "or.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Accept invitation to <%0>'s game";
        field_j = "Searching for an opponent";
        field_k = new String[]{"<col=ffffff>Cue ball</col>", "<col=ffff99>1 One</col>", "<col=9999ff>2 Two</col>", "<col=ff9999>3 Three</col>", "<col=cc99ff>4 Four</col>", "<col=ffcc99>5 Five</col>", "<col=99ff99>6 Six</col>", "<col=cc9966>7 Seven</col>", "<col=999999>8 Eight</col>", "<col=ffff99>9 Nine!</col>"};
    }
}
