/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static int field_b;
    private int[] field_c;
    static tf field_e;
    static tf field_f;
    static int field_a;
    static ch field_d;

    final static String a(qc param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            var3_int = param0.c(param1 + 1);
            if (var3_int > param2) {
              var3_int = param2;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param0.field_f = param0.field_f + vj.field_b.a(var4, param0.field_f, param0.field_j, param1, -127, var3_int);
          var5 = bc.a(param1 ^ -103, var4, 0, var3_int);
          stackOut_3_0 = (String) var5;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_4_0;
        }
        return null;
    }

    final static qd a(byte[] param0, boolean param1) {
        qd var2 = null;
        Object var3 = null;
        if (!param1) {
          if (param0 == null) {
            return null;
          } else {
            var2 = new qd(param0, gh.field_m, md.field_e, rc.field_j, hl.field_K, cm.field_j, mj.field_a);
            kj.c(true);
            return var2;
          }
        } else {
          var3 = null;
          qd discarded$5 = qa.a((byte[]) null, false);
          if (param0 == null) {
            return null;
          } else {
            var2 = new qd(param0, gh.field_m, md.field_e, rc.field_j, hl.field_K, cm.field_j, mj.field_a);
            kj.c(true);
            return var2;
          }
        }
    }

    private final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        if (0 == param5) {
          return 0;
        } else {
          var8 = 121 / ((-63 - param4) / 59);
          var7 = 0;
          param5 = param5 + param3;
          var9 = param1;
          L0: while (true) {
            L1: {
              var10 = param2[var9];
              if (-1 < (var10 ^ -1)) {
                var7 = ((qa) this).field_c[var7];
                break L1;
              } else {
                var7++;
                break L1;
              }
            }
            L2: {
              var11 = ((qa) this).field_c[var7];
              if (((qa) this).field_c[var7] >= 0) {
                break L2;
              } else {
                param3++;
                param0[param3] = (byte)(var11 ^ -1);
                if (param3 < param5) {
                  var7 = 0;
                  break L2;
                } else {
                  return var9 - -1 + -param1;
                }
              }
            }
            L3: {
              if (0 == (64 & var10)) {
                var7++;
                break L3;
              } else {
                var7 = ((qa) this).field_c[var7];
                break L3;
              }
            }
            L4: {
              var11 = ((qa) this).field_c[var7];
              if (((qa) this).field_c[var7] < 0) {
                param3++;
                param0[param3] = (byte)(var11 ^ -1);
                if (param3 < param5) {
                  var7 = 0;
                  break L4;
                } else {
                  return var9 - -1 + -param1;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if ((var10 & 32) != 0) {
                var7 = ((qa) this).field_c[var7];
                break L5;
              } else {
                var7++;
                break L5;
              }
            }
            L6: {
              var11 = ((qa) this).field_c[var7];
              if (-1 >= (((qa) this).field_c[var7] ^ -1)) {
                break L6;
              } else {
                param3++;
                param0[param3] = (byte)(var11 ^ -1);
                if (param5 > param3) {
                  var7 = 0;
                  break L6;
                } else {
                  return var9 - -1 + -param1;
                }
              }
            }
            L7: {
              if ((var10 & 16) == 0) {
                var7++;
                break L7;
              } else {
                var7 = ((qa) this).field_c[var7];
                break L7;
              }
            }
            L8: {
              var11 = ((qa) this).field_c[var7];
              if (-1 >= (((qa) this).field_c[var7] ^ -1)) {
                break L8;
              } else {
                param3++;
                param0[param3] = (byte)(var11 ^ -1);
                if (param5 > param3) {
                  var7 = 0;
                  break L8;
                } else {
                  return var9 - -1 + -param1;
                }
              }
            }
            L9: {
              if ((8 & var10) == 0) {
                var7++;
                break L9;
              } else {
                var7 = ((qa) this).field_c[var7];
                break L9;
              }
            }
            L10: {
              var11 = ((qa) this).field_c[var7];
              if (((qa) this).field_c[var7] < 0) {
                param3++;
                param0[param3] = (byte)(var11 ^ -1);
                if (param5 > param3) {
                  var7 = 0;
                  break L10;
                } else {
                  return var9 - -1 + -param1;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (-1 != (var10 & 4)) {
                var7 = ((qa) this).field_c[var7];
                break L11;
              } else {
                var7++;
                break L11;
              }
            }
            L12: {
              var11 = ((qa) this).field_c[var7];
              if (-1 > ((qa) this).field_c[var7]) {
                param3++;
                param0[param3] = (byte)(var11 ^ -1);
                if (param5 > param3) {
                  var7 = 0;
                  break L12;
                } else {
                  return var9 - -1 + -param1;
                }
              } else {
                break L12;
              }
            }
            L13: {
              if ((var10 & 2) != 0) {
                var7 = ((qa) this).field_c[var7];
                break L13;
              } else {
                var7++;
                break L13;
              }
            }
            L14: {
              var11 = ((qa) this).field_c[var7];
              if (((qa) this).field_c[var7] < 0) {
                param3++;
                param0[param3] = (byte)(var11 ^ -1);
                if (param3 < param5) {
                  var7 = 0;
                  break L14;
                } else {
                  return var9 - -1 + -param1;
                }
              } else {
                break L14;
              }
            }
            L15: {
              if (0 == (1 & var10)) {
                var7++;
                break L15;
              } else {
                var7 = ((qa) this).field_c[var7];
                break L15;
              }
            }
            var11 = ((qa) this).field_c[var7];
            if (((qa) this).field_c[var7] < 0) {
              param3++;
              param0[param3] = (byte)(var11 ^ -1);
              if (param3 < param5) {
                var7 = 0;
                var9++;
                continue L0;
              } else {
                return var9 - -1 + -param1;
              }
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -1) {
            qa.b((byte) -72);
            field_e = null;
            field_f = null;
            return;
        }
        field_e = null;
        field_f = null;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        float var1 = 0.0f;
        int var2 = 0;
        var2 = Geoblox.field_C;
        if (param0 >= 72) {
          af.field_c = af.field_c - 1;
          if (0 > af.field_c) {
            if (uf.field_b == 0 - -ka.field_h) {
              uf.field_b = ka.field_h + 3;
              L0: {
                af.field_c = 20;
                pa.field_g = pa.field_g - 1;
                gi.field_e = gi.field_e + 1;
                if (-31 < (gi.field_e % 600 ^ -1)) {
                  uf.field_b = ka.field_h + 0;
                  break L0;
                } else {
                  break L0;
                }
              }
              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
              wa.field_a = wa.field_a - 1;
              if (-1 <= (wa.field_a ^ -1)) {
                jf.field_j = jf.field_j - 1;
                if (jf.field_j > 0) {
                  rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                  return;
                } else {
                  return;
                }
              } else {
                ha.field_g = wa.field_a % 15 % 2;
                jf.field_j = jf.field_j - 1;
                if (jf.field_j <= 0) {
                  return;
                } else {
                  rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                  return;
                }
              }
            } else {
              var1_int = uf.field_b + -ka.field_h;
              if (-2 == jk.field_d) {
                if (var1_int < -2) {
                  uf.field_b = uf.field_b - 1;
                  L1: {
                    af.field_c = 20;
                    pa.field_g = pa.field_g - 1;
                    gi.field_e = gi.field_e + 1;
                    if (-31 < (gi.field_e % 600 ^ -1)) {
                      uf.field_b = ka.field_h + 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                  wa.field_a = wa.field_a - 1;
                  if (-1 <= (wa.field_a ^ -1)) {
                    jf.field_j = jf.field_j - 1;
                    if (jf.field_j > 0) {
                      rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L2: {
                      ha.field_g = wa.field_a % 15 % 2;
                      jf.field_j = jf.field_j - 1;
                      if (jf.field_j <= 0) {
                        break L2;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  L3: {
                    if (jk.field_d != 2) {
                      break L3;
                    } else {
                      if (-6 <= var1_int) {
                        break L3;
                      } else {
                        uf.field_b = uf.field_b + 1;
                        L4: {
                          af.field_c = 20;
                          pa.field_g = pa.field_g - 1;
                          gi.field_e = gi.field_e + 1;
                          if (-31 < (gi.field_e % 600 ^ -1)) {
                            uf.field_b = ka.field_h + 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                          wa.field_a = wa.field_a - 1;
                          if (-1 <= (wa.field_a ^ -1)) {
                            break L5;
                          } else {
                            ha.field_g = wa.field_a % 15 % 2;
                            break L5;
                          }
                        }
                        L6: {
                          jf.field_j = jf.field_j - 1;
                          if (jf.field_j <= 0) {
                            break L6;
                          } else {
                            rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                            break L6;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L7: {
                    if (jk.field_d != -1) {
                      break L7;
                    } else {
                      if (-4 <= var1_int) {
                        break L7;
                      } else {
                        L8: {
                          uf.field_b = uf.field_b + 1;
                          af.field_c = 20;
                          pa.field_g = pa.field_g - 1;
                          gi.field_e = gi.field_e + 1;
                          if (-31 < (gi.field_e % 600 ^ -1)) {
                            uf.field_b = ka.field_h + 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                          wa.field_a = wa.field_a - 1;
                          if (-1 <= (wa.field_a ^ -1)) {
                            break L9;
                          } else {
                            ha.field_g = wa.field_a % 15 % 2;
                            break L9;
                          }
                        }
                        L10: {
                          jf.field_j = jf.field_j - 1;
                          if (jf.field_j <= 0) {
                            break L10;
                          } else {
                            rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                            break L10;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (jk.field_d == 0) {
                    if (var1_int <= 3) {
                      L11: {
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (wa.field_a ^ -1)) {
                          break L12;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L12;
                        }
                      }
                      L13: {
                        jf.field_j = jf.field_j - 1;
                        if (jf.field_j <= 0) {
                          break L13;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L13;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        uf.field_b = uf.field_b - 1;
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (wa.field_a ^ -1)) {
                          break L15;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L15;
                        }
                      }
                      L16: {
                        jf.field_j = jf.field_j - 1;
                        if (jf.field_j <= 0) {
                          break L16;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L16;
                        }
                      }
                      return;
                    }
                  } else {
                    L17: {
                      af.field_c = 20;
                      pa.field_g = pa.field_g - 1;
                      gi.field_e = gi.field_e + 1;
                      if (-31 < (gi.field_e % 600 ^ -1)) {
                        uf.field_b = ka.field_h + 0;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (wa.field_a ^ -1)) {
                        break L18;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L18;
                      }
                    }
                    L19: {
                      jf.field_j = jf.field_j - 1;
                      if (jf.field_j <= 0) {
                        break L19;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L19;
                      }
                    }
                    return;
                  }
                }
              } else {
                L20: {
                  if (jk.field_d != 2) {
                    break L20;
                  } else {
                    if (-6 <= var1_int) {
                      break L20;
                    } else {
                      uf.field_b = uf.field_b + 1;
                      L21: {
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (wa.field_a ^ -1)) {
                          break L22;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L22;
                        }
                      }
                      L23: {
                        jf.field_j = jf.field_j - 1;
                        if (jf.field_j <= 0) {
                          break L23;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L23;
                        }
                      }
                      return;
                    }
                  }
                }
                L24: {
                  if (jk.field_d != -1) {
                    break L24;
                  } else {
                    if (-4 <= var1_int) {
                      break L24;
                    } else {
                      L25: {
                        uf.field_b = uf.field_b + 1;
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (wa.field_a ^ -1)) {
                          break L26;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L26;
                        }
                      }
                      L27: {
                        jf.field_j = jf.field_j - 1;
                        if (jf.field_j <= 0) {
                          break L27;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L27;
                        }
                      }
                      return;
                    }
                  }
                }
                if (jk.field_d == 0) {
                  if (var1_int <= 3) {
                    L28: {
                      af.field_c = 20;
                      pa.field_g = pa.field_g - 1;
                      gi.field_e = gi.field_e + 1;
                      if (-31 < (gi.field_e % 600 ^ -1)) {
                        uf.field_b = ka.field_h + 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (wa.field_a ^ -1)) {
                        break L29;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L29;
                      }
                    }
                    L30: {
                      jf.field_j = jf.field_j - 1;
                      if (jf.field_j <= 0) {
                        break L30;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L30;
                      }
                    }
                    return;
                  } else {
                    L31: {
                      uf.field_b = uf.field_b - 1;
                      af.field_c = 20;
                      pa.field_g = pa.field_g - 1;
                      gi.field_e = gi.field_e + 1;
                      if (-31 < (gi.field_e % 600 ^ -1)) {
                        uf.field_b = ka.field_h + 0;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (wa.field_a ^ -1)) {
                        break L32;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L32;
                      }
                    }
                    L33: {
                      jf.field_j = jf.field_j - 1;
                      if (jf.field_j <= 0) {
                        break L33;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L33;
                      }
                    }
                    return;
                  }
                } else {
                  L34: {
                    af.field_c = 20;
                    pa.field_g = pa.field_g - 1;
                    gi.field_e = gi.field_e + 1;
                    if (-31 < (gi.field_e % 600 ^ -1)) {
                      uf.field_b = ka.field_h + 0;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= (wa.field_a ^ -1)) {
                      break L35;
                    } else {
                      ha.field_g = wa.field_a % 15 % 2;
                      break L35;
                    }
                  }
                  L36: {
                    jf.field_j = jf.field_j - 1;
                    if (jf.field_j <= 0) {
                      break L36;
                    } else {
                      rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                      break L36;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L37: {
              pa.field_g = pa.field_g - 1;
              gi.field_e = gi.field_e + 1;
              if (-31 < (gi.field_e % 600 ^ -1)) {
                uf.field_b = ka.field_h + 0;
                break L37;
              } else {
                break L37;
              }
            }
            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            wa.field_a = wa.field_a - 1;
            if (-1 <= (wa.field_a ^ -1)) {
              jf.field_j = jf.field_j - 1;
              if (jf.field_j <= 0) {
                return;
              } else {
                rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              jf.field_j = jf.field_j - 1;
              if (jf.field_j > 0) {
                rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = new tf();
        field_a = 0;
        field_f = new tf();
        field_d = null;
    }
}
