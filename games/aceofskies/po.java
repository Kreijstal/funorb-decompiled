/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class po extends ka {
    private am field_f;
    private int field_g;
    private am field_b;
    private am field_k;
    static pa[] field_e;
    private int field_d;
    private am field_c;
    static int field_h;
    static int field_j;
    private ms field_i;

    final static void a(fp param0) {
        dl var3 = null;
        try {
            var3 = q.field_p;
            var3.g(127, 2);
            var3.b(-1336879960, param0.field_f);
            var3.a(param0.field_e, 23385);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "po.F(" + (param0 != null ? "{...}" : "null") + ',' + 115 + ',' + 2 + ')');
        }
    }

    final static rh a(int param0, int param1, al param2) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3 = jo.a(param2, param0, (byte) -44);
            var3.field_g.d(-1);
            stackOut_2_0 = (rh) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("po.A(").append(param0).append(',').append(0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              po.c(126);
              break L0;
            }
          }
          var3 = ls.a(param1, param2, (byte) 21);
          if (var3 == null) {
            var4 = 0;
            L1: while (true) {
              if (param1.length() > var4) {
                if (cg.a(param1.charAt(var4), (byte) 118)) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_10_0 = wi.field_b;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_4_0 = (String) var3;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("po.D(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0) {
        try {
            int var2_int = 0;
            RuntimeException var2 = null;
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              var2_int = 0;
              try {
                L0: {
                  var3 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                  param0.getAppletContext().showDocument(jf.a(param0, var3, -53), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2;
                stackOut_5_1 = new StringBuilder().append("po.C(");
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L1;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L1;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -104 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        Object var3 = null;
        if (null == ((po) this).field_c) {
          L0: {
            if (null != ((po) this).field_b) {
              ((po) this).field_b.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != ((po) this).field_k) {
              ((po) this).field_k.a(true);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (null != ((po) this).field_f) {
              ((po) this).field_f.a(true);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 != 0) {
            L3: {
              var3 = null;
              String discarded$2 = po.a(-108, (CharSequence) null, true);
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          L5: {
            ((po) this).field_c.a(true);
            if (null != ((po) this).field_b) {
              ((po) this).field_b.a(true);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != ((po) this).field_k) {
              ((po) this).field_k.a(true);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (null != ((po) this).field_f) {
              ((po) this).field_f.a(true);
              break L7;
            } else {
              break L7;
            }
          }
          if (param0 == 0) {
            L8: {
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L8;
              } else {
                break L8;
              }
            }
            return;
          } else {
            L9: {
              var3 = null;
              String discarded$3 = po.a(-108, (CharSequence) null, true);
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L9;
              } else {
                break L9;
              }
            }
            return;
          }
        }
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != -30534) {
            field_h = 87;
        }
    }

    po(bf param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ((po) this).field_d = param2;
                ((po) this).field_g = param1;
                if (param3) {
                  break L2;
                } else {
                  if (!tt.a(((po) this).field_g, true, ((po) this).field_d)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((po) this).field_c = new am(cu.a((byte) 117, ((po) this).field_g, ((po) this).field_d));
              break L1;
            }
            L3: {
              L4: {
                if (param3) {
                  break L4;
                } else {
                  if (!ta.a(((po) this).field_g, ((po) this).field_d, (byte) 91)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((po) this).field_b = new am(av.a(22847, ((po) this).field_d, ((po) this).field_g));
              break L3;
            }
            L5: {
              L6: {
                if (param3) {
                  break L6;
                } else {
                  if (!si.a(((po) this).field_d, 2, ((po) this).field_g)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ((po) this).field_k = new am(hi.c(14834, ((po) this).field_g, ((po) this).field_d));
              break L5;
            }
            L7: {
              L8: {
                if (param3) {
                  break L8;
                } else {
                  if (!ga.a(0, ((po) this).field_d, ((po) this).field_g)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              ((po) this).field_f = new am(ln.a(17, ((po) this).field_g, ((po) this).field_d));
              break L7;
            }
            L9: {
              if (param3) {
                break L9;
              } else {
                if (!la.a(((po) this).field_d, ((po) this).field_g, (byte) 21)) {
                  break L0;
                } else {
                  break L9;
                }
              }
            }
            ((po) this).field_i = new ms(hs.a(true, ((po) this).field_g, ((po) this).field_d));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("po.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L10;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
