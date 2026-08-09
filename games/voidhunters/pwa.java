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
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pwa var5 = null;
        try {
          L0: {
            L1: {
              var5 = (pwa) ((Object) param0);
              if (null == this.field_e) {
                break L1;
              } else {
                if (var5.field_e != null) {
                  this.field_e.a(var5.field_e, -63);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_d == null) {
                break L2;
              } else {
                if (var5.field_d != null) {
                  this.field_d.a(var5.field_d, -125);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (this.field_f == null) {
                break L3;
              } else {
                if (var5.field_f == null) {
                  break L3;
                } else {
                  this.field_f.a(var5.field_f, -39);
                  break L3;
                }
              }
            }
            L4: {
              var4 = 0;
              if (this.field_e != null) {
                stackIn_14_0 = 0;
                break L4;
              } else {
                stackIn_14_0 = 1;
                break L4;
              }
            }
            L5: {


              if (var5.field_e != null) {

                stackIn_17_1 = 0;
                break L5;
              } else {

                stackIn_17_1 = 1;
                break L5;
              }
            }
            L6: {
              L7: {
                if ((stackIn_14_0 ^ stackIn_17_1) != 0) {
                  break L7;
                } else {
                  if (null == this.field_e) {
                    break L6;
                  } else {
                    if (this.field_e.a((byte) 115, var5.field_e)) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              iva.a(-6940, "PlayerJoin join has changed. before=" + var5.field_e + ", now=" + this.field_e);
              var4 = 1;
              break L6;
            }
            L8: {
              if (this.field_d != null) {
                stackIn_25_0 = 0;
                break L8;
              } else {
                stackIn_25_0 = 1;
                break L8;
              }
            }
            L9: {


              if (var5.field_d != null) {

                stackIn_28_1 = 0;
                break L9;
              } else {

                stackIn_28_1 = 1;
                break L9;
              }
            }
            L10: {
              L11: {
                if ((stackIn_25_0 ^ stackIn_28_1) != 0) {
                  break L11;
                } else {
                  if (this.field_d == null) {
                    break L10;
                  } else {
                    if (!this.field_d.a((byte) -51, var5.field_d)) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              iva.a(-6940, "PlayerLeave leave has changed. before=" + var5.field_d + ", now=" + this.field_d);
              var4 = 1;
              break L10;
            }
            L12: {
              if (this.field_f != null) {
                stackIn_36_0 = 0;
                break L12;
              } else {
                stackIn_36_0 = 1;
                break L12;
              }
            }
            L13: {


              if (null != var5.field_f) {

                stackIn_39_1 = 0;
                break L13;
              } else {

                stackIn_39_1 = 1;
                break L13;
              }
            }
            L14: {
              L15: {
                if ((stackIn_36_0 ^ stackIn_39_1) != 0) {
                  break L15;
                } else {
                  if (this.field_f == null) {
                    break L14;
                  } else {
                    if (!this.field_f.a((byte) -121, var5.field_f)) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              var4 = 1;
              iva.a(-6940, "PlayerReady ready has changed. before=" + var5.field_f + ", now=" + this.field_f);
              break L14;
            }
            L16: {
              if (this.field_c) {
                stackIn_47_0 = 0;
                break L16;
              } else {
                stackIn_47_0 = 1;
                break L16;
              }
            }
            L17: {


              if (var5.field_c) {

                stackIn_50_1 = 0;
                break L17;
              } else {

                stackIn_50_1 = 1;
                break L17;
              }
            }
            L18: {
              if (stackIn_47_0 == stackIn_50_1) {
                break L18;
              } else {
                iva.a(-6940, "boolean event_cancellation has changed. before=" + var5.field_c + ", now=" + this.field_c);
                var4 = 1;
                break L18;
              }
            }
            L19: {
              if (var4 != 0) {
                iva.a(-6940, "This instance of CarouselSystemEvent has changed");
                break L19;
              } else {
                break L19;
              }
            }
            if (param1 <= -19) {
              break L0;
            } else {
              this.field_e = (gqa) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackIn_60_0 = (RuntimeException) (var3);

            stackIn_60_1 = new StringBuilder().append("pwa.F(");

            if (param0 == null) {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L20;
            } else {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L20;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = (faa) (param0);

              stackIn_2_1 = -81;

              if (this.field_e == null) {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              if (!vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
                break L2;
              } else {
                this.field_e.b(param0, -119);
                break L2;
              }
            }
            L3: {
              stackIn_7_0 = (faa) (param0);

              stackIn_7_1 = -59;

              if (null == this.field_d) {
                stackIn_8_0 = (faa) ((Object) stackIn_7_0);
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = 0;
                break L3;
              } else {
                stackIn_8_0 = (faa) ((Object) stackIn_7_0);
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = 1;
                break L3;
              }
            }
            L4: {
              if (!vq.a(stackIn_8_0, stackIn_8_1, stackIn_8_2 != 0)) {
                break L4;
              } else {
                this.field_d.b(param0, -110);
                break L4;
              }
            }
            L5: {
              stackIn_12_0 = (faa) (param0);

              stackIn_12_1 = -43;

              if (this.field_f == null) {
                stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = 0;
                break L5;
              } else {
                stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = 1;
                break L5;
              }
            }
            L6: {
              if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
                this.field_f.b(param0, -115);
                break L6;
              } else {
                break L6;
              }
            }
            vq.a(param0, -107, this.field_c);
            if (param1 < -109) {
              break L0;
            } else {
              this.toString();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("pwa.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -89) {
            field_b = -102;
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        pwa var6 = null;
        pwa var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6 = (pwa) ((Object) param1);
              var7 = var6;
              if (null != this.field_e) {
                L2: {
                  if (null == var7.field_e) {
                    var7.field_e = new gqa();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_e.b((byte) 110, var7.field_e);
                break L1;
              } else {
                var6.field_e = null;
                break L1;
              }
            }
            L3: {
              if (this.field_d == null) {
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
                this.field_d.b((byte) 65, var7.field_d);
                break L3;
              }
            }
            L5: {
              if (this.field_f == null) {
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
                this.field_f.b((byte) 99, var7.field_f);
                break L5;
              }
            }
            var7.field_c = this.field_c;
            if (param0 > 54) {
              break L0;
            } else {
              var5 = (tv) null;
              this.b((byte) 53, (tv) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("pwa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    public final String toString() {
        return "join=" + this.field_e + ", leave=" + this.field_d + ", ready=" + this.field_f + ", event_cancellation=" + this.field_c;
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_1 = 0;
        boolean stackIn_32_0 = false;
        boolean stackIn_33_0 = false;
        int stackIn_33_1 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pwa var4 = null;
        try {
          L0: {
            L1: {
              var3_int = 105 % ((22 - param0) / 59);
              var4 = (pwa) ((Object) param1);
              if (var4.field_e != null) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (null != this.field_e) {

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
                    if (null == this.field_e) {
                      break L5;
                    } else {
                      if (this.field_e.a((byte) 90, var4.field_e)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (null != var4.field_d) {
                      stackIn_13_0 = 0;
                      break L6;
                    } else {
                      stackIn_13_0 = 1;
                      break L6;
                    }
                  }
                  L7: {


                    if (null != this.field_d) {

                      stackIn_16_1 = 0;
                      break L7;
                    } else {

                      stackIn_16_1 = 1;
                      break L7;
                    }
                  }
                  if ((stackIn_13_0 ^ stackIn_16_1) != 0) {
                    break L4;
                  } else {
                    L8: {
                      if (null == this.field_d) {
                        break L8;
                      } else {
                        if (this.field_d.a((byte) -57, var4.field_d)) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (this.field_f != null) {
                        stackIn_23_0 = 0;
                        break L9;
                      } else {
                        stackIn_23_0 = 1;
                        break L9;
                      }
                    }
                    L10: {


                      if (null != var4.field_f) {

                        stackIn_26_1 = 0;
                        break L10;
                      } else {

                        stackIn_26_1 = 1;
                        break L10;
                      }
                    }
                    if ((stackIn_23_0 ^ stackIn_26_1) != 0) {
                      break L4;
                    } else {
                      L11: {
                        if (this.field_f == null) {
                          break L11;
                        } else {
                          if (this.field_f.a((byte) 122, var4.field_f)) {
                            break L4;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        stackIn_32_0 = this.field_c;

                        if (var4.field_c) {
                          stackIn_33_0 = stackIn_32_0;
                          stackIn_33_1 = 0;
                          break L12;
                        } else {
                          stackIn_33_0 = stackIn_32_0;
                          stackIn_33_1 = 1;
                          break L12;
                        }
                      }
                      if ((stackIn_33_0 ? 1 : 0) != stackIn_33_1) {
                        stackIn_36_0 = 0;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              stackIn_36_0 = 1;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("pwa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        return stackIn_36_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!kv.a(false, param0)) {
                this.field_e = null;
                break L1;
              } else {
                L2: {
                  if (null == this.field_e) {
                    this.field_e = new gqa();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_e.a(param0, false);
                break L1;
              }
            }
            L3: {
              if (!kv.a(param1, param0)) {
                this.field_d = null;
                break L3;
              } else {
                if (this.field_d != null) {
                  this.field_d.a(param0, param1);
                  break L3;
                } else {
                  this.field_d = new hg();
                  this.field_d.a(param0, param1);
                  break L3;
                }
              }
            }
            L4: {
              if (!kv.a(param1, param0)) {
                this.field_f = null;
                break L4;
              } else {
                if (this.field_f != null) {
                  this.field_f.a(param0, param1);
                  break L4;
                } else {
                  this.field_f = new gtb();
                  this.field_f.a(param0, param1);
                  break L4;
                }
              }
            }
            this.field_c = kv.a(false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("pwa.H(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Good vs everything";
        field_b = 192;
    }
}
