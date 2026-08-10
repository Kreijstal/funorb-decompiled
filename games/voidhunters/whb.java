/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class whb implements ntb {
    static dja field_c;
    ub field_b;
    static String field_d;
    static int field_a;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 > -110) {
            field_c = (dja) null;
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_9_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        whb var6 = null;
        try {
          L0: {
            L1: {
              var6 = (whb) ((Object) param0);
              if (param1 < -19) {
                break L1;
              } else {
                var5 = (tv) null;
                this.a((tv) null, 37);
                break L1;
              }
            }
            L2: {
              if (null == this.field_b) {
                break L2;
              } else {
                if (null == var6.field_b) {
                  break L2;
                } else {
                  if (this.field_b.getClass() != var6.field_b.getClass()) {
                    break L2;
                  } else {
                    this.field_b.a(var6.field_b, -110);
                    break L2;
                  }
                }
              }
            }
            L3: {
              var4 = 0;
              if (var6.field_b != null) {
                stackIn_9_0 = 0;
                break L3;
              } else {
                stackIn_9_0 = 1;
                break L3;
              }
            }
            L4: {


              if (null != this.field_b) {

                stackIn_12_1 = 0;
                break L4;
              } else {

                stackIn_12_1 = 1;
                break L4;
              }
            }
            L5: {
              L6: {
                if ((stackIn_9_0 ^ stackIn_12_1) != 0) {
                  break L6;
                } else {
                  L7: {
                    if (this.field_b == null) {
                      break L7;
                    } else {
                      if (this.field_b.getClass() != var6.field_b.getClass()) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (this.field_b == null) {
                    break L5;
                  } else {
                    if (!this.field_b.a((byte) -45, var6.field_b)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var4 = 1;
              iva.a(-6940, "DebugSendable response has changed. before=" + var6.field_b + ", now=" + this.field_b);
              break L5;
            }
            if (var4 != 0) {
              tfb.a((byte) -108, "This instance of DebugMessage has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("whb.F(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        whb var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var4 = -88 / ((param0 - 22) / 59);
              var3 = (whb) ((Object) param1);
              if (null != var3.field_b) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (null != this.field_b) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                if ((stackIn_3_0 ^ stackIn_6_1) != 0) {
                  break L4;
                } else {
                  L5: {
                    if (this.field_b == null) {
                      break L5;
                    } else {
                      if (this.field_b.getClass() != var3.field_b.getClass()) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (this.field_b == null) {
                      break L6;
                    } else {
                      if (!this.field_b.a((byte) 93, var3.field_b)) {
                        break L6;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_15_0 = 0;
                  break L3;
                }
              }
              stackIn_15_0 = 1;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("whb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (!param1) {
              break L0;
            } else {
              whb.a(80);
              break L0;
            }
          }
          if (!kv.a(param1, param0)) {
            this.field_b = null;
            return;
          } else {
            if (this.field_b == null) {
              var3_int = param0.i(0, 1);
              if (-1 != (var3_int ^ -1)) {
                if (var3_int != 1) {
                  this.field_b.a(param0, false);
                  return;
                } else {
                  this.field_b = (ub) ((Object) new af());
                  this.field_b.a(param0, false);
                  return;
                }
              } else {
                this.field_b = (ub) ((Object) new mo());
                this.field_b.a(param0, false);
                return;
              }
            } else {
              this.field_b.a(param0, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("whb.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
            return;
        }
        try {
            if (vq.a(param0, -100, this.field_b != null ? true : false)) {
                if (this.field_b.getClass() == mo.class || this.field_b.getClass() == af.class) {
                    param0.a(-632, 0, 1);
                }
                this.field_b.b(param0, -122);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "whb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        int var4 = 0;
        whb var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 > 54) {
              break L0;
            } else {
              field_d = (String) null;
              break L0;
            }
          }
          var5 = (whb) ((Object) param1);
          if (this.field_b == null) {
            var5.field_b = null;
            return;
          } else {
            L1: {
              if (null == var5.field_b) {
                break L1;
              } else {
                if (var5.field_b.getClass() == this.field_b.getClass()) {
                  this.field_b.b((byte) 93, var5.field_b);
                  return;
                } else {
                  break L1;
                }
              }
            }
            if (this.field_b.getClass() == mo.class) {
              var5.field_b = (ub) ((Object) new mo());
              this.field_b.b((byte) 93, var5.field_b);
              return;
            } else {
              if (this.field_b.getClass() != af.class) {
                this.field_b.b((byte) 93, var5.field_b);
                return;
              } else {
                var5.field_b = (ub) ((Object) new af());
                this.field_b.b((byte) 93, var5.field_b);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("whb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_c = (dja) ((Object) new wkb());
        field_d = "Defence";
    }
}
