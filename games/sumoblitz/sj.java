/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static al field_c;
    static long field_a;
    static ts field_b;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qn var9 = null;
        int var10 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        String stackIn_31_0 = null;
        String stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        String stackIn_43_1 = null;
        int stackIn_44_0 = 0;
        String stackIn_44_1 = null;
        int stackIn_45_0 = 0;
        String stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        qn stackIn_50_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String stackOut_30_0 = null;
        String stackOut_29_0 = null;
        String stackOut_37_0 = null;
        String stackOut_36_0 = null;
        int stackOut_42_0 = 0;
        String stackOut_42_1 = null;
        int stackOut_44_0 = 0;
        String stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_43_0 = 0;
        String stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        qn stackOut_49_0 = null;
        qn stackOut_48_0 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = hh.field_f;
              if (param0 >= 118) {
                break L1;
              } else {
                sj.a(false);
                break L1;
              }
            }
            L2: {
              var2 = 0;
              if (cl.field_s == 2) {
                var3_long = wq.a(-124) + -iv.field_f;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (-1 >= (var2 ^ -1)) {
                  break L2;
                } else {
                  var2 = 0;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (bf.field_c.length <= var3) {
                break L0;
              } else {
                var4 = eb.field_a[var3];
                if (var10 == 0) {
                  L4: {
                    L5: {
                      if (0 <= var4) {
                        break L5;
                      } else {
                        var5 = ke.field_d;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (nj.field_a.field_g != var4) {
                        break L6;
                      } else {
                        var5 = ds.field_a;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var5 = rc.field_j;
                    break L4;
                  }
                  L7: {
                    var6 = bf.field_c[var3];
                    if (2 != cl.field_s) {
                      break L7;
                    } else {
                      if (1 == var2) {
                        L8: {
                          if (no.field_b.length >= hf.field_F.length) {
                            stackOut_21_0 = no.field_b.length;
                            stackIn_22_0 = stackOut_21_0;
                            break L8;
                          } else {
                            stackOut_20_0 = hf.field_F.length;
                            stackIn_22_0 = stackOut_20_0;
                            break L8;
                          }
                        }
                        L9: {
                          var7 = stackIn_22_0;
                          if (uw.field_c.length >= uw.field_b.length) {
                            stackOut_24_0 = uw.field_c.length;
                            stackIn_25_0 = stackOut_24_0;
                            break L9;
                          } else {
                            stackOut_23_0 = uw.field_b.length;
                            stackIn_25_0 = stackOut_23_0;
                            break L9;
                          }
                        }
                        L10: {
                          var8 = stackIn_25_0;
                          if (6 > var3) {
                            break L10;
                          } else {
                            if (var3 < 6 - -var7) {
                              L11: {
                                if (-var7 + (-6 + var3 + no.field_b.length) >= 0) {
                                  stackOut_30_0 = no.field_b[-var7 + no.field_b.length + (var3 + -6)];
                                  stackIn_31_0 = stackOut_30_0;
                                  break L11;
                                } else {
                                  stackOut_29_0 = "";
                                  stackIn_31_0 = stackOut_29_0;
                                  break L11;
                                }
                              }
                              var6 = stackIn_31_0;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (var7 + 7 > var3) {
                          break L7;
                        } else {
                          if (var8 + var7 + 7 > var3) {
                            L12: {
                              if (-var7 + (var3 - 7) >= uw.field_c.length) {
                                stackOut_37_0 = "";
                                stackIn_38_0 = stackOut_37_0;
                                break L12;
                              } else {
                                stackOut_36_0 = uw.field_c[-var7 + var3 + -7];
                                stackIn_38_0 = stackOut_36_0;
                                break L12;
                              }
                            }
                            var6 = stackIn_38_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  L13: {
                    if (-2 == var4) {
                      var6 = Integer.toString(var2);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    stackOut_42_0 = -9;
                    stackOut_42_1 = (String) (var6);
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    if (0 > var4) {
                      stackOut_44_0 = stackIn_44_0;
                      stackOut_44_1 = (String) ((Object) stackIn_44_1);
                      stackOut_44_2 = 0;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      stackIn_45_2 = stackOut_44_2;
                      break L14;
                    } else {
                      stackOut_43_0 = stackIn_43_0;
                      stackOut_43_1 = (String) ((Object) stackIn_43_1);
                      stackOut_43_2 = 1;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_45_2 = stackOut_43_2;
                      break L14;
                    }
                  }
                  L15: {
                    var7 = gt.a((byte) stackIn_45_0, stackIn_45_1, stackIn_45_2 != 0);
                    var8 = -(var7 >> 821055745) + oj.field_a;
                    if ((var4 ^ -1) <= -1) {
                      L16: {
                        var1_int = var1_int + qc.field_a;
                        if (var4 != nj.field_a.field_g) {
                          stackOut_49_0 = vp.field_e;
                          stackIn_50_0 = stackOut_49_0;
                          break L16;
                        } else {
                          stackOut_48_0 = fs.field_k;
                          stackIn_50_0 = stackOut_48_0;
                          break L16;
                        }
                      }
                      L17: {
                        var9 = stackIn_50_0;
                        if (var9 != null) {
                          var9.a((dw.field_b << 1411955297) + var7, -dw.field_b + var8, (ag.field_b << -646696383) + ga.field_h, 101, var1_int);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var1_int = var1_int + ag.field_b;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L18: {
                    L19: {
                      if ((var4 ^ -1) > -1) {
                        break L19;
                      } else {
                        ns.field_a.b(var6, var8, var1_int - -dl.field_f, var5, -1);
                        var1_int = var1_int + (qc.field_a + (ag.field_b - -ga.field_h));
                        if (var10 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    qq.field_R.b(var6, var8, var1_int - -ia.field_d, var5, -1);
                    var1_int = var1_int + fn.field_t;
                    break L18;
                  }
                  var3++;
                  continue L3;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "sj.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            sj.a(-105, -2, -5);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        nl.field_o = true;
        field_a = 15000L + wq.a(-13);
        if (param0 >= -26) {
          L0: {
            field_b = (ts) null;
            if (-12 != (jv.field_a ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-12 != (jv.field_a ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -1) {
          discarded$1 = sj.a(-9);
          if (!t.field_p[param2]) {
            if (wm.field_f[param2]) {
              return;
            } else {
              L0: {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            var3 = param2;
                            if (0 != var3) {
                              break L6;
                            } else {
                              if (var4 == 0) {
                                L7: {
                                  if (-1 == (param1 ^ -1)) {
                                    fq.field_f.a(param0 ^ 3387, 16);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                L8: {
                                  if (-2 == (param1 ^ -1)) {
                                    fq.field_f.a(-3388, 0);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                if (2 == param1) {
                                  fq.field_f.a(-3388, 1);
                                  t.field_p[param2] = true;
                                  if (var4 != 0) {
                                    break L5;
                                  } else {
                                    return;
                                  }
                                } else {
                                  break L0;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (1 != var3) {
                              break L9;
                            } else {
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (-3 != (var3 ^ -1)) {
                              break L10;
                            } else {
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if ((var3 ^ -1) == -4) {
                            break L3;
                          } else {
                            if (4 == var3) {
                              break L2;
                            } else {
                              L11: {
                                if (-6 != (var3 ^ -1)) {
                                  break L11;
                                } else {
                                  if (var4 == 0) {
                                    break L1;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (6 != var3) {
                                  break L12;
                                } else {
                                  if (var4 == 0) {
                                    L13: {
                                      if (0 == param1) {
                                        fq.field_f.a(-3388, 18);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    if ((param1 ^ -1) != -5) {
                                      break L0;
                                    } else {
                                      fq.field_f.a(param0 + -3387, 15);
                                      t.field_p[param2] = true;
                                      if (var4 == 0) {
                                        break L0;
                                      } else {
                                        L14: {
                                          if ((param1 ^ -1) != -2) {
                                            break L14;
                                          } else {
                                            fq.field_f.a(-3388, 11);
                                            t.field_p[param2] = true;
                                            if (0 == param1) {
                                              fq.field_f.a(-3388, 12);
                                              t.field_p[param2] = true;
                                              if (var4 == 0) {
                                                break L14;
                                              } else {
                                                if (0 == param1) {
                                                  fq.field_f.a(param0 ^ 3387, 13);
                                                  t.field_p[param2] = true;
                                                  if (var4 == 0) {
                                                    break L14;
                                                  } else {
                                                    if (param1 == 0) {
                                                      fq.field_f.a(-3388, 14);
                                                      t.field_p[param2] = true;
                                                      break L14;
                                                    } else {
                                                      return;
                                                    }
                                                  }
                                                } else {
                                                  return;
                                                }
                                              }
                                            } else {
                                              return;
                                            }
                                          }
                                        }
                                        return;
                                      }
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L15: {
                                if ((var3 ^ -1) != -9) {
                                  break L15;
                                } else {
                                  if (var4 == 0) {
                                    if ((param1 ^ -1) != -2) {
                                      break L0;
                                    } else {
                                      fq.field_f.a(-3388, 11);
                                      t.field_p[param2] = true;
                                      if (var4 == 0) {
                                        break L0;
                                      } else {
                                        if (0 == param1) {
                                          L16: {
                                            fq.field_f.a(-3388, 12);
                                            t.field_p[param2] = true;
                                            if (var4 == 0) {
                                              break L16;
                                            } else {
                                              if (0 == param1) {
                                                fq.field_f.a(param0 ^ 3387, 13);
                                                t.field_p[param2] = true;
                                                if (var4 == 0) {
                                                  break L16;
                                                } else {
                                                  if (param1 == 0) {
                                                    fq.field_f.a(-3388, 14);
                                                    t.field_p[param2] = true;
                                                    break L16;
                                                  } else {
                                                    return;
                                                  }
                                                }
                                              } else {
                                                return;
                                              }
                                            }
                                          }
                                          return;
                                        } else {
                                          return;
                                        }
                                      }
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L17: {
                                L18: {
                                  L19: {
                                    if (-10 != (var3 ^ -1)) {
                                      break L19;
                                    } else {
                                      if (var4 == 0) {
                                        if (0 == param1) {
                                          fq.field_f.a(-3388, 12);
                                          t.field_p[param2] = true;
                                          if (var4 == 0) {
                                            break L0;
                                          } else {
                                            break L18;
                                          }
                                        } else {
                                          return;
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    if (-11 != (var3 ^ -1)) {
                                      break L20;
                                    } else {
                                      if (var4 == 0) {
                                        break L18;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  if (11 == var3) {
                                    break L17;
                                  } else {
                                    break L0;
                                  }
                                }
                                if (0 == param1) {
                                  fq.field_f.a(param0 ^ 3387, 13);
                                  t.field_p[param2] = true;
                                  if (var4 == 0) {
                                    break L0;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  return;
                                }
                              }
                              if (param1 == 0) {
                                fq.field_f.a(-3388, 14);
                                t.field_p[param2] = true;
                                break L0;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        if (0 == param1) {
                          fq.field_f.a(param0 ^ 3387, 2);
                          t.field_p[param2] = true;
                          if (var4 != 0) {
                            break L4;
                          } else {
                            return;
                          }
                        } else {
                          break L0;
                        }
                      }
                      L21: {
                        if (param1 == 0) {
                          fq.field_f.a(param0 ^ 3387, 5);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      if (param1 == 5) {
                        fq.field_f.a(-3388, 3);
                        t.field_p[param2] = true;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                    if (-1 == (param1 ^ -1)) {
                      fq.field_f.a(-3388, 6);
                      t.field_p[param2] = true;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                  L22: {
                    if (0 == param1) {
                      fq.field_f.a(-3388, 7);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (-2 == (param1 ^ -1)) {
                      fq.field_f.a(param0 ^ 3387, 4);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (param1 == 2) {
                      fq.field_f.a(-3388, 8);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  if ((param1 ^ -1) != -4) {
                    break L0;
                  } else {
                    fq.field_f.a(param0 ^ 3387, 9);
                    t.field_p[param2] = true;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (param1 != 0) {
                  break L0;
                } else {
                  fq.field_f.a(-3388, 10);
                  t.field_p[param2] = true;
                  if (var4 == 0) {
                    break L0;
                  } else {
                    L25: {
                      if (0 == param1) {
                        fq.field_f.a(-3388, 18);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if ((param1 ^ -1) != -5) {
                        break L26;
                      } else {
                        fq.field_f.a(param0 + -3387, 15);
                        t.field_p[param2] = true;
                        if (var4 == 0) {
                          break L26;
                        } else {
                          if ((param1 ^ -1) != -2) {
                            break L26;
                          } else {
                            fq.field_f.a(-3388, 11);
                            t.field_p[param2] = true;
                            if (0 == param1) {
                              fq.field_f.a(-3388, 12);
                              t.field_p[param2] = true;
                              if (var4 == 0) {
                                break L26;
                              } else {
                                if (0 == param1) {
                                  fq.field_f.a(param0 ^ 3387, 13);
                                  t.field_p[param2] = true;
                                  if (var4 == 0) {
                                    break L26;
                                  } else {
                                    if (param1 == 0) {
                                      fq.field_f.a(-3388, 14);
                                      t.field_p[param2] = true;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                } else {
                                  break L26;
                                }
                              }
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          L27: {
            if (t.field_p[param2]) {
              break L27;
            } else {
              if (wm.field_f[param2]) {
                break L27;
              } else {
                L28: {
                  L29: {
                    L30: {
                      L31: {
                        L32: {
                          L33: {
                            L34: {
                              var3 = param2;
                              if (0 != var3) {
                                break L34;
                              } else {
                                if (var4 == 0) {
                                  L35: {
                                    if (-1 == (param1 ^ -1)) {
                                      fq.field_f.a(param0 ^ 3387, 16);
                                      break L35;
                                    } else {
                                      break L35;
                                    }
                                  }
                                  L36: {
                                    if (-2 == (param1 ^ -1)) {
                                      fq.field_f.a(-3388, 0);
                                      break L36;
                                    } else {
                                      break L36;
                                    }
                                  }
                                  if (2 == param1) {
                                    fq.field_f.a(-3388, 1);
                                    t.field_p[param2] = true;
                                    if (var4 != 0) {
                                      break L33;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    break L31;
                                  }
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L37: {
                              if (1 != var3) {
                                break L37;
                              } else {
                                if (var4 == 0) {
                                  break L33;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            L38: {
                              if (-3 != (var3 ^ -1)) {
                                break L38;
                              } else {
                                if (var4 == 0) {
                                  break L32;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            if ((var3 ^ -1) == -4) {
                              break L30;
                            } else {
                              if (4 == var3) {
                                break L29;
                              } else {
                                L39: {
                                  if (-6 != (var3 ^ -1)) {
                                    break L39;
                                  } else {
                                    if (var4 == 0) {
                                      break L28;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                L40: {
                                  if (6 != var3) {
                                    break L40;
                                  } else {
                                    if (var4 == 0) {
                                      L41: {
                                        if (0 == param1) {
                                          fq.field_f.a(-3388, 18);
                                          break L41;
                                        } else {
                                          break L41;
                                        }
                                      }
                                      if ((param1 ^ -1) == -5) {
                                        fq.field_f.a(param0 + -3387, 15);
                                        t.field_p[param2] = true;
                                        if (var4 == 0) {
                                          return;
                                        } else {
                                          L42: {
                                            if ((param1 ^ -1) != -2) {
                                              break L42;
                                            } else {
                                              fq.field_f.a(-3388, 11);
                                              t.field_p[param2] = true;
                                              if (0 == param1) {
                                                fq.field_f.a(-3388, 12);
                                                t.field_p[param2] = true;
                                                if (var4 == 0) {
                                                  break L42;
                                                } else {
                                                  if (0 == param1) {
                                                    fq.field_f.a(param0 ^ 3387, 13);
                                                    t.field_p[param2] = true;
                                                    if (var4 == 0) {
                                                      break L42;
                                                    } else {
                                                      if (param1 == 0) {
                                                        fq.field_f.a(-3388, 14);
                                                        t.field_p[param2] = true;
                                                        break L42;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              } else {
                                                break L42;
                                              }
                                            }
                                          }
                                          return;
                                        }
                                      } else {
                                        return;
                                      }
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                                L43: {
                                  if ((var3 ^ -1) != -9) {
                                    break L43;
                                  } else {
                                    if (var4 == 0) {
                                      if ((param1 ^ -1) == -2) {
                                        fq.field_f.a(-3388, 11);
                                        t.field_p[param2] = true;
                                        if (var4 == 0) {
                                          return;
                                        } else {
                                          L44: {
                                            if (0 == param1) {
                                              fq.field_f.a(-3388, 12);
                                              t.field_p[param2] = true;
                                              if (var4 == 0) {
                                                break L44;
                                              } else {
                                                if (0 == param1) {
                                                  fq.field_f.a(param0 ^ 3387, 13);
                                                  t.field_p[param2] = true;
                                                  if (var4 == 0) {
                                                    break L44;
                                                  } else {
                                                    if (param1 == 0) {
                                                      fq.field_f.a(-3388, 14);
                                                      t.field_p[param2] = true;
                                                      break L44;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            } else {
                                              break L44;
                                            }
                                          }
                                          return;
                                        }
                                      } else {
                                        return;
                                      }
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                L45: {
                                  L46: {
                                    L47: {
                                      if (-10 != (var3 ^ -1)) {
                                        break L47;
                                      } else {
                                        if (var4 == 0) {
                                          if (0 == param1) {
                                            fq.field_f.a(-3388, 12);
                                            t.field_p[param2] = true;
                                            if (var4 != 0) {
                                              break L46;
                                            } else {
                                              return;
                                            }
                                          } else {
                                            return;
                                          }
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                    L48: {
                                      if (-11 != (var3 ^ -1)) {
                                        break L48;
                                      } else {
                                        if (var4 == 0) {
                                          break L46;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    if (11 == var3) {
                                      break L45;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  if (0 == param1) {
                                    fq.field_f.a(param0 ^ 3387, 13);
                                    t.field_p[param2] = true;
                                    if (var4 != 0) {
                                      break L45;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    return;
                                  }
                                }
                                if (param1 != 0) {
                                  return;
                                } else {
                                  fq.field_f.a(-3388, 14);
                                  t.field_p[param2] = true;
                                  return;
                                }
                              }
                            }
                          }
                          if (0 == param1) {
                            fq.field_f.a(param0 ^ 3387, 2);
                            t.field_p[param2] = true;
                            if (var4 != 0) {
                              break L32;
                            } else {
                              return;
                            }
                          } else {
                            break L31;
                          }
                        }
                        L49: {
                          if (param1 == 0) {
                            fq.field_f.a(param0 ^ 3387, 5);
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        if (param1 == 5) {
                          fq.field_f.a(-3388, 3);
                          t.field_p[param2] = true;
                          if (var4 != 0) {
                            break L30;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                      return;
                    }
                    if (-1 == (param1 ^ -1)) {
                      fq.field_f.a(-3388, 6);
                      t.field_p[param2] = true;
                      if (var4 != 0) {
                        break L29;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                  L50: {
                    if (0 == param1) {
                      fq.field_f.a(-3388, 7);
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                  L51: {
                    if (-2 == (param1 ^ -1)) {
                      fq.field_f.a(param0 ^ 3387, 4);
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == 2) {
                      fq.field_f.a(-3388, 8);
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  if ((param1 ^ -1) == -4) {
                    fq.field_f.a(param0 ^ 3387, 9);
                    t.field_p[param2] = true;
                    if (var4 != 0) {
                      break L28;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
                if (param1 == 0) {
                  fq.field_f.a(-3388, 10);
                  t.field_p[param2] = true;
                  if (var4 == 0) {
                    return;
                  } else {
                    L53: {
                      if (0 == param1) {
                        fq.field_f.a(-3388, 18);
                        break L53;
                      } else {
                        break L53;
                      }
                    }
                    L54: {
                      if ((param1 ^ -1) != -5) {
                        break L54;
                      } else {
                        fq.field_f.a(param0 + -3387, 15);
                        t.field_p[param2] = true;
                        if (var4 == 0) {
                          break L54;
                        } else {
                          if ((param1 ^ -1) != -2) {
                            break L54;
                          } else {
                            fq.field_f.a(-3388, 11);
                            t.field_p[param2] = true;
                            if (0 == param1) {
                              fq.field_f.a(-3388, 12);
                              t.field_p[param2] = true;
                              if (var4 == 0) {
                                break L54;
                              } else {
                                if (0 == param1) {
                                  fq.field_f.a(param0 ^ 3387, 13);
                                  t.field_p[param2] = true;
                                  if (var4 == 0) {
                                    break L54;
                                  } else {
                                    if (param1 == 0) {
                                      fq.field_f.a(-3388, 14);
                                      t.field_p[param2] = true;
                                      break L54;
                                    } else {
                                      break L54;
                                    }
                                  }
                                } else {
                                  break L54;
                                }
                              }
                            } else {
                              break L54;
                            }
                          }
                        }
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
          return;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!g.a(param0, 0, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param2.length() <= var3_int) {
                      break L3;
                    } else {
                      stackOut_7_0 = jl.a((byte) 110, param2.charAt(var3_int));
                      stackIn_13_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_8_0) {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = param1;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                if (stackIn_13_0 > 122) {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  discarded$2 = sj.a(-58);
                  return true;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("sj.E(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    static {
        field_b = new ts(2, 4, 4, 0);
    }
}
