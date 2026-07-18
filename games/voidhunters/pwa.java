/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pwa implements ntb {
    boolean field_c;
    static String field_a;
    gtb field_f;
    gqa field_e;
    hg field_d;
    static int field_b;

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        pwa var5 = null;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            L1: {
              var5 = (pwa) (Object) param0;
              if (null == var5.field_e) {
                break L1;
              } else {
                if (var5.field_e != null) {
                  var5.field_e.a((tv) (Object) var5.field_e, -63);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var5.field_d == null) {
                break L2;
              } else {
                if (var5.field_d != null) {
                  var5.field_d.a((tv) (Object) var5.field_d, -125);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var5.field_f == null) {
                break L3;
              } else {
                if (var5.field_f == null) {
                  break L3;
                } else {
                  var5.field_f.a((tv) (Object) var5.field_f, -39);
                  break L3;
                }
              }
            }
            var4 = 0;
            gqa discarded$3 = var5.field_e;
            L4: {
              if (null == var5.field_e) {
                break L4;
              } else {
                if (var5.field_e.a((byte) 115, (tv) (Object) var5.field_e)) {
                  iva.a(-6940, "PlayerJoin join has changed. before=" + (Object) (Object) var5.field_e + ", now=" + (Object) (Object) var5.field_e);
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            hg discarded$4 = var5.field_d;
            L5: {
              if (var5.field_d == null) {
                break L5;
              } else {
                if (!var5.field_d.a((byte) -51, (tv) (Object) var5.field_d)) {
                  break L5;
                } else {
                  iva.a(-6940, "PlayerLeave leave has changed. before=" + (Object) (Object) var5.field_d + ", now=" + (Object) (Object) var5.field_d);
                  var4 = 1;
                  break L5;
                }
              }
            }
            gtb discarded$5 = var5.field_f;
            L6: {
              if (var5.field_f == null) {
                break L6;
              } else {
                if (!var5.field_f.a((byte) -121, (tv) (Object) var5.field_f)) {
                  break L6;
                } else {
                  var4 = 1;
                  iva.a(-6940, "PlayerReady ready has changed. before=" + (Object) (Object) var5.field_f + ", now=" + (Object) (Object) var5.field_f);
                  break L6;
                }
              }
            }
            L7: {
              if (var5.field_c) {
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L7;
              } else {
                stackOut_30_0 = 1;
                stackIn_32_0 = stackOut_30_0;
                break L7;
              }
            }
            L8: {
              stackOut_32_0 = stackIn_32_0;
              stackIn_34_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if (var5.field_c) {
                stackOut_34_0 = stackIn_34_0;
                stackOut_34_1 = 0;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                break L8;
              } else {
                stackOut_33_0 = stackIn_33_0;
                stackOut_33_1 = 1;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L8;
              }
            }
            L9: {
              if (stackIn_35_0 == stackIn_35_1) {
                break L9;
              } else {
                iva.a(-6940, "boolean event_cancellation has changed. before=" + var5.field_c + ", now=" + var5.field_c);
                var4 = 1;
                break L9;
              }
            }
            L10: {
              if (var4 != 0) {
                iva.a(-6940, "This instance of CarouselSystemEvent has changed");
                break L10;
              } else {
                break L10;
              }
            }
            if (param1 <= -19) {
              break L0;
            } else {
              ((pwa) this).field_e = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3;
            stackOut_43_1 = new StringBuilder().append("pwa.F(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        faa stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        faa stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        faa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        faa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = (faa) param0;
              stackOut_0_1 = -81;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (((pwa) this).field_e == null) {
                stackOut_2_0 = (faa) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (faa) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 == 0)) {
                break L2;
              } else {
                ((pwa) this).field_e.b(param0, -119);
                break L2;
              }
            }
            L3: {
              stackOut_5_0 = (faa) param0;
              stackOut_5_1 = -59;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (null == ((pwa) this).field_d) {
                stackOut_7_0 = (faa) (Object) stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L3;
              } else {
                stackOut_6_0 = (faa) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L3;
              }
            }
            L4: {
              if (vq.a(stackIn_8_0, stackIn_8_1, stackIn_8_2 == 0)) {
                break L4;
              } else {
                ((pwa) this).field_d.b(param0, -110);
                break L4;
              }
            }
            L5: {
              stackOut_10_0 = (faa) param0;
              stackOut_10_1 = -43;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              if (((pwa) this).field_f == null) {
                stackOut_12_0 = (faa) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                break L5;
              } else {
                stackOut_11_0 = (faa) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                break L5;
              }
            }
            L6: {
              if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
                ((pwa) this).field_f.b(param0, -115);
                break L6;
              } else {
                break L6;
              }
            }
            boolean discarded$10 = vq.a(param0, -107, ((pwa) this).field_c);
            if (param1 < -109) {
              break L0;
            } else {
              String discarded$11 = ((pwa) this).toString();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("pwa.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_a = null;
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        pwa var6 = null;
        pwa var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6 = (pwa) (Object) param1;
              var7 = var6;
              if (null != var6.field_e) {
                L2: {
                  if (null == var7.field_e) {
                    var7.field_e = new gqa();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6.field_e.b((byte) 110, (tv) (Object) var7.field_e);
                break L1;
              } else {
                var6.field_e = null;
                break L1;
              }
            }
            L3: {
              if (var6.field_d == null) {
                var7.field_d = null;
                break L3;
              } else {
                L4: {
                  if (var7.field_d == null) {
                    var7.field_d = new hg();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6.field_d.b((byte) 65, (tv) (Object) var7.field_d);
                break L3;
              }
            }
            L5: {
              if (var6.field_f == null) {
                var7.field_f = null;
                break L5;
              } else {
                L6: {
                  if (null == var7.field_f) {
                    var7.field_f = new gtb();
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var6.field_f.b((byte) 99, (tv) (Object) var7.field_f);
                break L5;
              }
            }
            var7.field_c = var6.field_c;
            if (param0 > 54) {
              break L0;
            } else {
              var5 = null;
              ((pwa) this).b((byte) 53, (tv) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("pwa.D(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    public final String toString() {
        return "join=" + (Object) (Object) ((pwa) this).field_e + ", leave=" + (Object) (Object) ((pwa) this).field_d + ", ready=" + (Object) (Object) ((pwa) this).field_f + ", event_cancellation=" + ((pwa) this).field_c;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pwa var4 = null;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_15_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_17_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            var3_int = 105 % ((22 - param0) / 59);
            var4 = (pwa) (Object) param1;
            gqa discarded$3 = var4.field_e;
            L1: {
              L2: {
                L3: {
                  if (null == var4.field_e) {
                    break L3;
                  } else {
                    if (var4.field_e.a((byte) 90, (tv) (Object) var4.field_e)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                hg discarded$4 = var4.field_d;
                L4: {
                  if (null == var4.field_d) {
                    break L4;
                  } else {
                    if (var4.field_d.a((byte) -57, (tv) (Object) var4.field_d)) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                gtb discarded$5 = var4.field_f;
                L5: {
                  if (var4.field_f == null) {
                    break L5;
                  } else {
                    if (var4.field_f.a((byte) 122, (tv) (Object) var4.field_f)) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  stackOut_15_0 = var4.field_c;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var4.field_c) {
                    stackOut_17_0 = stackIn_17_0;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L6;
                  } else {
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L6;
                  }
                }
                if ((stackIn_18_0 ? 1 : 0) != stackIn_18_1) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L1;
                } else {
                  break L2;
                }
              }
              stackOut_19_0 = 1;
              stackIn_21_0 = stackOut_19_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("pwa.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!kv.a(false, param0)) {
                ((pwa) this).field_e = null;
                break L1;
              } else {
                L2: {
                  if (null == ((pwa) this).field_e) {
                    ((pwa) this).field_e = new gqa();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((pwa) this).field_e.a(param0, false);
                break L1;
              }
            }
            L3: {
              if (!kv.a(param1, param0)) {
                ((pwa) this).field_d = null;
                break L3;
              } else {
                if (((pwa) this).field_d != null) {
                  ((pwa) this).field_d.a(param0, param1);
                  break L3;
                } else {
                  ((pwa) this).field_d = new hg();
                  ((pwa) this).field_d.a(param0, param1);
                  break L3;
                }
              }
            }
            L4: {
              if (!kv.a(param1, param0)) {
                ((pwa) this).field_f = null;
                break L4;
              } else {
                if (((pwa) this).field_f != null) {
                  ((pwa) this).field_f.a(param0, param1);
                  break L4;
                } else {
                  ((pwa) this).field_f = new gtb();
                  ((pwa) this).field_f.a(param0, param1);
                  break L4;
                }
              }
            }
            ((pwa) this).field_c = kv.a(false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("pwa.H(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Good vs everything";
        field_b = 192;
    }
}
