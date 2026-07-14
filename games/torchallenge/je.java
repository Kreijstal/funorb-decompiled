/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static byte[][] field_c;
    private fd field_d;
    static boolean field_i;
    static volatile boolean field_f;
    static int[][] field_h;
    private int field_e;
    private ak field_k;
    private int field_j;
    static long field_a;
    static ka field_b;
    static ka field_g;

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -90) {
          field_h = null;
          field_g = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        lb var6 = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (!(((je) this).field_e >= param2)) {
            throw new IllegalStateException();
        }
        this.a(50, param3);
        ((je) this).field_j = ((je) this).field_j - param2;
        while (((je) this).field_j < 0) {
            var6 = (lb) (Object) ((je) this).field_k.a(0);
            this.a(var6, -27615);
        }
        re var6_ref = new re(param1, param2);
        ((je) this).field_d.a((byte) 31, (da) (Object) var6_ref, param3);
        ((je) this).field_k.a((w) (Object) var6_ref, 2);
        ((lb) (Object) var6_ref).field_l = (long)param0;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = param1; var2 > var4; var4++) {
            var3[var2 + (-1 - var4)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    private final void a(int param0, long param1) {
        lb var4 = null;
        if (param0 != 50) {
          ((je) this).a((Object) null, (byte) -11, -42L);
          var4 = (lb) (Object) ((je) this).field_d.a(104, param1);
          this.a(var4, -27615);
          return;
        } else {
          var4 = (lb) (Object) ((je) this).field_d.a(104, param1);
          this.a(var4, -27615);
          return;
        }
    }

    final static void a(byte param0, nc param1) {
        mj.field_a.b((qd) (Object) param1);
        if (param0 != 15) {
            field_h = null;
        }
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        nh.field_jb = 0;
        n.field_cb = null;
        bl.field_V = null;
        var2 = wb.field_d;
        wb.field_d = pg.field_m;
        if (-52 == param0) {
          gb.field_d.field_b = 2;
          gb.field_d.field_h = gb.field_d.field_h + 1;
          pg.field_m = var2;
          if (param1) {
            if (gb.field_d.field_h > -3) {
              if (gb.field_d.field_h < 2) {
                if (4 > gb.field_d.field_h) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  if (4 > gb.field_d.field_h) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (-52 != param0) {
                if (gb.field_d.field_h < 2) {
                  if (4 > gb.field_d.field_h) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 != param0) {
                    if (4 > gb.field_d.field_h) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                return 2;
              }
            }
          } else {
            return 25;
          }
        } else {
          if (-51 == param0) {
            gb.field_d.field_b = 5;
            gb.field_d.field_h = gb.field_d.field_h + 1;
            pg.field_m = var2;
            if (param1) {
              if (gb.field_d.field_h > -3) {
                if (gb.field_d.field_h < 2) {
                  if (4 > gb.field_d.field_h) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 != param0) {
                    if (4 <= gb.field_d.field_h) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                if (-52 != param0) {
                  if (gb.field_d.field_h >= 2) {
                    if (50 == param0) {
                      return 5;
                    } else {
                      if (4 <= gb.field_d.field_h) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if (4 <= gb.field_d.field_h) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  return 2;
                }
              }
            } else {
              return 25;
            }
          } else {
            gb.field_d.field_b = 1;
            gb.field_d.field_h = gb.field_d.field_h + 1;
            pg.field_m = var2;
            if (param1) {
              if ((gb.field_d.field_h ^ -1) <= -3) {
                if (-52 == (param0 ^ -1)) {
                  return 2;
                } else {
                  if (gb.field_d.field_h >= 2) {
                    if (50 == param0) {
                      return 5;
                    } else {
                      if (4 <= gb.field_d.field_h) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if (4 <= gb.field_d.field_h) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L0: {
                  if (gb.field_d.field_h < 2) {
                    break L0;
                  } else {
                    if (50 == param0) {
                      return 5;
                    } else {
                      break L0;
                    }
                  }
                }
                if (4 <= gb.field_d.field_h) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              return 25;
            }
          }
        }
    }

    private je() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_254_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_252_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (kj.field_G == -1) {
          if (0 == (sd.field_b ^ -1)) {
            L0: {
              kj.field_G = kc.field_u;
              sd.field_b = ph.field_d;
              bk.field_p = bk.field_p + 1;
              if (param0 == -109) {
                break L0;
              } else {
                field_a = 50L;
                break L0;
              }
            }
            L1: {
              if (param1 == null) {
                if (ie.field_g == null) {
                  break L1;
                } else {
                  L2: {
                    if (sj.field_R) {
                      break L2;
                    } else {
                      if (cf.field_a <= bk.field_p) {
                        break L2;
                      } else {
                        if (ek.field_P) {
                          bi.field_h = kj.field_G;
                          ul.field_n = sd.field_b;
                          bk.field_p = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    ie.field_g = param1;
                    kj.field_G = -1;
                    sd.field_b = -1;
                    if (!sj.field_R) {
                      break L3;
                    } else {
                      if (bk.field_p == gi.field_e) {
                        bk.field_p = 0;
                        sj.field_R = false;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (!param1.equals((Object) (Object) ie.field_g)) {
                  break L1;
                } else {
                  L4: {
                    if (sj.field_R) {
                      break L4;
                    } else {
                      if (cf.field_a <= bk.field_p) {
                        break L4;
                      } else {
                        if (ek.field_P) {
                          bi.field_h = kj.field_G;
                          ul.field_n = sd.field_b;
                          bk.field_p = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    ie.field_g = param1;
                    kj.field_G = -1;
                    sd.field_b = -1;
                    if (!sj.field_R) {
                      break L5;
                    } else {
                      if (bk.field_p == gi.field_e) {
                        bk.field_p = 0;
                        sj.field_R = false;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (sj.field_R) {
              L6: {
                var2 = 0;
                if (param1 == null) {
                  bk.field_p = 0;
                  break L6;
                } else {
                  L7: {
                    if (sj.field_R) {
                      break L7;
                    } else {
                      if (var2 != 0) {
                        break L7;
                      } else {
                        bk.field_p = 0;
                        break L6;
                      }
                    }
                  }
                  bk.field_p = cf.field_a;
                  break L6;
                }
              }
              L8: {
                if (param1 != null) {
                  sj.field_R = false;
                  break L8;
                } else {
                  if (var2 == 0) {
                    break L8;
                  } else {
                    sj.field_R = true;
                    break L8;
                  }
                }
              }
              L9: {
                ul.field_n = sd.field_b;
                bi.field_h = kj.field_G;
                if (sj.field_R) {
                  break L9;
                } else {
                  if (cf.field_a <= bk.field_p) {
                    break L9;
                  } else {
                    if (ek.field_P) {
                      bi.field_h = kj.field_G;
                      ul.field_n = sd.field_b;
                      bk.field_p = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L10: {
                ie.field_g = param1;
                kj.field_G = -1;
                sd.field_b = -1;
                if (!sj.field_R) {
                  break L10;
                } else {
                  if (bk.field_p == gi.field_e) {
                    bk.field_p = 0;
                    sj.field_R = false;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              return;
            } else {
              L11: {
                if (bk.field_p >= cf.field_a) {
                  if (ef.field_e + cf.field_a <= bk.field_p) {
                    stackOut_253_0 = 0;
                    stackIn_254_0 = stackOut_253_0;
                    break L11;
                  } else {
                    stackOut_252_0 = 1;
                    stackIn_254_0 = stackOut_252_0;
                    break L11;
                  }
                } else {
                  stackOut_250_0 = 0;
                  stackIn_254_0 = stackOut_250_0;
                  break L11;
                }
              }
              L12: {
                var2 = stackIn_254_0;
                if (param1 == null) {
                  bk.field_p = 0;
                  break L12;
                } else {
                  L13: {
                    if (sj.field_R) {
                      break L13;
                    } else {
                      if (var2 != 0) {
                        break L13;
                      } else {
                        bk.field_p = 0;
                        break L12;
                      }
                    }
                  }
                  bk.field_p = cf.field_a;
                  break L12;
                }
              }
              L14: {
                if (param1 != null) {
                  sj.field_R = false;
                  break L14;
                } else {
                  if (var2 == 0) {
                    break L14;
                  } else {
                    sj.field_R = true;
                    break L14;
                  }
                }
              }
              L15: {
                ul.field_n = sd.field_b;
                bi.field_h = kj.field_G;
                if (sj.field_R) {
                  break L15;
                } else {
                  if (cf.field_a <= bk.field_p) {
                    break L15;
                  } else {
                    if (ek.field_P) {
                      bi.field_h = kj.field_G;
                      ul.field_n = sd.field_b;
                      bk.field_p = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              L16: {
                ie.field_g = param1;
                kj.field_G = -1;
                sd.field_b = -1;
                if (!sj.field_R) {
                  break L16;
                } else {
                  if (bk.field_p == gi.field_e) {
                    bk.field_p = 0;
                    sj.field_R = false;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              return;
            }
          } else {
            bk.field_p = bk.field_p + 1;
            if (param0 == -109) {
              if (param1 != null) {
                if (!param1.equals((Object) (Object) ie.field_g)) {
                  L17: {
                    if (!sj.field_R) {
                      if (bk.field_p >= cf.field_a) {
                        if (ef.field_e + cf.field_a <= bk.field_p) {
                          stackOut_208_0 = 0;
                          stackIn_209_0 = stackOut_208_0;
                          break L17;
                        } else {
                          stackOut_207_0 = 1;
                          stackIn_209_0 = stackOut_207_0;
                          break L17;
                        }
                      } else {
                        stackOut_205_0 = 0;
                        stackIn_209_0 = stackOut_205_0;
                        break L17;
                      }
                    } else {
                      stackOut_203_0 = 0;
                      stackIn_209_0 = stackOut_203_0;
                      break L17;
                    }
                  }
                  L18: {
                    var2 = stackIn_209_0;
                    if (param1 == null) {
                      bk.field_p = 0;
                      break L18;
                    } else {
                      L19: {
                        if (sj.field_R) {
                          break L19;
                        } else {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            bk.field_p = 0;
                            break L18;
                          }
                        }
                      }
                      bk.field_p = cf.field_a;
                      break L18;
                    }
                  }
                  L20: {
                    if (param1 != null) {
                      sj.field_R = false;
                      break L20;
                    } else {
                      if (var2 == 0) {
                        break L20;
                      } else {
                        sj.field_R = true;
                        break L20;
                      }
                    }
                  }
                  L21: {
                    ul.field_n = sd.field_b;
                    bi.field_h = kj.field_G;
                    if (sj.field_R) {
                      break L21;
                    } else {
                      if (cf.field_a <= bk.field_p) {
                        break L21;
                      } else {
                        if (ek.field_P) {
                          bi.field_h = kj.field_G;
                          ul.field_n = sd.field_b;
                          bk.field_p = 0;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  L22: {
                    ie.field_g = param1;
                    kj.field_G = -1;
                    sd.field_b = -1;
                    if (!sj.field_R) {
                      break L22;
                    } else {
                      if (bk.field_p == gi.field_e) {
                        bk.field_p = 0;
                        sj.field_R = false;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  return;
                } else {
                  L23: {
                    if (sj.field_R) {
                      break L23;
                    } else {
                      if (cf.field_a <= bk.field_p) {
                        break L23;
                      } else {
                        if (ek.field_P) {
                          bi.field_h = kj.field_G;
                          ul.field_n = sd.field_b;
                          bk.field_p = 0;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  L24: {
                    ie.field_g = param1;
                    kj.field_G = -1;
                    sd.field_b = -1;
                    if (!sj.field_R) {
                      break L24;
                    } else {
                      if (bk.field_p == gi.field_e) {
                        bk.field_p = 0;
                        sj.field_R = false;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  if (ie.field_g == null) {
                    L26: {
                      if (!sj.field_R) {
                        if (bk.field_p >= cf.field_a) {
                          if (ef.field_e + cf.field_a <= bk.field_p) {
                            stackOut_167_0 = 0;
                            stackIn_168_0 = stackOut_167_0;
                            break L26;
                          } else {
                            stackOut_166_0 = 1;
                            stackIn_168_0 = stackOut_166_0;
                            break L26;
                          }
                        } else {
                          stackOut_164_0 = 0;
                          stackIn_168_0 = stackOut_164_0;
                          break L26;
                        }
                      } else {
                        stackOut_162_0 = 0;
                        stackIn_168_0 = stackOut_162_0;
                        break L26;
                      }
                    }
                    L27: {
                      var2 = stackIn_168_0;
                      if (param1 == null) {
                        bk.field_p = 0;
                        break L27;
                      } else {
                        L28: {
                          if (sj.field_R) {
                            break L28;
                          } else {
                            if (var2 != 0) {
                              break L28;
                            } else {
                              bk.field_p = 0;
                              break L27;
                            }
                          }
                        }
                        bk.field_p = cf.field_a;
                        break L27;
                      }
                    }
                    L29: {
                      if (param1 != null) {
                        sj.field_R = false;
                        break L29;
                      } else {
                        if (var2 == 0) {
                          break L29;
                        } else {
                          sj.field_R = true;
                          break L29;
                        }
                      }
                    }
                    ul.field_n = sd.field_b;
                    bi.field_h = kj.field_G;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L30: {
                  if (sj.field_R) {
                    break L30;
                  } else {
                    if (cf.field_a <= bk.field_p) {
                      break L30;
                    } else {
                      if (ek.field_P) {
                        bi.field_h = kj.field_G;
                        ul.field_n = sd.field_b;
                        bk.field_p = 0;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
                L31: {
                  ie.field_g = param1;
                  kj.field_G = -1;
                  sd.field_b = -1;
                  if (!sj.field_R) {
                    break L31;
                  } else {
                    if (bk.field_p == gi.field_e) {
                      bk.field_p = 0;
                      sj.field_R = false;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                }
                return;
              }
            } else {
              L32: {
                L33: {
                  field_a = 50L;
                  if (param1 == null) {
                    if (ie.field_g == null) {
                      break L33;
                    } else {
                      break L32;
                    }
                  } else {
                    if (param1.equals((Object) (Object) ie.field_g)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                L34: {
                  if (!sj.field_R) {
                    if (bk.field_p >= cf.field_a) {
                      if (ef.field_e + cf.field_a <= bk.field_p) {
                        stackOut_132_0 = 0;
                        stackIn_133_0 = stackOut_132_0;
                        break L34;
                      } else {
                        stackOut_131_0 = 1;
                        stackIn_133_0 = stackOut_131_0;
                        break L34;
                      }
                    } else {
                      stackOut_129_0 = 0;
                      stackIn_133_0 = stackOut_129_0;
                      break L34;
                    }
                  } else {
                    stackOut_127_0 = 0;
                    stackIn_133_0 = stackOut_127_0;
                    break L34;
                  }
                }
                L35: {
                  var2 = stackIn_133_0;
                  if (param1 == null) {
                    bk.field_p = 0;
                    break L35;
                  } else {
                    L36: {
                      if (sj.field_R) {
                        break L36;
                      } else {
                        if (var2 != 0) {
                          break L36;
                        } else {
                          bk.field_p = 0;
                          break L35;
                        }
                      }
                    }
                    bk.field_p = cf.field_a;
                    break L35;
                  }
                }
                if (param1 != null) {
                  sj.field_R = false;
                  ul.field_n = sd.field_b;
                  bi.field_h = kj.field_G;
                  break L32;
                } else {
                  if (var2 == 0) {
                    ul.field_n = sd.field_b;
                    bi.field_h = kj.field_G;
                    break L32;
                  } else {
                    sj.field_R = true;
                    ul.field_n = sd.field_b;
                    bi.field_h = kj.field_G;
                    break L32;
                  }
                }
              }
              L37: {
                if (sj.field_R) {
                  break L37;
                } else {
                  if (cf.field_a <= bk.field_p) {
                    break L37;
                  } else {
                    if (ek.field_P) {
                      bi.field_h = kj.field_G;
                      ul.field_n = sd.field_b;
                      bk.field_p = 0;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                }
              }
              L38: {
                ie.field_g = param1;
                kj.field_G = -1;
                sd.field_b = -1;
                if (!sj.field_R) {
                  break L38;
                } else {
                  if (bk.field_p == gi.field_e) {
                    bk.field_p = 0;
                    sj.field_R = false;
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              return;
            }
          }
        } else {
          bk.field_p = bk.field_p + 1;
          if (param0 == -109) {
            if (param1 != null) {
              if (!param1.equals((Object) (Object) ie.field_g)) {
                L39: {
                  if (!sj.field_R) {
                    if (bk.field_p >= cf.field_a) {
                      if (ef.field_e + cf.field_a > bk.field_p) {
                        stackOut_94_0 = 1;
                        stackIn_96_0 = stackOut_94_0;
                        break L39;
                      } else {
                        stackOut_93_0 = 0;
                        stackIn_96_0 = stackOut_93_0;
                        break L39;
                      }
                    } else {
                      stackOut_91_0 = 0;
                      stackIn_96_0 = stackOut_91_0;
                      break L39;
                    }
                  } else {
                    stackOut_89_0 = 0;
                    stackIn_96_0 = stackOut_89_0;
                    break L39;
                  }
                }
                L40: {
                  var2 = stackIn_96_0;
                  if (param1 == null) {
                    bk.field_p = 0;
                    break L40;
                  } else {
                    L41: {
                      if (sj.field_R) {
                        break L41;
                      } else {
                        if (var2 != 0) {
                          break L41;
                        } else {
                          bk.field_p = 0;
                          break L40;
                        }
                      }
                    }
                    bk.field_p = cf.field_a;
                    break L40;
                  }
                }
                L42: {
                  if (param1 != null) {
                    sj.field_R = false;
                    break L42;
                  } else {
                    if (var2 == 0) {
                      break L42;
                    } else {
                      sj.field_R = true;
                      break L42;
                    }
                  }
                }
                L43: {
                  ul.field_n = sd.field_b;
                  bi.field_h = kj.field_G;
                  if (sj.field_R) {
                    break L43;
                  } else {
                    if (cf.field_a <= bk.field_p) {
                      break L43;
                    } else {
                      if (ek.field_P) {
                        bi.field_h = kj.field_G;
                        ul.field_n = sd.field_b;
                        bk.field_p = 0;
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                  }
                }
                L44: {
                  ie.field_g = param1;
                  kj.field_G = -1;
                  sd.field_b = -1;
                  if (!sj.field_R) {
                    break L44;
                  } else {
                    if (bk.field_p == gi.field_e) {
                      bk.field_p = 0;
                      sj.field_R = false;
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                }
                return;
              } else {
                L45: {
                  if (sj.field_R) {
                    break L45;
                  } else {
                    if (cf.field_a <= bk.field_p) {
                      break L45;
                    } else {
                      if (ek.field_P) {
                        bi.field_h = kj.field_G;
                        ul.field_n = sd.field_b;
                        bk.field_p = 0;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                  }
                }
                L46: {
                  ie.field_g = param1;
                  kj.field_G = -1;
                  sd.field_b = -1;
                  if (!sj.field_R) {
                    break L46;
                  } else {
                    if (bk.field_p == gi.field_e) {
                      bk.field_p = 0;
                      sj.field_R = false;
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                }
                return;
              }
            } else {
              L47: {
                if (ie.field_g == null) {
                  L48: {
                    if (!sj.field_R) {
                      if (bk.field_p >= cf.field_a) {
                        if (ef.field_e + cf.field_a <= bk.field_p) {
                          stackOut_49_0 = 0;
                          stackIn_51_0 = stackOut_49_0;
                          break L48;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_51_0 = stackOut_48_0;
                          break L48;
                        }
                      } else {
                        stackOut_46_0 = 0;
                        stackIn_51_0 = stackOut_46_0;
                        break L48;
                      }
                    } else {
                      stackOut_44_0 = 0;
                      stackIn_51_0 = stackOut_44_0;
                      break L48;
                    }
                  }
                  L49: {
                    var2 = stackIn_51_0;
                    if (param1 == null) {
                      bk.field_p = 0;
                      break L49;
                    } else {
                      if (!sj.field_R) {
                        if (var2 == 0) {
                          bk.field_p = 0;
                          break L49;
                        } else {
                          bk.field_p = cf.field_a;
                          break L49;
                        }
                      } else {
                        bk.field_p = cf.field_a;
                        break L49;
                      }
                    }
                  }
                  if (param1 != null) {
                    sj.field_R = false;
                    ul.field_n = sd.field_b;
                    bi.field_h = kj.field_G;
                    break L47;
                  } else {
                    if (var2 == 0) {
                      ul.field_n = sd.field_b;
                      bi.field_h = kj.field_G;
                      break L47;
                    } else {
                      sj.field_R = true;
                      ul.field_n = sd.field_b;
                      bi.field_h = kj.field_G;
                      break L47;
                    }
                  }
                } else {
                  break L47;
                }
              }
              L50: {
                if (sj.field_R) {
                  break L50;
                } else {
                  if (cf.field_a <= bk.field_p) {
                    break L50;
                  } else {
                    if (ek.field_P) {
                      bi.field_h = kj.field_G;
                      ul.field_n = sd.field_b;
                      bk.field_p = 0;
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                }
              }
              L51: {
                ie.field_g = param1;
                kj.field_G = -1;
                sd.field_b = -1;
                if (!sj.field_R) {
                  break L51;
                } else {
                  if (bk.field_p == gi.field_e) {
                    bk.field_p = 0;
                    sj.field_R = false;
                    break L51;
                  } else {
                    break L51;
                  }
                }
              }
              return;
            }
          } else {
            L52: {
              L53: {
                field_a = 50L;
                if (param1 == null) {
                  if (ie.field_g == null) {
                    break L53;
                  } else {
                    break L52;
                  }
                } else {
                  if (param1.equals((Object) (Object) ie.field_g)) {
                    break L52;
                  } else {
                    break L53;
                  }
                }
              }
              L54: {
                if (!sj.field_R) {
                  if (bk.field_p >= cf.field_a) {
                    if (ef.field_e + cf.field_a > bk.field_p) {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L54;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_15_0 = stackOut_12_0;
                      break L54;
                    }
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_15_0 = stackOut_10_0;
                    break L54;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_15_0 = stackOut_8_0;
                  break L54;
                }
              }
              L55: {
                L56: {
                  var2 = stackIn_15_0;
                  if (param1 == null) {
                    break L56;
                  } else {
                    if (!sj.field_R) {
                      if (var2 == 0) {
                        break L56;
                      } else {
                        bk.field_p = cf.field_a;
                        break L55;
                      }
                    } else {
                      bk.field_p = cf.field_a;
                      break L55;
                    }
                  }
                }
                bk.field_p = 0;
                break L55;
              }
              if (param1 != null) {
                sj.field_R = false;
                ul.field_n = sd.field_b;
                bi.field_h = kj.field_G;
                break L52;
              } else {
                if (var2 == 0) {
                  ul.field_n = sd.field_b;
                  bi.field_h = kj.field_G;
                  break L52;
                } else {
                  sj.field_R = true;
                  ul.field_n = sd.field_b;
                  bi.field_h = kj.field_G;
                  break L52;
                }
              }
            }
            L57: {
              if (sj.field_R) {
                break L57;
              } else {
                if (cf.field_a <= bk.field_p) {
                  break L57;
                } else {
                  if (ek.field_P) {
                    bi.field_h = kj.field_G;
                    ul.field_n = sd.field_b;
                    bk.field_p = 0;
                    break L57;
                  } else {
                    break L57;
                  }
                }
              }
            }
            L58: {
              ie.field_g = param1;
              kj.field_G = -1;
              sd.field_b = -1;
              if (!sj.field_R) {
                break L58;
              } else {
                if (bk.field_p == gi.field_e) {
                  bk.field_p = 0;
                  sj.field_R = false;
                  break L58;
                } else {
                  break L58;
                }
              }
            }
            return;
          }
        }
    }

    private final void a(lb param0, int param1) {
        if (param0 == null) {
          if (param1 != -27615) {
            ((je) this).field_j = 30;
            return;
          } else {
            return;
          }
        } else {
          param0.a(true);
          param0.a(12695);
          ((je) this).field_j = ((je) this).field_j + param0.field_r;
          if (param1 == -27615) {
            return;
          } else {
            ((je) this).field_j = 30;
            return;
          }
        }
    }

    final void a(Object param0, byte param1, long param2) {
        int var5 = -44 % ((param1 - 24) / 43);
        this.a(0, param0, 1, param2);
    }

    final Object a(long param0, int param1) {
        re var6 = null;
        lb var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (lb) (Object) ((je) this).field_d.a(103, param0);
        if (var7 != null) {
          if (param1 == 0) {
            var9 = var7.c((byte) 70);
            if (var9 == null) {
              var7.a(true);
              var7.a(param1 ^ 12695);
              ((je) this).field_j = ((je) this).field_j + var7.field_r;
              return null;
            } else {
              L0: {
                if (var7.e(1024)) {
                  var6 = new re(var9, var7.field_r);
                  ((je) this).field_d.a((byte) 112, (da) (Object) var6, var7.field_d);
                  ((je) this).field_k.a((w) (Object) var6, 2);
                  ((lb) (Object) var6).field_l = 0L;
                  var7.a(true);
                  var7.a(12695);
                  break L0;
                } else {
                  ((je) this).field_k.a((w) (Object) var7, 2);
                  var7.field_l = 0L;
                  break L0;
                }
              }
              return var9;
            }
          } else {
            this.a(28, -88L);
            var8 = var7.c((byte) 70);
            if (var8 == null) {
              var7.a(true);
              var7.a(param1 ^ 12695);
              ((je) this).field_j = ((je) this).field_j + var7.field_r;
              return null;
            } else {
              L1: {
                if (var7.e(1024)) {
                  var6 = new re(var8, var7.field_r);
                  ((je) this).field_d.a((byte) 112, (da) (Object) var6, var7.field_d);
                  ((je) this).field_k.a((w) (Object) var6, 2);
                  ((lb) (Object) var6).field_l = 0L;
                  var7.a(true);
                  var7.a(12695);
                  break L1;
                } else {
                  ((je) this).field_k.a((w) (Object) var7, 2);
                  var7.field_l = 0L;
                  break L1;
                }
              }
              return var8;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_f = true;
        field_h = new int[][]{new int[2], new int[2], new int[2]};
    }
}
