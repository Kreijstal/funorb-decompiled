/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends dqa implements en, oo {
    static String field_E;
    private htb field_x;
    private boolean field_B;
    private htb field_A;
    private String field_v;
    private uf field_G;
    private boolean field_F;
    private boolean field_w;
    static String field_C;
    private uf field_y;
    private htb field_z;

    final void a(byte param0, String param1) {
        uf var3 = null;
        String var4 = null;
        if (param0 != 9) {
            return;
        }
        try {
            var3 = this.field_y;
            var4 = param1;
            var3.a(false, param0 ^ 9, var4);
            this.field_G.e(82);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vla.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 11) {
              L1: {
                if (this.field_x != param3) {
                  if (param3 == this.field_z) {
                    kga.a(70);
                    break L1;
                  } else {
                    if (param3 != this.field_A) {
                      break L1;
                    } else {
                      if (!this.field_B) {
                        if (!this.field_w) {
                          vsb.e(-24248);
                          break L1;
                        } else {
                          to.e((byte) -91);
                          break L1;
                        }
                      } else {
                        qj.a((byte) 127);
                        break L1;
                      }
                    }
                  }
                } else {
                  this.d(-1);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("vla.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(this.field_v == null)) {
            loa.field_o.a(this.field_v, this.field_g + (param0 - -20), 15 + (param3 + this.field_r), -40 + this.field_h, this.field_f, 16777215, -1, 1, 0, loa.field_o.field_k);
        }
        if (!(this.field_z == null)) {
            dma.h(param0 + 10, param3 + 134, -20 + this.field_h, 4210752);
        }
        super.b(param0, param1, 58, param3);
        if (param2 < 47) {
            uf var6 = (uf) null;
            this.a((uf) null, (byte) 79);
        }
    }

    final void i(byte param0) {
        this.field_y.e(82);
        if (param0 != -29) {
            this.field_x = (htb) null;
        }
        this.field_G.e(82);
    }

    private final void d(int param0) {
        uf var3;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            var3 = (uf) null;
            this.a((uf) null, (byte) -20);
            break L0;
          }
        }
        L1: {
          L2: {
            if (tj.f((byte) -21)) {
              break L2;
            } else {
              if ((this.field_y.field_j.length() ^ -1) >= -1) {
                break L1;
              } else {
                if (this.field_G.field_j.length() > 0) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          cda.a(-41, this.field_G.field_j, this.field_y.field_j);
          break L1;
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param1 ^ -1)) {
                if (param1 != 99) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(true, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(param2, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("vla.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final String a(int param0) {
        if (!(null != this.field_y.field_j)) {
            return "";
        }
        if (param0 != 30) {
            return (String) null;
        }
        return this.field_y.field_j;
    }

    vla(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (wwa) null);
        sca dupTemp$0 = null;
        sca dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        htb stackIn_17_1 = null;
        htb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        htb stackIn_18_1 = null;
        htb stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        vva var6 = null;
        RuntimeException var6_ref = null;
        no var7 = null;
        String var8 = null;
        khb var9 = null;
        sca var12 = null;
        sca var13 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param4) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((vla) (this)).field_w = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param3) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((vla) (this)).field_F = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param2) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((vla) (this)).field_B = stackIn_10_1 != 0;
              this.field_v = param1;
              if (!this.field_B) {
                break L4;
              } else {
                L5: {
                  if (this.field_F) {
                    break L5;
                  } else {
                    if (!this.field_w) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_y = (uf) ((Object) new tga(param0, (sba) (this), 100));
              this.field_G = (uf) ((Object) new tga("", (sba) (this), 20));
              if (this.field_B) {
                this.field_x = new htb(kj.field_p, (sba) null);
                this.field_A = new htb(vda.field_q, (sba) null);
                this.field_y.field_x = false;
                break L6;
              } else {
                L7: {
                  this.field_x = new htb(jmb.field_s, (sba) null);
                  stackIn_17_0 = this;

                  stackIn_17_1 = null;

                  stackIn_17_2 = null;

                  if (this.field_w) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = cjb.field_a;
                    break L7;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = vab.field_a;
                    break L7;
                  }
                }
                ((vla) (this)).field_A = new htb(stackIn_18_3, (sba) null);
                if (!this.field_F) {
                  break L6;
                } else {
                  this.field_z = new htb(gqb.field_b, (sba) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_y.field_q = (wwa) ((Object) new io(10000536));
              this.field_G.field_q = (wwa) ((Object) new kpb(10000536));
              var6 = new vva();
              this.field_x.field_q = (wwa) ((Object) var6);
              if (null == this.field_A) {
                break L8;
              } else {
                this.field_A.field_q = (wwa) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_y.field_p = sja.field_j;
              if (this.field_z == null) {
                break L9;
              } else {
                this.field_z.field_q = (wwa) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (this.field_z == null) {
                break L10;
              } else {
                this.field_z.field_p = tt.field_a;
                break L10;
              }
            }
            L11: {
              if (this.field_B) {
                this.field_A.field_p = ewa.field_o;
                break L11;
              } else {
                if (!this.field_w) {
                  this.field_A.field_q = (wwa) ((Object) new meb());
                  break L11;
                } else {
                  this.field_A.field_p = dqa.field_u;
                  this.field_A.field_q = (wwa) ((Object) new meb());
                  break L11;
                }
              }
            }
            L12: {
              this.field_r = 15;
              var7 = loa.field_o;
              if (null == this.field_v) {
                break L12;
              } else {
                this.field_r = this.field_r + (var7.b(this.field_v, this.field_h + -40, var7.field_k) + 5);
                break L12;
              }
            }
            L13: {
              var8 = rg.field_a;
              var9 = gib.a(19314, vpa.b((byte) -86));
              if (up.field_o != var9) {
                if (var9 != hha.field_p) {
                  break L13;
                } else {
                  var8 = ula.field_o;
                  break L13;
                }
              } else {
                var8 = fj.field_a;
                break L13;
              }
            }
            L14: {
              dupTemp$0 = new sca(10, this.field_r, this.field_h + -20, 25, this.field_y, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b(-18756, dupTemp$0);
              this.field_r = this.field_r + (((shb) ((Object) var12)).field_f - -5);
              dupTemp$1 = new sca(10, this.field_r, -20 + this.field_h, 25, this.field_G, false, 80, 3, var7, 16777215, dpa.field_q);
              var13 = dupTemp$1;
              this.b(-18756, dupTemp$1);
              this.field_r = this.field_r + (((shb) ((Object) var13)).field_f - -5);
              this.field_x.field_l = (sba) (this);
              if (this.field_z == null) {
                break L14;
              } else {
                this.field_z.field_l = (sba) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_A == null) {
                break L15;
              } else {
                this.field_A.field_l = (sba) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_z) {
                this.field_x.a(8, this.field_h - 16, 30, 1, this.field_r);
                this.field_r = this.field_r + 35;
                break L16;
              } else {
                this.field_x.a(85, this.field_h - 95, 30, 1, this.field_r);
                this.field_r = this.field_r + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_z) {
                break L17;
              } else {
                this.field_z.a(8, -16 + this.field_h, 30, 1, this.field_r);
                this.field_r = this.field_r + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_A) {
                break L18;
              } else {
                L19: {
                  if (this.field_B) {
                    break L19;
                  } else {
                    if (!this.field_w) {
                      this.field_A.a(8, 40, 20, 1, this.field_r);
                      this.field_r = this.field_r + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_A.a(8, -10 + (-6 + this.field_h), 30, 1, this.field_r);
                this.field_r = this.field_r + 35;
                break L18;
              }
            }
            L20: {
              this.a(0, this.field_h, 3 + this.field_r, 1, 0);
              this.b(-18756, this.field_x);
              if (this.field_z == null) {
                break L20;
              } else {
                this.b(-18756, this.field_z);
                break L20;
              }
            }
            L21: {
              if (null == this.field_A) {
                break L21;
              } else {
                this.b(-18756, this.field_A);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("vla.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L22;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L23;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L23;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 3) {
            return;
        }
        field_E = null;
        field_C = null;
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 > 105) {
                break L1;
              } else {
                vla.e(30);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_7_0 = var3;
                break L0;
              } else {
                var3 = aea.a(-125, param1.charAt(var4)) + (-var3 + (var3 << -2095977691));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("vla.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public final void a(uf param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 100) {
                break L1;
              } else {
                this.d(-74);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("vla.L(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void a(int param0, uf param1) {
        CharSequence var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == -12409) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                vla.a((byte) -119, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (param1 != this.field_y) {
                break L2;
              } else {
                this.field_G.a(param0 ^ -12409, (shb) (this));
                break L2;
              }
            }
            L3: {
              if (param1 == this.field_G) {
                this.d(-1);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("vla.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_C = "Hull block";
    }
}
