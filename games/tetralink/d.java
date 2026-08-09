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
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = TetraLink.field_J;
            try {
              L0: {
                if (!kn.field_e) {
                  L1: {
                    if (param0 == -17840) {
                      break L1;
                    } else {
                      field_c = (String[][]) null;
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      var2 = "tuhstatbut";
                      var3 = (String) (ii.a((byte) 122, "getcookies", param1));
                      var4 = hi.a(var3, ';', 783);
                      var5 = 0;
                      L3: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L2;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                              break L4;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                stackIn_12_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackIn_19_0 = 0;
                        break L6;
                      } else {
                        stackIn_19_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref2);

                stackIn_22_1 = new StringBuilder().append("d.M(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean c(byte param0) {
        java.applet.Applet var2;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 > 32) {
          if (null == sj.field_g) {
            if (hi.field_a) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          var2 = (java.applet.Applet) null;
          d.a(114, (java.applet.Applet) null);
          if (null != sj.field_g) {
            return true;
          } else {
            L0: {
              if (!hi.field_a) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final jk c(int param0) {
        if (!(!this.b(13074))) {
            return an.field_a;
        }
        if (param0 > -7) {
            return (jk) null;
        }
        if (!(k.a(0) >= 350L + this.field_d)) {
            return pm.field_b;
        }
        return this.a(false);
    }

    public final void a(int param0) {
        this.field_d = k.a(0);
        if (param0 < 117) {
            d.b((byte) 100);
        }
    }

    public final String a(byte param0) {
        if (!this.b(param0 + 13147)) {
          if (param0 == -73) {
            if (350L + this.field_d > k.a(0)) {
              return null;
            } else {
              return this.e(0);
            }
          } else {
            field_e = -50;
            if (350L + this.field_d > k.a(0)) {
              return null;
            } else {
              return this.e(0);
            }
          }
        } else {
          return null;
        }
    }

    public static void b(byte param0) {
        field_c = (String[][]) null;
        if (param0 != 6) {
          d.d(112);
          field_i = null;
          field_a = null;
          field_g = null;
          field_f = (byte[][]) null;
          return;
        } else {
          field_i = null;
          field_a = null;
          field_g = null;
          field_f = (byte[][]) null;
          return;
        }
    }

    abstract jk a(boolean param0);

    final static void d(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var5 = ug.field_bb;
              var1 = var5;
              if (param0 <= -65) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "d.J(" + param0 + ')');
        }
    }

    abstract String e(int param0);

    static {
        field_g = "Asking to join <%0>'s game...";
        field_f = new byte[1000][];
        field_a = "Close";
        field_e = 0;
        field_c = new String[][]{new String[]{"120", "90", "60", "45", "30", "20", "10"}};
    }
}
