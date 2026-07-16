/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends hl {
    private cd field_q;
    private int field_l;
    private int field_d;
    private pc field_s;
    private sg field_g;
    private ab field_n;
    private ml field_v;
    private byte[] field_w;
    private sg field_m;
    private na field_i;
    private int field_k;
    private byte[] field_x;
    static oi field_t;
    private oi field_p;
    private int field_o;
    static int field_f;
    private oi field_u;
    private boolean field_j;
    private boolean field_r;
    private boolean field_e;
    private long field_h;

    final void a(int param0) {
        wl var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (null == ((fh) this).field_p) {
          return;
        } else {
          if (((fh) this).b(false) == null) {
            return;
          } else {
            L0: {
              if (param0 == -3) {
                break L0;
              } else {
                fh.c(16, 122);
                break L0;
              }
            }
            var2 = ((fh) this).field_u.b((byte) 72);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_e;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if ((var3 ^ -1) > -1) {
                            break L5;
                          } else {
                            if (var3 >= ((fh) this).field_s.field_s) {
                              break L5;
                            } else {
                              if (0 != ((fh) this).field_s.field_p[var3]) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.a(false);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (-1 != (((fh) this).field_w[var3] ^ -1)) {
                          break L6;
                        } else {
                          ml discarded$4 = this.a(-23529, 1, var3);
                          break L6;
                        }
                      }
                      L7: {
                        if (-1 == ((fh) this).field_w[var3]) {
                          ml discarded$5 = this.a(-23529, 2, var3);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (((fh) this).field_w[var3] != 1) {
                        break L3;
                      } else {
                        var2.a(false);
                        break L3;
                      }
                    }
                    var2 = ((fh) this).field_u.d(param0 ^ -8195);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        ml var2 = null;
        wl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        byte stackIn_11_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackOut_10_0 = 0;
        byte stackOut_10_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_65_0 = 0;
        L0: {
          var5 = wizardrun.field_H;
          if (param0 == 25) {
            break L0;
          } else {
            ((fh) this).field_o = -118;
            break L0;
          }
        }
        L1: {
          if (((fh) this).field_p != null) {
            if (null == ((fh) this).b(false)) {
              return;
            } else {
              L2: {
                if (!((fh) this).field_r) {
                  break L2;
                } else {
                  var2_int = 1;
                  var3 = ((fh) this).field_p.b((byte) 83);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              if (var3 == null) {
                                break L8;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_10_0 = 0;
                                stackOut_10_1 = ((fh) this).field_w[var4];
                                stackIn_105_0 = stackOut_10_0;
                                stackIn_105_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var5 != 0) {
                                  L9: while (true) {
                                    if (stackIn_105_0 <= stackIn_105_1) {
                                      break L5;
                                    } else {
                                      stackOut_103_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                                      stackIn_34_0 = stackOut_103_0;
                                      stackIn_104_0 = stackOut_103_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        stackOut_104_0 = stackIn_104_0;
                                        stackIn_101_0 = stackOut_104_0;
                                        if (stackIn_101_0 == 0) {
                                          ((fh) this).field_o = ((fh) this).field_o + 1;
                                          if (var5 == 0) {
                                            stackOut_107_0 = ((fh) this).field_s.field_p.length;
                                            stackOut_107_1 = ((fh) this).field_o;
                                            stackIn_105_0 = stackOut_107_0;
                                            stackIn_105_1 = stackOut_107_1;
                                            continue L9;
                                          } else {
                                            break L6;
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (stackIn_11_0 == stackIn_11_1) {
                                      ml discarded$4 = this.a(-23529, 1, var4);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    L12: {
                                      if (((fh) this).field_w[var4] != 0) {
                                        break L12;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var3.a(false);
                                    break L11;
                                  }
                                  var3 = ((fh) this).field_p.d(8192);
                                  if (var5 == 0) {
                                    continue L3;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            L13: while (true) {
                              if (((fh) this).field_s.field_p.length <= ((fh) this).field_o) {
                                break L5;
                              } else {
                                stackOut_20_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                                stackIn_34_0 = stackOut_20_0;
                                stackIn_21_0 = stackOut_20_0;
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  if (stackIn_21_0 == 0) {
                                    ((fh) this).field_o = ((fh) this).field_o + 1;
                                    if (var5 == 0) {
                                      continue L13;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          break L6;
                        }
                        L14: {
                          if (-251 >= (((fh) this).field_q.field_b ^ -1)) {
                            var2_int = 0;
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if (0 != ((fh) this).field_w[((fh) this).field_o]) {
                            break L15;
                          } else {
                            ml discarded$5 = this.a(-23529, 1, ((fh) this).field_o);
                            break L15;
                          }
                        }
                        L16: {
                          if (0 == ((fh) this).field_w[((fh) this).field_o]) {
                            var3 = new wl();
                            var3.field_e = (long)((fh) this).field_o;
                            var2_int = 0;
                            ((fh) this).field_p.a(var3, false);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        ((fh) this).field_o = ((fh) this).field_o + 1;
                        break L5;
                      }
                      stackOut_33_0 = var2_int;
                      stackIn_34_0 = stackOut_33_0;
                      break L4;
                    }
                    L17: {
                      if (stackIn_34_0 != 0) {
                        ((fh) this).field_o = 0;
                        ((fh) this).field_r = false;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L18: {
                if (((fh) this).field_j) {
                  break L18;
                } else {
                  ((fh) this).field_p = null;
                  break L18;
                }
              }
              var2_int = 1;
              var3 = ((fh) this).field_p.b((byte) 73);
              L19: while (true) {
                L20: {
                  L21: {
                    L22: {
                      if (var3 == null) {
                        L23: while (true) {
                          if (((fh) this).field_o >= ((fh) this).field_s.field_p.length) {
                            break L21;
                          } else {
                            stackOut_53_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                            stackIn_66_0 = stackOut_53_0;
                            stackIn_54_0 = stackOut_53_0;
                            if (var5 != 0) {
                              break L20;
                            } else {
                              if (stackIn_54_0 != 0) {
                                break L22;
                              } else {
                                ((fh) this).field_o = ((fh) this).field_o + 1;
                                continue L23;
                              }
                            }
                          }
                        }
                      } else {
                        var4 = (int)var3.field_e;
                        stackOut_42_0 = ((fh) this).field_w[var4] ^ -1;
                        stackOut_42_1 = -2;
                        stackIn_96_0 = stackOut_42_0;
                        stackIn_96_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (var5 != 0) {
                          L24: while (true) {
                            if (stackIn_96_0 >= stackIn_96_1) {
                              break L21;
                            } else {
                              stackOut_94_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                              stackIn_66_0 = stackOut_94_0;
                              stackIn_95_0 = stackOut_94_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                stackOut_95_0 = stackIn_95_0;
                                stackIn_92_0 = stackOut_95_0;
                                if (stackIn_92_0 != 0) {
                                  break L22;
                                } else {
                                  ((fh) this).field_o = ((fh) this).field_o + 1;
                                  stackOut_98_0 = ((fh) this).field_o;
                                  stackOut_98_1 = ((fh) this).field_s.field_p.length;
                                  stackIn_96_0 = stackOut_98_0;
                                  stackIn_96_1 = stackOut_98_1;
                                  continue L24;
                                }
                              }
                            }
                          }
                        } else {
                          L25: {
                            if (stackIn_43_0 != stackIn_43_1) {
                              ml discarded$6 = this.a(-23529, 2, var4);
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          L26: {
                            L27: {
                              if (((fh) this).field_w[var4] != 1) {
                                break L27;
                              } else {
                                var3.a(false);
                                if (var5 == 0) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var2_int = 0;
                            break L26;
                          }
                          var3 = ((fh) this).field_p.d(8192);
                          continue L19;
                        }
                      }
                    }
                    L28: {
                      if (((fh) this).field_i.c(-21)) {
                        var2_int = 0;
                        if (var5 == 0) {
                          break L21;
                        } else {
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (1 == ((fh) this).field_w[((fh) this).field_o]) {
                        break L29;
                      } else {
                        ml discarded$7 = this.a(-23529, 2, ((fh) this).field_o);
                        break L29;
                      }
                    }
                    L30: {
                      if (((fh) this).field_w[((fh) this).field_o] == 1) {
                        break L30;
                      } else {
                        var3 = new wl();
                        var3.field_e = (long)((fh) this).field_o;
                        ((fh) this).field_p.a(var3, false);
                        var2_int = 0;
                        break L30;
                      }
                    }
                    ((fh) this).field_o = ((fh) this).field_o + 1;
                    break L21;
                  }
                  stackOut_65_0 = var2_int;
                  stackIn_66_0 = stackOut_65_0;
                  break L20;
                }
                if (stackIn_66_0 != 0) {
                  ((fh) this).field_o = 0;
                  ((fh) this).field_j = false;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        if (((fh) this).field_e) {
          if ((d.a((byte) 100) ^ -1L) <= (((fh) this).field_h ^ -1L)) {
            var2 = (ml) (Object) ((fh) this).field_n.b((byte) -114);
            L31: while (true) {
              if (var2 != null) {
                if (var5 == 0) {
                  L32: {
                    L33: {
                      if (!var2.field_s) {
                        break L33;
                      } else {
                        if (var5 == 0) {
                          break L32;
                        } else {
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (!var2.field_q) {
                        break L34;
                      } else {
                        if (!var2.field_r) {
                          throw new RuntimeException();
                        } else {
                          var2.a(false);
                          break L34;
                        }
                      }
                    }
                    var2.field_q = true;
                    break L32;
                  }
                  var2 = (ml) (Object) ((fh) this).field_n.b(param0 ^ 24);
                  continue L31;
                } else {
                  return;
                }
              } else {
                ((fh) this).field_h = 1000L + d.a((byte) 67);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final ml a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        byte stackIn_93_0 = 0;
        byte stackIn_93_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        Object stackIn_109_0 = null;
        Throwable decompiledCaughtException = null;
        byte stackOut_92_0 = 0;
        byte stackOut_92_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        Object stackOut_108_0 = null;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        var10 = wizardrun.field_H;
        if (param0 == -23529) {
          L0: {
            var4 = (Object) (Object) (ml) (Object) ((fh) this).field_n.a(1, (long)param2);
            if (var4 == null) {
              break L0;
            } else {
              if (param1 != 0) {
                break L0;
              } else {
                if (((ml) var4).field_r) {
                  break L0;
                } else {
                  if (!((ml) var4).field_s) {
                    break L0;
                  } else {
                    ((ml) var4).a(false);
                    var4 = null;
                    break L0;
                  }
                }
              }
            }
          }
          L1: {
            if (var4 == null) {
              L2: {
                if (param1 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (-2 != (param1 ^ -1)) {
                      break L3;
                    } else {
                      if (null == ((fh) this).field_g) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((fh) this).field_q.a((byte) -46, param2, ((fh) this).field_g);
                        if (var10 == 0) {
                          ((fh) this).field_n.a((wl) var4, param0 + 23462, (long)param2);
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if ((param1 ^ -1) == -3) {
                    if (null != ((fh) this).field_g) {
                      if ((((fh) this).field_w[param2] ^ -1) != 0) {
                        throw new RuntimeException();
                      } else {
                        if (!((fh) this).field_i.c(-21)) {
                          var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -73, (byte) 2, false);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              L4: {
                if (((fh) this).field_g == null) {
                  break L4;
                } else {
                  if ((((fh) this).field_w[param2] ^ -1) == 0) {
                    break L4;
                  } else {
                    var4 = (Object) (Object) ((fh) this).field_q.a(param2, 1, ((fh) this).field_g);
                    break L4;
                  }
                }
              }
              if (((fh) this).field_i.a(3473)) {
                return null;
              } else {
                var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -85, (byte) 2, true);
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!((ml) var4).field_s) {
            var5 = ((ml) var4).d(95);
            if (var4 instanceof sk) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (-3 > (var5.length ^ -1)) {
                        rk.field_j.reset();
                        rk.field_j.update(var5, 0, -2 + var5.length);
                        var6_int = (int)rk.field_j.getValue();
                        if (((fh) this).field_s.field_q[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L7: {
                            L8: {
                              if (null == ((fh) this).field_s.field_j) {
                                break L8;
                              } else {
                                if (null == ((fh) this).field_s.field_j[param2]) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((fh) this).field_s.field_j[param2];
                                  var8 = id.a(var5, 0, -2 + var5.length, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      stackOut_92_0 = var8[var9];
                                      stackOut_92_1 = var7_ref_byte__[var9];
                                      stackIn_98_0 = stackOut_92_0;
                                      stackIn_98_1 = stackOut_92_1;
                                      stackIn_93_0 = stackOut_92_0;
                                      stackIn_93_1 = stackOut_92_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_93_0 != stackIn_93_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_97_0 = (255 & var5[var5.length + -2]) << 1080720936;
                            stackOut_97_1 = -(var5[-1 + var5.length] & 255);
                            stackIn_98_0 = stackOut_97_0;
                            stackIn_98_1 = stackOut_97_1;
                            break L7;
                          }
                          var7 = stackIn_98_0 - stackIn_98_1;
                          if (var7 != (65535 & ((fh) this).field_s.field_n[param2])) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if ((((fh) this).field_w[param2] ^ -1) != -2) {
                                L11: {
                                  if (((fh) this).field_w[param2] != 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((fh) this).field_w[param2] = (byte) 1;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L12: {
                              if (!((ml) var4).field_r) {
                                ((ml) var4).a(false);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            stackOut_108_0 = var4;
                            stackIn_109_0 = stackOut_108_0;
                            break L5;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (Exception) (Object) decompiledCaughtException;
                ((fh) this).field_w[param2] = (byte)-1;
                ((ml) var4).a(false);
                if (((ml) var4).field_r) {
                  if (((fh) this).field_i.a(3473)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -123, (byte) 2, true);
                    ((fh) this).field_n.a((wl) var4, -103, (long)param2);
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (ml) (Object) stackIn_109_0;
            } else {
              L13: {
                if (var5 == null) {
                  break L13;
                } else {
                  if (var5.length <= 2) {
                    break L13;
                  } else {
                    rk.field_j.reset();
                    rk.field_j.update(var5, 0, -2 + var5.length);
                    var6_int = (int)rk.field_j.getValue();
                    if (((fh) this).field_s.field_q[param2] != var6_int) {
                      throw new RuntimeException();
                    } else {
                      if (null != ((fh) this).field_s.field_j) {
                        if (null != ((fh) this).field_s.field_j[param2]) {
                          var7_ref_byte__ = ((fh) this).field_s.field_j[param2];
                          var8 = id.a(var5, 0, var5.length + -2, 0);
                          var9 = 0;
                          L14: while (true) {
                            if (64 > var9) {
                              stackOut_64_0 = var8[var9] ^ -1;
                              stackOut_64_1 = var7_ref_byte__[var9] ^ -1;
                              stackIn_70_0 = stackOut_64_0;
                              stackIn_70_1 = stackOut_64_1;
                              stackIn_65_0 = stackOut_64_0;
                              stackIn_65_1 = stackOut_64_1;
                              if (var10 == 0) {
                                if (stackIn_70_0 == stackIn_70_1) {
                                  var9++;
                                  continue L14;
                                } else {
                                  throw new RuntimeException();
                                }
                              } else {
                                L15: {
                                  if (stackIn_65_0 == stackIn_65_1) {
                                    break L15;
                                  } else {
                                    ((fh) this).field_w[param2] = (byte) 1;
                                    break L15;
                                  }
                                }
                                L16: {
                                  if (((ml) var4).field_r) {
                                    break L16;
                                  } else {
                                    ((ml) var4).a(false);
                                    break L16;
                                  }
                                }
                                return (ml) var4;
                              }
                            } else {
                              ((fh) this).field_i.field_k = 0;
                              ((fh) this).field_i.field_n = 0;
                              L17: {
                                var5[-2 + var5.length] = (byte)(((fh) this).field_s.field_n[param2] >>> 359382024);
                                var5[var5.length - 1] = (byte)((fh) this).field_s.field_n[param2];
                                if (null != ((fh) this).field_g) {
                                  sk discarded$3 = ((fh) this).field_q.a((byte) -124, ((fh) this).field_g, var5, param2);
                                  if (-2 == (((fh) this).field_w[param2] ^ -1)) {
                                    break L17;
                                  } else {
                                    ((fh) this).field_w[param2] = (byte) 1;
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (((ml) var4).field_r) {
                                  break L18;
                                } else {
                                  ((ml) var4).a(false);
                                  break L18;
                                }
                              }
                              return (ml) var4;
                            }
                          }
                        } else {
                          ((fh) this).field_i.field_k = 0;
                          ((fh) this).field_i.field_n = 0;
                          L19: {
                            var5[-2 + var5.length] = (byte)(((fh) this).field_s.field_n[param2] >>> 359382024);
                            var5[var5.length - 1] = (byte)((fh) this).field_s.field_n[param2];
                            if (null != ((fh) this).field_g) {
                              sk discarded$4 = ((fh) this).field_q.a((byte) -124, ((fh) this).field_g, var5, param2);
                              if (-2 == (((fh) this).field_w[param2] ^ -1)) {
                                break L19;
                              } else {
                                ((fh) this).field_w[param2] = (byte) 1;
                                break L19;
                              }
                            } else {
                              break L19;
                            }
                          }
                          L20: {
                            if (((ml) var4).field_r) {
                              break L20;
                            } else {
                              ((ml) var4).a(false);
                              break L20;
                            }
                          }
                          return (ml) var4;
                        }
                      } else {
                        ((fh) this).field_i.field_k = 0;
                        ((fh) this).field_i.field_n = 0;
                        L21: {
                          var5[-2 + var5.length] = (byte)(((fh) this).field_s.field_n[param2] >>> 359382024);
                          var5[var5.length - 1] = (byte)((fh) this).field_s.field_n[param2];
                          if (null != ((fh) this).field_g) {
                            sk discarded$5 = ((fh) this).field_q.a((byte) -124, ((fh) this).field_g, var5, param2);
                            if (-2 == (((fh) this).field_w[param2] ^ -1)) {
                              break L21;
                            } else {
                              ((fh) this).field_w[param2] = (byte) 1;
                              break L21;
                            }
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (((ml) var4).field_r) {
                            break L22;
                          } else {
                            ((ml) var4).a(false);
                            break L22;
                          }
                        }
                        return (ml) var4;
                      }
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void b(byte param0) {
        field_t = null;
        if (param0 != -8) {
            field_t = null;
        }
    }

    final static void b(int param0, int param1) {
        ai var2 = null;
        int var3 = 0;
        nj var4 = null;
        ai stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        ai stackOut_3_0 = null;
        wl stackOut_5_0 = null;
        L0: {
          var3 = wizardrun.field_H;
          var2 = (ai) (Object) field_t.b((byte) 100);
          if (param0 == -28323) {
            break L0;
          } else {
            fh.b((byte) 68);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (var2 == null) {
                break L3;
              } else {
                og.a(var2, param1, 123);
                stackOut_3_0 = (ai) (Object) field_t.d(8192);
                stackIn_6_0 = (Object) (Object) stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var3 != 0) {
                  break L2;
                } else {
                  var2 = stackIn_4_0;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_5_0 = pc.field_l.b((byte) 91);
            stackIn_6_0 = (Object) (Object) stackOut_5_0;
            break L2;
          }
          var4 = (nj) (Object) stackIn_6_0;
          L4: while (true) {
            L5: {
              if (var4 == null) {
                break L5;
              } else {
                ri.a(var4, param1, (byte) 121);
                var4 = (nj) (Object) pc.field_l.d(8192);
                if (var3 != 0) {
                  break L5;
                } else {
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final byte[] a(byte param0, int param1) {
        ml var3 = null;
        byte[] var4 = null;
        var3 = this.a(-23529, 0, param1);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            var4 = var3.d(95);
            if (param0 < -21) {
              break L0;
            } else {
              fh.c(-33, -78);
              break L0;
            }
          }
          var3.a(false);
          return var4;
        }
    }

    final static void c(int param0, int param1) {
        of var2 = null;
        int var3 = 0;
        L0: {
          var3 = wizardrun.field_H;
          var2 = (of) (Object) bh.field_b.b((byte) 96);
          if (param1 == 0) {
            break L0;
          } else {
            field_f = 48;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var2 == null) {
              break L2;
            } else {
              di.a(var2, param0, (byte) -81);
              var2 = (of) (Object) bh.field_b.d(param1 ^ 8192);
              if (var3 != 0) {
                break L2;
              } else {
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 11682) {
            fh.b(-2, 121);
        }
        param1 = (param1 & 1431655765) - -((param1 & -1431655765) >>> 734649505);
        param1 = ((param1 & -858993460) >>> -840074718) + (858993459 & param1);
        param1 = param1 - -(param1 >>> 1817374596) & 252645135;
        param1 = param1 + (param1 >>> -781462488);
        param1 = param1 + (param1 >>> -679920880);
        return 255 & param1;
    }

    final void a(byte param0) {
        int var2 = 0;
        if (((fh) this).field_g == null) {
          return;
        } else {
          L0: {
            var2 = -38 / ((-32 - param0) / 59);
            ((fh) this).field_j = true;
            if (null != ((fh) this).field_p) {
              break L0;
            } else {
              ((fh) this).field_p = new oi();
              break L0;
            }
          }
          return;
        }
    }

    final pc b(boolean param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = wizardrun.field_H;
        if (((fh) this).field_s != null) {
          return ((fh) this).field_s;
        } else {
          L0: {
            if (null != ((fh) this).field_v) {
              break L0;
            } else {
              if (!((fh) this).field_i.a(3473)) {
                ((fh) this).field_v = (ml) (Object) ((fh) this).field_i.a(255, ((fh) this).field_d, (byte) -119, (byte) 0, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((fh) this).field_v.field_s) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((fh) this).c((byte) -59);
                break L1;
              }
            }
            var5 = ((fh) this).field_v.d(95);
            var2 = var5;
            if (!(((fh) this).field_v instanceof sk)) {
              if (var5 == null) {
                throw new RuntimeException();
              } else {
                L2: {
                  ((fh) this).field_s = new pc(var5, ((fh) this).field_l, ((fh) this).field_x);
                  if (null != ((fh) this).field_m) {
                    sk discarded$1 = ((fh) this).field_q.a((byte) 0, ((fh) this).field_m, var5, ((fh) this).field_d);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  ((fh) this).field_v = null;
                  if (null != ((fh) this).field_g) {
                    ((fh) this).field_w = new byte[((fh) this).field_s.field_s];
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return ((fh) this).field_s;
              }
            } else {
              if (var5 != null) {
                ((fh) this).field_s = new pc(var5, ((fh) this).field_l, ((fh) this).field_x);
                if (((fh) this).field_k != ((fh) this).field_s.field_f) {
                  throw new RuntimeException();
                } else {
                  L4: {
                    ((fh) this).field_v = null;
                    if (null != ((fh) this).field_g) {
                      ((fh) this).field_w = new byte[((fh) this).field_s.field_s];
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return ((fh) this).field_s;
                }
              } else {
                throw new RuntimeException();
              }
            }
          } else {
            return null;
          }
        }
    }

    final int a(boolean param0, int param1) {
        ml var3 = null;
        var3 = (ml) (Object) ((fh) this).field_n.a(1, (long)param1);
        if (var3 != null) {
          return var3.c(false);
        } else {
          if (param0) {
            ((fh) this).field_d = -2;
            return 0;
          } else {
            return 0;
          }
        }
    }

    fh(int param0, sg param1, sg param2, na param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((fh) this).field_n = new ab(16);
            ((fh) this).field_o = 0;
            ((fh) this).field_u = new oi();
            ((fh) this).field_h = 0L;
            ((fh) this).field_d = param0;
            ((fh) this).field_g = param1;
            if (null != ((fh) this).field_g) {
              break L1;
            } else {
              ((fh) this).field_r = false;
              if (wizardrun.field_H == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((fh) this).field_r = true;
          ((fh) this).field_p = new oi();
          break L0;
        }
        L2: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((fh) this).field_e = stackIn_6_1 != 0;
          ((fh) this).field_x = param6;
          ((fh) this).field_k = param7;
          ((fh) this).field_m = param2;
          ((fh) this).field_q = param4;
          ((fh) this).field_i = param3;
          ((fh) this).field_l = param5;
          if (null == ((fh) this).field_m) {
            break L3;
          } else {
            ((fh) this).field_v = (ml) (Object) ((fh) this).field_q.a(((fh) this).field_d, 1, ((fh) this).field_m);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new oi();
    }
}
