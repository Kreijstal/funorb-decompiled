/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private int field_a;
    private int field_r;
    private int field_m;
    private int field_i;
    private int field_l;
    private int field_f;
    private int field_k;
    private int field_q;
    static String field_j;
    private boolean field_e;
    private int field_h;
    private static String[] field_p;
    private int field_o;
    private int field_b;
    boolean field_d;
    private int field_g;
    private int field_c;
    private int field_n;

    final static void a(byte param0) {
        if (param0 != 5) {
            field_j = (String) null;
            al.field_g = new vna();
            return;
        }
        al.field_g = new vna();
    }

    private final boolean c(int param0) {
        if (this.field_n >= this.field_c) {
          if (this.field_m <= this.field_i) {
            if (this.field_r >= this.field_n) {
              if (this.field_o >= this.field_i) {
                if (param0 != 17973) {
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
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int b(int param0) {
        if (param0 != 2) {
            this.field_h = -59;
            return this.field_i;
        }
        return this.field_i;
    }

    final void d(int param0) {
        boolean discarded$0 = false;
        if (param0 >= 98) {
          if (this.field_d) {
            return;
          } else {
            L0: {
              if (this.field_k > this.field_g) {
                if (this.field_f == this.field_i) {
                  this.field_d = true;
                  return;
                } else {
                  this.field_g = this.field_g + this.field_h;
                  this.field_i = this.field_i + this.field_b;
                  break L0;
                }
              } else {
                if (this.field_n == this.field_a) {
                  this.field_d = true;
                  return;
                } else {
                  this.field_n = this.field_n + this.field_q;
                  this.field_k = this.field_k + this.field_l;
                  break L0;
                }
              }
            }
            if (!this.field_e) {
              if (!this.c(17973)) {
                this.field_d = true;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          discarded$0 = this.c(-119);
          if (this.field_d) {
            return;
          } else {
            L1: {
              if (this.field_k > this.field_g) {
                if (this.field_f == this.field_i) {
                  this.field_d = true;
                  return;
                } else {
                  this.field_g = this.field_g + this.field_h;
                  this.field_i = this.field_i + this.field_b;
                  break L1;
                }
              } else {
                if (this.field_n == this.field_a) {
                  this.field_d = true;
                  return;
                } else {
                  this.field_n = this.field_n + this.field_q;
                  this.field_k = this.field_k + this.field_l;
                  break L1;
                }
              }
            }
            if (!this.field_e) {
              if (this.c(17973)) {
                return;
              } else {
                this.field_d = true;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_18_0;
        int stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        Object stackIn_35_0;
        int stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        Object stackIn_56_0;
        int stackIn_56_1;
        int stackIn_56_2;
        int stackIn_56_3;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          this.field_r = param3;
          stackIn_4_0 = this;

          if (param6 > param5) {
            stackIn_5_0 = this;
            stackIn_5_1 = 1;
            break L0;
          } else {
            stackIn_3_0 = this;

            if (param6 < param5) {
              stackIn_5_0 = this;
              stackIn_5_1 = -1;
              break L0;
            } else {
              stackIn_5_0 = this;
              stackIn_5_1 = 0;
              break L0;
            }
          }
        }
        L1: {
          ((nf) (this)).field_b = stackIn_5_1;
          this.field_f = param6 / param2;
          this.field_o = param8;
          this.field_a = param7 / param2;
          this.field_m = param0;
          this.field_n = param4 / param2;
          this.field_i = param5 / param2;
          stackIn_7_0 = this;

          if (param4 >= param7) {
            stackIn_9_0 = this;

            if (param7 >= param4) {
              stackIn_10_0 = this;
              stackIn_10_1 = 0;
              break L1;
            } else {
              stackIn_10_0 = this;
              stackIn_10_1 = -1;
              break L1;
            }
          } else {
            stackIn_10_0 = this;
            stackIn_10_1 = 1;
            break L1;
          }
        }
        ((nf) (this)).field_q = stackIn_10_1;
        this.field_c = param9;
        var11 = ua.a(param7 - param4, 47);
        var12 = ua.a(param6 - param5, 28);
        var13 = param2 * this.field_n;
        var14 = param2 + var13;
        var15 = this.field_i * param2;
        var16 = param2 + var15;
        if ((var11 ^ -1) >= -1) {
          L2: {
            this.field_l = 0;
            this.field_k = 2147483647;
            if (var12 <= 0) {
              this.field_g = 2147483647;
              this.field_h = 0;
              this.field_e = true;
              this.field_d = false;
              break L2;
            } else {
              if (this.field_i == this.field_f) {
                this.field_g = 2147483647;
                this.field_h = 0;
                this.field_e = true;
                this.field_d = false;
                break L2;
              } else {
                L3: {
                  stackIn_17_0 = this;

                  stackIn_17_1 = var12;

                  stackIn_17_2 = -28970;

                  if (this.field_i > this.field_f) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = stackIn_17_1;
                    stackIn_18_2 = stackIn_17_2;
                    stackIn_18_3 = param5 + -var15;
                    break L3;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = stackIn_17_1;
                    stackIn_18_2 = stackIn_17_2;
                    stackIn_18_3 = -param5 + var16;
                    break L3;
                  }
                }
                ((nf) (this)).field_g = bs.a(stackIn_18_1, stackIn_18_2, stackIn_18_3);
                this.field_h = bs.a(var12, -28970, param2);
                this.field_e = true;
                this.field_d = false;
                break L2;
              }
            }
          }
          L4: while (true) {
            L5: {
              if (this.field_d) {
                break L5;
              } else {
                if (this.c(17973)) {
                  break L5;
                } else {
                  this.d(121);
                  continue L4;
                }
              }
            }
            L6: {
              this.field_e = false;
              if (param1 == 7) {
                break L6;
              } else {
                this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
                break L6;
              }
            }
            return;
          }
        } else {
          if (this.field_n != this.field_a) {
            L7: {
              stackIn_50_0 = this;

              stackIn_50_1 = var11;

              stackIn_50_2 = param1 ^ -28975;

              if (this.field_n > this.field_a) {
                stackIn_51_0 = this;
                stackIn_51_1 = stackIn_50_1;
                stackIn_51_2 = stackIn_50_2;
                stackIn_51_3 = -var13 + param4;
                break L7;
              } else {
                stackIn_51_0 = this;
                stackIn_51_1 = stackIn_50_1;
                stackIn_51_2 = stackIn_50_2;
                stackIn_51_3 = -param4 + var14;
                break L7;
              }
            }
            ((nf) (this)).field_k = bs.a(stackIn_51_1, stackIn_51_2, stackIn_51_3);
            this.field_l = bs.a(var11, -28970, param2);
            if (var12 <= 0) {
              this.field_g = 2147483647;
              this.field_h = 0;
              this.field_e = true;
              this.field_d = false;
              L8: while (true) {
                L9: {
                  if (this.field_d) {
                    break L9;
                  } else {
                    if (this.c(17973)) {
                      break L9;
                    } else {
                      this.d(121);
                      continue L8;
                    }
                  }
                }
                this.field_e = false;
                if (param1 == 7) {
                  return;
                } else {
                  this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
                  return;
                }
              }
            } else {
              if (this.field_i == this.field_f) {
                this.field_g = 2147483647;
                this.field_h = 0;
                this.field_e = true;
                this.field_d = false;
                L10: while (true) {
                  L11: {
                    if (this.field_d) {
                      break L11;
                    } else {
                      if (this.c(17973)) {
                        break L11;
                      } else {
                        this.d(121);
                        continue L10;
                      }
                    }
                  }
                  this.field_e = false;
                  if (param1 == 7) {
                    return;
                  } else {
                    this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
                    return;
                  }
                }
              } else {
                L12: {
                  stackIn_55_0 = this;

                  stackIn_55_1 = var12;

                  stackIn_55_2 = -28970;

                  if (this.field_i > this.field_f) {
                    stackIn_56_0 = this;
                    stackIn_56_1 = stackIn_55_1;
                    stackIn_56_2 = stackIn_55_2;
                    stackIn_56_3 = param5 + -var15;
                    break L12;
                  } else {
                    stackIn_56_0 = this;
                    stackIn_56_1 = stackIn_55_1;
                    stackIn_56_2 = stackIn_55_2;
                    stackIn_56_3 = -param5 + var16;
                    break L12;
                  }
                }
                ((nf) (this)).field_g = bs.a(stackIn_56_1, stackIn_56_2, stackIn_56_3);
                this.field_h = bs.a(var12, -28970, param2);
                this.field_e = true;
                this.field_d = false;
                L13: while (true) {
                  L14: {
                    if (this.field_d) {
                      break L14;
                    } else {
                      if (this.c(17973)) {
                        break L14;
                      } else {
                        this.d(121);
                        continue L13;
                      }
                    }
                  }
                  this.field_e = false;
                  if (param1 == 7) {
                    return;
                  } else {
                    this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
                    return;
                  }
                }
              }
            }
          } else {
            L15: {
              this.field_l = 0;
              this.field_k = 2147483647;
              if (var12 <= 0) {
                this.field_g = 2147483647;
                this.field_h = 0;
                this.field_e = true;
                this.field_d = false;
                break L15;
              } else {
                if (this.field_i == this.field_f) {
                  this.field_g = 2147483647;
                  this.field_h = 0;
                  this.field_e = true;
                  this.field_d = false;
                  break L15;
                } else {
                  L16: {
                    stackIn_34_0 = this;

                    stackIn_34_1 = var12;

                    stackIn_34_2 = -28970;

                    if (this.field_i > this.field_f) {
                      stackIn_35_0 = this;
                      stackIn_35_1 = stackIn_34_1;
                      stackIn_35_2 = stackIn_34_2;
                      stackIn_35_3 = param5 + -var15;
                      break L16;
                    } else {
                      stackIn_35_0 = this;
                      stackIn_35_1 = stackIn_34_1;
                      stackIn_35_2 = stackIn_34_2;
                      stackIn_35_3 = -param5 + var16;
                      break L16;
                    }
                  }
                  ((nf) (this)).field_g = bs.a(stackIn_35_1, stackIn_35_2, stackIn_35_3);
                  this.field_h = bs.a(var12, -28970, param2);
                  this.field_e = true;
                  this.field_d = false;
                  break L15;
                }
              }
            }
            L17: while (true) {
              L18: {
                if (this.field_d) {
                  break L18;
                } else {
                  if (this.c(17973)) {
                    break L18;
                  } else {
                    this.d(121);
                    continue L17;
                  }
                }
              }
              L19: {
                this.field_e = false;
                if (param1 == 7) {
                  break L19;
                } else {
                  this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
                  break L19;
                }
              }
              return;
            }
          }
        }
    }

    final int b(byte param0) {
        if (param0 != 75) {
            this.field_k = -47;
            return this.field_n;
        }
        return this.field_n;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (-param0 + param3 < pka.field_b) {
          ov.a(param4, param0, param1, false, param2, param5, param3);
          if (param6 <= -67) {
            return;
          } else {
            field_p = (String[]) null;
            return;
          }
        } else {
          if (ss.field_c < param0 + param3) {
            ov.a(param4, param0, param1, false, param2, param5, param3);
            if (param6 <= -67) {
              return;
            } else {
              field_p = (String[]) null;
              return;
            }
          } else {
            if (gca.field_d > -param0 + param1) {
              ov.a(param4, param0, param1, false, param2, param5, param3);
              if (param6 > -67) {
                field_p = (String[]) null;
                return;
              } else {
                return;
              }
            } else {
              if (param1 + param0 <= hc.field_h) {
                vsa.a(param1, param0, 0, param5, param2, param4, param3);
                if (param6 > -67) {
                  field_p = (String[]) null;
                  return;
                } else {
                  return;
                }
              } else {
                ov.a(param4, param0, param1, false, param2, param5, param3);
                if (param6 > -67) {
                  field_p = (String[]) null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_j = null;
        if (param0 != -25802) {
            nf.a(-39, -25, -55, -64, -108, -100, 117);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.a(param5, (byte) 7, param3, param6 - 1, param4, param1, param7, param0, -1 + param2, 0);
    }

    static {
        field_j = "OK";
        field_p = new String[2];
        field_p[1] = "Key";
        field_p[0] = "Coin";
    }
}
