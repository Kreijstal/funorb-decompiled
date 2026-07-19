/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bua {
    private float field_i;
    private int field_b;
    private int field_h;
    private int field_j;
    private int field_a;
    private int field_l;
    private float field_f;
    static jea field_g;
    private int field_e;
    static String field_c;
    private cra field_k;
    private int field_d;

    final void a(int param0, int param1, int param2, boolean param3, int param4, float param5) {
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        this.field_f = param5;
        if ((param4 ^ -1) != param1) {
          if (param0 != -1) {
            if (!param3) {
              if (param4 == this.field_e) {
                L0: {
                  if (param2 != this.field_a) {
                    break L0;
                  } else {
                    if (param0 != this.field_j) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
                this.field_a = param2;
                this.field_j = param0;
                this.field_e = param4;
                if (null != this.field_k) {
                  this.field_k.a((byte) -105);
                  this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                  return;
                } else {
                  L1: {
                    if (this.field_l <= 0) {
                      this.field_k = new cra();
                      if (var8 == 0) {
                        break L1;
                      } else {
                        this.field_k.a((byte) -105);
                        this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                        return;
                      }
                    } else {
                      this.field_k = new cra(this.field_l);
                      if (var8 == 0) {
                        break L1;
                      } else {
                        this.field_k = new cra();
                        this.field_k.a((byte) -105);
                        this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                        return;
                      }
                    }
                  }
                  this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                  return;
                }
              } else {
                this.field_a = param2;
                this.field_j = param0;
                this.field_e = param4;
                if (null != this.field_k) {
                  this.field_k.a((byte) -105);
                  this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                  return;
                } else {
                  L2: {
                    if (this.field_l <= 0) {
                      this.field_k = new cra();
                      if (var8 == 0) {
                        break L2;
                      } else {
                        this.field_k.a((byte) -105);
                        this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                        return;
                      }
                    } else {
                      this.field_k = new cra(this.field_l);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        this.field_k = new cra();
                        this.field_k.a((byte) -105);
                        this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                        return;
                      }
                    }
                  }
                  this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                  return;
                }
              }
            } else {
              this.field_a = param2;
              this.field_j = param0;
              this.field_e = param4;
              if (null == this.field_k) {
                if (this.field_l <= 0) {
                  this.field_k = new cra();
                  if (var8 == 0) {
                    this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                    return;
                  } else {
                    this.field_k.a((byte) -105);
                    this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                    return;
                  }
                } else {
                  this.field_k = new cra(this.field_l);
                  if (var8 != 0) {
                    this.field_k = new cra();
                    if (var8 != 0) {
                      this.field_k.a((byte) -105);
                      this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                      return;
                    } else {
                      this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                      return;
                    }
                  } else {
                    this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                    return;
                  }
                }
              } else {
                this.field_k.a((byte) -105);
                this.field_k.a(tva.a(param1 ^ -2, param0, param2, param4), -30988);
                return;
              }
            }
          } else {
            this.d(110);
            return;
          }
        } else {
          this.d(110);
          return;
        }
    }

    final void a(int param0) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 0) {
          if (this.field_k != null) {
            this.field_i = this.field_i + this.field_f;
            L0: while (true) {
              if (1.0f <= this.field_i) {
                discarded$2 = this.field_k.b(param0 + 22);
                this.field_i = this.field_i - 1.0f;
                if (var3 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_f = -0.3097847104072571f;
          if (this.field_k != null) {
            this.field_i = this.field_i + this.field_f;
            L1: while (true) {
              if (1.0f <= this.field_i) {
                discarded$3 = this.field_k.b(param0 + 22);
                this.field_i = this.field_i - 1.0f;
                if (var3 == 0) {
                  continue L1;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 < 41) {
          this.a(57, -19, 81, -80, -19);
          this.field_k.a(tva.a(-2, param3, param2, param4), param1, 8198);
          return;
        } else {
          this.field_k.a(tva.a(-2, param3, param2, param4), param1, 8198);
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            this.field_e = 72;
            return this.field_k.a(false);
        }
        return this.field_k.a(false);
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            return false;
        }
        return this.field_k == null ? false : this.field_k.field_o;
    }

    final static int a(int param0, int param1) {
        if (param0 != 0) {
            return 9;
        }
        return uoa.field_c[2047 & param1];
    }

    final int b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            this.field_b = -41;
            if (null != this.field_k) {
              stackOut_7_0 = this.field_k.field_f;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null != this.field_k) {
              stackOut_3_0 = this.field_k.field_f;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    bua(int param0, int param1) {
        this(param0, param1, 0);
    }

    final ka a(boolean param0, int param1, boolean param2, byte param3) {
        ka var5 = null;
        ka var6 = null;
        ka var7 = null;
        ka var8 = null;
        var5 = kb.a(this.field_d, param0, param2, param1 + 3, this.field_b);
        if (var5 != null) {
          if (null == this.field_k) {
            if ((this.field_h ^ -1) != -129) {
              var8 = rga.a(var5, param3, 124);
              if (param1 == -1) {
                L0: {
                  if (null != this.field_k) {
                    this.field_k.a(-101, var8);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (128 != this.field_h) {
                  var8.O(this.field_h, this.field_h, this.field_h);
                  return var8;
                } else {
                  return var8;
                }
              } else {
                L1: {
                  field_c = (String) null;
                  if (null != this.field_k) {
                    this.field_k.a(-101, var8);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (128 != this.field_h) {
                  var8.O(this.field_h, this.field_h, this.field_h);
                  return var8;
                } else {
                  return var8;
                }
              }
            } else {
              return var5;
            }
          } else {
            var7 = rga.a(var5, param3, 124);
            var6 = var7;
            if (param1 == -1) {
              L2: {
                if (null != this.field_k) {
                  this.field_k.a(-101, var7);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (128 != this.field_h) {
                var7.O(this.field_h, this.field_h, this.field_h);
                return var7;
              } else {
                return var7;
              }
            } else {
              L3: {
                field_c = (String) null;
                if (null != this.field_k) {
                  this.field_k.a(-101, var7);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (128 != this.field_h) {
                var7.O(this.field_h, this.field_h, this.field_h);
                return var7;
              } else {
                return var7;
              }
            }
          }
        } else {
          return var5;
        }
    }

    final void b(int param0, int param1) {
        this.field_k.a(param1, (byte) 109);
        int var3 = 48 / ((param0 - 20) / 57);
    }

    final void a(boolean param0, int param1) {
        this.field_h = param1;
        if (!param0) {
            return;
        }
        this.field_i = 1.865414023399353f;
    }

    public static void a(byte param0) {
        int discarded$0 = 0;
        field_c = null;
        if (param0 <= 55) {
            discarded$0 = bua.a(56, 48);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final int c(byte param0) {
        int var2 = 88 % ((-47 - param0) / 34);
        return this.a(this.field_a, (byte) 66, this.field_e, this.field_j);
    }

    final ka b(byte param0) {
        if (param0 != 74) {
            return (ka) null;
        }
        return this.a(false, param0 ^ -75, false, (byte) 1);
    }

    final void a(int param0, int param1, int param2) {
        this.field_d = param2;
        this.field_b = param0;
        if (param1 == -23308) {
            return;
        }
        this.field_i = 0.5494057536125183f;
    }

    final int a(int param0, byte param1, int param2, int param3) {
        dk var5 = null;
        if (param1 != 66) {
            field_g = (jea) null;
            var5 = tva.a(-2, param3, param0, param2);
            if (!(var5 != null)) {
                return 0;
            }
            return var5.a((byte) 117, true);
        }
        var5 = tva.a(-2, param3, param0, param2);
        if (!(var5 != null)) {
            return 0;
        }
        return var5.a((byte) 117, true);
    }

    private final void d(int param0) {
        this.field_e = -1;
        this.field_k = null;
        if (param0 <= 97) {
          field_g = (jea) null;
          this.field_j = -1;
          return;
        } else {
          this.field_j = -1;
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4) {
        this.a(param3, 0, param0, param4, param2, 1.0f);
        if (!param1) {
            return;
        }
        this.field_b = -21;
    }

    final void a(int param0, boolean param1, byte param2, int param3) {
        this.a(-1, false, param0, param3, param1);
        int var5 = 35 / ((param2 - -34) / 41);
    }

    bua(int param0, int param1, int param2) {
        this.field_h = 128;
        this.a(param0, -23308, param1);
        this.field_l = param2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.a(79, param1, param3, param0, param2);
    }

    static {
        field_c = "New Game";
    }
}
