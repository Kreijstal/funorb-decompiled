/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends nv {
    private boolean field_r;
    private boolean field_v;
    private boolean field_t;
    private boolean field_p;
    static String field_n;
    static int[] field_u;
    static String field_q;
    private boolean field_o;
    static String field_s;

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            field_q = (String) null;
            return param0;
        }
        return param0;
    }

    public static void b(int param0) {
        field_n = null;
        field_q = null;
        if (param0 != -2) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    sg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_r = false;
        try {
            this.field_p = 1 != param1.b((byte) 44, 1) ? false : true;
            this.field_t = -2 != (param1.b((byte) 44, 1) ^ -1) ? false : true;
            this.field_v = (param1.b((byte) 44, 1) ^ -1) != -2 ? false : true;
            this.field_o = param1.b((byte) 44, 1) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.equals("I")) {
                stackIn_7_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0.equals("S")) {
                  if (param0.equals("J")) {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("Z")) {
                      if (!param0.equals("F")) {
                        if (param0.equals("D")) {
                          stackIn_24_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L1: {
                            if (param1 == 1) {
                              break L1;
                            } else {
                              sg.b(-10);
                              break L1;
                            }
                          }
                          if (param0.equals("C")) {
                            stackIn_30_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        }
                      } else {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("sg.H(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_30_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void k(int param0) {
        hca var2;
        if (param0 == 5418) {
          if (!this.d(8031)) {
            if (this.field_r) {
              if (!this.field_p) {
                return;
              } else {
                this.c(false);
                return;
              }
            } else {
              return;
            }
          } else {
            L0: {
              this.field_r = true;
              var2 = this.m((byte) 19);
              if (this.field_t) {
                var2.i(true);
                break L0;
              } else {
                break L0;
              }
            }
            if (!this.field_o) {
              if (!this.field_v) {
                return;
              } else {
                var2.n(21120);
                return;
              }
            } else {
              var2.l((byte) 28);
              if (!this.field_v) {
                return;
              } else {
                var2.n(21120);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_v = true;
            return 10;
        }
        return 10;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, this.field_p ? 1 : 0, 1);
            param1.a((byte) -25, !this.field_t ? 0 : 1, 1);
            param1.a((byte) 12, !this.field_v ? 0 : 1, 1);
            param1.a((byte) -125, this.field_o ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "You ran out of time";
        field_q = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_s = "Quick Chat game";
    }
}
