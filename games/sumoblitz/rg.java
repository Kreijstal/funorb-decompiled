/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg extends sp {
    boolean field_D;
    dg field_E;
    private int field_B;
    static iw field_A;
    static int[] field_C;

    rg(dg param0, int param1, int param2) {
        super(lj.field_b - param1 >> 1264137313, cv.field_O + -param2 >> 1258340289, param1, param2, (mh) null);
        try {
            this.field_D = false;
            this.field_B = 0;
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_A = null;
        int var1 = 68 / ((1 - param0) / 63);
        field_C = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (this.field_B != 0) {
          if (-257 < (this.field_B ^ -1)) {
            if (null != uw.field_a) {
              if (uw.field_a.field_x >= this.field_q) {
                if (this.field_p <= uw.field_a.field_u) {
                  jq.a(7161, uw.field_a);
                  lk.b();
                  this.b(113, 0, 0);
                  if (param2 >= -35) {
                    this.f(-77);
                    super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                    return;
                  } else {
                    super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                    return;
                  }
                } else {
                  uw.field_a = new wb(this.field_q, this.field_p);
                  jq.a(7161, uw.field_a);
                  lk.b();
                  this.b(113, 0, 0);
                  if (param2 >= -35) {
                    this.f(-77);
                    super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                    return;
                  } else {
                    super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                    return;
                  }
                }
              } else {
                uw.field_a = new wb(this.field_q, this.field_p);
                jq.a(7161, uw.field_a);
                lk.b();
                this.b(113, 0, 0);
                if (param2 >= -35) {
                  this.f(-77);
                  super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                  su.a((byte) 114);
                  uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                  return;
                } else {
                  super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                  su.a((byte) 114);
                  uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                  return;
                }
              }
            } else {
              uw.field_a = new wb(this.field_q, this.field_p);
              jq.a(7161, uw.field_a);
              lk.b();
              this.b(113, 0, 0);
              if (param2 >= -35) {
                this.f(-77);
                super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                su.a((byte) 114);
                uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                return;
              } else {
                super.a(-param0 + -this.field_r, -param1 + -this.field_v, (byte) -114, param3);
                su.a((byte) 114);
                uw.field_a.a(param0 - -this.field_r, param1 - -this.field_v, this.field_B);
                return;
              }
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              this.b(117, param0 + this.field_r, param1 + this.field_v);
              super.a(param0, param1, (byte) -112, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean g(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int var2;
        int var3;
        if (param0 == -28778) {
          var2 = this.a((byte) -100);
          var3 = var2 + -this.field_B;
          if ((var3 ^ -1) >= -1) {
            if (var3 < 0) {
              L0: {
                L1: {
                  this.field_B = this.field_B + (1 + var3 + -16) / 16;
                  if (0 != this.field_B) {
                    break L1;
                  } else {
                    if (var2 != 0) {
                      break L1;
                    } else {
                      if (this.field_D) {
                        break L1;
                      } else {
                        stackIn_59_0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_59_0 = 0;
                break L0;
              }
              return stackIn_59_0 != 0;
            } else {
              L2: {
                L3: {
                  if (0 != this.field_B) {
                    break L3;
                  } else {
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (this.field_D) {
                        break L3;
                      } else {
                        stackIn_53_0 = 1;
                        break L2;
                      }
                    }
                  }
                }
                stackIn_53_0 = 0;
                break L2;
              }
              return stackIn_53_0 != 0;
            }
          } else {
            this.field_B = this.field_B + (7 + var3) / 8;
            if (var3 < 0) {
              L4: {
                L5: {
                  this.field_B = this.field_B + (1 + var3 + -16) / 16;
                  if (0 != this.field_B) {
                    break L5;
                  } else {
                    if (var2 != 0) {
                      break L5;
                    } else {
                      if (this.field_D) {
                        break L5;
                      } else {
                        stackIn_45_0 = 1;
                        break L4;
                      }
                    }
                  }
                }
                stackIn_45_0 = 0;
                break L4;
              }
              return stackIn_45_0 != 0;
            } else {
              L6: {
                L7: {
                  if (0 != this.field_B) {
                    break L7;
                  } else {
                    if (var2 != 0) {
                      break L7;
                    } else {
                      if (this.field_D) {
                        break L7;
                      } else {
                        stackIn_39_0 = 1;
                        break L6;
                      }
                    }
                  }
                }
                stackIn_39_0 = 0;
                break L6;
              }
              return stackIn_39_0 != 0;
            }
          }
        } else {
          this.field_E = (dg) null;
          var2 = this.a((byte) -100);
          var3 = var2 + -this.field_B;
          if ((var3 ^ -1) < -1) {
            this.field_B = this.field_B + (7 + var3) / 8;
            if (var3 >= 0) {
              L8: {
                L9: {
                  if (0 != this.field_B) {
                    break L9;
                  } else {
                    if (var2 != 0) {
                      break L9;
                    } else {
                      if (this.field_D) {
                        break L9;
                      } else {
                        stackIn_30_0 = 1;
                        break L8;
                      }
                    }
                  }
                }
                stackIn_30_0 = 0;
                break L8;
              }
              return stackIn_30_0 != 0;
            } else {
              L10: {
                L11: {
                  this.field_B = this.field_B + (1 + var3 + -16) / 16;
                  if (0 != this.field_B) {
                    break L11;
                  } else {
                    if (var2 != 0) {
                      break L11;
                    } else {
                      if (this.field_D) {
                        break L11;
                      } else {
                        stackIn_24_0 = 1;
                        break L10;
                      }
                    }
                  }
                }
                stackIn_24_0 = 0;
                break L10;
              }
              return stackIn_24_0 != 0;
            }
          } else {
            if (var3 < 0) {
              this.field_B = this.field_B + (1 + var3 + -16) / 16;
              if (0 == this.field_B) {
                if (var2 != 0) {
                  return false;
                } else {
                  L12: {
                    if (this.field_D) {
                      stackIn_15_0 = 0;
                      break L12;
                    } else {
                      stackIn_15_0 = 1;
                      break L12;
                    }
                  }
                  return stackIn_15_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              L13: {
                L14: {
                  if (0 != this.field_B) {
                    break L14;
                  } else {
                    if (var2 != 0) {
                      break L14;
                    } else {
                      if (this.field_D) {
                        break L14;
                      } else {
                        stackIn_8_0 = 1;
                        break L13;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L13;
              }
              return stackIn_8_0 != 0;
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int var2;
        var2 = -62 % ((-58 - param0) / 63);
        if (65 > param1) {
          if (param1 >= 97) {
            if (param1 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (param1 > 90) {
            if (param1 >= 97) {
              if (param1 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    boolean h(int param0) {
        if (param0 == 0) {
          this.field_B = this.a((byte) -100);
          if (0 == this.field_B) {
            if (this.field_D) {
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

    final void c(int param0, int param1, int param2) {
        if (param2 < 37) {
          field_A = (iw) null;
          this.a(106, lj.field_b - param0 >> -1058313983, -param1 + cv.field_O >> -1017172895, param1, param0);
          return;
        } else {
          this.a(106, lj.field_b - param0 >> -1058313983, -param1 + cv.field_O >> -1017172895, param1, param0);
          return;
        }
    }

    abstract void b(int param0, int param1, int param2);

    final pk f(int param0) {
        pk var2 = super.f(-105);
        int var3 = -113 / ((param0 - -25) / 58);
        if (!(var2 == null)) {
            return var2;
        }
        return (pk) (this);
    }

    final static void a(byte param0, int param1) {
        se.a(19886);
        if (param0 != 55) {
            rg.a(124, 'r');
        }
    }

    private final int a(byte param0) {
        int stackIn_6_0 = 0;
        if (param0 != -100) {
          return -55;
        } else {
          L0: {
            if (this.field_D) {
              if (this.field_E.e((byte) 54) == this) {
                stackIn_6_0 = 256;
                break L0;
              } else {
                stackIn_6_0 = 0;
                break L0;
              }
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    static {
        field_A = new iw(1);
        field_C = new int[1024];
    }
}
