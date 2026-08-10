/*
 * Decompiled by CFR-JS 0.4.0.
 */
class im extends bd {
    static int field_g;
    static String field_i;
    static String field_f;
    private String field_e;
    private long field_h;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                  var3 = 13 % ((param0 - -29) / 56);
                  param1.getAppletContext().showDocument(nm.a(param1, var2, -31843), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("im.Q(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static na a(int param0, byte param1) {
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        if (param1 >= -28) {
          L0: {
            field_i = (String) null;
            if (null != nk.field_q) {
              stackIn_8_0 = nk.field_q.a((long)param0, (byte) -102);
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return (na) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null != nk.field_q) {
              stackIn_4_0 = nk.field_q.a((long)param0, (byte) -102);
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return (na) ((Object) stackIn_4_0);
        }
    }

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
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = jb.field_s;
              var1 = var5;
              if (param0 == -24000) {
                break L1;
              } else {
                field_i = (String) null;
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
          throw aa.a((Throwable) ((Object) var1_ref), "im.P(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        int fieldTemp$2 = 0;
        int var1_int = 0;
        ab var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = -117 / ((param0 - 89) / 35);
            var2 = he.field_e;
            L1: while (true) {
              if (!bl.d(0)) {
                break L0;
              } else {
                var2.b((byte) -66, 8);
                fieldTemp$2 = var2.field_g + 1;
                var2.field_g = var2.field_g + 1;
                var3 = fieldTemp$2;
                ho.a(-5534, var2);
                he.field_e.b(var2.field_g + -var3, (byte) 43);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "im.O(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
            ff.a(false, param2, (byte) -97, param0);
            if (param1 != 0) {
                im.a((byte) -12);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "im.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ch a(int param0) {
        if (param0 != 0) {
            field_i = (String) null;
            return hk.field_m;
        }
        return hk.field_m;
    }

    final static wa a(int param0, String param1) {
        String var2 = null;
        wa var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        wa stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (null != ie.field_Qb) {
              if (param1 != null) {
                if (0 != param1.length()) {
                  L1: {
                    var6 = (CharSequence) ((Object) param1);
                    var2 = gk.a(var6, -13);
                    if (param0 == 0) {
                      break L1;
                    } else {
                      im.a((byte) 70);
                      break L1;
                    }
                  }
                  if (var2 != null) {
                    var3 = (wa) ((Object) ie.field_Qb.a((long)var2.hashCode(), (byte) -72));
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_Cb);
                        var4 = gk.a(var7, -13);
                        if (!var4.equals(var2)) {
                          var3 = (wa) ((Object) ie.field_Qb.d(-107));
                          continue L2;
                        } else {
                          stackIn_18_0 = (wa) (var3);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_12_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_7_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("im.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wa) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wa) ((Object) stackIn_12_0);
          } else {
            return stackIn_18_0;
          }
        }
    }

    final void a(wk param0, int param1) {
        try {
            param0.a(this.field_h, (byte) 109);
            int var3_int = 116 / ((-35 - param1) / 36);
            param0.a((byte) 7, this.field_e);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "im.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, gh param1, dl param2, java.awt.Component param3, int param4, boolean param5) {
        try {
            if (param4 != -22836) {
                field_f = (String) null;
            }
            sm.a(param4 ^ 22876, param5, param0, param1, param3, 1024, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "im.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static nc a(eg param0, int param1, eg param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        nc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (fc.a(50, param0, param4, param1)) {
              L1: {
                if (param3 >= 44) {
                  break L1;
                } else {
                  field_i = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = mi.a(param2.b(param1, 26219, param4), 45);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("im.N(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nc) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    im(long param0, String param1) {
        try {
            this.field_e = param1;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "im.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        String var2;
        field_f = null;
        if (param0 != -14) {
          var2 = (String) null;
          im.a((String) null, -94, (String) null);
          field_i = null;
          return;
        } else {
          field_i = null;
          return;
        }
    }

    static {
        field_g = 65;
        field_i = "Turn time remaining: <%0><br><br>It is currently your turn and time is ticking down.<br><br>If you don't move soon you will miss your go!";
        field_f = "OK";
    }
}
