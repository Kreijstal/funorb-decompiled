/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends ch {
    static String field_O;
    private int field_J;
    static up[] field_I;
    boolean field_N;
    private kn field_M;
    static int[] field_L;
    static boolean field_K;

    abstract void a(int param0, int param1, boolean param2);

    final ng k(int param0) {
        ng var2 = super.k(48);
        int var3 = -47 / ((-51 - param0) / 39);
        if (!(var2 == null)) {
            return var2;
        }
        return (ng) (this);
    }

    boolean a(byte param0) {
        this.field_J = this.d(false);
        if (param0 >= 120) {
          if (0 == this.field_J) {
            if (this.field_N) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_L = (int[]) null;
          if (0 == this.field_J) {
            if (this.field_N) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final int d(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param0) {
          L0: {
            field_L = (int[]) null;
            if (this.field_N) {
              if (this != this.field_M.n(640)) {
                stackIn_12_0 = 0;
                break L0;
              } else {
                stackIn_12_0 = 256;
                break L0;
              }
            } else {
              stackIn_12_0 = 0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (this.field_N) {
              if (this != this.field_M.n(640)) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 256;
                break L1;
              }
            } else {
              stackIn_6_0 = 0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    ud(kn param0, int param1, int param2) {
        super(kn.field_O + -param1 >> 1551872321, sl.field_c + -param2 >> -1859045567, param1, param2, (eb) null);
        try {
            this.field_M = param0;
            this.field_N = false;
            this.field_J = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -11) {
            return;
        }
        field_L = null;
        field_O = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        if (this.field_J != 0) {
          if (256 > this.field_J) {
            if (null != fd.field_a) {
              if (fd.field_a.field_F >= this.field_E) {
                if (this.field_C <= fd.field_a.field_E) {
                  h.a(-90, fd.field_a);
                  t.d();
                  this.a(0, 0, true);
                  super.a(-this.field_p + -param0, param1, -param2 - this.field_z, (byte) -61);
                  var5 = -94 / ((param3 - 70) / 49);
                  ia.a((byte) 92);
                  fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
                  return;
                } else {
                  fd.field_a = new tf(this.field_E, this.field_C);
                  h.a(-90, fd.field_a);
                  t.d();
                  this.a(0, 0, true);
                  super.a(-this.field_p + -param0, param1, -param2 - this.field_z, (byte) -61);
                  var5 = -94 / ((param3 - 70) / 49);
                  ia.a((byte) 92);
                  fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
                  return;
                }
              } else {
                fd.field_a = new tf(this.field_E, this.field_C);
                h.a(-90, fd.field_a);
                t.d();
                this.a(0, 0, true);
                super.a(-this.field_p + -param0, param1, -param2 - this.field_z, (byte) -61);
                var5 = -94 / ((param3 - 70) / 49);
                ia.a((byte) 92);
                fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
                return;
              }
            } else {
              fd.field_a = new tf(this.field_E, this.field_C);
              h.a(-90, fd.field_a);
              t.d();
              this.a(0, 0, true);
              super.a(-this.field_p + -param0, param1, -param2 - this.field_z, (byte) -61);
              var5 = -94 / ((param3 - 70) / 49);
              ia.a((byte) 92);
              fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
              return;
            }
          } else {
            if (-1 != (param1 ^ -1)) {
              return;
            } else {
              this.a(param2 - -this.field_z, param0 - -this.field_p, true);
              super.a(param0, param1, param2, (byte) 119);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean c(boolean param0) {
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
        if (!param0) {
          var2 = this.d(param0);
          var3 = -this.field_J + var2;
          if (-1 <= (var3 ^ -1)) {
            if (var3 < 0) {
              L0: {
                L1: {
                  this.field_J = this.field_J + (-16 + (var3 + 1)) / 16;
                  if (this.field_J != 0) {
                    break L1;
                  } else {
                    if (-1 != (var2 ^ -1)) {
                      break L1;
                    } else {
                      if (this.field_N) {
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
                  if (this.field_J != 0) {
                    break L3;
                  } else {
                    if (-1 != (var2 ^ -1)) {
                      break L3;
                    } else {
                      if (this.field_N) {
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
            this.field_J = this.field_J + (7 + var3) / 8;
            if (var3 < 0) {
              L4: {
                L5: {
                  this.field_J = this.field_J + (-16 + (var3 + 1)) / 16;
                  if (this.field_J != 0) {
                    break L5;
                  } else {
                    if (-1 != (var2 ^ -1)) {
                      break L5;
                    } else {
                      if (this.field_N) {
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
                  if (this.field_J != 0) {
                    break L7;
                  } else {
                    if (-1 != (var2 ^ -1)) {
                      break L7;
                    } else {
                      if (this.field_N) {
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
          this.a(-46, -6, false);
          var2 = this.d(param0);
          var3 = -this.field_J + var2;
          if (-1 > (var3 ^ -1)) {
            this.field_J = this.field_J + (7 + var3) / 8;
            if (var3 >= 0) {
              L8: {
                L9: {
                  if (this.field_J != 0) {
                    break L9;
                  } else {
                    if (-1 != (var2 ^ -1)) {
                      break L9;
                    } else {
                      if (this.field_N) {
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
                  this.field_J = this.field_J + (-16 + (var3 + 1)) / 16;
                  if (this.field_J != 0) {
                    break L11;
                  } else {
                    if (-1 != (var2 ^ -1)) {
                      break L11;
                    } else {
                      if (this.field_N) {
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
              this.field_J = this.field_J + (-16 + (var3 + 1)) / 16;
              if (this.field_J == 0) {
                if (-1 != (var2 ^ -1)) {
                  return false;
                } else {
                  L12: {
                    if (this.field_N) {
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
                  if (this.field_J != 0) {
                    break L14;
                  } else {
                    if (-1 != (var2 ^ -1)) {
                      break L14;
                    } else {
                      if (this.field_N) {
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

    final void a(int param0, byte param1, int param2) {
        this.a(param2, (byte) 88, -param0 + sl.field_c >> 1920618209, kn.field_O - param2 >> -1754508159, param0);
        if (param1 != -110) {
            field_K = true;
        }
    }

    static {
        field_I = new up[50];
        field_L = new int[4];
        field_O = "<%0> wants to join";
        field_K = false;
    }
}
