/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sga extends sna {
    sna field_wb;
    sna field_vb;
    cw field_xb;

    private final void a(int param0, int param1, int param2) {
        this.field_wb.field_p = this.field_p;
        this.field_vb.field_kb = 0;
        this.field_wb.field_sb = this.field_sb - param2 + -param1;
        this.field_vb.field_sb = -param2 + this.field_sb - param1;
        this.field_xb.a(param2, -this.field_vb.field_rb, this.field_sb - param2, this.field_wb.field_p, 0, false, this.field_vb.field_p, this.field_p);
        if (param0 >= -117) {
            this.field_vb = (sna) null;
        }
    }

    sga(long param0, sna param1, sna param2, cw param3) {
        super(param0, (sna) null);
        try {
            this.field_wb = new sna(0L, param2);
            this.field_xb = new cw(0L, param3);
            this.a(-1, this.field_wb);
            this.a(-1, this.field_xb);
            this.field_vb = param1;
            this.field_wb.a(-1, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sga.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        if (!this.field_xb.b(true)) {
          L0: {
            if (this.field_xb.f((byte) 62)) {
              this.field_vb.field_I = this.field_vb.field_I - param4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.field_xb.g(0)) {
              this.field_vb.field_I = this.field_vb.field_I + param2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_xb.i(115)) {
              this.field_vb.field_I = this.field_vb.field_I - param2;
              break L2;
            } else {
              break L2;
            }
          }
          if (!this.field_T) {
            if (param3) {
              if (0 <= -(this.field_vb.field_rb + this.field_vb.field_I)) {
                if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) < -(this.field_vb.field_rb + this.field_vb.field_I)) {
                  L3: {
                    this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
                    if (this.field_xb.f(56)) {
                      this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                      this.field_vb.field_I = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                  return;
                } else {
                  L4: {
                    if (this.field_xb.f(56)) {
                      this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                      this.field_vb.field_I = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                  return;
                }
              } else {
                this.field_vb.field_I = -this.field_vb.field_rb;
                if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) < -(this.field_vb.field_rb + this.field_vb.field_I)) {
                  L5: {
                    this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
                    if (this.field_xb.f(56)) {
                      this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                      this.field_vb.field_I = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                  return;
                } else {
                  L6: {
                    if (this.field_xb.f(56)) {
                      this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                      this.field_vb.field_I = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                  return;
                }
              }
            } else {
              L7: {
                if (-(this.field_vb.field_I + this.field_vb.field_rb) > this.field_vb.field_hb + this.field_vb.field_p + -this.field_wb.field_p) {
                  this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (-(this.field_vb.field_rb - -this.field_vb.field_I) >= 0) {
                L8: {
                  if (this.field_xb.f(56)) {
                    this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                    this.field_vb.field_I = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                return;
              } else {
                L9: {
                  this.field_vb.field_I = -this.field_vb.field_rb;
                  if (this.field_xb.f(56)) {
                    this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                    this.field_vb.field_I = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                return;
              }
            }
          } else {
            this.field_vb.field_I = this.field_vb.field_I - param1;
            if (param3) {
              if (0 > -(this.field_vb.field_rb + this.field_vb.field_I)) {
                this.field_vb.field_I = -this.field_vb.field_rb;
                if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) >= -(this.field_vb.field_rb + this.field_vb.field_I)) {
                  L10: {
                    if (this.field_xb.f(56)) {
                      this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                      this.field_vb.field_I = 0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                  return;
                } else {
                  L11: {
                    this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
                    if (this.field_xb.f(56)) {
                      this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                      this.field_vb.field_I = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                  return;
                }
              } else {
                L12: {
                  if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) >= -(this.field_vb.field_rb + this.field_vb.field_I)) {
                    break L12;
                  } else {
                    this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
                    break L12;
                  }
                }
                L13: {
                  if (this.field_xb.f(56)) {
                    this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                    this.field_vb.field_I = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                return;
              }
            } else {
              L14: {
                if (-(this.field_vb.field_I + this.field_vb.field_rb) > this.field_vb.field_hb + this.field_vb.field_p + -this.field_wb.field_p) {
                  this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p);
                  break L14;
                } else {
                  break L14;
                }
              }
              if (-(this.field_vb.field_rb - -this.field_vb.field_I) >= 0) {
                L15: {
                  if (this.field_xb.f(56)) {
                    this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                    this.field_vb.field_I = 0;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                return;
              } else {
                L16: {
                  this.field_vb.field_I = -this.field_vb.field_rb;
                  if (this.field_xb.f(56)) {
                    this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                    this.field_vb.field_I = 0;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                return;
              }
            }
          }
        } else {
          L17: {
            this.field_vb.field_I = this.field_vb.field_I + param4;
            if (this.field_xb.f((byte) 62)) {
              this.field_vb.field_I = this.field_vb.field_I - param4;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (this.field_xb.g(0)) {
              this.field_vb.field_I = this.field_vb.field_I + param2;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (this.field_xb.i(115)) {
              this.field_vb.field_I = this.field_vb.field_I - param2;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if (!this.field_T) {
              break L20;
            } else {
              this.field_vb.field_I = this.field_vb.field_I - param1;
              break L20;
            }
          }
          L21: {
            if (param3) {
              L22: {
                if (0 <= -(this.field_vb.field_rb + this.field_vb.field_I)) {
                  break L22;
                } else {
                  this.field_vb.field_I = -this.field_vb.field_rb;
                  break L22;
                }
              }
              if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) >= -(this.field_vb.field_rb + this.field_vb.field_I)) {
                break L21;
              } else {
                this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
                break L21;
              }
            } else {
              L23: {
                if (-(this.field_vb.field_I + this.field_vb.field_rb) > this.field_vb.field_hb + this.field_vb.field_p + -this.field_wb.field_p) {
                  this.field_vb.field_I = -this.field_vb.field_rb + -(this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p);
                  break L23;
                } else {
                  break L23;
                }
              }
              if (-(this.field_vb.field_rb - -this.field_vb.field_I) < 0) {
                this.field_vb.field_I = -this.field_vb.field_rb;
                break L21;
              } else {
                break L21;
              }
            }
          }
          L24: {
            if (this.field_xb.f(56)) {
              this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
              this.field_vb.field_I = 0;
              break L24;
            } else {
              break L24;
            }
          }
          var6 = 5 % ((61 - param0) / 59);
          this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_sb = param4;
        this.field_rb = param3;
        this.field_kb = param2;
        if (param0 != -58) {
          return;
        } else {
          this.field_p = param1;
          this.a(-121, param6, param5);
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, byte param3, int param4, boolean param5, boolean param6) {
        boolean discarded$1 = false;
        int var8 = 0;
        if (param3 > 18) {
          if (!param5) {
            if (this.field_T) {
              if (param6) {
                var8 = 0;
                this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              } else {
                var8 = 1;
                this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              }
            } else {
              var8 = 0;
              this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
              this.a((byte) -89, param0, param2, false, param4);
              return var8 != 0;
            }
          } else {
            var8 = 1;
            this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
            this.a((byte) -89, param0, param2, false, param4);
            return var8 != 0;
          }
        } else {
          discarded$1 = this.a(69, -104, -15, false, false, true);
          if (!param5) {
            if (this.field_T) {
              if (param6) {
                var8 = 0;
                this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              } else {
                var8 = 1;
                this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              }
            } else {
              var8 = 0;
              this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
              this.a((byte) -89, param0, param2, false, param4);
              return var8 != 0;
            }
          } else {
            var8 = 1;
            this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
            this.a((byte) -89, param0, param2, false, param4);
            return var8 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        if (!param5) {
            return false;
        }
        return this.a(param2, param1, this.field_wb.field_p, (byte) 94, param0, param3, param4);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.a((byte) 125, param3, this.field_wb.field_p, param0, param2);
        if (param1 != 0) {
            this.field_vb = (sna) null;
        }
    }

    static {
    }
}
