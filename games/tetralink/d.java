/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class d implements vm {
    static int field_j;
    private long field_d;
    static ah field_i;
    static String field_g;
    static byte[][] field_f;
    static int field_h;
    static int field_b;
    static String field_a;
    static int field_e;
    static String[][] field_c;

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = TetraLink.field_J;
            if (!kn.field_e) {
              L0: {
                if (param0 == -17840) {
                  break L0;
                } else {
                  field_c = null;
                  break L0;
                }
              }
              try {
                L1: {
                  var2 = "tuhstatbut";
                  var3 = (String) ii.a((byte) 122, "getcookies", param1);
                  var4 = hi.a(var3, ';', 783);
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      break L1;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (var6 < 0) {
                          break L3;
                        } else {
                          if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (null == param1.getParameter("tuhstatbut")) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L5;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L5;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean c(byte param0) {
        Object var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 > 32) {
          if (null == sj.field_g) {
            if (hi.field_a) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var2 = null;
          boolean discarded$4 = d.a(114, (java.applet.Applet) null);
          if (null != sj.field_g) {
            return true;
          } else {
            L0: {
              if (!hi.field_a) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final jk c(int param0) {
        if (!(!((d) this).b(13074))) {
            return an.field_a;
        }
        if (param0 > -7) {
            return null;
        }
        if (!(k.a(0) >= 350L + ((d) this).field_d)) {
            return pm.field_b;
        }
        return ((d) this).a(false);
    }

    public final void a(int param0) {
        ((d) this).field_d = k.a(0);
        if (param0 < 117) {
            d.b((byte) 100);
        }
    }

    public final String a(byte param0) {
        if (!((d) this).b(param0 + 13147)) {
          if (param0 == -73) {
            if (350L + ((d) this).field_d > k.a(0)) {
              return null;
            } else {
              return ((d) this).e(0);
            }
          } else {
            field_e = -50;
            if (350L + ((d) this).field_d > k.a(0)) {
              return null;
            } else {
              return ((d) this).e(0);
            }
          }
        } else {
          return null;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != 6) {
          d.d(112);
          field_i = null;
          field_a = null;
          field_g = null;
          field_f = null;
          return;
        } else {
          field_i = null;
          field_a = null;
          field_g = null;
          field_f = null;
          return;
        }
    }

    abstract jk a(boolean param0);

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = TetraLink.field_J;
        var7 = ug.field_bb;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 > -65) {
          field_g = null;
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$32 = var2;
              var2++;
              var5[incrementValue$32] = 0;
              int incrementValue$33 = var2;
              var2++;
              var5[incrementValue$33] = 0;
              int incrementValue$34 = var2;
              var2++;
              var5[incrementValue$34] = 0;
              int incrementValue$35 = var2;
              var2++;
              var5[incrementValue$35] = 0;
              int incrementValue$36 = var2;
              var2++;
              var5[incrementValue$36] = 0;
              int incrementValue$37 = var2;
              var2++;
              var5[incrementValue$37] = 0;
              int incrementValue$38 = var2;
              var2++;
              var5[incrementValue$38] = 0;
              int incrementValue$39 = var2;
              var2++;
              var5[incrementValue$39] = 0;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$40 = var2;
              var2++;
              var5[incrementValue$40] = 0;
              int incrementValue$41 = var2;
              var2++;
              var5[incrementValue$41] = 0;
              int incrementValue$42 = var2;
              var2++;
              var5[incrementValue$42] = 0;
              int incrementValue$43 = var2;
              var2++;
              var5[incrementValue$43] = 0;
              int incrementValue$44 = var2;
              var2++;
              var5[incrementValue$44] = 0;
              int incrementValue$45 = var2;
              var2++;
              var5[incrementValue$45] = 0;
              int incrementValue$46 = var2;
              var2++;
              var5[incrementValue$46] = 0;
              int incrementValue$47 = var2;
              var2++;
              var5[incrementValue$47] = 0;
              continue L1;
            }
          }
        }
    }

    abstract String e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Asking to join <%0>'s game...";
        field_f = new byte[1000][];
        field_a = "Close";
        field_e = 0;
        field_c = new String[][]{new String[7]};
    }
}
