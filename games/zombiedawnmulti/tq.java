/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends cj {
    hi field_Ib;
    static String field_Fb;
    cj field_Gb;
    static String field_Hb;
    cj field_Jb;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    private final void a(int param0, int param1, int param2) {
        this.field_Jb.field_zb = -param1 + (this.field_zb + -param2);
        this.field_Gb.field_x = param0;
        this.field_Jb.field_z = this.field_z;
        this.field_Gb.field_zb = -param2 + -param1 + this.field_zb;
        this.field_Ib.a(this.field_Gb.field_z, 0, this.field_Jb.field_z, this.field_z, -1, -this.field_Gb.field_Q, param1, -param1 + this.field_zb);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 != -31465) {
          this.a(67, 91, -23, -43, 80, -90, 37);
          this.field_x = param3;
          this.field_Q = param6;
          this.field_z = param4;
          this.field_zb = param2;
          this.a(0, param0, param1);
          return;
        } else {
          this.field_x = param3;
          this.field_Q = param6;
          this.field_z = param4;
          this.field_zb = param2;
          this.a(0, param0, param1);
          return;
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        if (param0) {
          var8 = 1;
          this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8 != 0);
          this.a(param3, param4 + 4719, param2, false, param6);
          if (param4 != -4719) {
            return true;
          } else {
            return var8 != 0;
          }
        } else {
          if (this.field_L) {
            if (!param5) {
              var8 = 1;
              this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8 != 0);
              this.a(param3, param4 + 4719, param2, false, param6);
              if (param4 != -4719) {
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              var8 = 0;
              this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8 != 0);
              this.a(param3, param4 + 4719, param2, false, param6);
              if (param4 != -4719) {
                return true;
              } else {
                return var8 != 0;
              }
            }
          } else {
            var8 = 0;
            this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8 != 0);
            this.a(param3, param4 + 4719, param2, false, param6);
            if (param4 != -4719) {
              return true;
            } else {
              return var8 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.a(param2, 0, this.field_Jb.field_z, param3, param0);
        if (param1 < 104) {
            field_Hb = (String) null;
        }
    }

    public static void h(int param0) {
        field_Fb = null;
        if (param0 != 0) {
            tq.h(58);
            field_Hb = null;
            return;
        }
        field_Hb = null;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        boolean discarded$2 = false;
        if (param5 >= -22) {
          discarded$2 = this.a(false, -109, -80, -22, -26, true, -105);
          return this.a(param3, param0, this.field_Jb.field_z, param2, -4719, param1, param4);
        } else {
          return this.a(param3, param0, this.field_Jb.field_z, param2, -4719, param1, param4);
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        L0: {
          if (this.field_Ib.d(false)) {
            this.field_Gb.field_mb = this.field_Gb.field_mb + param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_Ib.e((byte) -37)) {
            this.field_Gb.field_mb = this.field_Gb.field_mb - param0;
            break L1;
          } else {
            break L1;
          }
        }
        if (!this.field_Ib.d((byte) 37)) {
          L2: {
            if (this.field_Ib.i(param1 + -1)) {
              this.field_Gb.field_mb = this.field_Gb.field_mb - param2;
              break L2;
            } else {
              break L2;
            }
          }
          if (!this.field_L) {
            L3: {
              L4: {
                if (param3) {
                  break L4;
                } else {
                  L5: {
                    if (-this.field_Jb.field_z + this.field_Gb.field_z + this.field_Gb.field_I < -(this.field_Gb.field_Q + this.field_Gb.field_mb)) {
                      this.field_Gb.field_mb = -(-this.field_Jb.field_z + this.field_Gb.field_I + this.field_Gb.field_z) - this.field_Gb.field_Q;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if ((-(this.field_Gb.field_mb + this.field_Gb.field_Q) ^ -1) > -1) {
                    this.field_Gb.field_mb = -this.field_Gb.field_Q;
                    if (!ZombieDawnMulti.field_E) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    if (param1 != 0) {
                      return;
                    } else {
                      L6: {
                        if (this.field_Ib.j(120)) {
                          this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                          this.field_Gb.field_mb = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                      return;
                    }
                  }
                }
              }
              if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) >= 0) {
                if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) > -this.field_Jb.field_z + (this.field_Gb.field_I + this.field_Gb.field_z)) {
                  this.field_Gb.field_mb = -(this.field_Gb.field_z + this.field_Gb.field_I - this.field_Jb.field_z) + -this.field_Gb.field_Q;
                  break L3;
                } else {
                  if (param1 == 0) {
                    L7: {
                      if (this.field_Ib.j(120)) {
                        this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                        this.field_Gb.field_mb = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  this.field_Gb.field_mb = -this.field_Gb.field_Q;
                  if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) > -this.field_Jb.field_z + (this.field_Gb.field_I + this.field_Gb.field_z)) {
                    this.field_Gb.field_mb = -(this.field_Gb.field_z + this.field_Gb.field_I - this.field_Jb.field_z) + -this.field_Gb.field_Q;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (param1 != 0) {
                  return;
                } else {
                  L9: {
                    if (this.field_Ib.j(120)) {
                      this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                      this.field_Gb.field_mb = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                  return;
                }
              }
            }
            if (param1 == 0) {
              L10: {
                if (this.field_Ib.j(120)) {
                  this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                  this.field_Gb.field_mb = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
              return;
            } else {
              return;
            }
          } else {
            L11: {
              this.field_Gb.field_mb = this.field_Gb.field_mb - param4;
              if (param3) {
                break L11;
              } else {
                L12: {
                  if (-this.field_Jb.field_z + this.field_Gb.field_z + this.field_Gb.field_I < -(this.field_Gb.field_Q + this.field_Gb.field_mb)) {
                    this.field_Gb.field_mb = -(-this.field_Jb.field_z + this.field_Gb.field_I + this.field_Gb.field_z) - this.field_Gb.field_Q;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if ((-(this.field_Gb.field_mb + this.field_Gb.field_Q) ^ -1) > -1) {
                  this.field_Gb.field_mb = -this.field_Gb.field_Q;
                  if (ZombieDawnMulti.field_E) {
                    break L11;
                  } else {
                    if (param1 != 0) {
                      return;
                    } else {
                      L13: {
                        if (this.field_Ib.j(120)) {
                          this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                          this.field_Gb.field_mb = 0;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                      return;
                    }
                  }
                } else {
                  if (param1 != 0) {
                    return;
                  } else {
                    L14: {
                      if (this.field_Ib.j(120)) {
                        this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                        this.field_Gb.field_mb = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                    return;
                  }
                }
              }
            }
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) < 0) {
              this.field_Gb.field_mb = -this.field_Gb.field_Q;
              if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) > -this.field_Jb.field_z + (this.field_Gb.field_I + this.field_Gb.field_z)) {
                this.field_Gb.field_mb = -(this.field_Gb.field_z + this.field_Gb.field_I - this.field_Jb.field_z) + -this.field_Gb.field_Q;
                if (param1 != 0) {
                  return;
                } else {
                  L15: {
                    if (this.field_Ib.j(120)) {
                      this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                      this.field_Gb.field_mb = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                  return;
                }
              } else {
                if (param1 != 0) {
                  return;
                } else {
                  L16: {
                    if (this.field_Ib.j(120)) {
                      this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                      this.field_Gb.field_mb = 0;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                  return;
                }
              }
            } else {
              L17: {
                if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) > -this.field_Jb.field_z + (this.field_Gb.field_I + this.field_Gb.field_z)) {
                  this.field_Gb.field_mb = -(this.field_Gb.field_z + this.field_Gb.field_I - this.field_Jb.field_z) + -this.field_Gb.field_Q;
                  break L17;
                } else {
                  break L17;
                }
              }
              if (param1 != 0) {
                return;
              } else {
                L18: {
                  if (this.field_Ib.j(120)) {
                    this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                    this.field_Gb.field_mb = 0;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
                return;
              }
            }
          }
        } else {
          L19: {
            this.field_Gb.field_mb = this.field_Gb.field_mb + param2;
            if (this.field_Ib.i(param1 + -1)) {
              this.field_Gb.field_mb = this.field_Gb.field_mb - param2;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if (!this.field_L) {
              break L20;
            } else {
              this.field_Gb.field_mb = this.field_Gb.field_mb - param4;
              break L20;
            }
          }
          L21: {
            L22: {
              if (param3) {
                break L22;
              } else {
                L23: {
                  if (-this.field_Jb.field_z + this.field_Gb.field_z + this.field_Gb.field_I < -(this.field_Gb.field_Q + this.field_Gb.field_mb)) {
                    this.field_Gb.field_mb = -(-this.field_Jb.field_z + this.field_Gb.field_I + this.field_Gb.field_z) - this.field_Gb.field_Q;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                if ((-(this.field_Gb.field_mb + this.field_Gb.field_Q) ^ -1) > -1) {
                  this.field_Gb.field_mb = -this.field_Gb.field_Q;
                  if (!ZombieDawnMulti.field_E) {
                    break L21;
                  } else {
                    break L22;
                  }
                } else {
                  break L21;
                }
              }
            }
            L24: {
              if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) >= 0) {
                break L24;
              } else {
                this.field_Gb.field_mb = -this.field_Gb.field_Q;
                break L24;
              }
            }
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) > -this.field_Jb.field_z + (this.field_Gb.field_I + this.field_Gb.field_z)) {
              this.field_Gb.field_mb = -(this.field_Gb.field_z + this.field_Gb.field_I - this.field_Jb.field_z) + -this.field_Gb.field_Q;
              break L21;
            } else {
              break L21;
            }
          }
          if (param1 != 0) {
            return;
          } else {
            L25: {
              if (this.field_Ib.j(120)) {
                this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
                this.field_Gb.field_mb = 0;
                break L25;
              } else {
                break L25;
              }
            }
            this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
            return;
          }
        }
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    tq(long param0, cj param1, cj param2, hi param3) {
        super(param0, (cj) null);
        try {
            this.field_Jb = new cj(0L, param2);
            this.field_Ib = new hi(0L, param3);
            this.a((byte) 50, this.field_Jb);
            this.a((byte) 50, this.field_Ib);
            this.field_Gb = param1;
            this.field_Jb.a((byte) 50, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "tq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Hb = "This password is part of your Player Name, and would be easy to guess";
        field_Fb = "<%0> has declined the invitation.";
    }
}
