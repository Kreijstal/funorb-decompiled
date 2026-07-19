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
        L0: {
          L1: {
            this.field_yb = false;
            if (-3 == (this.field_D ^ -1)) {
              break L1;
            } else {
              if ((this.field_D ^ -1) == -5) {
                break L1;
              } else {
                if ((this.field_D ^ -1) != -7) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_lb = 17;
          this.field_cb = 71680;
          break L0;
        }
    }

    final void l(byte param0) {
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        boolean discarded$19 = false;
        boolean discarded$20 = false;
        boolean discarded$21 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_yb) {
            stackOut_2_0 = 2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0 * 250;
        if ((this.field_Q ^ -1) == -1) {
          if (!this.field_yb) {
            var3 = 1;
            if (null != this.field_nb) {
              var4 = this.field_nb.e((byte) -112) + -this.e((byte) -112);
              var5 = this.field_nb.g(1829947600) + -this.g(1829947600);
              if (this.field_nb.o(124)) {
                if (var4 * var4 - -(var5 * var5) <= 125000) {
                  L1: {
                    if (0 != (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) ^ -1)) {
                      discarded$11 = this.a(false, this.field_nb);
                      break L1;
                    } else {
                      if (0 != (this.field_A.field_b.a(this.g(1829947600) + -48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                        discarded$12 = this.a(false, this.field_nb);
                        break L1;
                      } else {
                        this.field_nb = null;
                        this.a(0, (byte) -89);
                        this.field_N = this.e((byte) -112);
                        this.field_ab = this.g(1829947600);
                        this.field_S = true;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          discarded$13 = this.a(false, this.field_nb);
                          break L1;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L2: {
                    this.field_nb = null;
                    this.a(0, (byte) -89);
                    this.field_N = this.e((byte) -112);
                    this.field_ab = this.g(1829947600);
                    this.field_S = true;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      discarded$14 = this.a(false, this.field_nb);
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                L3: {
                  this.field_nb = null;
                  this.a(0, (byte) -89);
                  this.field_N = this.e((byte) -112);
                  this.field_ab = this.g(1829947600);
                  this.field_S = true;
                  if (var6 == 0) {
                    break L3;
                  } else {
                    discarded$15 = this.a(false, this.field_nb);
                    break L3;
                  }
                }
                return;
              }
            } else {
              if (this.b(this.field_yb, var2, -32)) {
                L4: {
                  if (this.d(false)) {
                    this.field_yb = true;
                    if (var3 == 0) {
                      break L4;
                    } else {
                      if (param0 == 111) {
                        return;
                      } else {
                        field_zb = (String) null;
                        return;
                      }
                    }
                  } else {
                    L5: {
                      if (this.field_yb) {
                        break L5;
                      } else {
                        if (-4 != (this.field_Q ^ -1)) {
                          this.a(3, (byte) -89);
                          this.field_S = true;
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L5;
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
                    this.field_yb = false;
                    if (var6 == 0) {
                      break L4;
                    } else {
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
                    }
                  }
                }
                if (param0 == 111) {
                  return;
                } else {
                  field_zb = (String) null;
                  return;
                }
              } else {
                L6: {
                  this.field_yb = false;
                  this.field_nb = this.a(this.field_yb, 250, 5690);
                  if (this.field_nb != null) {
                    break L6;
                  } else {
                    if (3 == this.field_Q) {
                      this.a(0, (byte) -89);
                      this.field_S = true;
                      if (var6 != 0) {
                        break L6;
                      } else {
                        if (param0 == 111) {
                          return;
                        } else {
                          field_zb = (String) null;
                          return;
                        }
                      }
                    } else {
                      L7: {
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
                }
                this.a(30, (byte) -89);
                this.b(this.field_ab, (byte) -61, this.field_N);
                this.l((byte) 111);
                if (var6 != 0) {
                  L8: {
                    L9: {
                      if (this.d(false)) {
                        break L9;
                      } else {
                        L10: {
                          if (this.field_yb) {
                            break L10;
                          } else {
                            if (-4 != (this.field_Q ^ -1)) {
                              this.a(3, (byte) -89);
                              this.field_S = true;
                              if (var6 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        this.field_yb = false;
                        if (var6 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    this.field_yb = true;
                    if (var3 == 0) {
                      break L8;
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
                  }
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
            var3 = 0;
            if (null != this.field_nb) {
              L12: {
                L13: {
                  var4 = this.field_nb.e((byte) -112) + -this.e((byte) -112);
                  var5 = this.field_nb.g(1829947600) + -this.g(1829947600);
                  if (!this.field_nb.o(124)) {
                    break L13;
                  } else {
                    if (var4 * var4 - -(var5 * var5) > 125000) {
                      break L13;
                    } else {
                      if (0 != (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) ^ -1)) {
                        discarded$16 = this.a(false, this.field_nb);
                        break L12;
                      } else {
                        if (0 != (this.field_A.field_b.a(this.g(1829947600) + -48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                          discarded$17 = this.a(false, this.field_nb);
                          break L12;
                        } else {
                          break L13;
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
                if (var6 == 0) {
                  break L12;
                } else {
                  discarded$18 = this.a(false, this.field_nb);
                  break L12;
                }
              }
              return;
            } else {
              L14: {
                if (this.b(this.field_yb, var2, -32)) {
                  if (this.d(false)) {
                    this.field_yb = true;
                    if (var3 == 0) {
                      break L14;
                    } else {
                      L15: {
                        if (param0 == 111) {
                          break L15;
                        } else {
                          field_zb = (String) null;
                          break L15;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      if (this.field_yb) {
                        break L16;
                      } else {
                        if (-4 != (this.field_Q ^ -1)) {
                          this.a(3, (byte) -89);
                          this.field_S = true;
                          if (var6 == 0) {
                            break L14;
                          } else {
                            break L16;
                          }
                        } else {
                          L17: {
                            if (param0 == 111) {
                              break L17;
                            } else {
                              field_zb = (String) null;
                              break L17;
                            }
                          }
                          return;
                        }
                      }
                    }
                    this.field_yb = false;
                    if (var6 == 0) {
                      break L14;
                    } else {
                      L18: {
                        this.field_yb = true;
                        if (var3 == 0) {
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (param0 == 111) {
                          break L19;
                        } else {
                          field_zb = (String) null;
                          break L19;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L20: {
                    this.field_yb = false;
                    this.field_nb = this.a(this.field_yb, 250, 5690);
                    if (this.field_nb != null) {
                      break L20;
                    } else {
                      if (3 == this.field_Q) {
                        this.a(0, (byte) -89);
                        this.field_S = true;
                        if (var6 == 0) {
                          break L14;
                        } else {
                          break L20;
                        }
                      } else {
                        L21: {
                          if (param0 == 111) {
                            break L21;
                          } else {
                            field_zb = (String) null;
                            break L21;
                          }
                        }
                        return;
                      }
                    }
                  }
                  this.a(30, (byte) -89);
                  this.b(this.field_ab, (byte) -61, this.field_N);
                  this.l((byte) 111);
                  if (var6 == 0) {
                    break L14;
                  } else {
                    L22: {
                      L23: {
                        if (this.d(false)) {
                          break L23;
                        } else {
                          L24: {
                            if (this.field_yb) {
                              break L24;
                            } else {
                              if (-4 != (this.field_Q ^ -1)) {
                                this.a(3, (byte) -89);
                                this.field_S = true;
                                if (var6 == 0) {
                                  break L22;
                                } else {
                                  break L24;
                                }
                              } else {
                                break L22;
                              }
                            }
                          }
                          this.field_yb = false;
                          if (var6 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      this.field_yb = true;
                      if (var3 == 0) {
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L25: {
                      if (param0 == 111) {
                        break L25;
                      } else {
                        field_zb = (String) null;
                        break L25;
                      }
                    }
                    return;
                  }
                }
              }
              if (param0 == 111) {
                return;
              } else {
                field_zb = (String) null;
                return;
              }
            }
          }
        } else {
          var3 = 0;
          if (null != this.field_nb) {
            L26: {
              L27: {
                var4 = this.field_nb.e((byte) -112) + -this.e((byte) -112);
                var5 = this.field_nb.g(1829947600) + -this.g(1829947600);
                if (!this.field_nb.o(124)) {
                  break L27;
                } else {
                  if (var4 * var4 - -(var5 * var5) > 125000) {
                    break L27;
                  } else {
                    if (0 != (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) ^ -1)) {
                      discarded$19 = this.a(false, this.field_nb);
                      break L26;
                    } else {
                      if (0 != (this.field_A.field_b.a(this.g(1829947600) + -48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) + -48, false, false) ^ -1)) {
                        discarded$20 = this.a(false, this.field_nb);
                        break L26;
                      } else {
                        break L27;
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
              if (var6 == 0) {
                break L26;
              } else {
                discarded$21 = this.a(false, this.field_nb);
                break L26;
              }
            }
            return;
          } else {
            L28: {
              if (this.b(this.field_yb, var2, -32)) {
                if (this.d(false)) {
                  this.field_yb = true;
                  if (var3 == 0) {
                    break L28;
                  } else {
                    L29: {
                      if (param0 == 111) {
                        break L29;
                      } else {
                        field_zb = (String) null;
                        break L29;
                      }
                    }
                    return;
                  }
                } else {
                  L30: {
                    if (this.field_yb) {
                      break L30;
                    } else {
                      if (-4 != (this.field_Q ^ -1)) {
                        this.a(3, (byte) -89);
                        this.field_S = true;
                        if (var6 == 0) {
                          break L28;
                        } else {
                          break L30;
                        }
                      } else {
                        L31: {
                          if (param0 == 111) {
                            break L31;
                          } else {
                            field_zb = (String) null;
                            break L31;
                          }
                        }
                        return;
                      }
                    }
                  }
                  this.field_yb = false;
                  if (var6 == 0) {
                    break L28;
                  } else {
                    L32: {
                      this.field_yb = true;
                      if (var3 == 0) {
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      if (param0 == 111) {
                        break L33;
                      } else {
                        field_zb = (String) null;
                        break L33;
                      }
                    }
                    return;
                  }
                }
              } else {
                L34: {
                  this.field_yb = false;
                  this.field_nb = this.a(this.field_yb, 250, 5690);
                  if (this.field_nb != null) {
                    break L34;
                  } else {
                    if (3 == this.field_Q) {
                      this.a(0, (byte) -89);
                      this.field_S = true;
                      if (var6 == 0) {
                        break L28;
                      } else {
                        break L34;
                      }
                    } else {
                      L35: {
                        if (param0 == 111) {
                          break L35;
                        } else {
                          field_zb = (String) null;
                          break L35;
                        }
                      }
                      return;
                    }
                  }
                }
                this.a(30, (byte) -89);
                this.b(this.field_ab, (byte) -61, this.field_N);
                this.l((byte) 111);
                if (var6 == 0) {
                  break L28;
                } else {
                  L36: {
                    L37: {
                      if (this.d(false)) {
                        break L37;
                      } else {
                        L38: {
                          if (this.field_yb) {
                            break L38;
                          } else {
                            if (-4 != (this.field_Q ^ -1)) {
                              this.a(3, (byte) -89);
                              this.field_S = true;
                              if (var6 == 0) {
                                break L36;
                              } else {
                                break L38;
                              }
                            } else {
                              break L36;
                            }
                          }
                        }
                        this.field_yb = false;
                        if (var6 == 0) {
                          break L36;
                        } else {
                          break L37;
                        }
                      }
                    }
                    this.field_yb = true;
                    if (var3 == 0) {
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L39: {
                    if (param0 == 111) {
                      break L39;
                    } else {
                      field_zb = (String) null;
                      break L39;
                    }
                  }
                  return;
                }
              }
            }
            if (param0 == 111) {
              return;
            } else {
              field_zb = (String) null;
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
        }
        field_Ab = null;
        field_Fb = null;
    }

    static {
        field_Cb = "Try changing the '<%0>' setting.";
        field_Db = 0;
        field_zb = "To server list";
        field_Eb = "Breach";
    }
}
