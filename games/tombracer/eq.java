/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends nv {
    static ola field_n;
    static int field_r;
    private boolean field_u;
    static int[] field_p;
    private boolean field_t;
    private boolean field_q;
    private int field_s;
    private boolean field_o;

    final void a(int param0, boolean param1) {
        this.field_t = param1 ? true : false;
        if (param0 != -28592) {
            this.a(-6, 77);
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!fia.field_j.startsWith("win")) {
                    break L1;
                  } else {
                    if (qla.a(param2, -127)) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L2: {
                    L3: {
                      if (param0 == 1) {
                        break L3;
                      } else {
                        field_n = (ola) null;
                        break L3;
                      }
                    }
                    param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  ssa.a("MGR1: " + param2, (byte) 125, (Throwable) null);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("eq.V(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, int param1) {
        this.field_o = param0 ? true : false;
        if (param1 >= -23) {
            pc var4 = (pc) null;
            this.a(33, -58, (pc) null, 39);
        }
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a(param0, param1);
            if (4 > this.b(param0).field_E) {
              param1.h(3, 0);
              param1.a(3, (byte) -12, false);
              this.field_q = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("eq.Q(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void b(byte param0, boolean param1) {
        if (param0 > -53) {
            return;
        }
        this.field_q = param1 ? true : false;
    }

    eq(la param0, boolean param1) {
        super(param0, param1);
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            field_p = (int[]) null;
            return param0;
        }
        return param0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(param6 instanceof ep)) {
                break L1;
              } else {
                if (!this.field_o) {
                  break L1;
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param2 == 1) {
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.a(true);
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("eq.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if (!vpa.a(79)) {
          if (param0 != 0) {
            L0: {
              field_n = (ola) null;
              if (ld.field_e < 2) {
                stackIn_10_0 = 0;
                break L0;
              } else {
                stackIn_10_0 = 1;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if (ld.field_e < 2) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    eq(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            if (-5 >= (param0.field_E ^ -1)) {
                this.field_q = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
            }
            if ((param0.field_E ^ -1) <= -7) {
                this.field_u = 1 == param1.b((byte) 44, 1) ? true : false;
            }
            if (-12 >= (param0.field_E ^ -1)) {
                this.field_t = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
            }
            if (-21 >= (param0.field_E ^ -1)) {
                this.field_o = param1.b((byte) 44, 1) == 1 ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            fsa var3 = (fsa) null;
            this.a(true, (fsa) null);
            return 12;
        }
        return 12;
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_t) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 1) {
                  break L1;
                } else {
                  this.a(true, 49);
                  break L1;
                }
              }
              param2.a(param3, (byte) 47);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("eq.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    public static void b(int param0) {
        field_p = null;
        field_n = null;
        if (param0 != 15602) {
            eq.b(22);
        }
    }

    final void k(int param0) {
        ffa var3;
        if (this.field_q) {
          if (!this.d(8031)) {
            if (param0 != 5418) {
              var3 = (ffa) null;
              this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
              return;
            } else {
              return;
            }
          } else {
            this.m((byte) 19).a(2, (byte) -123, this.field_s);
            if (param0 != 5418) {
              var3 = (ffa) null;
              this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
              return;
            } else {
              return;
            }
          }
        } else {
          if (this.field_u) {
            if (this.d(8031)) {
              this.b(true).r(-36);
              if (param0 != 5418) {
                var3 = (ffa) null;
                this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
                return;
              } else {
                return;
              }
            } else {
              if (param0 != 5418) {
                var3 = (ffa) null;
                this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 == 5418) {
              return;
            } else {
              var3 = (ffa) null;
              this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
              return;
            }
          }
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 56, this.field_q ? 1 : 0, 1);
            param1.a((byte) -125, this.field_u ? 1 : 0, 1);
            param1.a((byte) 69, this.field_t ? 1 : 0, 1);
            param1.a((byte) -125, this.field_o ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        this.field_s = param0;
        if (param1 != -22) {
            ffa var4 = (ffa) null;
            this.a(-37, 114, -50, -103, 24, 15, (ffa) null);
        }
    }

    static {
        field_p = new int[8192];
        field_r = -1;
    }
}
