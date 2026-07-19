/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep {
    static int field_h;
    private static boolean field_g;
    static int[] field_k;
    static int field_d;
    static int field_i;
    private static int field_j;
    static int field_c;
    private static int[] field_b;
    static int[] field_a;
    private static int[] field_e;
    private static int[] field_f;

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_i = param2 - param0;
        field_h = param3 - param1;
        ep.b();
        if (field_a.length < field_h) {
            field_a = new int[cb.b(-74, field_h)];
        }
        int var4 = param1 * oo.field_b + param0;
        for (var5 = 0; var5 < field_h; var5++) {
            field_a[var5] = var4;
            var4 = var4 + oo.field_b;
        }
    }

    final static int a() {
        return field_a[0] % oo.field_b;
    }

    public static void c() {
        field_a = null;
        field_b = null;
        field_f = null;
        field_k = null;
        field_e = null;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!field_g) {
            break L0;
          } else {
            L1: {
              if (param5 <= field_i) {
                break L1;
              } else {
                param5 = field_i;
                break L1;
              }
            }
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = 0;
              break L0;
            }
          }
        }
        if (param4 < param5) {
          param1 = param1 + param4;
          param3 = param5 - param4 >> 2;
          if (field_j != 0) {
            L2: {
              if (field_j != 254) {
                var6 = field_j;
                var7 = 256 - field_j;
                param2 = ((param2 & 16711935) * var7 >> 8 & 16711935) + ((param2 & 65280) * var7 >> 8 & 65280);
                L3: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L4: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        var8 = param0[param1];
                        incrementValue$15 = param1;
                        param1++;
                        param0[incrementValue$15] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param0[param1];
                    incrementValue$16 = param1;
                    param1++;
                    param0[incrementValue$16] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    incrementValue$17 = param1;
                    param1++;
                    param0[incrementValue$17] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    incrementValue$18 = param1;
                    param1++;
                    param0[incrementValue$18] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    incrementValue$19 = param1;
                    param1++;
                    param0[incrementValue$19] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    continue L3;
                  }
                }
              } else {
                L5: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L6: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        incrementValue$20 = param1;
                        param1++;
                        param0[incrementValue$20] = param0[param1];
                        continue L6;
                      }
                    }
                  } else {
                    incrementValue$21 = param1;
                    param1++;
                    param0[incrementValue$21] = param0[param1];
                    incrementValue$22 = param1;
                    param1++;
                    param0[incrementValue$22] = param0[param1];
                    incrementValue$23 = param1;
                    param1++;
                    param0[incrementValue$23] = param0[param1];
                    incrementValue$24 = param1;
                    param1++;
                    param0[incrementValue$24] = param0[param1];
                    continue L5;
                  }
                }
              }
            }
            return;
          } else {
            L7: while (true) {
              param3--;
              if (param3 < 0) {
                param3 = param5 - param4 & 3;
                L8: while (true) {
                  param3--;
                  if (param3 < 0) {
                    return;
                  } else {
                    incrementValue$25 = param1;
                    param1++;
                    param0[incrementValue$25] = param2;
                    continue L8;
                  }
                }
              } else {
                incrementValue$26 = param1;
                param1++;
                param0[incrementValue$26] = param2;
                incrementValue$27 = param1;
                param1++;
                param0[incrementValue$27] = param2;
                incrementValue$28 = param1;
                param1++;
                param0[incrementValue$28] = param2;
                incrementValue$29 = param1;
                param1++;
                param0[incrementValue$29] = param2;
                continue L7;
              }
            }
          }
        } else {
          return;
        }
    }

    final static int d() {
        return field_a[0] / oo.field_b;
    }

    final static void e() {
        ep.a(oo.field_f, oo.field_e, oo.field_g, oo.field_d);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var7 = 0;
          if (param1 == param0) {
            break L0;
          } else {
            var7 = (param4 - param3 << 16) / (param1 - param0);
            break L0;
          }
        }
        L1: {
          var8 = 0;
          if (param2 == param1) {
            break L1;
          } else {
            var8 = (param5 - param4 << 16) / (param2 - param1);
            break L1;
          }
        }
        L2: {
          var9 = 0;
          if (param2 == param0) {
            break L2;
          } else {
            var9 = (param3 - param5 << 16) / (param0 - param2);
            break L2;
          }
        }
        L3: {
          if (param0 > param1) {
            break L3;
          } else {
            if (param0 > param2) {
              break L3;
            } else {
              if (param0 < field_h) {
                L4: {
                  if (param1 <= field_h) {
                    break L4;
                  } else {
                    param1 = field_h;
                    break L4;
                  }
                }
                L5: {
                  if (param2 <= field_h) {
                    break L5;
                  } else {
                    param2 = field_h;
                    break L5;
                  }
                }
                if (param1 >= param2) {
                  L6: {
                    param3 = param3 << 16;
                    param4 = param3 << 16;
                    if (param0 >= 0) {
                      break L6;
                    } else {
                      param4 = param4 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    param5 = param5 << 16;
                    if (param2 >= 0) {
                      break L7;
                    } else {
                      param5 = param5 - var8 * param2;
                      param2 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      if (param0 == param2) {
                        break L9;
                      } else {
                        if (var9 < var7) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param0 != param2) {
                        break L10;
                      } else {
                        if (var8 <= var7) {
                          break L10;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = field_a[param0];
                    L11: while (true) {
                      param2--;
                      if (param2 < 0) {
                        param1--;
                        L12: while (true) {
                          if (param1 < 0) {
                            return;
                          } else {
                            ep.a(oo.field_i, param0, param6, 0, param3 >> 16, param5 >> 16);
                            param5 = param5 + var8;
                            param3 = param3 + var7;
                            param0 = param0 + oo.field_b;
                            param1--;
                            continue L12;
                          }
                        }
                      } else {
                        ep.a(oo.field_i, param0, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + oo.field_b;
                        continue L11;
                      }
                    }
                  }
                  param1 = param1 - param2;
                  param2 = param2 - param0;
                  param0 = field_a[param0];
                  L13: while (true) {
                    param2--;
                    if (param2 < 0) {
                      param1--;
                      L14: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          ep.a(oo.field_i, param0, param6, 0, param5 >> 16, param3 >> 16);
                          param5 = param5 + var8;
                          param3 = param3 + var7;
                          param0 = param0 + oo.field_b;
                          param1--;
                          continue L14;
                        }
                      }
                    } else {
                      ep.a(oo.field_i, param0, param6, 0, param4 >> 16, param3 >> 16);
                      param4 = param4 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + oo.field_b;
                      continue L13;
                    }
                  }
                } else {
                  L15: {
                    param3 = param3 << 16;
                    param5 = param3 << 16;
                    if (param0 >= 0) {
                      break L15;
                    } else {
                      param5 = param5 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L15;
                    }
                  }
                  L16: {
                    param4 = param4 << 16;
                    if (param1 >= 0) {
                      break L16;
                    } else {
                      param4 = param4 - var8 * param1;
                      param1 = 0;
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      if (param0 == param1) {
                        break L18;
                      } else {
                        if (var9 < var7) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (param0 != param1) {
                        break L19;
                      } else {
                        if (var9 <= var8) {
                          break L19;
                        } else {
                          break L17;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = field_a[param0];
                    L20: while (true) {
                      param1--;
                      if (param1 < 0) {
                        param2--;
                        L21: while (true) {
                          if (param2 < 0) {
                            return;
                          } else {
                            ep.a(oo.field_i, param0, param6, 0, param4 >> 16, param5 >> 16);
                            param5 = param5 + var9;
                            param4 = param4 + var8;
                            param0 = param0 + oo.field_b;
                            param2--;
                            continue L21;
                          }
                        }
                      } else {
                        ep.a(oo.field_i, param0, param6, 0, param3 >> 16, param5 >> 16);
                        param5 = param5 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + oo.field_b;
                        continue L20;
                      }
                    }
                  }
                  param2 = param2 - param1;
                  param1 = param1 - param0;
                  param0 = field_a[param0];
                  L22: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param2--;
                      L23: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          ep.a(oo.field_i, param0, param6, 0, param5 >> 16, param4 >> 16);
                          param5 = param5 + var9;
                          param4 = param4 + var8;
                          param0 = param0 + oo.field_b;
                          param2--;
                          continue L23;
                        }
                      }
                    } else {
                      ep.a(oo.field_i, param0, param6, 0, param5 >> 16, param3 >> 16);
                      param5 = param5 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + oo.field_b;
                      continue L22;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        if (param1 > param2) {
          if (param2 < field_h) {
            L24: {
              if (param0 <= field_h) {
                break L24;
              } else {
                param0 = field_h;
                break L24;
              }
            }
            L25: {
              if (param1 <= field_h) {
                break L25;
              } else {
                param1 = field_h;
                break L25;
              }
            }
            if (param0 >= param1) {
              L26: {
                param5 = param5 << 16;
                param3 = param5 << 16;
                if (param2 >= 0) {
                  break L26;
                } else {
                  param3 = param3 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L26;
                }
              }
              L27: {
                param4 = param4 << 16;
                if (param1 >= 0) {
                  break L27;
                } else {
                  param4 = param4 - var7 * param1;
                  param1 = 0;
                  break L27;
                }
              }
              if (var8 >= var9) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_a[param2];
                L28: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L29: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        ep.a(oo.field_i, param2, param6, 0, param5 >> 16, param4 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + oo.field_b;
                        param0--;
                        continue L29;
                      }
                    }
                  } else {
                    ep.a(oo.field_i, param2, param6, 0, param5 >> 16, param3 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + oo.field_b;
                    continue L28;
                  }
                }
              } else {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_a[param2];
                L30: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L31: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        ep.a(oo.field_i, param2, param6, 0, param4 >> 16, param5 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + oo.field_b;
                        param0--;
                        continue L31;
                      }
                    }
                  } else {
                    ep.a(oo.field_i, param2, param6, 0, param3 >> 16, param5 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + oo.field_b;
                    continue L30;
                  }
                }
              }
            } else {
              L32: {
                param5 = param5 << 16;
                param4 = param5 << 16;
                if (param2 >= 0) {
                  break L32;
                } else {
                  param4 = param4 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L32;
                }
              }
              L33: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L33;
                } else {
                  param3 = param3 - var7 * param0;
                  param0 = 0;
                  break L33;
                }
              }
              if (var8 >= var9) {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_a[param2];
                L34: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L35: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        ep.a(oo.field_i, param2, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + oo.field_b;
                        param1--;
                        continue L35;
                      }
                    }
                  } else {
                    ep.a(oo.field_i, param2, param6, 0, param5 >> 16, param4 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + oo.field_b;
                    continue L34;
                  }
                }
              } else {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_a[param2];
                L36: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L37: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        ep.a(oo.field_i, param2, param6, 0, param4 >> 16, param3 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + oo.field_b;
                        param1--;
                        continue L37;
                      }
                    }
                  } else {
                    ep.a(oo.field_i, param2, param6, 0, param4 >> 16, param5 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + oo.field_b;
                    continue L36;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 < field_h) {
            L38: {
              if (param2 <= field_h) {
                break L38;
              } else {
                param2 = field_h;
                break L38;
              }
            }
            L39: {
              if (param0 <= field_h) {
                break L39;
              } else {
                param0 = field_h;
                break L39;
              }
            }
            if (param2 >= param0) {
              L40: {
                param4 = param4 << 16;
                param5 = param4 << 16;
                if (param1 >= 0) {
                  break L40;
                } else {
                  param5 = param5 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L40;
                }
              }
              L41: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L41;
                } else {
                  param3 = param3 - var9 * param0;
                  param0 = 0;
                  break L41;
                }
              }
              if (var7 >= var8) {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_a[param1];
                L42: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L43: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        ep.a(oo.field_i, param1, param6, 0, param4 >> 16, param3 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + oo.field_b;
                        param2--;
                        continue L43;
                      }
                    }
                  } else {
                    ep.a(oo.field_i, param1, param6, 0, param4 >> 16, param5 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + oo.field_b;
                    continue L42;
                  }
                }
              } else {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_a[param1];
                L44: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L45: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        ep.a(oo.field_i, param1, param6, 0, param3 >> 16, param4 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + oo.field_b;
                        param2--;
                        continue L45;
                      }
                    }
                  } else {
                    ep.a(oo.field_i, param1, param6, 0, param5 >> 16, param4 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + oo.field_b;
                    continue L44;
                  }
                }
              }
            } else {
              L46: {
                param4 = param4 << 16;
                param3 = param4 << 16;
                if (param1 >= 0) {
                  break L46;
                } else {
                  param3 = param3 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L46;
                }
              }
              L47: {
                param5 = param5 << 16;
                if (param2 >= 0) {
                  break L47;
                } else {
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L47;
                }
              }
              L48: {
                L49: {
                  if (param1 == param2) {
                    break L49;
                  } else {
                    if (var7 < var8) {
                      break L48;
                    } else {
                      break L49;
                    }
                  }
                }
                L50: {
                  if (param1 != param2) {
                    break L50;
                  } else {
                    if (var7 <= var9) {
                      break L50;
                    } else {
                      break L48;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = field_a[param1];
                L51: while (true) {
                  param2--;
                  if (param2 < 0) {
                    param0--;
                    L52: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        ep.a(oo.field_i, param1, param6, 0, param5 >> 16, param3 >> 16);
                        param3 = param3 + var7;
                        param5 = param5 + var9;
                        param1 = param1 + oo.field_b;
                        param0--;
                        continue L52;
                      }
                    }
                  } else {
                    ep.a(oo.field_i, param1, param6, 0, param4 >> 16, param3 >> 16);
                    param3 = param3 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + oo.field_b;
                    continue L51;
                  }
                }
              }
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = field_a[param1];
              L53: while (true) {
                param2--;
                if (param2 < 0) {
                  param0--;
                  L54: while (true) {
                    if (param0 < 0) {
                      return;
                    } else {
                      ep.a(oo.field_i, param1, param6, 0, param3 >> 16, param5 >> 16);
                      param3 = param3 + var7;
                      param5 = param5 + var9;
                      param1 = param1 + oo.field_b;
                      param0--;
                      continue L54;
                    }
                  }
                } else {
                  ep.a(oo.field_i, param1, param6, 0, param3 >> 16, param4 >> 16);
                  param3 = param3 + var7;
                  param4 = param4 + var8;
                  param1 = param1 + oo.field_b;
                  continue L53;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            if (param0 < 0) {
              break L1;
            } else {
              if (param0 > field_i) {
                break L1;
              } else {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 > field_i) {
                    break L1;
                  } else {
                    if (param2 < 0) {
                      break L1;
                    } else {
                      if (param2 <= field_i) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        field_g = stackIn_8_0 != 0;
    }

    private final static void b() {
        field_d = field_i / 2;
        field_c = field_h / 2;
    }

    static {
        int var0 = 0;
        field_k = new int[2048];
        field_g = false;
        field_b = new int[512];
        field_j = 0;
        field_e = new int[2048];
        field_a = new int[1024];
        field_f = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_b[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_f[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_k[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_e[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
