/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends dqa {
    static no field_x;
    private int field_w;
    static int field_A;
    static String field_y;
    boolean field_z;
    ida field_v;

    private final int c(boolean param0) {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (!((bl) this).field_z) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if ((Object) (Object) ((bl) this).field_v.g(0) == this) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    final shb g(byte param0) {
        shb var2 = super.g((byte) -123);
        if (param0 > -3) {
            return null;
        }
        if (var2 != null) {
            return var2;
        }
        return (shb) this;
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param0 == 248) {
          L0: {
            var2 = this.c(false);
            var3 = var2 - ((bl) this).field_w;
            if (0 < var3) {
              ((bl) this).field_w = ((bl) this).field_w + (-1 + var3 - -8) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (var3 >= 0) {
            L1: {
              L2: {
                if (((bl) this).field_w != 0) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((bl) this).field_z) {
                      break L2;
                    } else {
                      stackOut_34_0 = 1;
                      stackIn_36_0 = stackOut_34_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_35_0 = 0;
              stackIn_36_0 = stackOut_35_0;
              break L1;
            }
            return stackIn_36_0 != 0;
          } else {
            L3: {
              L4: {
                ((bl) this).field_w = ((bl) this).field_w + (1 + (var3 + -16)) / 16;
                if (((bl) this).field_w != 0) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (((bl) this).field_z) {
                      break L4;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L3;
            }
            return stackIn_30_0 != 0;
          }
        } else {
          L5: {
            bl.d(true);
            var2 = this.c(false);
            var3 = var2 - ((bl) this).field_w;
            if (0 < var3) {
              ((bl) this).field_w = ((bl) this).field_w + (-1 + var3 - -8) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if (var3 < 0) {
            ((bl) this).field_w = ((bl) this).field_w + (1 + (var3 + -16)) / 16;
            if (((bl) this).field_w == 0) {
              if (var2 == 0) {
                L6: {
                  if (((bl) this).field_z) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L6;
                  }
                }
                return stackIn_20_0 != 0;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (((bl) this).field_w == 0) {
              if (var2 == 0) {
                L7: {
                  if (((bl) this).field_z) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L7;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L7;
                  }
                }
                return stackIn_12_0 != 0;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (((bl) this).field_w != 0) {
          if (((bl) this).field_w >= 256) {
            if (param1 != 0) {
              return;
            } else {
              ((bl) this).b(param3 - -((bl) this).field_r, 1630174241, param0 + ((bl) this).field_g);
              super.b(param0, param1, 101, param3);
              return;
            }
          } else {
            if (null != vib.field_b) {
              if (vib.field_b.field_q >= ((bl) this).field_h) {
                if (((bl) this).field_f <= vib.field_b.field_p) {
                  de.a(111, vib.field_b);
                  dma.a();
                  ((bl) this).b(0, 1630174241, 0);
                  super.b(-param0 + -((bl) this).field_g, param1, 127, -((bl) this).field_r + -param3);
                  if (param2 <= 47) {
                    boolean discarded$4 = ((bl) this).j((byte) 123);
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                    return;
                  } else {
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                    return;
                  }
                } else {
                  vib.field_b = new phb(((bl) this).field_h, ((bl) this).field_f);
                  de.a(111, vib.field_b);
                  dma.a();
                  ((bl) this).b(0, 1630174241, 0);
                  super.b(-param0 + -((bl) this).field_g, param1, 127, -((bl) this).field_r + -param3);
                  if (param2 <= 47) {
                    boolean discarded$5 = ((bl) this).j((byte) 123);
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                    return;
                  } else {
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                    return;
                  }
                }
              } else {
                vib.field_b = new phb(((bl) this).field_h, ((bl) this).field_f);
                de.a(111, vib.field_b);
                dma.a();
                ((bl) this).b(0, 1630174241, 0);
                super.b(-param0 + -((bl) this).field_g, param1, 127, -((bl) this).field_r + -param3);
                if (param2 <= 47) {
                  boolean discarded$6 = ((bl) this).j((byte) 123);
                  bia.a((byte) 124);
                  vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                  return;
                } else {
                  bia.a((byte) 124);
                  vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                  return;
                }
              }
            } else {
              vib.field_b = new phb(((bl) this).field_h, ((bl) this).field_f);
              de.a(111, vib.field_b);
              dma.a();
              ((bl) this).b(0, 1630174241, 0);
              super.b(-param0 + -((bl) this).field_g, param1, 127, -((bl) this).field_r + -param3);
              if (param2 <= 47) {
                boolean discarded$7 = ((bl) this).j((byte) 123);
                bia.a((byte) 124);
                vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                return;
              } else {
                bia.a((byte) 124);
                vib.field_b.d(param0 - -((bl) this).field_g, ((bl) this).field_r + param3, ((bl) this).field_w);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean j(byte param0) {
        ((bl) this).field_w = this.c(false);
        if (param0 == 55) {
          if (0 == ((bl) this).field_w) {
            if (((bl) this).field_z) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    abstract void b(int param0, int param1, int param2);

    final void c(int param0, int param1, int param2) {
        ((bl) this).a(-param0 + fob.field_a >> 1, param0, param2, 1, vi.field_p + -param2 >> 1);
        if (param1 != -1860440319) {
            ((bl) this).field_z = false;
        }
    }

    public static void i(byte param0) {
        field_y = null;
        if (param0 != -17) {
            bl.d(false);
            field_x = null;
            return;
        }
        field_x = null;
    }

    final static void d(boolean param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = rua.field_q;
              var1 = var5;
              if (!param0) {
                break L1;
              } else {
                bl.i((byte) 60);
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
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
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1_ref, "bl.EA(" + param0 + ')');
        }
    }

    bl(ida param0, int param1, int param2) {
        super(fob.field_a + -param1 >> 1, -param2 + vi.field_p >> 1, param1, param2, (wwa) null);
        try {
            ((bl) this).field_w = 0;
            ((bl) this).field_v = param0;
            ((bl) this).field_z = false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Change team of clicked ship";
    }
}
