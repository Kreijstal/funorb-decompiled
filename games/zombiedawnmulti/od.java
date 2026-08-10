/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends lm {
    static String field_Cb;
    static String field_zb;
    private boolean field_yb;
    static int field_Db;
    static ja[] field_Fb;
    static String field_Eb;
    static ja[] field_Ab;
    static byte[] field_Gb;
    static String field_Bb;

    od(int param0, int param1, int param2) {
        super(param0, param1, param2, 100352);
        this.field_yb = false;
        if (-3 == (this.field_D ^ -1) || (this.field_D ^ -1) == -5 || (this.field_D ^ -1) == -7) {
            this.field_lb = 17;
            this.field_cb = 71680;
        }
    }

    final void l(byte param0) {
        int stackIn_3_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_yb) {
            stackIn_3_0 = 2;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var2 = stackIn_3_0 * 250;
        if (this.field_Q == 0) {
          if (!this.field_yb) {
            var3 = 1;
            if (null != this.field_nb) {
              L1: {
                var4 = this.field_nb.e((byte) -112) + -this.e((byte) -112);
                var5 = this.field_nb.g(1829947600) + -this.g(1829947600);
                if (!this.field_nb.o(124)) {
                  break L1;
                } else {
                  if (var4 * var4 - -(var5 * var5) > 125000) {
                    break L1;
                  } else {
                    if (0 == (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) ^ -1)) {
                      if (0 == (this.field_A.field_b.a(this.g(1829947600) + -48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                        break L1;
                      } else {
                        this.a(false, this.field_nb);
                        return;
                      }
                    } else {
                      this.a(false, this.field_nb);
                      return;
                    }
                  }
                }
              }
              this.field_nb = null;
              this.a(0, (byte) -89);
              this.field_N = this.e((byte) -112);
              this.field_ab = this.g(1829947600);
              this.field_S = true;
              return;
            } else {
              if (this.b(this.field_yb, var2, -32)) {
                if (this.d(false)) {
                  this.field_yb = true;
                  if (var3 == 0) {
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = (String) null;
                      return;
                    }
                  } else {
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = (String) null;
                      return;
                    }
                  }
                } else {
                  if (this.field_yb) {
                    this.field_yb = false;
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = (String) null;
                      return;
                    }
                  } else {
                    if (-4 != (this.field_Q ^ -1)) {
                      this.a(3, (byte) -89);
                      this.field_S = true;
                      if (param0 == 111) {
                        return;
                      } else {
                        field_zb = (String) null;
                        return;
                      }
                    } else {
                      if (param0 == 111) {
                        return;
                      } else {
                        field_zb = (String) null;
                        return;
                      }
                    }
                  }
                }
              } else {
                this.field_yb = false;
                this.field_nb = this.a(this.field_yb, 250, 5690);
                if (this.field_nb != null) {
                  this.a(30, (byte) -89);
                  this.b(this.field_ab, (byte) -61, this.field_N);
                  this.l((byte) 111);
                  if (param0 == 111) {
                    return;
                  } else {
                    field_zb = (String) null;
                    return;
                  }
                } else {
                  if (3 == this.field_Q) {
                    this.a(0, (byte) -89);
                    this.field_S = true;
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = (String) null;
                      return;
                    }
                  } else {
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = (String) null;
                      return;
                    }
                  }
                }
              }
            }
          } else {
            var3 = 0;
            if (null != this.field_nb) {
              L2: {
                L3: {
                  var4 = this.field_nb.e((byte) -112) + -this.e((byte) -112);
                  var5 = this.field_nb.g(1829947600) + -this.g(1829947600);
                  if (!this.field_nb.o(124)) {
                    break L3;
                  } else {
                    if (var4 * var4 - -(var5 * var5) > 125000) {
                      break L3;
                    } else {
                      if (0 != (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) ^ -1)) {
                        this.a(false, this.field_nb);
                        break L2;
                      } else {
                        if (0 != (this.field_A.field_b.a(this.g(1829947600) + -48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                          this.a(false, this.field_nb);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.field_nb = null;
                this.a(0, (byte) -89);
                this.field_N = this.e((byte) -112);
                this.field_ab = this.g(1829947600);
                this.field_S = true;
                break L2;
              }
              return;
            } else {
              L4: {
                if (this.b(this.field_yb, var2, -32)) {
                  if (this.d(false)) {
                    this.field_yb = true;
                    if (var3 == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (param0 == 111) {
                          break L5;
                        } else {
                          field_zb = (String) null;
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    if (!this.field_yb) {
                      if (-4 == (this.field_Q ^ -1)) {
                        if (param0 == 111) {
                          return;
                        } else {
                          field_zb = (String) null;
                          return;
                        }
                      } else {
                        L6: {
                          this.a(3, (byte) -89);
                          this.field_S = true;
                          if (param0 == 111) {
                            break L6;
                          } else {
                            field_zb = (String) null;
                            break L6;
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        this.field_yb = false;
                        if (param0 == 111) {
                          break L7;
                        } else {
                          field_zb = (String) null;
                          break L7;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  this.field_yb = false;
                  this.field_nb = this.a(this.field_yb, 250, 5690);
                  if (this.field_nb != null) {
                    this.a(30, (byte) -89);
                    this.b(this.field_ab, (byte) -61, this.field_N);
                    this.l((byte) 111);
                    if (param0 == 111) {
                      return;
                    } else {
                      field_zb = (String) null;
                      return;
                    }
                  } else {
                    if (3 == this.field_Q) {
                      this.a(0, (byte) -89);
                      this.field_S = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (param0 != 111) {
                field_zb = (String) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          var3 = 0;
          if (null != this.field_nb) {
            L8: {
              L9: {
                var4 = this.field_nb.e((byte) -112) + -this.e((byte) -112);
                var5 = this.field_nb.g(1829947600) + -this.g(1829947600);
                if (!this.field_nb.o(124)) {
                  break L9;
                } else {
                  if (var4 * var4 - -(var5 * var5) > 125000) {
                    break L9;
                  } else {
                    if (0 != (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) ^ -1)) {
                      this.a(false, this.field_nb);
                      break L8;
                    } else {
                      if (0 != (this.field_A.field_b.a(this.g(1829947600) + -48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                        this.a(false, this.field_nb);
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              this.field_nb = null;
              this.a(0, (byte) -89);
              this.field_N = this.e((byte) -112);
              this.field_ab = this.g(1829947600);
              this.field_S = true;
              break L8;
            }
            return;
          } else {
            L10: {
              if (this.b(this.field_yb, var2, -32)) {
                if (this.d(false)) {
                  this.field_yb = true;
                  if (var3 == 0) {
                    break L10;
                  } else {
                    L11: {
                      if (param0 == 111) {
                        break L11;
                      } else {
                        field_zb = (String) null;
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  if (!this.field_yb) {
                    if (-4 == (this.field_Q ^ -1)) {
                      L12: {
                        if (param0 == 111) {
                          break L12;
                        } else {
                          field_zb = (String) null;
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L13: {
                        this.a(3, (byte) -89);
                        this.field_S = true;
                        if (param0 == 111) {
                          break L13;
                        } else {
                          field_zb = (String) null;
                          break L13;
                        }
                      }
                      return;
                    }
                  } else {
                    L14: {
                      this.field_yb = false;
                      if (param0 == 111) {
                        break L14;
                      } else {
                        field_zb = (String) null;
                        break L14;
                      }
                    }
                    return;
                  }
                }
              } else {
                this.field_yb = false;
                this.field_nb = this.a(this.field_yb, 250, 5690);
                if (this.field_nb != null) {
                  L15: {
                    this.a(30, (byte) -89);
                    this.b(this.field_ab, (byte) -61, this.field_N);
                    this.l((byte) 111);
                    if (param0 == 111) {
                      break L15;
                    } else {
                      field_zb = (String) null;
                      break L15;
                    }
                  }
                  return;
                } else {
                  if (3 == this.field_Q) {
                    this.a(0, (byte) -89);
                    this.field_S = true;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
            if (param0 != 111) {
              field_zb = (String) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void o(byte param0) {
        field_Cb = null;
        field_Eb = null;
        field_Gb = null;
        field_Bb = null;
        field_zb = null;
        if (param0 > -5) {
          return;
        } else {
          field_Ab = null;
          field_Fb = null;
          return;
        }
    }

    static {
        field_Cb = "Try changing the '<%0>' setting.";
        field_Db = 0;
        field_zb = "To server list";
        field_Eb = "Breach";
    }
}
