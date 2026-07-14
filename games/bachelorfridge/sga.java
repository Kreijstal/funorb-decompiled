/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sga extends sna {
    sna field_wb;
    sna field_vb;
    cw field_xb;

    private final void a(int param0, int param1, int param2) {
        ((sga) this).field_wb.field_p = ((sga) this).field_p;
        ((sga) this).field_vb.field_kb = 0;
        ((sga) this).field_wb.field_sb = ((sga) this).field_sb - param2 + -param1;
        ((sga) this).field_vb.field_sb = -param2 + ((sga) this).field_sb - param1;
        ((sga) this).field_xb.a(param2, -((sga) this).field_vb.field_rb, ((sga) this).field_sb - param2, ((sga) this).field_wb.field_p, 0, false, ((sga) this).field_vb.field_p, ((sga) this).field_p);
        if (param0 >= -117) {
            ((sga) this).field_vb = null;
        }
    }

    sga(long param0, sna param1, sna param2, cw param3) {
        super(param0, (sna) null);
        ((sga) this).field_wb = new sna(0L, param2);
        ((sga) this).field_xb = new cw(0L, param3);
        ((sga) this).a(-1, ((sga) this).field_wb);
        ((sga) this).a(-1, (sna) (Object) ((sga) this).field_xb);
        ((sga) this).field_vb = param1;
        ((sga) this).field_wb.a(-1, param1);
    }

    private final void a(byte param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        if (!((sga) this).field_xb.b(true)) {
          L0: {
            if (((sga) this).field_xb.f((byte) 62)) {
              ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I - param4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((sga) this).field_xb.g(0)) {
              ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I + param2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((sga) this).field_xb.i(115)) {
              ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I - param2;
              break L2;
            } else {
              break L2;
            }
          }
          if (!((sga) this).field_T) {
            if (param3) {
              if (0 <= -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                if (((sga) this).field_vb.field_p - (-((sga) this).field_vb.field_hb + ((sga) this).field_wb.field_p) < -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                  L3: {
                    ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + (((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p));
                    if (((sga) this).field_xb.f(56)) {
                      ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                      ((sga) this).field_vb.field_I = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                  return;
                } else {
                  L4: {
                    if (((sga) this).field_xb.f(56)) {
                      ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                      ((sga) this).field_vb.field_I = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                  return;
                }
              } else {
                ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb;
                if (((sga) this).field_vb.field_p - (-((sga) this).field_vb.field_hb + ((sga) this).field_wb.field_p) < -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                  L5: {
                    ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + (((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p));
                    if (((sga) this).field_xb.f(56)) {
                      ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                      ((sga) this).field_vb.field_I = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                  return;
                } else {
                  L6: {
                    if (((sga) this).field_xb.f(56)) {
                      ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                      ((sga) this).field_vb.field_I = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                  return;
                }
              }
            } else {
              L7: {
                if (-(((sga) this).field_vb.field_I + ((sga) this).field_vb.field_rb) > ((sga) this).field_vb.field_hb + ((sga) this).field_vb.field_p + -((sga) this).field_wb.field_p) {
                  ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + ((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (-(((sga) this).field_vb.field_rb - -((sga) this).field_vb.field_I) >= 0) {
                L8: {
                  if (((sga) this).field_xb.f(56)) {
                    ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                    ((sga) this).field_vb.field_I = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                return;
              } else {
                L9: {
                  ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb;
                  if (((sga) this).field_xb.f(56)) {
                    ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                    ((sga) this).field_vb.field_I = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                return;
              }
            }
          } else {
            ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I - param1;
            if (param3) {
              if (0 > -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb;
                if (((sga) this).field_vb.field_p - (-((sga) this).field_vb.field_hb + ((sga) this).field_wb.field_p) >= -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                  L10: {
                    if (((sga) this).field_xb.f(56)) {
                      ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                      ((sga) this).field_vb.field_I = 0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                  return;
                } else {
                  L11: {
                    ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + (((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p));
                    if (((sga) this).field_xb.f(56)) {
                      ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                      ((sga) this).field_vb.field_I = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var6 = 5 % ((61 - param0) / 59);
                  ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                  return;
                }
              } else {
                L12: {
                  if (((sga) this).field_vb.field_p - (-((sga) this).field_vb.field_hb + ((sga) this).field_wb.field_p) >= -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                    break L12;
                  } else {
                    ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + (((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p));
                    break L12;
                  }
                }
                L13: {
                  if (((sga) this).field_xb.f(56)) {
                    ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                    ((sga) this).field_vb.field_I = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                return;
              }
            } else {
              L14: {
                if (-(((sga) this).field_vb.field_I + ((sga) this).field_vb.field_rb) > ((sga) this).field_vb.field_hb + ((sga) this).field_vb.field_p + -((sga) this).field_wb.field_p) {
                  ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + ((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p);
                  break L14;
                } else {
                  break L14;
                }
              }
              if (-(((sga) this).field_vb.field_rb - -((sga) this).field_vb.field_I) >= 0) {
                L15: {
                  if (((sga) this).field_xb.f(56)) {
                    ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                    ((sga) this).field_vb.field_I = 0;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                return;
              } else {
                L16: {
                  ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb;
                  if (((sga) this).field_xb.f(56)) {
                    ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
                    ((sga) this).field_vb.field_I = 0;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                var6 = 5 % ((61 - param0) / 59);
                ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
                return;
              }
            }
          }
        } else {
          L17: {
            ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I + param4;
            if (((sga) this).field_xb.f((byte) 62)) {
              ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I - param4;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (((sga) this).field_xb.g(0)) {
              ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I + param2;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (((sga) this).field_xb.i(115)) {
              ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I - param2;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if (!((sga) this).field_T) {
              break L20;
            } else {
              ((sga) this).field_vb.field_I = ((sga) this).field_vb.field_I - param1;
              break L20;
            }
          }
          L21: {
            if (param3) {
              L22: {
                if (0 <= -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                  break L22;
                } else {
                  ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb;
                  break L22;
                }
              }
              if (((sga) this).field_vb.field_p - (-((sga) this).field_vb.field_hb + ((sga) this).field_wb.field_p) >= -(((sga) this).field_vb.field_rb + ((sga) this).field_vb.field_I)) {
                break L21;
              } else {
                ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + (((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p));
                break L21;
              }
            } else {
              L23: {
                if (-(((sga) this).field_vb.field_I + ((sga) this).field_vb.field_rb) > ((sga) this).field_vb.field_hb + ((sga) this).field_vb.field_p + -((sga) this).field_wb.field_p) {
                  ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb + -(((sga) this).field_vb.field_hb + ((sga) this).field_vb.field_p - ((sga) this).field_wb.field_p);
                  break L23;
                } else {
                  break L23;
                }
              }
              if (-(((sga) this).field_vb.field_rb - -((sga) this).field_vb.field_I) < 0) {
                ((sga) this).field_vb.field_I = -((sga) this).field_vb.field_rb;
                break L21;
              } else {
                break L21;
              }
            }
          }
          L24: {
            if (((sga) this).field_xb.f(56)) {
              ((sga) this).field_vb.field_rb = -((sga) this).field_xb.a(7409, param3, ((sga) this).field_vb.field_p, ((sga) this).field_wb.field_p);
              ((sga) this).field_vb.field_I = 0;
              break L24;
            } else {
              break L24;
            }
          }
          var6 = 5 % ((61 - param0) / 59);
          ((sga) this).field_xb.a((byte) 29, -((sga) this).field_vb.field_rb, ((sga) this).field_wb.field_p, ((sga) this).field_vb.field_p);
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((sga) this).field_sb = param4;
        ((sga) this).field_rb = param3;
        ((sga) this).field_kb = param2;
        if (param0 != -58) {
          return;
        } else {
          ((sga) this).field_p = param1;
          this.a(-121, param6, param5);
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, byte param3, int param4, boolean param5, boolean param6) {
        int var8 = 0;
        if (param3 > 18) {
          if (!param5) {
            if (((sga) this).field_T) {
              if (param6) {
                var8 = 0;
                ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              } else {
                var8 = 1;
                ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              }
            } else {
              var8 = 0;
              ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
              this.a((byte) -89, param0, param2, false, param4);
              return var8 != 0;
            }
          } else {
            var8 = 1;
            ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
            this.a((byte) -89, param0, param2, false, param4);
            return var8 != 0;
          }
        } else {
          boolean discarded$1 = ((sga) this).a(69, -104, -15, false, false, true);
          if (!param5) {
            if (((sga) this).field_T) {
              if (param6) {
                var8 = 0;
                ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              } else {
                var8 = 1;
                ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
                this.a((byte) -89, param0, param2, false, param4);
                return var8 != 0;
              }
            } else {
              var8 = 0;
              ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
              this.a((byte) -89, param0, param2, false, param4);
              return var8 != 0;
            }
          } else {
            var8 = 1;
            ((sga) this).field_vb.a(-24380, ((sga) this).field_wb.field_p, var8 != 0, param1);
            this.a((byte) -89, param0, param2, false, param4);
            return var8 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        if (!param5) {
            return false;
        }
        return this.a(param2, param1, ((sga) this).field_wb.field_p, (byte) 94, param0, param3, param4);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.a((byte) 125, param3, ((sga) this).field_wb.field_p, param0, param2);
        if (param1 != 0) {
            ((sga) this).field_vb = null;
        }
    }

    static {
    }
}
