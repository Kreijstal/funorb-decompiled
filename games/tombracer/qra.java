/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qra {
    static int[] field_e;
    private boolean field_b;
    static String field_g;
    static float field_d;
    ff field_c;
    private boolean field_i;
    qh field_h;
    static d field_l;
    static int field_j;
    private fna field_k;
    v field_f;
    private ko field_a;

    public static void b(int param0) {
        if (param0 != 96) {
          qra.b(-96);
          field_l = null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_l = null;
          field_e = null;
          field_g = null;
          return;
        }
    }

    abstract void a(int param0, boolean param1);

    abstract boolean e(int param0);

    final static void a(la param0, int param1, ff param2) {
        if (param1 != 100) {
            field_e = (int[]) null;
        }
        if (vpa.a(84) || param2.k(param1 + -25419)) {
            return;
        }
        if (!(0 <= param0.q((byte) -82))) {
            return;
        }
        try {
            ql.field_k.k(96, -2988);
            ql.field_k.f(-1477662136, param0.q((byte) -82));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qra.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void b(int param0, boolean param1);

    abstract boolean a(char param0, int param1, int param2);

    final static int a(int param0) {
        if (param0 != 96) {
            return 112;
        }
        return ej.field_a.f(param0 ^ -2147483552);
    }

    private final void a(byte param0) {
        this.field_k = new fna(0, wba.field_q[0], 0, false);
        if (param0 != -78) {
          this.a((byte) 97);
          this.field_k.field_b = this.field_k.e(-163) / 2 + 10;
          this.field_k.field_i = -25 + koa.b(0);
          this.field_k.a(false);
          this.field_a = new ko(1);
          return;
        } else {
          this.field_k.field_b = this.field_k.e(-163) / 2 + 10;
          this.field_k.field_i = -25 + koa.b(0);
          this.field_k.a(false);
          this.field_a = new ko(1);
          return;
        }
    }

    final void c(int param0) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        ko stackIn_16_0 = null;
        ko stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        ko stackIn_47_0 = null;
        ko stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_79_0 = 0;
        ko stackIn_81_0 = null;
        ko stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int var2;
        int var3;
        this.field_i = true;
        if (this.field_k.field_b - 80 <= jba.field_j) {
          if (this.field_k.field_b - -80 > jba.field_j) {
            L0: {
              if (-25 + this.field_k.field_i <= sta.field_B) {
                if (this.field_k.field_i + 25 <= sta.field_B) {
                  stackIn_67_0 = 0;
                  break L0;
                } else {
                  stackIn_67_0 = 1;
                  break L0;
                }
              } else {
                stackIn_67_0 = 0;
                break L0;
              }
            }
            L1: {
              var2 = stackIn_67_0;
              stackIn_69_0 = this;

              if (var2 == 0) {
                stackIn_70_0 = this;
                stackIn_70_1 = 0;
                break L1;
              } else {
                stackIn_70_0 = this;
                stackIn_70_1 = 1;
                break L1;
              }
            }
            L2: {
              ((qra) (this)).field_b = stackIn_70_1 != 0;
              if (this.field_k.field_b <= jm.field_m) {
                if (jm.field_m < 100 + this.field_k.field_b) {
                  if (lba.field_p >= this.field_k.field_i) {
                    if (20 + this.field_k.field_i <= lba.field_p) {
                      stackIn_79_0 = 0;
                      break L2;
                    } else {
                      stackIn_79_0 = 1;
                      break L2;
                    }
                  } else {
                    stackIn_79_0 = 0;
                    break L2;
                  }
                } else {
                  stackIn_79_0 = 0;
                  break L2;
                }
              } else {
                stackIn_79_0 = 0;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_79_0;
              stackIn_81_0 = this.field_a;

              if (var3 != 0) {
                stackIn_82_0 = (ko) ((Object) stackIn_81_0);
                stackIn_82_1 = 0;
                break L3;
              } else {
                stackIn_82_0 = (ko) ((Object) stackIn_81_0);
                stackIn_82_1 = -1;
                break L3;
              }
            }
            L4: {




              stackIn_84_2 = 85;

              if (var2 != 0) {
                stackIn_82_0 = (ko) ((Object) stackIn_82_0);

                stackIn_85_2 = stackIn_84_2;
                stackIn_85_3 = 0;
                break L4;
              } else {
                stackIn_82_0 = (ko) ((Object) stackIn_82_0);

                stackIn_85_2 = stackIn_84_2;
                stackIn_85_3 = -1;
                break L4;
              }
            }
            ((ko) (Object) stackIn_82_0).a(stackIn_82_1, stackIn_85_2, stackIn_85_3);
            this.field_k.a(true, this.field_b, true, 6);
            if (param0 == 7) {
              if (var2 != 0) {
                if (0 == hf.field_b) {
                  return;
                } else {
                  L5: {
                    stackIn_92_0 = 0;

                    if (!this.field_h.field_D) {
                      stackIn_93_0 = stackIn_92_0;
                      stackIn_93_1 = 9;
                      break L5;
                    } else {
                      stackIn_93_0 = stackIn_92_0;
                      stackIn_93_1 = 7;
                      break L5;
                    }
                  }
                  ira.a(stackIn_93_0 != 0, stackIn_93_1, (byte) 97);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L6: {
              var2 = 0;
              stackIn_34_0 = this;

              if (var2 == 0) {
                stackIn_35_0 = this;
                stackIn_35_1 = 0;
                break L6;
              } else {
                stackIn_35_0 = this;
                stackIn_35_1 = 1;
                break L6;
              }
            }
            L7: {
              ((qra) (this)).field_b = stackIn_35_1 != 0;
              if (this.field_k.field_b <= jm.field_m) {
                if (jm.field_m < 100 + this.field_k.field_b) {
                  if (lba.field_p >= this.field_k.field_i) {
                    if (20 + this.field_k.field_i > lba.field_p) {
                      stackIn_45_0 = 1;
                      break L7;
                    } else {
                      stackIn_45_0 = 0;
                      break L7;
                    }
                  } else {
                    stackIn_45_0 = 0;
                    break L7;
                  }
                } else {
                  stackIn_45_0 = 0;
                  break L7;
                }
              } else {
                stackIn_45_0 = 0;
                break L7;
              }
            }
            L8: {
              var3 = stackIn_45_0;
              stackIn_47_0 = this.field_a;

              if (var3 != 0) {
                stackIn_48_0 = (ko) ((Object) stackIn_47_0);
                stackIn_48_1 = 0;
                break L8;
              } else {
                stackIn_48_0 = (ko) ((Object) stackIn_47_0);
                stackIn_48_1 = -1;
                break L8;
              }
            }
            L9: {




              stackIn_50_2 = 85;

              if (var2 != 0) {
                stackIn_48_0 = (ko) ((Object) stackIn_48_0);

                stackIn_51_2 = stackIn_50_2;
                stackIn_51_3 = 0;
                break L9;
              } else {
                stackIn_48_0 = (ko) ((Object) stackIn_48_0);

                stackIn_51_2 = stackIn_50_2;
                stackIn_51_3 = -1;
                break L9;
              }
            }
            ((ko) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_51_2, stackIn_51_3);
            this.field_k.a(true, this.field_b, true, 6);
            if (param0 == 7) {
              if (var2 != 0) {
                if (0 == hf.field_b) {
                  return;
                } else {
                  L10: {
                    stackIn_58_0 = 0;

                    if (!this.field_h.field_D) {
                      stackIn_59_0 = stackIn_58_0;
                      stackIn_59_1 = 9;
                      break L10;
                    } else {
                      stackIn_59_0 = stackIn_58_0;
                      stackIn_59_1 = 7;
                      break L10;
                    }
                  }
                  ira.a(stackIn_59_0 != 0, stackIn_59_1, (byte) 97);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L11: {
            var2 = 0;
            stackIn_3_0 = this;

            if (var2 == 0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L11;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L11;
            }
          }
          L12: {
            ((qra) (this)).field_b = stackIn_4_1 != 0;
            if (this.field_k.field_b <= jm.field_m) {
              if (jm.field_m < 100 + this.field_k.field_b) {
                if (lba.field_p >= this.field_k.field_i) {
                  if (20 + this.field_k.field_i > lba.field_p) {
                    stackIn_14_0 = 1;
                    break L12;
                  } else {
                    stackIn_14_0 = 0;
                    break L12;
                  }
                } else {
                  stackIn_14_0 = 0;
                  break L12;
                }
              } else {
                stackIn_14_0 = 0;
                break L12;
              }
            } else {
              stackIn_14_0 = 0;
              break L12;
            }
          }
          L13: {
            var3 = stackIn_14_0;
            stackIn_16_0 = this.field_a;

            if (var3 != 0) {
              stackIn_17_0 = (ko) ((Object) stackIn_16_0);
              stackIn_17_1 = 0;
              break L13;
            } else {
              stackIn_17_0 = (ko) ((Object) stackIn_16_0);
              stackIn_17_1 = -1;
              break L13;
            }
          }
          L14: {




            stackIn_19_2 = 85;

            if (var2 != 0) {
              stackIn_17_0 = (ko) ((Object) stackIn_17_0);

              stackIn_20_2 = stackIn_19_2;
              stackIn_20_3 = 0;
              break L14;
            } else {
              stackIn_17_0 = (ko) ((Object) stackIn_17_0);

              stackIn_20_2 = stackIn_19_2;
              stackIn_20_3 = -1;
              break L14;
            }
          }
          ((ko) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_20_2, stackIn_20_3);
          this.field_k.a(true, this.field_b, true, 6);
          if (param0 == 7) {
            if (var2 != 0) {
              if (0 == hf.field_b) {
                return;
              } else {
                L15: {
                  stackIn_27_0 = 0;

                  if (!this.field_h.field_D) {
                    stackIn_28_0 = stackIn_27_0;
                    stackIn_28_1 = 9;
                    break L15;
                  } else {
                    stackIn_28_0 = stackIn_27_0;
                    stackIn_28_1 = 7;
                    break L15;
                  }
                }
                ira.a(stackIn_28_0 != 0, stackIn_28_1, (byte) 97);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    qra(qh param0, v param1) {
        try {
            this.field_c = param0.field_k;
            this.field_f = param1;
            this.field_h = param0;
            this.a((byte) -78);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        if (param0 != -27142) {
            return;
        }
        this.field_k.a(false, this.field_i, param0 + 27143, this.field_b);
    }

    static {
        field_g = "<%0> is not a member, and cannot play with the current options.";
    }
}
