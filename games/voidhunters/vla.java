/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
            var3 = ((vla) this).field_y;
            var4 = param1;
            var3.a(false, param0 ^ 9, var4);
            ((vla) this).field_G.e(82);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vla.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 11) {
              L1: {
                if (((vla) this).field_x != param3) {
                  if (param3 == ((vla) this).field_z) {
                    int discarded$206 = 70;
                    kga.a();
                    break L1;
                  } else {
                    if (param3 != ((vla) this).field_A) {
                      break L1;
                    } else {
                      if (!((vla) this).field_B) {
                        if (!((vla) this).field_w) {
                          vsb.e(-24248);
                          break L1;
                        } else {
                          to.e((byte) -91);
                          break L1;
                        }
                      } else {
                        int discarded$207 = 127;
                        qj.a();
                        break L1;
                      }
                    }
                  }
                } else {
                  this.d(-1);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("vla.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 41);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(((vla) this).field_v == null)) {
            int discarded$0 = loa.field_o.a(((vla) this).field_v, ((vla) this).field_g + (param0 - -20), 15 + (param3 + ((vla) this).field_r), -40 + ((vla) this).field_h, ((vla) this).field_f, 16777215, -1, 1, 0, loa.field_o.field_k);
        }
        if (!(((vla) this).field_z == null)) {
            dma.h(param0 + 10, param3 + 134, -20 + ((vla) this).field_h, 4210752);
        }
        super.b(param0, param1, 58, param3);
        if (param2 < 47) {
            Object var6 = null;
            ((vla) this).a((uf) null, (byte) 79);
        }
    }

    final void i(byte param0) {
        ((vla) this).field_y.e(82);
        if (param0 != -29) {
            ((vla) this).field_x = null;
        }
        ((vla) this).field_G.e(82);
    }

    private final void d(int param0) {
        Object var3 = null;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            var3 = null;
            ((vla) this).a((uf) null, (byte) -20);
            break L0;
          }
        }
        L1: {
          L2: {
            int discarded$6 = -21;
            if (tj.f()) {
              break L2;
            } else {
              if (((vla) this).field_y.field_j.length() <= 0) {
                break L1;
              } else {
                if (((vla) this).field_G.field_j.length() > 0) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          cda.a(-41, ((vla) this).field_G.field_j, ((vla) this).field_y.field_j);
          break L1;
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((vla) this).a(true, param2);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((vla) this).a(param2, 0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("vla.N(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final String a(int param0) {
        if (!(null != ((vla) this).field_y.field_j)) {
            return "";
        }
        if (param0 != 30) {
            return null;
        }
        return ((vla) this).field_y.field_j;
    }

    vla(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (wwa) null);
        RuntimeException var6 = null;
        vva var6_ref = null;
        no var7 = null;
        String var8 = null;
        khb var9 = null;
        sca var12 = null;
        sca var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        htb stackIn_16_1 = null;
        htb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        htb stackIn_17_1 = null;
        htb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        htb stackIn_18_1 = null;
        htb stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        htb stackOut_15_1 = null;
        htb stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        htb stackOut_17_1 = null;
        htb stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        htb stackOut_16_1 = null;
        htb stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((vla) this).field_w = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((vla) this).field_F = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((vla) this).field_B = stackIn_10_1 != 0;
              ((vla) this).field_v = param1;
              if (!((vla) this).field_B) {
                break L4;
              } else {
                L5: {
                  if (((vla) this).field_F) {
                    break L5;
                  } else {
                    if (!((vla) this).field_w) {
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
              ((vla) this).field_y = (uf) (Object) new tga(param0, (sba) this, 100);
              ((vla) this).field_G = (uf) (Object) new tga("", (sba) this, 20);
              if (((vla) this).field_B) {
                ((vla) this).field_x = new htb(kj.field_p, (sba) null);
                ((vla) this).field_A = new htb(vda.field_q, (sba) null);
                ((vla) this).field_y.field_x = false;
                break L6;
              } else {
                L7: {
                  ((vla) this).field_x = new htb(jmb.field_s, (sba) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (((vla) this).field_w) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = cjb.field_a;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = vab.field_a;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((vla) this).field_A = new htb(stackIn_18_3, (sba) null);
                if (!((vla) this).field_F) {
                  break L6;
                } else {
                  ((vla) this).field_z = new htb(gqb.field_b, (sba) this);
                  break L6;
                }
              }
            }
            L8: {
              ((vla) this).field_y.field_q = (wwa) (Object) new io(10000536);
              ((vla) this).field_G.field_q = (wwa) (Object) new kpb(10000536);
              var6_ref = new vva();
              ((vla) this).field_x.field_q = (wwa) (Object) var6_ref;
              if (null == ((vla) this).field_A) {
                break L8;
              } else {
                ((vla) this).field_A.field_q = (wwa) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((vla) this).field_y.field_p = sja.field_j;
              if (((vla) this).field_z == null) {
                break L9;
              } else {
                ((vla) this).field_z.field_q = (wwa) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (((vla) this).field_z == null) {
                break L10;
              } else {
                ((vla) this).field_z.field_p = tt.field_a;
                break L10;
              }
            }
            L11: {
              if (((vla) this).field_B) {
                ((vla) this).field_A.field_p = ewa.field_o;
                break L11;
              } else {
                if (!((vla) this).field_w) {
                  ((vla) this).field_A.field_q = (wwa) (Object) new meb();
                  break L11;
                } else {
                  ((vla) this).field_A.field_p = dqa.field_u;
                  ((vla) this).field_A.field_q = (wwa) (Object) new meb();
                  break L11;
                }
              }
            }
            L12: {
              ((vla) this).field_r = 15;
              var7 = loa.field_o;
              if (null == ((vla) this).field_v) {
                break L12;
              } else {
                ((vla) this).field_r = ((vla) this).field_r + (var7.b(((vla) this).field_v, ((vla) this).field_h + -40, var7.field_k) + 5);
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
              sca dupTemp$2 = new sca(10, ((vla) this).field_r, ((vla) this).field_h + -20, 25, (shb) (Object) ((vla) this).field_y, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((vla) this).b(-18756, (shb) (Object) dupTemp$2);
              ((vla) this).field_r = ((vla) this).field_r + (((shb) (Object) var12).field_f - -5);
              sca dupTemp$3 = new sca(10, ((vla) this).field_r, -20 + ((vla) this).field_h, 25, (shb) (Object) ((vla) this).field_G, false, 80, 3, var7, 16777215, dpa.field_q);
              var13 = dupTemp$3;
              ((vla) this).b(-18756, (shb) (Object) dupTemp$3);
              ((vla) this).field_r = ((vla) this).field_r + (((shb) (Object) var13).field_f - -5);
              ((vla) this).field_x.field_l = (sba) this;
              if (((vla) this).field_z == null) {
                break L14;
              } else {
                ((vla) this).field_z.field_l = (sba) this;
                break L14;
              }
            }
            L15: {
              if (((vla) this).field_A == null) {
                break L15;
              } else {
                ((vla) this).field_A.field_l = (sba) this;
                break L15;
              }
            }
            L16: {
              if (null == ((vla) this).field_z) {
                ((vla) this).field_x.a(8, ((vla) this).field_h - 16, 30, 1, ((vla) this).field_r);
                ((vla) this).field_r = ((vla) this).field_r + 35;
                break L16;
              } else {
                ((vla) this).field_x.a(85, ((vla) this).field_h - 95, 30, 1, ((vla) this).field_r);
                ((vla) this).field_r = ((vla) this).field_r + 60;
                break L16;
              }
            }
            L17: {
              if (null == ((vla) this).field_z) {
                break L17;
              } else {
                ((vla) this).field_z.a(8, -16 + ((vla) this).field_h, 30, 1, ((vla) this).field_r);
                ((vla) this).field_r = ((vla) this).field_r + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((vla) this).field_A) {
                break L18;
              } else {
                L19: {
                  if (((vla) this).field_B) {
                    break L19;
                  } else {
                    if (!((vla) this).field_w) {
                      ((vla) this).field_A.a(8, 40, 20, 1, ((vla) this).field_r);
                      ((vla) this).field_r = ((vla) this).field_r + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((vla) this).field_A.a(8, -10 + (-6 + ((vla) this).field_h), 30, 1, ((vla) this).field_r);
                ((vla) this).field_r = ((vla) this).field_r + 35;
                break L18;
              }
            }
            L20: {
              ((vla) this).a(0, ((vla) this).field_h, 3 + ((vla) this).field_r, 1, 0);
              ((vla) this).b(-18756, (shb) (Object) ((vla) this).field_x);
              if (((vla) this).field_z == null) {
                break L20;
              } else {
                ((vla) this).b(-18756, (shb) (Object) ((vla) this).field_z);
                break L20;
              }
            }
            L21: {
              if (null == ((vla) this).field_A) {
                break L21;
              } else {
                ((vla) this).b(-18756, (shb) (Object) ((vla) this).field_A);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("vla.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = aea.a(-125, param1.charAt(var4)) + (-var3 + (var3 << 5));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("vla.D(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    public final void a(uf param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vla.L(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public final void a(int param0, uf param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -12409) {
                break L1;
              } else {
                var4 = null;
                int discarded$6 = vla.a((byte) -119, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (param1 != ((vla) this).field_y) {
                break L2;
              } else {
                boolean discarded$7 = ((vla) this).field_G.a(param0 ^ -12409, (shb) this);
                break L2;
              }
            }
            L3: {
              if (param1 == ((vla) this).field_G) {
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vla.I(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Hull block";
    }
}
