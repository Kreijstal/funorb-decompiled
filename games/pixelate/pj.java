/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static tf field_a;
    private int field_h;
    private tf field_e;
    static ak field_i;
    boolean field_f;
    private int field_b;
    private int field_g;
    private int field_d;
    private int field_j;
    private int field_c;

    final static void a(byte param0, boolean param1) {
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 87) {
          field_i = (ak) null;
          if (param1) {
            bm.field_o = false;
            if (param1) {
              if (0 >= oo.field_b) {
                if ((vn.field_g ^ -1) < -1) {
                  vn.field_g = vn.field_g - 1;
                  return;
                } else {
                  if (0 < h.field_W) {
                    h.field_W = h.field_W - 1;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                oo.field_b = oo.field_b - 1;
                return;
              }
            } else {
              if (io.field_c == null) {
                if (null == bn.field_S) {
                  bm.field_o = false;
                  if ((vn.field_g ^ -1) < -1) {
                    vn.field_g = vn.field_g - 1;
                    return;
                  } else {
                    if (-1 > (h.field_W ^ -1)) {
                      h.field_W = h.field_W - 1;
                      return;
                    } else {
                      if ((qh.field_c ^ -1) < (oo.field_b ^ -1)) {
                        if (oo.field_b != 0) {
                          oo.field_b = oo.field_b + 1;
                          return;
                        } else {
                          gd.a((byte) -7);
                          oo.field_b = oo.field_b + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if ((oo.field_b ^ -1) >= -1) {
                    if (h.field_W <= 0) {
                      if ((vn.field_g ^ -1) > (qh.field_c ^ -1)) {
                        if (-1 == (vn.field_g ^ -1)) {
                          nl.a(true, -71);
                          vn.field_g = vn.field_g + 1;
                          return;
                        } else {
                          vn.field_g = vn.field_g + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      h.field_W = h.field_W - 1;
                      return;
                    }
                  } else {
                    oo.field_b = oo.field_b - 1;
                    return;
                  }
                }
              } else {
                if (0 >= oo.field_b) {
                  if (vn.field_g <= 0) {
                    if ((qh.field_c ^ -1) < (h.field_W ^ -1)) {
                      L0: {
                        if (0 == h.field_W) {
                          nl.a(false, -102);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                      h.field_W = h.field_W + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    vn.field_g = vn.field_g - 1;
                    return;
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  return;
                }
              }
            }
          } else {
            if (io.field_c == null) {
              bm.field_o = false;
              if (param1) {
                if (0 >= oo.field_b) {
                  if ((vn.field_g ^ -1) < -1) {
                    vn.field_g = vn.field_g - 1;
                    return;
                  } else {
                    if (0 < h.field_W) {
                      h.field_W = h.field_W - 1;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  return;
                }
              } else {
                if (io.field_c == null) {
                  if (null == bn.field_S) {
                    bm.field_o = false;
                    if ((vn.field_g ^ -1) < -1) {
                      vn.field_g = vn.field_g - 1;
                      return;
                    } else {
                      if (-1 > (h.field_W ^ -1)) {
                        h.field_W = h.field_W - 1;
                        return;
                      } else {
                        if ((qh.field_c ^ -1) < (oo.field_b ^ -1)) {
                          if (oo.field_b != 0) {
                            oo.field_b = oo.field_b + 1;
                            return;
                          } else {
                            gd.a((byte) -7);
                            oo.field_b = oo.field_b + 1;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if ((oo.field_b ^ -1) >= -1) {
                      if (h.field_W <= 0) {
                        if ((vn.field_g ^ -1) > (qh.field_c ^ -1)) {
                          if (-1 == (vn.field_g ^ -1)) {
                            nl.a(true, -71);
                            vn.field_g = vn.field_g + 1;
                            return;
                          } else {
                            vn.field_g = vn.field_g + 1;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        h.field_W = h.field_W - 1;
                        return;
                      }
                    } else {
                      oo.field_b = oo.field_b - 1;
                      return;
                    }
                  }
                } else {
                  if (0 >= oo.field_b) {
                    if (vn.field_g <= 0) {
                      if ((qh.field_c ^ -1) < (h.field_W ^ -1)) {
                        L1: {
                          if (0 == h.field_W) {
                            nl.a(false, -102);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        h.field_W = h.field_W + 1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      vn.field_g = vn.field_g - 1;
                      return;
                    }
                  } else {
                    oo.field_b = oo.field_b - 1;
                    return;
                  }
                }
              }
            } else {
              if (param1) {
                if (0 >= oo.field_b) {
                  if ((vn.field_g ^ -1) < -1) {
                    vn.field_g = vn.field_g - 1;
                    return;
                  } else {
                    if (0 < h.field_W) {
                      h.field_W = h.field_W - 1;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  return;
                }
              } else {
                if (io.field_c == null) {
                  if (null == bn.field_S) {
                    bm.field_o = false;
                    if ((vn.field_g ^ -1) < -1) {
                      vn.field_g = vn.field_g - 1;
                      return;
                    } else {
                      if (-1 > (h.field_W ^ -1)) {
                        h.field_W = h.field_W - 1;
                        return;
                      } else {
                        if ((qh.field_c ^ -1) < (oo.field_b ^ -1)) {
                          if (oo.field_b != 0) {
                            oo.field_b = oo.field_b + 1;
                            return;
                          } else {
                            gd.a((byte) -7);
                            oo.field_b = oo.field_b + 1;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if ((oo.field_b ^ -1) >= -1) {
                      if (h.field_W <= 0) {
                        if ((vn.field_g ^ -1) > (qh.field_c ^ -1)) {
                          if (-1 == (vn.field_g ^ -1)) {
                            nl.a(true, -71);
                            vn.field_g = vn.field_g + 1;
                            return;
                          } else {
                            vn.field_g = vn.field_g + 1;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        h.field_W = h.field_W - 1;
                        return;
                      }
                    } else {
                      oo.field_b = oo.field_b - 1;
                      return;
                    }
                  }
                } else {
                  L2: {
                    if (0 >= oo.field_b) {
                      if (vn.field_g <= 0) {
                        if ((qh.field_c ^ -1) < (h.field_W ^ -1)) {
                          L3: {
                            if (0 == h.field_W) {
                              nl.a(false, -102);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          h.field_W = h.field_W + 1;
                          return;
                        } else {
                          break L2;
                        }
                      } else {
                        vn.field_g = vn.field_g - 1;
                        break L2;
                      }
                    } else {
                      oo.field_b = oo.field_b - 1;
                      break L2;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          L4: {
            if (param1) {
              bm.field_o = false;
              break L4;
            } else {
              if (io.field_c == null) {
                bm.field_o = false;
                break L4;
              } else {
                break L4;
              }
            }
          }
          if (param1) {
            if (0 >= oo.field_b) {
              if ((vn.field_g ^ -1) < -1) {
                vn.field_g = vn.field_g - 1;
                return;
              } else {
                if (0 < h.field_W) {
                  h.field_W = h.field_W - 1;
                  return;
                } else {
                  return;
                }
              }
            } else {
              oo.field_b = oo.field_b - 1;
              return;
            }
          } else {
            L5: {
              if (io.field_c == null) {
                if (null == bn.field_S) {
                  bm.field_o = false;
                  if ((vn.field_g ^ -1) < -1) {
                    vn.field_g = vn.field_g - 1;
                    return;
                  } else {
                    if (-1 > (h.field_W ^ -1)) {
                      h.field_W = h.field_W - 1;
                      return;
                    } else {
                      if ((qh.field_c ^ -1) < (oo.field_b ^ -1)) {
                        if (oo.field_b == 0) {
                          gd.a((byte) -7);
                          oo.field_b = oo.field_b + 1;
                          break L5;
                        } else {
                          oo.field_b = oo.field_b + 1;
                          return;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                } else {
                  if ((oo.field_b ^ -1) >= -1) {
                    if (h.field_W <= 0) {
                      if ((vn.field_g ^ -1) > (qh.field_c ^ -1)) {
                        if (-1 == (vn.field_g ^ -1)) {
                          nl.a(true, -71);
                          vn.field_g = vn.field_g + 1;
                          break L5;
                        } else {
                          vn.field_g = vn.field_g + 1;
                          return;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      h.field_W = h.field_W - 1;
                      break L5;
                    }
                  } else {
                    oo.field_b = oo.field_b - 1;
                    break L5;
                  }
                }
              } else {
                if (0 >= oo.field_b) {
                  if (vn.field_g <= 0) {
                    if ((qh.field_c ^ -1) < (h.field_W ^ -1)) {
                      L6: {
                        if (0 == h.field_W) {
                          nl.a(false, -102);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      h.field_W = h.field_W + 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    vn.field_g = vn.field_g - 1;
                    break L5;
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    final void a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        try {
            this.field_h = 0;
            this.field_c = param1;
            if (param2 != -1379417087) {
                this.field_b = -57;
            }
            this.field_g = 0;
            this.field_d = param3;
            this.field_f = false;
            this.field_j = 0;
            var5_int = rk.field_e.c(param0);
            if (!((var5_int ^ -1) >= (this.field_e.field_A ^ -1))) {
                this.field_e = new tf(10 + var5_int, this.field_e.field_B);
            }
            this.field_e.c();
            t.d();
            rk.field_e.b(param0, this.field_e.field_A >> -1379417087, this.field_e.field_B, 0, -1);
            qa.field_f.a(19692);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        if (param3 <= 19) {
            field_a = (tf) null;
            if ((t.field_d ^ -1) <= (param1 - -param2 - -param0 ^ -1)) {
                return param1 + param2;
            }
            if (!(0 > -param0 + param1)) {
                return -param0 + param1;
            }
            return t.field_d + -param0;
        }
        if ((t.field_d ^ -1) <= (param1 - -param2 - -param0 ^ -1)) {
            return param1 + param2;
        }
        if (!(0 > -param0 + param1)) {
            return -param0 + param1;
        }
        return t.field_d + -param0;
    }

    final void a(byte param0) {
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 <= -22) {
          if (this.field_f) {
            return;
          } else {
            if ((this.field_h ^ -1) <= -9) {
              if (66 > this.field_h) {
                this.field_e.b(this.field_c + -(this.field_e.field_A >> 1343830689), this.field_d - (this.field_e.field_B >> 802407105));
                return;
              } else {
                if (0 < this.field_b) {
                  this.field_e.c(this.field_c - (this.field_j >> -371053727), -(this.field_g >> -1824177279) + this.field_d, this.field_j, this.field_g, this.field_b);
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_e.d(-(this.field_j >> 1692418881) + this.field_c, -(this.field_g >> 221394785) + this.field_d, this.field_j, this.field_g);
              return;
            }
          }
        } else {
          this.field_j = -90;
          if (this.field_f) {
            return;
          } else {
            if ((this.field_h ^ -1) <= -9) {
              if (66 > this.field_h) {
                this.field_e.b(this.field_c + -(this.field_e.field_A >> 1343830689), this.field_d - (this.field_e.field_B >> 802407105));
                return;
              } else {
                if (0 < this.field_b) {
                  this.field_e.c(this.field_c - (this.field_j >> -371053727), -(this.field_g >> -1824177279) + this.field_d, this.field_j, this.field_g, this.field_b);
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_e.d(-(this.field_j >> 1692418881) + this.field_c, -(this.field_g >> 221394785) + this.field_d, this.field_j, this.field_g);
              return;
            }
          }
        }
    }

    final void a(int param0) {
        int discarded$0 = 0;
        int var2 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (!(!this.field_f)) {
            return;
        }
        this.field_h = this.field_h + 1;
        if (this.field_h >= 8) {
            if (66 > this.field_h) {
                if (param0 <= -55) {
                    return;
                }
                discarded$0 = pj.a(31, 2, 48, (byte) 8);
                return;
            }
            if (-77 < (this.field_h ^ -1)) {
                var2 = -58 + (-8 + this.field_h);
                this.field_g = this.field_e.field_B;
                this.field_j = (var2 << -845252860) + this.field_e.field_A;
                this.field_b = (10 - var2) * 256 / 10;
                if (param0 <= -55) {
                    return;
                }
                discarded$1 = pj.a(31, 2, 48, (byte) 8);
                return;
            }
            this.field_f = true;
            if (param0 > -55) {
                discarded$2 = pj.a(31, 2, 48, (byte) 8);
                return;
            }
            return;
        }
        this.field_g = this.field_h * this.field_e.field_B / 8;
        this.field_j = this.field_h * this.field_e.field_A / 8;
        if (param0 > -55) {
            discarded$3 = pj.a(31, 2, 48, (byte) 8);
            return;
        }
    }

    pj() {
        this.field_h = 0;
        this.field_e = new tf(320, 21);
        this.field_f = true;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
        field_i = null;
    }

    static {
    }
}
