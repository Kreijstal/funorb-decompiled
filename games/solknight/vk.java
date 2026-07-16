/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends jf {
    private int field_d;
    static o[] field_i;
    static char[] field_e;
    private int field_h;
    private String field_k;
    static int field_m;
    static int field_g;
    static int field_p;
    private int field_n;
    private int field_o;
    private int field_f;
    private boolean field_j;
    private mg field_l;

    final void a(mg param0, byte param1, int param2, int param3, String param4) {
        int var6 = 0;
        le var8 = null;
        le var9 = null;
        le var10 = null;
        if (param4 != null) {
          var6 = 118 / ((-3 - param1) / 61);
          if (param0 == ((vk) this).field_l) {
            if (((vk) this).field_j) {
              if (-1 == (((vk) this).field_h ^ -1)) {
                if (null != ((vk) this).field_k) {
                  if (((vk) this).field_k.equals((Object) (Object) param4)) {
                    return;
                  } else {
                    ((vk) this).field_j = true;
                    ((vk) this).field_k = param4;
                    ((vk) this).field_h = 0;
                    ((vk) this).field_l = param0;
                    var10 = this.a(param0, param4, param3, (byte) 125);
                    var10.field_c[0] = param2;
                    var10.field_c[param4.length()] = param0.b(param4) + param2;
                    lc.a(123, 0, param4, var10, param0);
                    return;
                  }
                } else {
                  ((vk) this).field_j = true;
                  ((vk) this).field_k = param4;
                  ((vk) this).field_h = 0;
                  ((vk) this).field_l = param0;
                  var10 = this.a(param0, param4, param3, (byte) 125);
                  var10.field_c[0] = param2;
                  var10.field_c[param4.length()] = param0.b(param4) + param2;
                  lc.a(123, 0, param4, var10, param0);
                  return;
                }
              } else {
                ((vk) this).field_j = true;
                ((vk) this).field_k = param4;
                ((vk) this).field_h = 0;
                ((vk) this).field_l = param0;
                var10 = this.a(param0, param4, param3, (byte) 125);
                var10.field_c[0] = param2;
                var10.field_c[param4.length()] = param0.b(param4) + param2;
                lc.a(123, 0, param4, var10, param0);
                return;
              }
            } else {
              ((vk) this).field_j = true;
              ((vk) this).field_k = param4;
              ((vk) this).field_h = 0;
              ((vk) this).field_l = param0;
              var9 = this.a(param0, param4, param3, (byte) 125);
              var9.field_c[0] = param2;
              var9.field_c[param4.length()] = param0.b(param4) + param2;
              lc.a(123, 0, param4, var9, param0);
              return;
            }
          } else {
            ((vk) this).field_j = true;
            ((vk) this).field_k = param4;
            ((vk) this).field_h = 0;
            ((vk) this).field_l = param0;
            var8 = this.a(param0, param4, param3, (byte) 125);
            var8.field_c[0] = param2;
            var8.field_c[param4.length()] = param0.b(param4) + param2;
            lc.a(123, 0, param4, var8, param0);
            return;
          }
        } else {
          ((vk) this).field_c = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, mg param3, String param4) {
        int var7 = 0;
        le var9 = null;
        le var10 = null;
        le var11 = null;
        le var12 = null;
        if (param4 == null) {
          ((vk) this).field_c = null;
          return;
        } else {
          if (param3 == ((vk) this).field_l) {
            if (((vk) this).field_j) {
              if ((((vk) this).field_h ^ -1) == -2) {
                if (null != ((vk) this).field_k) {
                  if (!((vk) this).field_k.equals((Object) (Object) param4)) {
                    ((vk) this).field_l = param3;
                    ((vk) this).field_h = 1;
                    ((vk) this).field_j = true;
                    var11 = this.a(param3, param4, param2, (byte) 127);
                    var7 = param3.b(param4);
                    var11.field_c[0] = -(var7 >> -1161140319) + param0;
                    var11.field_c[param4.length()] = (var7 >> -1664397695) + param0;
                    lc.a(125, param1, param4, var11, param3);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((vk) this).field_l = param3;
                  ((vk) this).field_h = 1;
                  ((vk) this).field_j = true;
                  var12 = this.a(param3, param4, param2, (byte) 127);
                  var7 = param3.b(param4);
                  var12.field_c[0] = -(var7 >> -1161140319) + param0;
                  var12.field_c[param4.length()] = (var7 >> -1664397695) + param0;
                  lc.a(125, param1, param4, var12, param3);
                  return;
                }
              } else {
                ((vk) this).field_l = param3;
                ((vk) this).field_h = 1;
                ((vk) this).field_j = true;
                var12 = this.a(param3, param4, param2, (byte) 127);
                var7 = param3.b(param4);
                var12.field_c[0] = -(var7 >> -1161140319) + param0;
                var12.field_c[param4.length()] = (var7 >> -1664397695) + param0;
                lc.a(125, param1, param4, var12, param3);
                return;
              }
            } else {
              ((vk) this).field_l = param3;
              ((vk) this).field_h = 1;
              ((vk) this).field_j = true;
              var10 = this.a(param3, param4, param2, (byte) 127);
              var7 = param3.b(param4);
              var10.field_c[0] = -(var7 >> -1161140319) + param0;
              var10.field_c[param4.length()] = (var7 >> -1664397695) + param0;
              lc.a(125, param1, param4, var10, param3);
              return;
            }
          } else {
            ((vk) this).field_l = param3;
            ((vk) this).field_h = 1;
            ((vk) this).field_j = true;
            var9 = this.a(param3, param4, param2, (byte) 127);
            var7 = param3.b(param4);
            var9.field_c[0] = -(var7 >> -1161140319) + param0;
            var9.field_c[param4.length()] = (var7 >> -1664397695) + param0;
            lc.a(125, param1, param4, var9, param3);
            return;
          }
        }
    }

    final void a(int param0, mg param1, int param2, String param3, int param4) {
        le var8 = null;
        le var10 = null;
        le var11 = null;
        le var12 = null;
        if (param3 == null) {
          ((vk) this).field_c = null;
          return;
        } else {
          if (((vk) this).field_l == param1) {
            if (((vk) this).field_j) {
              L0: {
                if (-3 != (((vk) this).field_h ^ -1)) {
                  break L0;
                } else {
                  if (((vk) this).field_k == null) {
                    break L0;
                  } else {
                    if (!((vk) this).field_k.equals((Object) (Object) param3)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((vk) this).field_j = true;
              ((vk) this).field_k = param3;
              ((vk) this).field_l = param1;
              ((vk) this).field_h = 2;
              var8 = this.a(param1, param3, param2, (byte) 127);
              var12 = var8;
              var12.field_c[0] = param4 - param1.b(param3);
              if (param0 != -13323) {
                ((vk) this).field_d = -67;
                var12.field_c[param3.length()] = param4;
                lc.a(113, 0, param3, var12, param1);
                return;
              } else {
                var12.field_c[param3.length()] = param4;
                lc.a(113, 0, param3, var12, param1);
                return;
              }
            } else {
              ((vk) this).field_j = true;
              ((vk) this).field_k = param3;
              ((vk) this).field_l = param1;
              ((vk) this).field_h = 2;
              var8 = this.a(param1, param3, param2, (byte) 127);
              var11 = var8;
              var11.field_c[0] = param4 - param1.b(param3);
              if (param0 != -13323) {
                ((vk) this).field_d = -67;
                var11.field_c[param3.length()] = param4;
                lc.a(113, 0, param3, var11, param1);
                return;
              } else {
                var11.field_c[param3.length()] = param4;
                lc.a(113, 0, param3, var11, param1);
                return;
              }
            }
          } else {
            ((vk) this).field_j = true;
            ((vk) this).field_k = param3;
            ((vk) this).field_l = param1;
            ((vk) this).field_h = 2;
            var8 = this.a(param1, param3, param2, (byte) 127);
            var10 = var8;
            var10.field_c[0] = param4 - param1.b(param3);
            if (param0 != -13323) {
              ((vk) this).field_d = -67;
              var10.field_c[param3.length()] = param4;
              lc.a(113, 0, param3, var10, param1);
              return;
            } else {
              var10.field_c[param3.length()] = param4;
              lc.a(113, 0, param3, var10, param1);
              return;
            }
          }
        }
    }

    private final le a(mg param0, String param1, int param2, byte param3) {
        le var5 = null;
        le var6 = null;
        if (param3 <= 121) {
          return null;
        } else {
          var6 = new le(param2 + -param0.field_F, param2 - -param0.field_s, param1.length());
          var5 = var6;
          ((vk) this).field_c = new le[]{var6};
          return var5;
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        rb var4_ref_rb = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        if (param0 < -116) {
          var1 = -16000;
          var2 = -7680;
          var3 = ud.field_k;
          if (kf.field_G != null) {
            var5 = kf.field_G.length + -1;
            L0: while (true) {
              if (var5 <= 0) {
                L1: {
                  var5 = 0;
                  if (kf.field_G.length <= var5) {
                    break L1;
                  } else {
                    L2: {
                      if (kf.field_G[var5] == null) {
                        var5++;
                        break L2;
                      } else {
                        kf.field_G[var5] = kf.field_G[var5].b(15);
                        var5++;
                        break L2;
                      }
                    }
                    var5++;
                    var5++;
                    break L1;
                  }
                }
                L3: {
                  if (-16000 == var1) {
                    var1 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (0 <= ve.field_b) {
                    ic.field_t = ic.field_t - (lc.field_h >>> 1363236177) * ud.field_k;
                    bi.field_i = bi.field_i - ud.field_k;
                    ud.field_k = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((ud.field_k ^ -1) >= (qh.field_a[7] ^ -1)) {
                    break L5;
                  } else {
                    var4 = ud.field_k + -qh.field_a[7];
                    ic.field_t = ic.field_t - (lc.field_h >>> -418187375) * var4;
                    bi.field_i = bi.field_i - var4;
                    ud.field_k = qh.field_a[7];
                    break L5;
                  }
                }
                wg.field_e = (wg.field_e * 9 + var2) / 10;
                sk.field_o = (sk.field_o * 9 - -var1) / 10;
                if (1 * qh.field_a[7] / 10 > var3) {
                  L6: {
                    if ((ud.field_k ^ -1) <= (qh.field_a[7] * 1 / 10 ^ -1)) {
                      vk.a(250, (byte) 89, 5);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var3 >= qh.field_a[7] * 3 / 10) {
                      break L7;
                    } else {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] * 3 / 10 ^ -1)) {
                        vk.a(249, (byte) 89, 6);
                        break L7;
                      } else {
                        L8: {
                          if ((6 * qh.field_a[7] / 10 ^ -1) >= (var3 ^ -1)) {
                            break L8;
                          } else {
                            if ((qh.field_a[7] * 6 / 10 ^ -1) < (ud.field_k ^ -1)) {
                              break L8;
                            } else {
                              vk.a(248, (byte) 89, 7);
                              break L8;
                            }
                          }
                        }
                        if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
                          L9: {
                            if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                              vk.a(247, (byte) 89, 8);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L10: {
                    if ((6 * qh.field_a[7] / 10 ^ -1) >= (var3 ^ -1)) {
                      break L10;
                    } else {
                      if ((qh.field_a[7] * 6 / 10 ^ -1) < (ud.field_k ^ -1)) {
                        break L10;
                      } else {
                        vk.a(248, (byte) 89, 7);
                        if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
                          L11: {
                            if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                              vk.a(247, (byte) 89, 8);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
                    L12: {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                        vk.a(247, (byte) 89, 8);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L13: {
                    if (var3 >= qh.field_a[7] * 3 / 10) {
                      break L13;
                    } else {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] * 3 / 10 ^ -1)) {
                        vk.a(249, (byte) 89, 6);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if ((6 * qh.field_a[7] / 10 ^ -1) >= (var3 ^ -1)) {
                      break L14;
                    } else {
                      if ((qh.field_a[7] * 6 / 10 ^ -1) < (ud.field_k ^ -1)) {
                        break L14;
                      } else {
                        vk.a(248, (byte) 89, 7);
                        break L14;
                      }
                    }
                  }
                  if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
                    L15: {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                        vk.a(247, (byte) 89, 8);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L16: {
                  if (null == kf.field_G[var5]) {
                    break L16;
                  } else {
                    if ((kf.field_G[var5].field_j ^ -1) > -26) {
                      break L16;
                    } else {
                      if (-32 == (kf.field_G[var5].field_j ^ -1)) {
                        break L16;
                      } else {
                        L17: {
                          if (Math.abs(kf.field_G[var5].field_a) - -Math.abs(-7680 + kf.field_G[var5].field_b) >= Math.abs(var1) + Math.abs(var2 - 7680)) {
                            break L17;
                          } else {
                            if (kf.field_G[var5].field_b >= 7040) {
                              break L17;
                            } else {
                              var1 = kf.field_G[var5].field_c * 15 + kf.field_G[var5].field_a;
                              var2 = kf.field_G[var5].field_d * 15 + kf.field_G[var5].field_b;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (null == kf.field_G[-1 + var5]) {
                            break L18;
                          } else {
                            if ((kf.field_G[-1 + var5].field_j ^ -1) > -26) {
                              break L18;
                            } else {
                              if (31 != kf.field_G[var5 + -1].field_j) {
                                break L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        var4_ref_rb = kf.field_G[var5];
                        kf.field_G[var5] = kf.field_G[-1 + var5];
                        kf.field_G[var5 - 1] = var4_ref_rb;
                        break L16;
                      }
                    }
                  }
                }
                var5--;
                continue L0;
              }
            }
          } else {
            L19: {
              if (-16000 == var1) {
                var1 = 0;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (0 <= ve.field_b) {
                ic.field_t = ic.field_t - (lc.field_h >>> 1363236177) * ud.field_k;
                bi.field_i = bi.field_i - ud.field_k;
                ud.field_k = 0;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if ((ud.field_k ^ -1) >= (qh.field_a[7] ^ -1)) {
                break L21;
              } else {
                var4 = ud.field_k + -qh.field_a[7];
                ic.field_t = ic.field_t - (lc.field_h >>> -418187375) * var4;
                bi.field_i = bi.field_i - var4;
                ud.field_k = qh.field_a[7];
                break L21;
              }
            }
            L22: {
              wg.field_e = (wg.field_e * 9 + var2) / 10;
              sk.field_o = (sk.field_o * 9 - -var1) / 10;
              if (1 * qh.field_a[7] / 10 <= var3) {
                break L22;
              } else {
                if ((ud.field_k ^ -1) <= (qh.field_a[7] * 1 / 10 ^ -1)) {
                  vk.a(250, (byte) 89, 5);
                  break L22;
                } else {
                  L23: {
                    if (var3 >= qh.field_a[7] * 3 / 10) {
                      break L23;
                    } else {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] * 3 / 10 ^ -1)) {
                        vk.a(249, (byte) 89, 6);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if ((6 * qh.field_a[7] / 10 ^ -1) >= (var3 ^ -1)) {
                      break L24;
                    } else {
                      if ((qh.field_a[7] * 6 / 10 ^ -1) < (ud.field_k ^ -1)) {
                        break L24;
                      } else {
                        vk.a(248, (byte) 89, 7);
                        break L24;
                      }
                    }
                  }
                  if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
                    L25: {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                        vk.a(247, (byte) 89, 8);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            L26: {
              if (var3 >= qh.field_a[7] * 3 / 10) {
                break L26;
              } else {
                if ((ud.field_k ^ -1) <= (qh.field_a[7] * 3 / 10 ^ -1)) {
                  vk.a(249, (byte) 89, 6);
                  break L26;
                } else {
                  L27: {
                    if ((6 * qh.field_a[7] / 10 ^ -1) >= (var3 ^ -1)) {
                      break L27;
                    } else {
                      if ((qh.field_a[7] * 6 / 10 ^ -1) < (ud.field_k ^ -1)) {
                        break L27;
                      } else {
                        vk.a(248, (byte) 89, 7);
                        break L27;
                      }
                    }
                  }
                  if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
                    L28: {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                        vk.a(247, (byte) 89, 8);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            L29: {
              if ((6 * qh.field_a[7] / 10 ^ -1) >= (var3 ^ -1)) {
                break L29;
              } else {
                if ((qh.field_a[7] * 6 / 10 ^ -1) < (ud.field_k ^ -1)) {
                  break L29;
                } else {
                  vk.a(248, (byte) 89, 7);
                  if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
                    L30: {
                      if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                        vk.a(247, (byte) 89, 8);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
              L31: {
                if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                  vk.a(247, (byte) 89, 8);
                  break L31;
                } else {
                  break L31;
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          L32: {
            field_e = null;
            var1 = -16000;
            var2 = -7680;
            var3 = ud.field_k;
            if (kf.field_G == null) {
              break L32;
            } else {
              L33: {
                var5 = kf.field_G.length + -1;
                if (var5 <= 0) {
                  break L33;
                } else {
                  L34: {
                    L35: {
                      L36: {
                        L37: {
                          if (null == kf.field_G[var5]) {
                            var5--;
                            break L37;
                          } else {
                            if ((kf.field_G[var5].field_j ^ -1) > -26) {
                              break L37;
                            } else {
                              if (-32 == (kf.field_G[var5].field_j ^ -1)) {
                                break L36;
                              } else {
                                L38: {
                                  if (Math.abs(kf.field_G[var5].field_a) - -Math.abs(-7680 + kf.field_G[var5].field_b) >= Math.abs(var1) + Math.abs(var2 - 7680)) {
                                    break L38;
                                  } else {
                                    if (kf.field_G[var5].field_b >= 7040) {
                                      break L38;
                                    } else {
                                      var1 = kf.field_G[var5].field_c * 15 + kf.field_G[var5].field_a;
                                      var2 = kf.field_G[var5].field_d * 15 + kf.field_G[var5].field_b;
                                      break L38;
                                    }
                                  }
                                }
                                L39: {
                                  if (null == kf.field_G[-1 + var5]) {
                                    break L39;
                                  } else {
                                    if ((kf.field_G[-1 + var5].field_j ^ -1) > -26) {
                                      break L39;
                                    } else {
                                      if (31 != kf.field_G[var5 + -1].field_j) {
                                        break L35;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                                var4_ref_rb = kf.field_G[var5];
                                kf.field_G[var5] = kf.field_G[-1 + var5];
                                kf.field_G[var5 - 1] = var4_ref_rb;
                                break L34;
                              }
                            }
                          }
                        }
                        var5--;
                        break L36;
                      }
                      var5--;
                      break L35;
                    }
                    var5--;
                    break L34;
                  }
                  var5--;
                  var5--;
                  var5--;
                  var5--;
                  var5--;
                  var5--;
                  break L33;
                }
              }
              var5 = 0;
              if (kf.field_G.length <= var5) {
                break L32;
              } else {
                L40: {
                  if (kf.field_G[var5] == null) {
                    var5++;
                    break L40;
                  } else {
                    kf.field_G[var5] = kf.field_G[var5].b(15);
                    var5++;
                    break L40;
                  }
                }
                var5++;
                var5++;
                var5++;
                break L32;
              }
            }
          }
          L41: {
            if (-16000 == var1) {
              var1 = 0;
              break L41;
            } else {
              break L41;
            }
          }
          L42: {
            if (0 <= ve.field_b) {
              ic.field_t = ic.field_t - (lc.field_h >>> 1363236177) * ud.field_k;
              bi.field_i = bi.field_i - ud.field_k;
              ud.field_k = 0;
              break L42;
            } else {
              break L42;
            }
          }
          L43: {
            if ((ud.field_k ^ -1) >= (qh.field_a[7] ^ -1)) {
              break L43;
            } else {
              var4 = ud.field_k + -qh.field_a[7];
              ic.field_t = ic.field_t - (lc.field_h >>> -418187375) * var4;
              bi.field_i = bi.field_i - var4;
              ud.field_k = qh.field_a[7];
              break L43;
            }
          }
          L44: {
            wg.field_e = (wg.field_e * 9 + var2) / 10;
            sk.field_o = (sk.field_o * 9 - -var1) / 10;
            if (1 * qh.field_a[7] / 10 <= var3) {
              break L44;
            } else {
              if ((ud.field_k ^ -1) <= (qh.field_a[7] * 1 / 10 ^ -1)) {
                vk.a(250, (byte) 89, 5);
                break L44;
              } else {
                break L44;
              }
            }
          }
          L45: {
            if (var3 >= qh.field_a[7] * 3 / 10) {
              break L45;
            } else {
              if ((ud.field_k ^ -1) <= (qh.field_a[7] * 3 / 10 ^ -1)) {
                vk.a(249, (byte) 89, 6);
                break L45;
              } else {
                break L45;
              }
            }
          }
          L46: {
            if ((6 * qh.field_a[7] / 10 ^ -1) >= (var3 ^ -1)) {
              break L46;
            } else {
              if ((qh.field_a[7] * 6 / 10 ^ -1) < (ud.field_k ^ -1)) {
                break L46;
              } else {
                vk.a(248, (byte) 89, 7);
                break L46;
              }
            }
          }
          if ((var3 ^ -1) > (qh.field_a[7] ^ -1)) {
            L47: {
              if ((ud.field_k ^ -1) <= (qh.field_a[7] ^ -1)) {
                vk.a(247, (byte) 89, 8);
                break L47;
              } else {
                break L47;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -14275) {
            field_g = 28;
            field_e = null;
            field_i = null;
            return;
        }
        field_e = null;
        field_i = null;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        var3 = 1 << param2;
        if ((ah.field_f & var3) == 0) {
          ah.field_f = ah.field_f | var3;
          jl.field_d = jl.field_d | var3;
          lc.field_t.a((gg) (Object) new la(param2), -7044);
          if (oa.field_n) {
            if (param1 == 89) {
              return;
            } else {
              vk.b((byte) 46);
              return;
            }
          } else {
            w.field_a.a((gg) (Object) new bl(param2, param0, bi.field_i, ic.field_t, lc.field_h, lk.field_e), -7044);
            if (param1 == 89) {
              return;
            } else {
              vk.b((byte) 46);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3, mg param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        String[] var16 = null;
        String[] var18 = null;
        String[] var19 = null;
        String var20 = null;
        le var21 = null;
        String[] var22 = null;
        String[] var23 = null;
        String var24 = null;
        le var25 = null;
        String var32 = null;
        le var33 = null;
        String var38 = null;
        le var39 = null;
        String var40 = null;
        le var41 = null;
        String var42 = null;
        le var43 = null;
        le stackIn_33_0 = null;
        le stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        le stackIn_34_0 = null;
        le stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        le stackIn_35_0 = null;
        le stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        le stackIn_57_0 = null;
        le stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        le stackIn_58_0 = null;
        le stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        le stackIn_59_0 = null;
        le stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        le stackIn_77_0 = null;
        le stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        le stackIn_78_0 = null;
        le stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        le stackIn_79_0 = null;
        le stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        le stackIn_90_0 = null;
        le stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        le stackIn_91_0 = null;
        le stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        le stackIn_92_0 = null;
        le stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        int stackIn_92_4 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        le stackIn_101_0 = null;
        le stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        le stackIn_102_0 = null;
        le stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        le stackIn_103_0 = null;
        le stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        int stackIn_103_4 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        le stackIn_113_0 = null;
        le stackIn_113_1 = null;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        le stackIn_114_0 = null;
        le stackIn_114_1 = null;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        le stackIn_115_0 = null;
        le stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        le stackOut_56_0 = null;
        le stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        le stackOut_58_0 = null;
        le stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        le stackOut_57_0 = null;
        le stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        le stackOut_112_0 = null;
        le stackOut_112_1 = null;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        le stackOut_114_0 = null;
        le stackOut_114_1 = null;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        le stackOut_113_0 = null;
        le stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        int stackOut_116_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        le stackOut_100_0 = null;
        le stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        le stackOut_102_0 = null;
        le stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_102_4 = 0;
        le stackOut_101_0 = null;
        le stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_101_4 = 0;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        le stackOut_89_0 = null;
        le stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        le stackOut_91_0 = null;
        le stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_91_4 = 0;
        le stackOut_90_0 = null;
        le stackOut_90_1 = null;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        int stackOut_93_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        le stackOut_76_0 = null;
        le stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        le stackOut_78_0 = null;
        le stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int stackOut_78_4 = 0;
        le stackOut_77_0 = null;
        le stackOut_77_1 = null;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        int stackOut_77_4 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        le stackOut_32_0 = null;
        le stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        le stackOut_34_0 = null;
        le stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        le stackOut_33_0 = null;
        le stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        L0: {
          var15 = SolKnight.field_L ? 1 : 0;
          if (0 == param1) {
            param1 = param4.field_x;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == null) {
          ((vk) this).field_c = null;
          return;
        } else {
          L1: {
            if (param4 != ((vk) this).field_l) {
              break L1;
            } else {
              if (((vk) this).field_j) {
                break L1;
              } else {
                if (param2 != ((vk) this).field_h) {
                  break L1;
                } else {
                  if ((((vk) this).field_f ^ -1) != (param7 ^ -1)) {
                    break L1;
                  } else {
                    if ((((vk) this).field_o ^ -1) != (param1 ^ -1)) {
                      break L1;
                    } else {
                      if ((param6 ^ -1) != (((vk) this).field_n ^ -1)) {
                        break L1;
                      } else {
                        if ((param5 ^ -1) != (((vk) this).field_d ^ -1)) {
                          break L1;
                        } else {
                          if (((vk) this).field_k == null) {
                            break L1;
                          } else {
                            if (!((vk) this).field_k.equals((Object) (Object) param0)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((vk) this).field_d = param5;
          ((vk) this).field_k = param0;
          ((vk) this).field_h = param2;
          ((vk) this).field_n = param6;
          ((vk) this).field_l = param4;
          if (param3 > 36) {
            L2: {
              ((vk) this).field_f = param7;
              ((vk) this).field_j = false;
              ((vk) this).field_o = param1;
              var23 = new String[param4.b(param0, param5) + 1];
              var16 = var23;
              var22 = var23;
              var10 = Math.max(1, param4.a(param0, new int[1], var22));
              if (((vk) this).field_f != 3) {
                break L2;
              } else {
                if (-2 != (var10 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    ((vk) this).field_f = 1;
                    if ((((vk) this).field_f ^ -1) == -1) {
                      var11 = param4.field_F;
                      break L3;
                    } else {
                      if (-2 == (((vk) this).field_f ^ -1)) {
                        var11 = param4.field_F - -(-(var10 * ((vk) this).field_o) + ((vk) this).field_n >> 1225931425);
                        break L3;
                      } else {
                        if (((vk) this).field_f == 2) {
                          var11 = -param4.field_s + (((vk) this).field_n + -(var10 * ((vk) this).field_o));
                          break L3;
                        } else {
                          L4: {
                            var12 = (-(((vk) this).field_o * var10) + ((vk) this).field_n) / (var10 + 1);
                            if ((var12 ^ -1) > -1) {
                              var12 = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((vk) this).field_o = ((vk) this).field_o + var12;
                          var11 = var12 + param4.field_F;
                          break L3;
                        }
                      }
                    }
                  }
                  ((vk) this).field_c = new le[var10];
                  var12 = 0;
                  L5: while (true) {
                    if ((var10 ^ -1) >= (var12 ^ -1)) {
                      return;
                    } else {
                      L6: {
                        var24 = var23[var12];
                        stackOut_56_0 = null;
                        stackOut_56_1 = null;
                        stackOut_56_2 = var11 - param4.field_F;
                        stackOut_56_3 = param4.field_s + var11;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_58_2 = stackOut_56_2;
                        stackIn_58_3 = stackOut_56_3;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        stackIn_57_3 = stackOut_56_3;
                        if (var24 == null) {
                          stackOut_58_0 = null;
                          stackOut_58_1 = null;
                          stackOut_58_2 = stackIn_58_2;
                          stackOut_58_3 = stackIn_58_3;
                          stackOut_58_4 = 0;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          stackIn_59_3 = stackOut_58_3;
                          stackIn_59_4 = stackOut_58_4;
                          break L6;
                        } else {
                          stackOut_57_0 = null;
                          stackOut_57_1 = null;
                          stackOut_57_2 = stackIn_57_2;
                          stackOut_57_3 = stackIn_57_3;
                          stackOut_57_4 = var24.length();
                          stackIn_59_0 = stackOut_57_0;
                          stackIn_59_1 = stackOut_57_1;
                          stackIn_59_2 = stackOut_57_2;
                          stackIn_59_3 = stackOut_57_3;
                          stackIn_59_4 = stackOut_57_4;
                          break L6;
                        }
                      }
                      L7: {
                        var25 = new le(stackIn_59_2, stackIn_59_3, stackIn_59_4);
                        var25.field_c[0] = 0;
                        if (var24 == null) {
                          break L7;
                        } else {
                          L8: {
                            var25.field_c[var24.length()] = param4.b(var24);
                            stackOut_60_0 = 114;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_61_0 = stackOut_60_0;
                            if (-4 != (param2 ^ -1)) {
                              stackOut_62_0 = stackIn_62_0;
                              stackOut_62_1 = 0;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              break L8;
                            } else {
                              stackOut_61_0 = stackIn_61_0;
                              stackOut_61_1 = ((vk) this).a(param4.b(var24), param5, 21107, var24);
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              break L8;
                            }
                          }
                          lc.a(stackIn_63_0, stackIn_63_1, var24, var25, param4);
                          break L7;
                        }
                      }
                      var11 = var11 + param1;
                      ((vk) this).field_c[var12] = var25;
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
            }
            if ((((vk) this).field_f ^ -1) == -1) {
              var11 = param4.field_F;
              ((vk) this).field_c = new le[var10];
              var12 = 0;
              L9: while (true) {
                if ((var10 ^ -1) >= (var12 ^ -1)) {
                  return;
                } else {
                  L10: {
                    var42 = var23[var12];
                    stackOut_112_0 = null;
                    stackOut_112_1 = null;
                    stackOut_112_2 = var11 - param4.field_F;
                    stackOut_112_3 = param4.field_s + var11;
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_114_2 = stackOut_112_2;
                    stackIn_114_3 = stackOut_112_3;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    stackIn_113_3 = stackOut_112_3;
                    if (var42 == null) {
                      stackOut_114_0 = null;
                      stackOut_114_1 = null;
                      stackOut_114_2 = stackIn_114_2;
                      stackOut_114_3 = stackIn_114_3;
                      stackOut_114_4 = 0;
                      stackIn_115_0 = stackOut_114_0;
                      stackIn_115_1 = stackOut_114_1;
                      stackIn_115_2 = stackOut_114_2;
                      stackIn_115_3 = stackOut_114_3;
                      stackIn_115_4 = stackOut_114_4;
                      break L10;
                    } else {
                      stackOut_113_0 = null;
                      stackOut_113_1 = null;
                      stackOut_113_2 = stackIn_113_2;
                      stackOut_113_3 = stackIn_113_3;
                      stackOut_113_4 = var42.length();
                      stackIn_115_0 = stackOut_113_0;
                      stackIn_115_1 = stackOut_113_1;
                      stackIn_115_2 = stackOut_113_2;
                      stackIn_115_3 = stackOut_113_3;
                      stackIn_115_4 = stackOut_113_4;
                      break L10;
                    }
                  }
                  L11: {
                    var43 = new le(stackIn_115_2, stackIn_115_3, stackIn_115_4);
                    var43.field_c[0] = 0;
                    if (var42 == null) {
                      break L11;
                    } else {
                      L12: {
                        var43.field_c[var42.length()] = param4.b(var42);
                        stackOut_116_0 = 114;
                        stackIn_118_0 = stackOut_116_0;
                        stackIn_117_0 = stackOut_116_0;
                        if (-4 != (param2 ^ -1)) {
                          stackOut_118_0 = stackIn_118_0;
                          stackOut_118_1 = 0;
                          stackIn_119_0 = stackOut_118_0;
                          stackIn_119_1 = stackOut_118_1;
                          break L12;
                        } else {
                          stackOut_117_0 = stackIn_117_0;
                          stackOut_117_1 = ((vk) this).a(param4.b(var42), param5, 21107, var42);
                          stackIn_119_0 = stackOut_117_0;
                          stackIn_119_1 = stackOut_117_1;
                          break L12;
                        }
                      }
                      lc.a(stackIn_119_0, stackIn_119_1, var42, var43, param4);
                      break L11;
                    }
                  }
                  var11 = var11 + param1;
                  ((vk) this).field_c[var12] = var43;
                  var12++;
                  continue L9;
                }
              }
            } else {
              if (-2 == (((vk) this).field_f ^ -1)) {
                var11 = param4.field_F - -(-(var10 * ((vk) this).field_o) + ((vk) this).field_n >> 1225931425);
                ((vk) this).field_c = new le[var10];
                var12 = 0;
                L13: while (true) {
                  if ((var10 ^ -1) >= (var12 ^ -1)) {
                    return;
                  } else {
                    L14: {
                      var40 = var23[var12];
                      stackOut_100_0 = null;
                      stackOut_100_1 = null;
                      stackOut_100_2 = var11 - param4.field_F;
                      stackOut_100_3 = param4.field_s + var11;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      stackIn_102_2 = stackOut_100_2;
                      stackIn_102_3 = stackOut_100_3;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      stackIn_101_2 = stackOut_100_2;
                      stackIn_101_3 = stackOut_100_3;
                      if (var40 == null) {
                        stackOut_102_0 = null;
                        stackOut_102_1 = null;
                        stackOut_102_2 = stackIn_102_2;
                        stackOut_102_3 = stackIn_102_3;
                        stackOut_102_4 = 0;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        stackIn_103_2 = stackOut_102_2;
                        stackIn_103_3 = stackOut_102_3;
                        stackIn_103_4 = stackOut_102_4;
                        break L14;
                      } else {
                        stackOut_101_0 = null;
                        stackOut_101_1 = null;
                        stackOut_101_2 = stackIn_101_2;
                        stackOut_101_3 = stackIn_101_3;
                        stackOut_101_4 = var40.length();
                        stackIn_103_0 = stackOut_101_0;
                        stackIn_103_1 = stackOut_101_1;
                        stackIn_103_2 = stackOut_101_2;
                        stackIn_103_3 = stackOut_101_3;
                        stackIn_103_4 = stackOut_101_4;
                        break L14;
                      }
                    }
                    L15: {
                      var41 = new le(stackIn_103_2, stackIn_103_3, stackIn_103_4);
                      var41.field_c[0] = 0;
                      if (var40 == null) {
                        break L15;
                      } else {
                        L16: {
                          var41.field_c[var40.length()] = param4.b(var40);
                          stackOut_104_0 = 114;
                          stackIn_106_0 = stackOut_104_0;
                          stackIn_105_0 = stackOut_104_0;
                          if (-4 != (param2 ^ -1)) {
                            stackOut_106_0 = stackIn_106_0;
                            stackOut_106_1 = 0;
                            stackIn_107_0 = stackOut_106_0;
                            stackIn_107_1 = stackOut_106_1;
                            break L16;
                          } else {
                            stackOut_105_0 = stackIn_105_0;
                            stackOut_105_1 = ((vk) this).a(param4.b(var40), param5, 21107, var40);
                            stackIn_107_0 = stackOut_105_0;
                            stackIn_107_1 = stackOut_105_1;
                            break L16;
                          }
                        }
                        lc.a(stackIn_107_0, stackIn_107_1, var40, var41, param4);
                        break L15;
                      }
                    }
                    var11 = var11 + param1;
                    ((vk) this).field_c[var12] = var41;
                    var12++;
                    continue L13;
                  }
                }
              } else {
                if (((vk) this).field_f == 2) {
                  var11 = -param4.field_s + (((vk) this).field_n + -(var10 * ((vk) this).field_o));
                  ((vk) this).field_c = new le[var10];
                  var12 = 0;
                  L17: while (true) {
                    if ((var10 ^ -1) < (var12 ^ -1)) {
                      L18: {
                        var38 = var23[var12];
                        stackOut_89_0 = null;
                        stackOut_89_1 = null;
                        stackOut_89_2 = var11 - param4.field_F;
                        stackOut_89_3 = param4.field_s + var11;
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_91_1 = stackOut_89_1;
                        stackIn_91_2 = stackOut_89_2;
                        stackIn_91_3 = stackOut_89_3;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        stackIn_90_2 = stackOut_89_2;
                        stackIn_90_3 = stackOut_89_3;
                        if (var38 == null) {
                          stackOut_91_0 = null;
                          stackOut_91_1 = null;
                          stackOut_91_2 = stackIn_91_2;
                          stackOut_91_3 = stackIn_91_3;
                          stackOut_91_4 = 0;
                          stackIn_92_0 = stackOut_91_0;
                          stackIn_92_1 = stackOut_91_1;
                          stackIn_92_2 = stackOut_91_2;
                          stackIn_92_3 = stackOut_91_3;
                          stackIn_92_4 = stackOut_91_4;
                          break L18;
                        } else {
                          stackOut_90_0 = null;
                          stackOut_90_1 = null;
                          stackOut_90_2 = stackIn_90_2;
                          stackOut_90_3 = stackIn_90_3;
                          stackOut_90_4 = var38.length();
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_92_1 = stackOut_90_1;
                          stackIn_92_2 = stackOut_90_2;
                          stackIn_92_3 = stackOut_90_3;
                          stackIn_92_4 = stackOut_90_4;
                          break L18;
                        }
                      }
                      L19: {
                        var39 = new le(stackIn_92_2, stackIn_92_3, stackIn_92_4);
                        var39.field_c[0] = 0;
                        if (var38 == null) {
                          break L19;
                        } else {
                          L20: {
                            var39.field_c[var38.length()] = param4.b(var38);
                            stackOut_93_0 = 114;
                            stackIn_95_0 = stackOut_93_0;
                            stackIn_94_0 = stackOut_93_0;
                            if (-4 != (param2 ^ -1)) {
                              stackOut_95_0 = stackIn_95_0;
                              stackOut_95_1 = 0;
                              stackIn_96_0 = stackOut_95_0;
                              stackIn_96_1 = stackOut_95_1;
                              break L20;
                            } else {
                              stackOut_94_0 = stackIn_94_0;
                              stackOut_94_1 = ((vk) this).a(param4.b(var38), param5, 21107, var38);
                              stackIn_96_0 = stackOut_94_0;
                              stackIn_96_1 = stackOut_94_1;
                              break L20;
                            }
                          }
                          lc.a(stackIn_96_0, stackIn_96_1, var38, var39, param4);
                          break L19;
                        }
                      }
                      var11 = var11 + param1;
                      ((vk) this).field_c[var12] = var39;
                      var12++;
                      continue L17;
                    } else {
                      return;
                    }
                  }
                } else {
                  L21: {
                    var12 = (-(((vk) this).field_o * var10) + ((vk) this).field_n) / (var10 + 1);
                    if ((var12 ^ -1) > -1) {
                      var12 = 0;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  ((vk) this).field_o = ((vk) this).field_o + var12;
                  var11 = var12 + param4.field_F;
                  ((vk) this).field_c = new le[var10];
                  var12 = 0;
                  L22: while (true) {
                    if ((var10 ^ -1) < (var12 ^ -1)) {
                      L23: {
                        var32 = var23[var12];
                        stackOut_76_0 = null;
                        stackOut_76_1 = null;
                        stackOut_76_2 = var11 - param4.field_F;
                        stackOut_76_3 = param4.field_s + var11;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_78_1 = stackOut_76_1;
                        stackIn_78_2 = stackOut_76_2;
                        stackIn_78_3 = stackOut_76_3;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        stackIn_77_2 = stackOut_76_2;
                        stackIn_77_3 = stackOut_76_3;
                        if (var32 == null) {
                          stackOut_78_0 = null;
                          stackOut_78_1 = null;
                          stackOut_78_2 = stackIn_78_2;
                          stackOut_78_3 = stackIn_78_3;
                          stackOut_78_4 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          stackIn_79_2 = stackOut_78_2;
                          stackIn_79_3 = stackOut_78_3;
                          stackIn_79_4 = stackOut_78_4;
                          break L23;
                        } else {
                          stackOut_77_0 = null;
                          stackOut_77_1 = null;
                          stackOut_77_2 = stackIn_77_2;
                          stackOut_77_3 = stackIn_77_3;
                          stackOut_77_4 = var32.length();
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_79_1 = stackOut_77_1;
                          stackIn_79_2 = stackOut_77_2;
                          stackIn_79_3 = stackOut_77_3;
                          stackIn_79_4 = stackOut_77_4;
                          break L23;
                        }
                      }
                      L24: {
                        var33 = new le(stackIn_79_2, stackIn_79_3, stackIn_79_4);
                        var33.field_c[0] = 0;
                        if (var32 == null) {
                          break L24;
                        } else {
                          L25: {
                            var33.field_c[var32.length()] = param4.b(var32);
                            stackOut_80_0 = 114;
                            stackIn_82_0 = stackOut_80_0;
                            stackIn_81_0 = stackOut_80_0;
                            if (-4 != (param2 ^ -1)) {
                              stackOut_82_0 = stackIn_82_0;
                              stackOut_82_1 = 0;
                              stackIn_83_0 = stackOut_82_0;
                              stackIn_83_1 = stackOut_82_1;
                              break L25;
                            } else {
                              stackOut_81_0 = stackIn_81_0;
                              stackOut_81_1 = ((vk) this).a(param4.b(var32), param5, 21107, var32);
                              stackIn_83_0 = stackOut_81_0;
                              stackIn_83_1 = stackOut_81_1;
                              break L25;
                            }
                          }
                          lc.a(stackIn_83_0, stackIn_83_1, var32, var33, param4);
                          break L24;
                        }
                      }
                      var11 = var11 + param1;
                      ((vk) this).field_c[var12] = var33;
                      var12++;
                      continue L22;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L26: {
              ((vk) this).field_l = null;
              ((vk) this).field_f = param7;
              ((vk) this).field_j = false;
              ((vk) this).field_o = param1;
              var19 = new String[param4.b(param0, param5) + 1];
              var16 = var19;
              var18 = var19;
              var10 = Math.max(1, param4.a(param0, new int[1], var18));
              if (((vk) this).field_f != 3) {
                break L26;
              } else {
                if (-2 != (var10 ^ -1)) {
                  break L26;
                } else {
                  ((vk) this).field_f = 1;
                  break L26;
                }
              }
            }
            L27: {
              if ((((vk) this).field_f ^ -1) == -1) {
                var11 = param4.field_F;
                break L27;
              } else {
                if (-2 == (((vk) this).field_f ^ -1)) {
                  var11 = param4.field_F - -(-(var10 * ((vk) this).field_o) + ((vk) this).field_n >> 1225931425);
                  break L27;
                } else {
                  if (((vk) this).field_f == 2) {
                    var11 = -param4.field_s + (((vk) this).field_n + -(var10 * ((vk) this).field_o));
                    break L27;
                  } else {
                    L28: {
                      var12 = (-(((vk) this).field_o * var10) + ((vk) this).field_n) / (var10 + 1);
                      if ((var12 ^ -1) > -1) {
                        var12 = 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    ((vk) this).field_o = ((vk) this).field_o + var12;
                    var11 = var12 + param4.field_F;
                    break L27;
                  }
                }
              }
            }
            ((vk) this).field_c = new le[var10];
            var12 = 0;
            L29: while (true) {
              if ((var10 ^ -1) >= (var12 ^ -1)) {
                return;
              } else {
                L30: {
                  var20 = var19[var12];
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = var11 - param4.field_F;
                  stackOut_32_3 = param4.field_s + var11;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  if (var20 == null) {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    stackIn_35_4 = stackOut_34_4;
                    break L30;
                  } else {
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = stackIn_33_2;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = var20.length();
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_35_4 = stackOut_33_4;
                    break L30;
                  }
                }
                L31: {
                  var21 = new le(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                  var21.field_c[0] = 0;
                  if (var20 == null) {
                    break L31;
                  } else {
                    L32: {
                      var21.field_c[var20.length()] = param4.b(var20);
                      stackOut_36_0 = 114;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if (-4 != (param2 ^ -1)) {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        break L32;
                      } else {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = ((vk) this).a(param4.b(var20), param5, 21107, var20);
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        break L32;
                      }
                    }
                    lc.a(stackIn_39_0, stackIn_39_1, var20, var21, param4);
                    break L31;
                  }
                }
                var11 = var11 + param1;
                ((vk) this).field_c[var12] = var21;
                var12++;
                continue L29;
              }
            }
          }
        }
    }

    public vk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
