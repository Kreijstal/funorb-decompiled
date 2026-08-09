/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    final static void a(fp param0, byte param1, int param2) {
        dl var3 = null;
        try {
            var3 = q.field_p;
            var3.g(127, param2);
            if (param1 < 19) {
                field_h = -122;
            }
            var3.b(-1336879960, param0.field_f);
            var3.a(param0.field_e, 23385);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "po.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static rh a(int param0, int param1, al param2) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              var3 = jo.a(param2, param0, (byte) -44);
              var3.field_g.d(-1);
              stackIn_4_0 = (rh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (rh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("po.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                po.c(126);
                break L1;
              }
            }
            var3 = ls.a(param1, param2, (byte) 21);
            if (var3 == null) {
              var4 = 0;
              L2: while (true) {
                if (param1.length() > var4) {
                  if (cg.a(param1.charAt(var4), (byte) 118)) {
                    var4++;
                    continue L2;
                  } else {
                    stackIn_11_0 = wi.field_b;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_5_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("po.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            int var2_int = 0;
            RuntimeException var2 = null;
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              var2_int = -51 % ((param1 - -49) / 53);
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
                stackIn_7_0 = (RuntimeException) (var2);

                stackIn_7_1 = new StringBuilder().append("po.C(");

                if (param0 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L1;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L1;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        CharSequence var3;
        if (null == this.field_c) {
          L0: {
            if (null != this.field_b) {
              this.field_b.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != this.field_k) {
              this.field_k.a(true);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (null != this.field_f) {
              this.field_f.a(true);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 != 0) {
            L3: {
              var3 = (CharSequence) null;
              po.a(-108, (CharSequence) null, true);
              if (null != this.field_i) {
                this.field_i.b((byte) 29);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null != this.field_i) {
                this.field_i.b((byte) 29);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          L5: {
            this.field_c.a(true);
            if (null != this.field_b) {
              this.field_b.a(true);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != this.field_k) {
              this.field_k.a(true);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (null != this.field_f) {
              this.field_f.a(true);
              break L7;
            } else {
              break L7;
            }
          }
          if (param0 == 0) {
            L8: {
              if (null != this.field_i) {
                this.field_i.b((byte) 29);
                break L8;
              } else {
                break L8;
              }
            }
            return;
          } else {
            L9: {
              var3 = (CharSequence) null;
              po.a(-108, (CharSequence) null, true);
              if (null != this.field_i) {
                this.field_i.b((byte) 29);
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              L2: {
                this.field_d = param2;
                this.field_g = param1;
                if (param3) {
                  break L2;
                } else {
                  if (!tt.a(this.field_g, true, this.field_d)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_c = new am(cu.a((byte) 117, this.field_g, this.field_d));
              break L1;
            }
            L3: {
              L4: {
                if (param3) {
                  break L4;
                } else {
                  if (!ta.a(this.field_g, this.field_d, (byte) 91)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_b = new am(av.a(22847, this.field_d, this.field_g));
              break L3;
            }
            L5: {
              L6: {
                if (param3) {
                  break L6;
                } else {
                  if (!si.a(this.field_d, 2, this.field_g)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              this.field_k = new am(hi.c(14834, this.field_g, this.field_d));
              break L5;
            }
            L7: {
              L8: {
                if (param3) {
                  break L8;
                } else {
                  if (!ga.a(0, this.field_d, this.field_g)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_f = new am(ln.a(17, this.field_g, this.field_d));
              break L7;
            }
            L9: {
              if (param3) {
                break L9;
              } else {
                if (!la.a(this.field_d, this.field_g, (byte) 21)) {
                  break L0;
                } else {
                  break L9;
                }
              }
            }
            this.field_i = new ms(hs.a(true, this.field_g, this.field_d));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("po.<init>(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L10;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L10;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
