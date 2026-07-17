/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private int field_e;
    private int field_A;
    static int field_c;
    private int field_l;
    private int field_z;
    private int field_f;
    private boolean field_k;
    private ud field_t;
    private int field_y;
    private int field_w;
    private int field_g;
    private int field_x;
    private float field_v;
    private int field_u;
    private int field_n;
    static cf field_s;
    private int field_r;
    private int field_q;
    private int field_m;
    private int field_i;
    static int field_b;
    static String field_a;
    static String field_p;
    static int[] field_d;
    static boolean field_h;
    static byte[][] field_j;
    static boolean field_o;

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_19_0 = new String(var8);
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L4;
                    } else {
                      if (var5 > 90) {
                        break L4;
                      } else {
                        var3[var4] = (char)(var5 + 32);
                        var4++;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3[var4] = '_';
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("cd.I(").append(-98).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var5 = -42 % ((param3 - 70) / 47);
          if (be.field_b) {
            break L0;
          } else {
            L1: {
              var7 = ea.field_e;
              if (gh.field_x) {
                var7 = -12 + var7 * 2 + 1;
                break L1;
              } else {
                break L1;
              }
            }
            ba.field_i.b((byte) 121);
            ba.field_i.a(2, var7);
            be.field_b = true;
            break L0;
          }
        }
        L2: {
          var6 = 0;
          if (param2) {
            break L2;
          } else {
            L3: {
              if (!ub.field_i) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            var6 = stackIn_9_0;
            ub.field_i = false;
            break L2;
          }
        }
        ba.field_i.a(true, 18, true, (ka) null, 3, df.field_R, aa.field_g, kc.field_u, ph.field_d);
        md.field_j = null;
        ba.field_i.a(true, 18, true, (ka) null, 6, df.field_R, aa.field_g, kc.field_u, ph.field_d);
        ba.field_i.a(true, 18, true, (ka) null, 2, df.field_R, aa.field_g, kc.field_u, ph.field_d);
        wb.field_p.a(aa.field_g, df.field_R, wb.field_p.field_B, wb.field_p.field_H, wb.field_p.field_o, 0, 2657, wb.field_p.field_u);
        wb.field_p.a((byte) 79, df.field_R, aa.field_g);
        if (param1 != 0) {
          if (!ii.field_d) {
            of.a(0, 0, (byte) 40, param4, param1);
            if (0 > param0) {
              L4: {
                if (!param2) {
                  ub.field_i = var6 != 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                if (param0 < 256) {
                  dg.a(param0, true);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (!param2) {
                  ub.field_i = var6 != 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          } else {
            qh.a(param1, true);
            ii.field_d = false;
            of.a(0, 0, (byte) 40, param4, param1);
            if (0 <= param0) {
              if (param0 >= 256) {
                L7: {
                  if (!param2) {
                    ub.field_i = var6 != 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              } else {
                L8: {
                  dg.a(param0, true);
                  if (!param2) {
                    ub.field_i = var6 != 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              }
            } else {
              L9: {
                if (!param2) {
                  ub.field_i = var6 != 0;
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          }
        } else {
          if (0 > param0) {
            L10: {
              if (!param2) {
                ub.field_i = var6 != 0;
                break L10;
              } else {
                break L10;
              }
            }
            return;
          } else {
            L11: {
              if (-257 > param0) {
                dg.a(param0, true);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (!param2) {
                ub.field_i = var6 != 0;
                break L12;
              } else {
                break L12;
              }
            }
            return;
          }
        }
    }

    final void d(int param0) {
        if (param0 != -1) {
            return;
        }
        ((cd) this).field_t.a(((cd) this).field_r, -77, ((cd) this).field_y);
    }

    final boolean c(int param0) {
        if (param0 == -1) {
          if (((cd) this).field_m <= ul.field_l) {
            if (-1 >= ee.field_o) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((cd) this).field_q = 84;
          if (((cd) this).field_m <= ul.field_l) {
            if (-1 <= ee.field_o) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final ad a(byte param0) {
        ad var2 = null;
        ((cd) this).field_y = sd.field_c;
        ((cd) this).field_r = fl.field_v;
        ((cd) this).field_t.a(((cd) this).field_A, -77, ((cd) this).field_u);
        if (param0 >= -74) {
          return null;
        } else {
          L0: {
            sa.field_c = false;
            var2 = dd.a(0, sh.field_u, 124, ((cd) this).field_u, 0, ((cd) this).field_A);
            if (var2 == null) {
              ((cd) this).d(-1);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        var2 = ((cd) this).field_i;
        var3 = ((cd) this).field_l;
        if (!((cd) this).c(-1)) {
          ((cd) this).field_k = false;
          return;
        } else {
          L0: {
            if (var3 > ((cd) this).field_x) {
              var3 = ((cd) this).field_x;
              break L0;
            } else {
              if (((cd) this).field_q > var3) {
                var3 = ((cd) this).field_q;
                break L0;
              } else {
                if (param0 <= -80) {
                  L1: {
                    if (((cd) this).field_z < var2) {
                      var2 = ((cd) this).field_z;
                      break L1;
                    } else {
                      if (((cd) this).field_e <= var2) {
                        break L1;
                      } else {
                        var2 = ((cd) this).field_e;
                        break L1;
                      }
                    }
                  }
                  if (((cd) this).field_v > 0.0f) {
                    L2: {
                      var4 = (int)((float)var3 * ((cd) this).field_v + 0.5f);
                      if (var4 > var2) {
                        var3 = (int)((float)var2 / ((cd) this).field_v);
                        break L2;
                      } else {
                        if (var4 >= var2) {
                          break L2;
                        } else {
                          L3: {
                            var2 = var4;
                            if (var2 != sd.field_c) {
                              ((cd) this).field_t.a(var3, -77, var2);
                              break L3;
                            } else {
                              if (fl.field_v != var3) {
                                ((cd) this).field_t.a(var3, -77, var2);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L4: {
                            if (((cd) this).field_i <= 0) {
                              break L4;
                            } else {
                              ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                              break L4;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (var2 == sd.field_c) {
                      if (fl.field_v == var3) {
                        L5: {
                          if (((cd) this).field_i <= 0) {
                            break L5;
                          } else {
                            ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                            break L5;
                          }
                        }
                        return;
                      } else {
                        L6: {
                          ((cd) this).field_t.a(var3, -77, var2);
                          if (((cd) this).field_i <= 0) {
                            break L6;
                          } else {
                            ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                            break L6;
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        ((cd) this).field_t.a(var3, -77, var2);
                        if (((cd) this).field_i <= 0) {
                          break L7;
                        } else {
                          ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                          break L7;
                        }
                      }
                      return;
                    }
                  } else {
                    L8: {
                      if (var2 != sd.field_c) {
                        ((cd) this).field_t.a(var3, -77, var2);
                        break L8;
                      } else {
                        if (fl.field_v != var3) {
                          ((cd) this).field_t.a(var3, -77, var2);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (((cd) this).field_i <= 0) {
                        break L9;
                      } else {
                        ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (param0 <= -80) {
            L10: {
              if (((cd) this).field_z < var2) {
                var2 = ((cd) this).field_z;
                break L10;
              } else {
                if (((cd) this).field_e > var2) {
                  var2 = ((cd) this).field_e;
                  break L10;
                } else {
                  if (((cd) this).field_v > 0.0f) {
                    L11: {
                      var4 = (int)((float)var3 * ((cd) this).field_v + 0.5f);
                      if (var4 > var2) {
                        var3 = (int)((float)var2 / ((cd) this).field_v);
                        break L11;
                      } else {
                        if (var4 >= var2) {
                          break L11;
                        } else {
                          L12: {
                            var2 = var4;
                            if (var2 != sd.field_c) {
                              ((cd) this).field_t.a(var3, -77, var2);
                              break L12;
                            } else {
                              if (fl.field_v != var3) {
                                ((cd) this).field_t.a(var3, -77, var2);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (((cd) this).field_i <= 0) {
                              break L13;
                            } else {
                              ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                              break L13;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (var2 == sd.field_c) {
                      if (fl.field_v != var3) {
                        ((cd) this).field_t.a(var3, -77, var2);
                        if (((cd) this).field_i <= 0) {
                          return;
                        } else {
                          ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                          return;
                        }
                      } else {
                        L14: {
                          if (((cd) this).field_i <= 0) {
                            break L14;
                          } else {
                            ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                            break L14;
                          }
                        }
                        return;
                      }
                    } else {
                      L15: {
                        ((cd) this).field_t.a(var3, -77, var2);
                        if (((cd) this).field_i <= 0) {
                          break L15;
                        } else {
                          ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                          break L15;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      if (var2 != sd.field_c) {
                        ((cd) this).field_t.a(var3, -77, var2);
                        break L16;
                      } else {
                        if (fl.field_v != var3) {
                          ((cd) this).field_t.a(var3, -77, var2);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if (((cd) this).field_i <= 0) {
                        break L17;
                      } else {
                        ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                        break L17;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (((cd) this).field_v > 0.0f) {
              L18: {
                var4 = (int)((float)var3 * ((cd) this).field_v + 0.5f);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / ((cd) this).field_v);
                  break L18;
                } else {
                  if (var4 >= var2) {
                    break L18;
                  } else {
                    var2 = var4;
                    if (var2 != sd.field_c) {
                      L19: {
                        ((cd) this).field_t.a(var3, -77, var2);
                        if (((cd) this).field_i <= 0) {
                          break L19;
                        } else {
                          ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                          break L19;
                        }
                      }
                      return;
                    } else {
                      if (fl.field_v != var3) {
                        ((cd) this).field_t.a(var3, -77, var2);
                        if (((cd) this).field_i > 0) {
                          ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((cd) this).field_i > 0) {
                          ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (var2 != sd.field_c) {
                ((cd) this).field_t.a(var3, -77, var2);
                if (((cd) this).field_i <= 0) {
                  return;
                } else {
                  ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                  return;
                }
              } else {
                if (fl.field_v != var3) {
                  ((cd) this).field_t.a(var3, -77, var2);
                  if (((cd) this).field_i <= 0) {
                    return;
                  } else {
                    ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                    return;
                  }
                } else {
                  if (((cd) this).field_i > 0) {
                    ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L20: {
                if (var2 != sd.field_c) {
                  ((cd) this).field_t.a(var3, -77, var2);
                  break L20;
                } else {
                  if (fl.field_v != var3) {
                    ((cd) this).field_t.a(var3, -77, var2);
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
              if (((cd) this).field_i <= 0) {
                return;
              } else {
                ra.field_g = (-sd.field_c + ((cd) this).field_i) / 2;
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    private cd() throws Throwable {
        throw new Error();
    }

    final void a(int param0) {
        if (gi.field_d != null) {
          return;
        } else {
          if (ee.field_o <= 0) {
            ((cd) this).field_k = false;
            if (((cd) this).field_k) {
              int fieldTemp$2 = ((cd) this).field_w - 1;
              ((cd) this).field_w = ((cd) this).field_w - 1;
              if (fieldTemp$2 <= 0) {
                ((cd) this).field_w = ((cd) this).field_g;
                if (((cd) this).field_m <= ul.field_l) {
                  if (param0 != 2) {
                    ((cd) this).d(-73);
                    this.b(param0 + -92);
                    return;
                  } else {
                    this.b(param0 + -92);
                    return;
                  }
                } else {
                  ((cd) this).field_k = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((cd) this).field_i > sd.field_c) {
                ra.field_g = (((cd) this).field_i - sd.field_c) / 2;
                if (sd.field_c == ((cd) this).field_f) {
                  if (((cd) this).field_n != fl.field_v) {
                    ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                  return;
                }
              } else {
                if (((cd) this).field_i <= 0) {
                  if (sd.field_c == ((cd) this).field_f) {
                    if (((cd) this).field_n == fl.field_v) {
                      return;
                    } else {
                      ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                      return;
                    }
                  } else {
                    ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                    return;
                  }
                } else {
                  L0: {
                    ra.field_g = 0;
                    if (sd.field_c != ((cd) this).field_f) {
                      ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                      break L0;
                    } else {
                      if (((cd) this).field_n == fl.field_v) {
                        break L0;
                      } else {
                        ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                        break L0;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            if (((cd) this).field_k) {
              int fieldTemp$3 = ((cd) this).field_w - 1;
              ((cd) this).field_w = ((cd) this).field_w - 1;
              if (fieldTemp$3 <= 0) {
                ((cd) this).field_w = ((cd) this).field_g;
                if (((cd) this).field_m <= ul.field_l) {
                  if (param0 != 2) {
                    ((cd) this).d(-73);
                    this.b(param0 + -92);
                    return;
                  } else {
                    this.b(param0 + -92);
                    return;
                  }
                } else {
                  ((cd) this).field_k = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((cd) this).field_i <= sd.field_c) {
                if (((cd) this).field_i <= 0) {
                  L1: {
                    if (sd.field_c != ((cd) this).field_f) {
                      ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                      break L1;
                    } else {
                      if (((cd) this).field_n == fl.field_v) {
                        break L1;
                      } else {
                        ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                        break L1;
                      }
                    }
                  }
                  return;
                } else {
                  L2: {
                    ra.field_g = 0;
                    if (sd.field_c != ((cd) this).field_f) {
                      ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                      break L2;
                    } else {
                      if (((cd) this).field_n == fl.field_v) {
                        break L2;
                      } else {
                        ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                        break L2;
                      }
                    }
                  }
                  return;
                }
              } else {
                L3: {
                  ra.field_g = (((cd) this).field_i - sd.field_c) / 2;
                  if (sd.field_c != ((cd) this).field_f) {
                    ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                    break L3;
                  } else {
                    if (((cd) this).field_n == fl.field_v) {
                      break L3;
                    } else {
                      ((cd) this).field_t.a(((cd) this).field_n, -77, ((cd) this).field_f);
                      break L3;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ((cd) this).field_i = param0;
        ((cd) this).field_l = param2;
        int var4 = 74 / ((55 - param1) / 47);
    }

    public static void b(byte param0) {
        field_j = null;
        field_d = null;
        field_a = null;
        field_s = null;
        field_p = null;
        if (param0 <= 72) {
            cd.b((byte) -52);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_s = new cf();
        field_p = "Achieved";
        field_d = new int[]{10, 50, 250, 1000};
        field_a = "Creating your account";
        field_j = new byte[50][];
        field_o = false;
    }
}
