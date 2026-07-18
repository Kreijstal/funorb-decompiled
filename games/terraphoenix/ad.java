/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static int[] field_u;
    e field_A;
    Terraphoenix field_i;
    private boolean field_n;
    int field_c;
    private String field_b;
    int field_g;
    private int field_d;
    private int field_v;
    int field_k;
    private boolean field_a;
    private int field_B;
    private int field_j;
    private int field_w;
    static int field_h;
    static String field_e;
    private int field_r;
    int field_y;
    private int field_C;
    int field_t;
    private String field_f;
    private boolean field_s;
    static ak field_x;
    int field_q;
    static byte[] field_m;
    int field_l;
    String field_o;
    int field_z;
    private int field_p;

    final static jb c(int param0) {
        try {
            Throwable var1 = null;
            RuntimeException var1_ref = null;
            jb stackIn_4_0 = null;
            Object stackIn_6_0 = null;
            Throwable decompiledCaughtException = null;
            jb stackOut_3_0 = null;
            Object stackOut_5_0 = null;
            try {
              try {
                L0: {
                  if (param0 == -3109) {
                    break L0;
                  } else {
                    ad.b((byte) -71);
                    break L0;
                  }
                }
                stackOut_3_0 = (jb) Class.forName("ii").newInstance();
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (jb) (Object) stackIn_6_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw qk.a((Throwable) (Object) var1_ref, "ad.M(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 68) {
                break L1;
              } else {
                field_h = -126;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == 160) {
                  break L3;
                } else {
                  if (param1 == 32) {
                    break L3;
                  } else {
                    if (95 == param1) {
                      break L3;
                    } else {
                      if (param1 != 45) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ad.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final boolean b(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        r var4_ref_r = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          if (((ad) this).field_p != 0) {
            break L0;
          } else {
            if (((ad) this).field_w == 0) {
              L1: {
                var2_int = (((ad) this).field_A.field_q.field_F + -((ad) this).field_A.field_q.field_H) * 32;
                var3 = -(((ad) this).field_A.field_q.field_E * 48) + 16 * (((ad) this).field_A.field_q.field_H + ((ad) this).field_A.field_q.field_F);
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L1;
                } else {
                  if (((ad) this).field_d != 1) {
                    break L1;
                  } else {
                    if (Math.abs(-var2_int + sj.field_b) + Math.abs(lg.field_c + -var3) > 32) {
                      ((ad) this).field_w = 5;
                      ((ad) this).field_B = 2;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~((ad) this).field_d != ~((ad) this).field_l) {
                  break L2;
                } else {
                  if (2 != ((ad) this).field_d) {
                    break L2;
                  } else {
                    if (Math.abs(sj.field_b + -var2_int) + Math.abs(-var3 + lg.field_c) != 0) {
                      break L2;
                    } else {
                      ((ad) this).field_B = 3;
                      ((ad) this).field_w = 5;
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L3;
                } else {
                  L4: {
                    if (((ad) this).field_d == 3) {
                      break L4;
                    } else {
                      if (((ad) this).field_d != 2) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (0 >= og.field_d) {
                    break L3;
                  } else {
                    ((ad) this).field_w = 5;
                    ((ad) this).field_B = 4;
                    break L3;
                  }
                }
              }
              L5: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L5;
                } else {
                  if (((ad) this).field_d > 4) {
                    break L5;
                  } else {
                    L6: {
                      if (3 != ((ad) this).field_A.field_q.field_F) {
                        break L6;
                      } else {
                        if (((ad) this).field_A.field_q.field_H != 4) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((ad) this).field_B = 5;
                    ((ad) this).field_w = 5;
                    break L5;
                  }
                }
              }
              L7: {
                if (~((ad) this).field_d != ~((ad) this).field_l) {
                  break L7;
                } else {
                  if (((ad) this).field_d > 5) {
                    break L7;
                  } else {
                    L8: {
                      if (((ad) this).field_A.field_q.field_F > 7) {
                        break L8;
                      } else {
                        if (7 < ((ad) this).field_A.field_q.field_H) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ((ad) this).field_B = 6;
                    ((ad) this).field_w = 5;
                    break L7;
                  }
                }
              }
              L9: {
                if (((ad) this).field_d >= 6) {
                  break L9;
                } else {
                  if (((ad) this).field_A.field_q.field_v / 2 < ((ad) this).field_A.field_q.field_jb) {
                    break L9;
                  } else {
                    ((ad) this).field_A.a(29518, -1);
                    ((ad) this).field_A.a(param0 + 29518, -2);
                    ((ad) this).field_B = 6;
                    ((ad) this).field_w = 5;
                    break L9;
                  }
                }
              }
              L10: {
                if (~((ad) this).field_l != ~((ad) this).field_d) {
                  break L10;
                } else {
                  if (((ad) this).field_d != 6) {
                    break L10;
                  } else {
                    if (((ad) this).field_A.field_q.field_v * 3 / 4 < ((ad) this).field_A.field_q.field_jb) {
                      ((ad) this).field_B = 7;
                      ((ad) this).field_w = 5;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              L11: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L11;
                } else {
                  if (((ad) this).field_d > 7) {
                    break L11;
                  } else {
                    if (((ad) this).field_A.field_q.field_E > 0) {
                      ((ad) this).field_B = 8;
                      ((ad) this).field_w = 5;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              L12: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L12;
                } else {
                  if (8 <= ((ad) this).field_d) {
                    break L12;
                  } else {
                    if (0 != ((ad) this).field_A.field_q.field_E) {
                      break L12;
                    } else {
                      if (((ad) this).field_A.field_q.field_H < 9) {
                        break L12;
                      } else {
                        if (((ad) this).field_A.field_q.field_F <= 8) {
                          ((ad) this).field_B = 9;
                          ((ad) this).field_w = 5;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                }
              }
              L13: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L13;
                } else {
                  if (((ad) this).field_d != 8) {
                    break L13;
                  } else {
                    if (0 == ((ad) this).field_A.field_q.field_E) {
                      ((ad) this).field_B = 9;
                      ((ad) this).field_w = 5;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              L14: {
                if (~((ad) this).field_l != ~((ad) this).field_d) {
                  break L14;
                } else {
                  if (((ad) this).field_d > 12) {
                    break L14;
                  } else {
                    if (((ad) this).field_A.field_q != ((ad) this).field_A.field_C[0]) {
                      ((ad) this).field_B = 13;
                      ((ad) this).field_w = 5;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              L15: {
                if (~((ad) this).field_d != ~((ad) this).field_l) {
                  break L15;
                } else {
                  if (((ad) this).field_d > 13) {
                    break L15;
                  } else {
                    L16: {
                      if (((ad) this).field_A.field_C[6].field_P <= 0) {
                        break L16;
                      } else {
                        if (((ad) this).field_A.field_C[7].field_P <= 0) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    ((ad) this).field_w = 5;
                    ((ad) this).field_B = 14;
                    break L15;
                  }
                }
              }
              L17: {
                if (~((ad) this).field_l != ~((ad) this).field_d) {
                  break L17;
                } else {
                  if (((ad) this).field_d > 14) {
                    break L17;
                  } else {
                    if (((ad) this).field_A.field_C[6].field_P > 0) {
                      break L17;
                    } else {
                      if (0 < ((ad) this).field_A.field_C[7].field_P) {
                        break L17;
                      } else {
                        ((ad) this).field_B = 15;
                        ((ad) this).field_w = 5;
                        break L17;
                      }
                    }
                  }
                }
              }
              L18: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L18;
                } else {
                  if (((ad) this).field_d != 15) {
                    break L18;
                  } else {
                    L19: {
                      if (((ad) this).field_A.field_q.field_B == 0) {
                        break L19;
                      } else {
                        if (((ad) this).field_A.field_C[8].field_P <= 0) {
                          break L19;
                        } else {
                          if (((ad) this).field_A.field_C[9].field_P > 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    ((ad) this).field_B = 16;
                    ((ad) this).field_w = 5;
                    break L18;
                  }
                }
              }
              L20: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L20;
                } else {
                  if (16 < ((ad) this).field_d) {
                    break L20;
                  } else {
                    L21: {
                      if (((ad) this).field_A.field_C[8].field_P <= 0) {
                        break L21;
                      } else {
                        if (((ad) this).field_A.field_C[9].field_P <= 0) {
                          break L21;
                        } else {
                          break L20;
                        }
                      }
                    }
                    ((ad) this).field_w = 5;
                    ((ad) this).field_B = 17;
                    break L20;
                  }
                }
              }
              L22: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L22;
                } else {
                  L23: {
                    if (9 == ((ad) this).field_l) {
                      break L23;
                    } else {
                      if (((ad) this).field_l != 10) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    var4_ref_r = ((ad) this).field_A.field_C[4];
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (var4_ref_r.field_S) {
                      break L24;
                    } else {
                      var4_ref_r.field_d = 2;
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_S = true;
                      var4_ref_r.field_A = 0;
                      var4_ref_r.field_X = 32;
                      var4_ref_r.field_n = 16;
                      break L24;
                    }
                  }
                  L25: {
                    var4_ref_r.field_B = 0;
                    var4_ref_r.field_nb.field_c = 20;
                    var4_ref_r = ((ad) this).field_A.field_C[5];
                    if (var4_ref_r.field_S) {
                      break L25;
                    } else {
                      var4_ref_r.field_d = 2;
                      var4_ref_r.field_n = 28;
                      var4_ref_r.field_S = true;
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_X = 33;
                      var4_ref_r.field_A = 0;
                      break L25;
                    }
                  }
                  var4_ref_r.field_nb.field_c = 20;
                  var4_ref_r.field_jb = var4_ref_r.field_v;
                  break L22;
                }
              }
              L26: {
                if (~((ad) this).field_l != ~((ad) this).field_d) {
                  break L26;
                } else {
                  if (((ad) this).field_d > 17) {
                    break L26;
                  } else {
                    if (0 < ((ad) this).field_A.field_C[8].field_P) {
                      break L26;
                    } else {
                      if (((ad) this).field_A.field_C[9].field_P <= 0) {
                        ((ad) this).field_B = 18;
                        ((ad) this).field_w = 5;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
              }
              L27: {
                if (~((ad) this).field_d != ~((ad) this).field_l) {
                  break L27;
                } else {
                  if (((ad) this).field_l == 10) {
                    L28: {
                      var4_ref_r = ((ad) this).field_A.field_C[6];
                      if (var4_ref_r.field_S) {
                        break L28;
                      } else {
                        if (0 >= ((ad) this).field_A.field_C[5].field_P) {
                          break L28;
                        } else {
                          var4_ref_r.field_S = true;
                          var4_ref_r.field_A = 0;
                          var4_ref_r.field_X = 19;
                          var4_ref_r.field_n = 20;
                          var4_ref_r.field_N = 0;
                          var4_ref_r.field_d = 2;
                          break L28;
                        }
                      }
                    }
                    L29: {
                      var4_ref_r.field_jb = var4_ref_r.field_v;
                      var4_ref_r.field_nb.field_c = 20;
                      var4_ref_r = ((ad) this).field_A.field_C[7];
                      if (var4_ref_r.field_S) {
                        break L29;
                      } else {
                        if (((ad) this).field_A.field_C[4].field_P <= 0) {
                          break L29;
                        } else {
                          var4_ref_r.field_N = 0;
                          var4_ref_r.field_A = 0;
                          var4_ref_r.field_n = 16;
                          var4_ref_r.field_S = true;
                          var4_ref_r.field_X = 20;
                          var4_ref_r.field_d = 2;
                          break L29;
                        }
                      }
                    }
                    var4_ref_r.field_nb.field_c = 20;
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (((ad) this).field_A.field_C[4].field_P > 0) {
                      break L27;
                    } else {
                      if (0 >= ((ad) this).field_A.field_C[5].field_P) {
                        ((ad) this).field_B = ((ad) this).field_l - -1;
                        ((ad) this).field_l = ((ad) this).field_B;
                        ((ad) this).field_d = ((ad) this).field_l;
                        this.a(false, 17097);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                  } else {
                    break L27;
                  }
                }
              }
              if (~((ad) this).field_l != ~((ad) this).field_d) {
                break L0;
              } else {
                if (((ad) this).field_l == 11) {
                  L30: {
                    var4_ref_r = ((ad) this).field_A.field_C[6];
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (var4_ref_r.field_S) {
                      break L30;
                    } else {
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_X = 12;
                      var4_ref_r.field_n = 19;
                      var4_ref_r.field_jb = 3 * var4_ref_r.field_jb / 2;
                      var4_ref_r.field_B = 0;
                      var4_ref_r.field_A = 0;
                      var4_ref_r.field_r = null;
                      var4_ref_r.field_d = var4_ref_r.field_B;
                      var4_ref_r.field_S = true;
                      if (var4_ref_r.field_F != var4_ref_r.field_X) {
                        break L30;
                      } else {
                        if (~var4_ref_r.field_H != ~var4_ref_r.field_n) {
                          break L30;
                        } else {
                          var4_ref_r.field_S = false;
                          break L30;
                        }
                      }
                    }
                  }
                  L31: {
                    var4_ref_r = ((ad) this).field_A.field_C[7];
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (var4_ref_r.field_S) {
                      break L31;
                    } else {
                      var4_ref_r.field_B = 0;
                      var4_ref_r.field_jb = var4_ref_r.field_jb * 3 / 2;
                      var4_ref_r.field_X = 12;
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_n = 17;
                      var4_ref_r.field_d = var4_ref_r.field_B;
                      var4_ref_r.field_S = true;
                      var4_ref_r.field_A = 0;
                      var4_ref_r.field_r = null;
                      if (~var4_ref_r.field_X != ~var4_ref_r.field_F) {
                        break L31;
                      } else {
                        if (~var4_ref_r.field_n == ~var4_ref_r.field_H) {
                          var4_ref_r.field_S = false;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  var4_ref_r = ((ad) this).field_A.field_C[1];
                  var4_ref_r.field_jb = var4_ref_r.field_v;
                  if (var4_ref_r.field_S) {
                    break L0;
                  } else {
                    L32: {
                      var4_ref_r.field_n = 19;
                      var4_ref_r.field_jb = 3 * var4_ref_r.field_jb / 2;
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_X = 5;
                      var4_ref_r.field_B = 0;
                      var4_ref_r.field_r = null;
                      var4_ref_r.field_S = true;
                      var4_ref_r.field_d = var4_ref_r.field_B;
                      var4_ref_r.field_A = 0;
                      if (~var4_ref_r.field_X != ~var4_ref_r.field_F) {
                        break L32;
                      } else {
                        if (~var4_ref_r.field_n == ~var4_ref_r.field_H) {
                          var4_ref_r.field_S = false;
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                    }
                    if (22 <= var4_ref_r.field_H) {
                      break L0;
                    } else {
                      if (((ad) this).field_A.field_C[6].field_S) {
                        break L0;
                      } else {
                        if (((ad) this).field_A.field_C[7].field_S) {
                          break L0;
                        } else {
                          var4_ref_r.field_jb = var4_ref_r.field_v;
                          ((ad) this).field_w = 5;
                          var4_ref_r.field_B = 1;
                          ((ad) this).field_B = ((ad) this).field_l - -1;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L33: {
          ((ad) this).field_j = ((ad) this).field_j + 1;
          if (((ad) this).field_j > 10) {
            ((ad) this).field_j = 0;
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          var2_int = param0;
          var3 = 260;
          var4 = 40;
          if (1 != ((ad) this).field_p) {
            break L34;
          } else {
            var2_int = 640 + -wh.field_e.field_r;
            var4 = 77;
            break L34;
          }
        }
        L35: {
          if (((ad) this).field_p != 2) {
            break L35;
          } else {
            var2_int = -wh.field_e.field_r + 640;
            var4 = 53;
            break L35;
          }
        }
        L36: {
          var5 = og.field_f.field_s * (og.field_f.c(((ad) this).field_b, var3) + 1) + 32;
          if (((ad) this).field_o != "") {
            if (((ad) this).field_a) {
              if (((ad) this).field_w != 0) {
                break L36;
              } else {
                if (((ad) this).field_z != 1) {
                  break L36;
                } else {
                  if (~((ad) this).field_g > ~var2_int) {
                    break L36;
                  } else {
                    if (~(wh.field_e.field_r + var2_int) >= ~((ad) this).field_g) {
                      break L36;
                    } else {
                      if (((ad) this).field_c < var5 - -var4) {
                        break L36;
                      } else {
                        if (~(wh.field_e.field_t + var5 - -var4) < ~((ad) this).field_c) {
                          ((ad) this).field_B = 1 + ((ad) this).field_l;
                          ((ad) this).field_w = 5;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L37: {
                if (0 == ((ad) this).field_p) {
                  if (((ad) this).field_w != 0) {
                    break L37;
                  } else {
                    if (((ad) this).field_z != 1) {
                      break L37;
                    } else {
                      if (~((ad) this).field_g > ~var2_int) {
                        break L37;
                      } else {
                        if (~(qh.field_b.field_r + var2_int) >= ~((ad) this).field_g) {
                          break L37;
                        } else {
                          if (~((ad) this).field_c > ~(var4 + var5)) {
                            break L37;
                          } else {
                            if (~(var5 + var4 + qh.field_b.field_t) >= ~((ad) this).field_c) {
                              break L37;
                            } else {
                              ((ad) this).field_n = true;
                              return false;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L37;
                }
              }
              if (((ad) this).field_A != null) {
                break L36;
              } else {
                if (((ad) this).field_s) {
                  if (~((ad) this).field_k < ~((ad) this).field_g) {
                    break L36;
                  } else {
                    if (((ad) this).field_t < ((ad) this).field_g) {
                      break L36;
                    } else {
                      if (((ad) this).field_q > ((ad) this).field_c) {
                        break L36;
                      } else {
                        if (((ad) this).field_y < ((ad) this).field_c) {
                          break L36;
                        } else {
                          if (((ad) this).field_w == 0) {
                            L38: {
                              if (1 != ((ad) this).field_z) {
                                break L38;
                              } else {
                                L39: {
                                  ((ad) this).field_w = 5;
                                  if (((ad) this).field_l != 4) {
                                    break L39;
                                  } else {
                                    if (((ad) this).field_p != 1) {
                                      break L39;
                                    } else {
                                      ((ad) this).field_i.field_hb = 1;
                                      break L39;
                                    }
                                  }
                                }
                                L40: {
                                  ((ad) this).field_B = 1 + ((ad) this).field_l;
                                  if (((ad) this).field_l != 2) {
                                    break L40;
                                  } else {
                                    if (3 != ((ad) this).field_p) {
                                      break L40;
                                    } else {
                                      ((ad) this).field_i.field_D = 6;
                                      break L40;
                                    }
                                  }
                                }
                                if (((ad) this).field_l != 1) {
                                  break L38;
                                } else {
                                  if (((ad) this).field_p != 2) {
                                    break L38;
                                  } else {
                                    ((ad) this).field_i.field_hb = 4;
                                    break L38;
                                  }
                                }
                              }
                            }
                            return true;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L36;
                }
              }
            }
          } else {
            break L36;
          }
        }
        L41: {
          L42: {
            if (((ad) this).field_w >= 0) {
              break L42;
            } else {
              ((ad) this).field_w = ((ad) this).field_w + 15;
              if (((ad) this).field_w <= 0) {
                break L41;
              } else {
                ((ad) this).field_w = 0;
                if (var6 == 0) {
                  break L41;
                } else {
                  break L42;
                }
              }
            }
          }
          L43: {
            if (0 < ((ad) this).field_w) {
              break L43;
            } else {
              if (~((ad) this).field_B != ~((ad) this).field_l) {
                ((ad) this).field_w = 5;
                if (var6 == 0) {
                  break L41;
                } else {
                  break L43;
                }
              } else {
                break L41;
              }
            }
          }
          ((ad) this).field_w = ((ad) this).field_w + 15;
          if (255 >= ((ad) this).field_w) {
            break L41;
          } else {
            L44: {
              ((ad) this).field_l = ((ad) this).field_B;
              ((ad) this).field_w = -255;
              if (~((ad) this).field_d < ~((ad) this).field_l) {
                break L44;
              } else {
                L45: {
                  if (((ad) this).field_d >= ((ad) this).field_l) {
                    break L45;
                  } else {
                    ((ad) this).field_d = ((ad) this).field_l;
                    break L45;
                  }
                }
                this.a(false, param0 ^ 17097);
                if (var6 == 0) {
                  break L41;
                } else {
                  break L44;
                }
              }
            }
            this.a(87);
            break L41;
          }
        }
        L46: {
          if (0 != ((ad) this).field_p) {
            break L46;
          } else {
            if (((ad) this).field_l != 19) {
              break L46;
            } else {
              le.field_q = null;
              ((ad) this).field_A.a(((ad) this).field_A.field_G, (byte) 122);
              ((ad) this).field_A.field_C[9].field_jb = ((ad) this).field_A.field_C[9].field_v;
              ((ad) this).field_A.field_C[10].field_jb = 2 * ((ad) this).field_A.field_C[10].field_v;
              ((ad) this).field_A.field_C[11].field_jb = ((ad) this).field_A.field_C[11].field_v;
              break L46;
            }
          }
        }
        L47: {
          if (1 != ((ad) this).field_p) {
            break L47;
          } else {
            if (((ad) this).field_l != 11) {
              break L47;
            } else {
              ((ad) this).field_i.field_wb = null;
              break L47;
            }
          }
        }
        L48: {
          if (2 != ((ad) this).field_p) {
            break L48;
          } else {
            if (((ad) this).field_l != 6) {
              break L48;
            } else {
              ((ad) this).field_i.field_wb = null;
              break L48;
            }
          }
        }
        if (!((ad) this).field_n) {
          L49: {
            var5 += 16;
            if (0 != ((ad) this).field_p) {
              break L49;
            } else {
              if (((ad) this).field_l != ((ad) this).field_d) {
                break L49;
              } else {
                if (0 == ((ad) this).field_d) {
                  return false;
                } else {
                  break L49;
                }
              }
            }
          }
          if (null == ((ad) this).field_A) {
            return false;
          } else {
            L50: {
              if (((ad) this).field_p == 0) {
                if (((ad) this).field_g < 0) {
                  break L50;
                } else {
                  if (var3 + 12 < ((ad) this).field_g) {
                    break L50;
                  } else {
                    if (var4 > ((ad) this).field_c) {
                      break L50;
                    } else {
                      if (((ad) this).field_c > var5 - -var4) {
                        break L50;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              } else {
                if (~(-12 + -var3 + 640) < ~((ad) this).field_g) {
                  break L50;
                } else {
                  if (((ad) this).field_g > 640) {
                    break L50;
                  } else {
                    if (var4 > ((ad) this).field_c) {
                      break L50;
                    } else {
                      if (((ad) this).field_c <= var4 + var5) {
                        return false;
                      } else {
                        break L50;
                      }
                    }
                  }
                }
              }
            }
            L51: {
              var2_int = -aa.field_j.field_r + 534;
              if (((ad) this).field_a) {
                break L51;
              } else {
                if (~((ad) this).field_g > ~var2_int) {
                  break L51;
                } else {
                  if (~((ad) this).field_g < ~(wh.field_e.field_r + var2_int)) {
                    break L51;
                  } else {
                    if (((ad) this).field_c < var5 + -16) {
                      break L51;
                    } else {
                      if (~((ad) this).field_c >= ~(-16 + var5 + wh.field_e.field_t)) {
                        return false;
                      } else {
                        break L51;
                      }
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return true;
        }
    }

    public static void b(byte param0) {
        if (param0 >= -16) {
            return;
        }
        try {
            field_u = null;
            field_m = null;
            field_e = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ad.J(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!param2) {
                  break L2;
                } else {
                  l.d(0, 0, l.field_k, l.field_j, 0, 192);
                  if (Terraphoenix.field_V == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              l.a();
              break L1;
            }
            L3: {
              oi.a(-22417, param2);
              if (param1 == 0) {
                break L3;
              } else {
                ad.a(30, -91);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "ad.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (((ad) this).field_A == null) {
                break L1;
              } else {
                if (((ad) this).field_A.field_J) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            if (((ad) this).field_n) {
              return;
            } else {
              L2: {
                if (param0 == -100) {
                  break L2;
                } else {
                  boolean discarded$3 = ((ad) this).b(120);
                  break L2;
                }
              }
              L3: {
                var2_int = 40;
                if (((ad) this).field_p == 1) {
                  var2_int = 77;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((ad) this).field_p == 2) {
                  var2_int = 53;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (((ad) this).field_l != 0) {
                  break L5;
                } else {
                  if (((ad) this).field_d != 0) {
                    break L5;
                  } else {
                    L6: {
                      if (((ad) this).field_w >= 0) {
                        break L6;
                      } else {
                        l.d(0, var2_int, 640, 480 + -var2_int, 0, 128);
                        if (var9 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    l.d(0, var2_int, 640, 480 + -var2_int, 0, 255 + -((128 + ((ad) this).field_w) / 2));
                    break L5;
                  }
                }
              }
              L7: {
                if (34 == ((ad) this).field_l) {
                  lg.field_c = (9 * lg.field_c - -768) / 10;
                  sj.field_b = (-488 + 9 * sj.field_b) / 10;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                L9: {
                  if (((ad) this).field_l == 35) {
                    break L9;
                  } else {
                    if (38 != ((ad) this).field_l) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                sj.field_b = (sj.field_b * 9 + -496) / 10;
                lg.field_c = (lg.field_c * 9 + 896) / 10;
                break L8;
              }
              L10: {
                if (((ad) this).field_o != "") {
                  L11: {
                    var4 = 260;
                    if (!((ad) this).field_a) {
                      if (((ad) this).field_s) {
                        var6 = 6250335 + ((ad) this).field_j * 1052688;
                        og.field_f.c(((ad) this).field_f, (((ad) this).field_k - -((ad) this).field_t) / 2, -1 + ((ad) this).field_q - 3, 0, -1);
                        og.field_f.c(((ad) this).field_f, (((ad) this).field_k + ((ad) this).field_t) / 2, 1 + (((ad) this).field_q + -3), 0, -1);
                        og.field_f.c(((ad) this).field_f, -1 + (((ad) this).field_k + ((ad) this).field_t) / 2, ((ad) this).field_q + -3, 0, -1);
                        og.field_f.c(((ad) this).field_f, 1 + (((ad) this).field_k + ((ad) this).field_t) / 2, -3 + ((ad) this).field_q, 0, -1);
                        og.field_f.c(((ad) this).field_f, (((ad) this).field_k + ((ad) this).field_t) / 2, -3 + ((ad) this).field_q, var6, -1);
                        l.e(-((ad) this).field_j + ((ad) this).field_k, ((ad) this).field_q + -((ad) this).field_j, 1 + ((ad) this).field_t + (-((ad) this).field_k + ((ad) this).field_j * 2), 2 * ((ad) this).field_j + 1 + -((ad) this).field_q + ((ad) this).field_y, var6);
                        l.e(((ad) this).field_k + 1 + -((ad) this).field_j, -((ad) this).field_j + 1 + ((ad) this).field_q, 2 * ((ad) this).field_j + -((ad) this).field_k + ((ad) this).field_t - 1, -1 + ((ad) this).field_y - (((ad) this).field_q + -(((ad) this).field_j * 2)), 0);
                        l.e(((ad) this).field_k + -1 - ((ad) this).field_j, -((ad) this).field_j + -1 + ((ad) this).field_q, 3 + (-((ad) this).field_k + (((ad) this).field_t + ((ad) this).field_j * 2)), 2 * ((ad) this).field_j + (3 + (-((ad) this).field_q + ((ad) this).field_y)), 0);
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      var3 = og.field_f.field_s * (og.field_f.c(((ad) this).field_b, var4) + 1) + 32;
                      if (0 != ((ad) this).field_p) {
                        break L13;
                      } else {
                        l.d(3, var2_int + 3, 6 + var4, var3 - 6, 0, 192);
                        if (var9 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    l.d(643 - (var4 - -12), var2_int + 3, 6 + var4, var3 + -6, 0, 192);
                    break L12;
                  }
                  L14: {
                    L15: {
                      if (((ad) this).field_p == 0) {
                        break L15;
                      } else {
                        jl.a(jc.field_G, var3, var2_int, 12 + var4, (byte) -127, -var4 + 640 - 12);
                        if (var9 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    jl.a(jc.field_G, var3, var2_int, 12 + var4, (byte) -121, 0);
                    break L14;
                  }
                  L16: {
                    L17: {
                      if (((ad) this).field_p == 0) {
                        break L17;
                      } else {
                        og.field_f.b(((ad) this).field_o, 32 + (-var4 + 640), var2_int + 16, 16777215, -1);
                        if (var9 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    og.field_f.b(((ad) this).field_o, 32, var2_int + 16, 16777215, -1);
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (((ad) this).field_p == 0) {
                        break L19;
                      } else {
                        int discarded$4 = ji.a(-6 + (-var4 + 640), og.field_f.field_s, 16777215, og.field_f.field_s + (var2_int - -33), ((ad) this).field_b, (byte) 98, 637);
                        if (var9 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    int discarded$5 = ji.a(6, og.field_f.field_s, 16777215, og.field_f.field_s + (var2_int - -32), ((ad) this).field_b, (byte) 90, var4);
                    break L18;
                  }
                  L20: {
                    var6 = ((ad) this).field_l;
                    if (var6 <= 9) {
                      break L20;
                    } else {
                      var6 -= 3;
                      break L20;
                    }
                  }
                  L21: {
                    L22: {
                      var7 = ((ad) this).field_d;
                      if (((ad) this).field_p == 0) {
                        break L22;
                      } else {
                        L23: {
                          if (((ad) this).field_w > 0) {
                            l.d(640 + (-var4 - 12) + 3, var2_int - -3, 12 + (-6 + var4), var3 - 6, 0, ((ad) this).field_w);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (((ad) this).field_w >= 0) {
                          break L21;
                        } else {
                          l.d(-var4 + 640 + -9, var2_int - -3, var4 + 6, var3 + -6, 16711680, -((ad) this).field_w);
                          if (var9 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    L24: {
                      if (0 < ((ad) this).field_w) {
                        l.d(3, var2_int - -3, 6 + var4, -6 + var3, 0, ((ad) this).field_w);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    if (((ad) this).field_w < 0) {
                      l.d(3, 3 + var2_int, 12 + (var4 - 6), var3 + -6, 16711680, -((ad) this).field_w);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L25: {
                    var5 = 0;
                    if (var7 <= 9) {
                      break L25;
                    } else {
                      var7 -= 3;
                      break L25;
                    }
                  }
                  L26: {
                    if (0 >= ((ad) this).field_p) {
                      break L26;
                    } else {
                      var5 = 640 - wh.field_e.field_r;
                      break L26;
                    }
                  }
                  L27: {
                    if (((ad) this).field_a) {
                      break L27;
                    } else {
                      if (((ad) this).field_p != 0) {
                        break L10;
                      } else {
                        qh.field_b.b(var5, var2_int + var3);
                        if (~var5 < ~((ad) this).field_g) {
                          break L10;
                        } else {
                          if (~(qh.field_b.field_r + var5) >= ~((ad) this).field_g) {
                            break L10;
                          } else {
                            if (var3 - -var2_int > ((ad) this).field_c) {
                              break L10;
                            } else {
                              if (qh.field_b.field_t + var3 + var2_int > ((ad) this).field_c) {
                                l.d(var5, var3 + var2_int, qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
                                if (var9 == 0) {
                                  break L10;
                                } else {
                                  break L27;
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L28: {
                    aa.field_j.b(var5, var3 - -var2_int);
                    if (~((ad) this).field_g > ~var5) {
                      break L28;
                    } else {
                      if (((ad) this).field_g >= wh.field_e.field_r + var5) {
                        break L28;
                      } else {
                        if (~(var3 - -var2_int) < ~((ad) this).field_c) {
                          break L28;
                        } else {
                          if (~((ad) this).field_c <= ~(wh.field_e.field_t + (var3 - -var2_int))) {
                            break L28;
                          } else {
                            l.d(var5, var3 - -var2_int, wh.field_e.field_r, wh.field_e.field_t, 16777215, 128);
                            break L28;
                          }
                        }
                      }
                    }
                  }
                  if (((ad) this).field_s) {
                    var8 = 6250335 + 1052688 * ((ad) this).field_j;
                    l.e(((ad) this).field_k, ((ad) this).field_q, 1 + (((ad) this).field_t + -((ad) this).field_k), 1 + -((ad) this).field_q + ((ad) this).field_y, var8);
                    l.e(((ad) this).field_k + 1, 1 + ((ad) this).field_q, -((ad) this).field_k + ((ad) this).field_t + -1, ((ad) this).field_y + -((ad) this).field_q - 1, 0);
                    l.e(((ad) this).field_k - 1, ((ad) this).field_q + -1, 3 + (-((ad) this).field_k + ((ad) this).field_t), ((ad) this).field_y + (-((ad) this).field_q - -3), 0);
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ad.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 0;
                var3 = kf.field_f;
                if (param1 >= ~var3) {
                  break L2;
                } else {
                  var2_int = var3 * var3 * 8192 / 1100;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var3 < 105) {
                  break L3;
                } else {
                  if (var3 < 120) {
                    var3 = -var3 + 120;
                    var2_int = -(8192 * var3 * var3 / 3300) + 8192;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var2_int = (-40960 + 16384 * var3) / 220;
              break L1;
            }
            L4: {
              var4 = 1;
              var5 = 0;
              if (param0 != 3) {
                break L4;
              } else {
                var4 = -1;
                break L4;
              }
            }
            L5: {
              if (1 == param0) {
                var5 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 == 4) {
                var5 = 1;
                var4 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0 == 5) {
                var4 = -1;
                var5 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param0 == 6) {
                var5 = -1;
                var4 = 1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (param0 == 7) {
                  break L10;
                } else {
                  if (param0 != 8) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var4 = -1;
              var5 = -1;
              break L9;
            }
            L11: {
              if (11 != param0) {
                break L11;
              } else {
                var4 = -1;
                break L11;
              }
            }
            L12: {
              if (param0 != 12) {
                break L12;
              } else {
                var5 = -1;
                var4 = -1;
                break L12;
              }
            }
            L13: {
              if (param0 != 13) {
                break L13;
              } else {
                var5 = -1;
                var4 = 1;
                break L13;
              }
            }
            L14: {
              if (param0 != 14) {
                break L14;
              } else {
                var5 = 1;
                var4 = -1;
                break L14;
              }
            }
            L15: {
              if (param0 != 15) {
                break L15;
              } else {
                var5 = 1;
                var4 = 1;
                break L15;
              }
            }
            ld.field_a = jb.a(var5 * var2_int, var2_int * var4, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ad.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        r var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                boolean discarded$1 = ((ad) this).b(117);
                break L1;
              }
            }
            L2: {
              if (~((ad) this).field_l != ~((ad) this).field_d) {
                break L2;
              } else {
                if (9 == ((ad) this).field_l) {
                  var2_int = 134;
                  var3 = 664;
                  sj.field_b = (var2_int + sj.field_b * 9) / 10;
                  lg.field_c = (var3 + lg.field_c * 9) / 10;
                  if (Math.abs(-var2_int + sj.field_b) - -Math.abs(lg.field_c - var3) >= 32) {
                    break L2;
                  } else {
                    ((ad) this).field_B = 1 + ((ad) this).field_l;
                    ((ad) this).field_l = ((ad) this).field_B;
                    ((ad) this).field_d = ((ad) this).field_l;
                    this.a(false, 17097);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (~((ad) this).field_l != ~((ad) this).field_d) {
                break L3;
              } else {
                if (((ad) this).field_l == 11) {
                  var4 = ((ad) this).field_A.field_C[1];
                  var2_int = 32 * (-var4.field_H + var4.field_F);
                  var4.field_jb = var4.field_v;
                  var3 = (var4.field_H + var4.field_F) * 16 - 48 * var4.field_E;
                  lg.field_c = (var3 + lg.field_c * 9) / 10;
                  sj.field_b = (var2_int + 9 * sj.field_b) / 10;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ad.H(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        dl var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ad) this).field_p != 0) {
                break L1;
              } else {
                L2: {
                  ((ad) this).field_A.a(29518, -1);
                  ((ad) this).field_A.a(29518, -2);
                  if (((ad) this).field_l == 0) {
                    L3: {
                      ((ad) this).field_A.field_C[0].field_c = null;
                      ((ad) this).field_A.field_C[0].field_H = 18;
                      ((ad) this).field_A.field_C[0].field_F = 3;
                      var2_ref = ((ad) this).field_A.field_h.a(-66, ((ad) this).field_A.field_C[0].field_H, ((ad) this).field_A.field_C[0].field_E, ((ad) this).field_A.field_C[0].field_F);
                      if (var2_ref.field_h == null) {
                        break L3;
                      } else {
                        ((ad) this).field_A.field_C[0].field_F = ((ad) this).field_A.field_C[0].field_F + 1;
                        var2_ref = ((ad) this).field_A.field_h.a(-104, ((ad) this).field_A.field_C[0].field_H, ((ad) this).field_A.field_C[0].field_E, ((ad) this).field_A.field_C[0].field_F);
                        break L3;
                      }
                    }
                    ((ad) this).field_A.field_C[0].field_c = var2_ref;
                    var2_ref.field_h = ((ad) this).field_A.field_C[0];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (9 <= ((ad) this).field_l) {
                    break L4;
                  } else {
                    L5: {
                      ((ad) this).field_A.field_C[4].field_t = 7;
                      var2_ref = ((ad) this).field_A.field_C[4].field_c;
                      ((ad) this).field_A.field_C[4].field_C = 0;
                      ((ad) this).field_A.field_C[4].field_P = 0;
                      var2_ref.field_m = 7;
                      if (7 != var2_ref.field_m) {
                        break L5;
                      } else {
                        var2_ref.field_m = 7;
                        break L5;
                      }
                    }
                    L6: {
                      var2_ref.field_t = 16777088;
                      var2_ref.field_h = null;
                      var2_ref = ((ad) this).field_A.field_C[5].field_c;
                      ((ad) this).field_A.field_C[5].field_C = 0;
                      ((ad) this).field_A.field_C[5].field_P = 0;
                      ((ad) this).field_A.field_C[5].field_t = 7;
                      var2_ref.field_m = 7;
                      if (7 == var2_ref.field_m) {
                        var2_ref.field_m = 7;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_ref.field_t = 10460976;
                    var2_ref.field_h = null;
                    break L4;
                  }
                }
                if (((ad) this).field_l >= 11) {
                  break L1;
                } else {
                  L7: {
                    var3 = 1;
                    ((ad) this).field_A.field_C[var3] = new r(((ad) this).field_A.field_G.field_nb[var3]);
                    ((ad) this).field_A.field_C[var3].field_F = 7;
                    ((ad) this).field_A.field_C[var3].field_H = 24;
                    ((ad) this).field_A.field_C[var3].field_E = 0;
                    ((ad) this).field_A.field_C[var3].field_U = 4;
                    var2_ref = ((ad) this).field_A.field_h.a(88, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                    if (null == var2_ref.field_h) {
                      break L7;
                    } else {
                      ((ad) this).field_A.field_C[var3].field_F = ((ad) this).field_A.field_C[var3].field_F + 1;
                      var2_ref = ((ad) this).field_A.field_h.a(-26, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                      break L7;
                    }
                  }
                  L8: {
                    var2_ref.field_h = ((ad) this).field_A.field_C[var3];
                    ((ad) this).field_A.field_C[var3].field_c = var2_ref;
                    var3 = 2;
                    ((ad) this).field_A.field_C[var3] = new r(((ad) this).field_A.field_G.field_nb[var3]);
                    ((ad) this).field_A.field_C[var3].field_F = 5;
                    ((ad) this).field_A.field_C[var3].field_H = 16;
                    ((ad) this).field_A.field_C[var3].field_E = 0;
                    ((ad) this).field_A.field_C[var3].field_U = 1;
                    var2_ref = ((ad) this).field_A.field_h.a(-48, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                    if (var2_ref.field_h == null) {
                      break L8;
                    } else {
                      ((ad) this).field_A.field_C[var3].field_F = ((ad) this).field_A.field_C[var3].field_F + 1;
                      var2_ref = ((ad) this).field_A.field_h.a(112, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                      break L8;
                    }
                  }
                  L9: {
                    var2_ref.field_h = ((ad) this).field_A.field_C[var3];
                    ((ad) this).field_A.field_C[var3].field_c = var2_ref;
                    var3 = 3;
                    ((ad) this).field_A.field_C[var3] = new r(((ad) this).field_A.field_G.field_nb[var3]);
                    ((ad) this).field_A.field_C[var3].field_F = 6;
                    ((ad) this).field_A.field_C[var3].field_H = 17;
                    ((ad) this).field_A.field_C[var3].field_E = 0;
                    ((ad) this).field_A.field_C[var3].field_U = 2;
                    var2_ref = ((ad) this).field_A.field_h.a(102, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                    if (var2_ref.field_h != null) {
                      ((ad) this).field_A.field_C[var3].field_F = ((ad) this).field_A.field_C[var3].field_F + 1;
                      var2_ref = ((ad) this).field_A.field_h.a(-30, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var2_ref.field_h = ((ad) this).field_A.field_C[var3];
                  ((ad) this).field_A.field_C[var3].field_c = var2_ref;
                  break L1;
                }
              }
            }
            L10: {
              if (param0 >= 28) {
                break L10;
              } else {
                ad.a(false, 108, true);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ad.E(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        try {
            this.a(true, 17097);
            int var2_int = 19 % ((param0 - -8) / 48);
            ((ad) this).field_a = true;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ad.G(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ad) this).field_A == null) {
                break L1;
              } else {
                if (((ad) this).field_A.field_J) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            if (((ad) this).field_n) {
              return;
            } else {
              L2: {
                if (((ad) this).field_s) {
                  break L2;
                } else {
                  if (((ad) this).field_v == -1) {
                    var2_int = 320 + -sj.field_b + (((ad) this).field_r * 32 - ((ad) this).field_C * 32);
                    var3 = -lg.field_c + 16 * ((ad) this).field_C + ((ad) this).field_r * 16 - -240;
                    var4 = 1052688 * ((ad) this).field_j - -11513775;
                    if (-1 == ((ad) this).field_r) {
                      break L2;
                    } else {
                      l.c(var2_int + -32, var3, var2_int, -16 + var3, var4);
                      l.c(var2_int + -32, var3, var2_int, var3 - -16, var4);
                      l.c(32 + var2_int, var3, var2_int, var3 + -16, var4);
                      l.c(var2_int - -32, var3, var2_int, 16 + var3, var4);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 > 116) {
                  break L3;
                } else {
                  ((ad) this).field_v = 90;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ad.D(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 | param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var4, "ad.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(boolean param0, int param1) {
        int var3_int = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        Object stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        Object stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        Object stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        Object stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        Object stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        Object stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        Object stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        Object stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        Object stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        Object stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        Object stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        Object stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        Object stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        Object stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        Object stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        Object stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        Object stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        Object stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        Object stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        Object stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        Object stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        Object stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        Object stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        Object stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        Object stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        Object stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        Object stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        Object stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        Object stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        Object stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        Object stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        Object stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_125_2 = null;
        Object stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        Object stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        Object stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        Object stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        Object stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        Object stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        Object stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        Object stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        String stackIn_135_2 = null;
        Object stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        Object stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        Object stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        Object stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        Object stackIn_141_0 = null;
        Object stackIn_142_0 = null;
        Object stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        Object stackIn_145_0 = null;
        Object stackIn_146_0 = null;
        Object stackIn_147_0 = null;
        Object stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        Object stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        Object stackIn_150_0 = null;
        StringBuilder stackIn_150_1 = null;
        Object stackIn_151_0 = null;
        StringBuilder stackIn_151_1 = null;
        String stackIn_151_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        Object stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        Object stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        Object stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        Object stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        Object stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        Object stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        Object stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        Object stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        Object stackOut_93_0 = null;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        Object stackOut_94_0 = null;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        Object stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        Object stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        Object stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        Object stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        Object stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        Object stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        Object stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        Object stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        Object stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        Object stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        Object stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        Object stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        Object stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        Object stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        Object stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        Object stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        Object stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        Object stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        Object stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        Object stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        Object stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        Object stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        Object stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        Object stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        Object stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        Object stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        Object stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        Object stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        Object stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        Object stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        Object stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        Object stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        Object stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        Object stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        Object stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        Object stackOut_140_0 = null;
        Object stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        Object stackOut_144_0 = null;
        Object stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        Object stackOut_145_0 = null;
        Object stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        Object stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        Object stackOut_150_0 = null;
        StringBuilder stackOut_150_1 = null;
        String stackOut_150_2 = null;
        Object stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        String stackOut_149_2 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  var5 = Terraphoenix.field_V;
                  ((ad) this).field_a = true;
                  ((ad) this).field_n = false;
                  ((ad) this).field_o = ((ad) this).field_l + " my title";
                  ((ad) this).field_s = false;
                  ((ad) this).field_b = "This is some tutorial text that will never appear in the new game :P.  But anyway, press the next button to continue";
                  ((ad) this).field_r = -1;
                  ((ad) this).field_v = -1;
                  var3_int = ((ad) this).field_p;
                  if (var3_int != 2) {
                    break L4;
                  } else {
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (1 == var3_int) {
                  break L2;
                } else {
                  if (var3_int != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            var3_int = ((ad) this).field_l;
                            if (var3_int != 0) {
                              break L11;
                            } else {
                              if (var5 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (var3_int == 1) {
                            break L9;
                          } else {
                            L12: {
                              if (var3_int != 2) {
                                break L12;
                              } else {
                                if (var5 == 0) {
                                  break L8;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (var3_int == 3) {
                              break L7;
                            } else {
                              L13: {
                                if (var3_int != 4) {
                                  break L13;
                                } else {
                                  if (var5 == 0) {
                                    break L6;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var3_int == 5) {
                                break L5;
                              } else {
                                ((ad) this).field_y = 480;
                                ((ad) this).field_t = 640;
                                ((ad) this).field_q = 0;
                                ((ad) this).field_s = true;
                                ((ad) this).field_k = 0;
                                if (var5 == 0) {
                                  break L0;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          stackOut_28_0 = this;
                          stackOut_28_1 = new StringBuilder().append(kl.field_d[1]);
                          stackIn_31_0 = stackOut_28_0;
                          stackIn_31_1 = stackOut_28_1;
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          if (!param0) {
                            stackOut_31_0 = this;
                            stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                            stackOut_31_2 = kl.field_d[2];
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            stackIn_32_2 = stackOut_31_2;
                            break L14;
                          } else {
                            stackOut_29_0 = this;
                            stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            stackOut_30_0 = this;
                            stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                            stackOut_30_2 = "";
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            stackIn_32_2 = stackOut_30_2;
                            break L14;
                          }
                        }
                        ((ad) this).field_b = stackIn_32_2;
                        ((ad) this).field_o = kl.field_d[0];
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L9;
                        }
                      }
                      L15: {
                        ((ad) this).field_a = false;
                        ((ad) this).field_s = true;
                        ((ad) this).field_o = kl.field_d[3];
                        ((ad) this).field_q = 266;
                        ((ad) this).field_k = 5;
                        ((ad) this).field_t = 47;
                        ((ad) this).field_y = 308;
                        stackOut_33_0 = this;
                        stackOut_33_1 = new StringBuilder().append(kl.field_d[4]);
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (!param0) {
                          stackOut_36_0 = this;
                          stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                          stackOut_36_2 = kl.field_d[5];
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          stackIn_37_2 = stackOut_36_2;
                          break L15;
                        } else {
                          stackOut_34_0 = this;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackOut_35_0 = this;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = "";
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          break L15;
                        }
                      }
                      ((ad) this).field_b = stackIn_37_2;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L8;
                      }
                    }
                    L16: {
                      stackOut_38_0 = this;
                      stackOut_38_1 = new StringBuilder().append(kl.field_d[7]);
                      stackIn_41_0 = stackOut_38_0;
                      stackIn_41_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if (!param0) {
                        stackOut_41_0 = this;
                        stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                        stackOut_41_2 = kl.field_d[8];
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        break L16;
                      } else {
                        stackOut_39_0 = this;
                        stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackOut_40_0 = this;
                        stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                        stackOut_40_2 = "";
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        break L16;
                      }
                    }
                    ((ad) this).field_b = stackIn_42_2;
                    ((ad) this).field_y = 152;
                    ((ad) this).field_t = 320;
                    ((ad) this).field_q = 69;
                    ((ad) this).field_a = false;
                    ((ad) this).field_o = kl.field_d[6];
                    ((ad) this).field_k = 59;
                    ((ad) this).field_s = true;
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L7;
                    }
                  }
                  L17: {
                    ((ad) this).field_y = 416;
                    ((ad) this).field_s = true;
                    ((ad) this).field_t = 628;
                    stackOut_43_0 = this;
                    stackOut_43_1 = new StringBuilder().append(kl.field_d[10]);
                    stackIn_46_0 = stackOut_43_0;
                    stackIn_46_1 = stackOut_43_1;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    if (!param0) {
                      stackOut_46_0 = this;
                      stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                      stackOut_46_2 = kl.field_d[11];
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      stackIn_47_2 = stackOut_46_2;
                      break L17;
                    } else {
                      stackOut_44_0 = this;
                      stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      stackOut_45_0 = this;
                      stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                      stackOut_45_2 = "";
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_47_2 = stackOut_45_2;
                      break L17;
                    }
                  }
                  ((ad) this).field_b = stackIn_47_2;
                  ((ad) this).field_k = 357;
                  ((ad) this).field_a = false;
                  ((ad) this).field_q = 387;
                  ((ad) this).field_o = kl.field_d[9];
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L6;
                  }
                }
                L18: {
                  ((ad) this).field_a = false;
                  ((ad) this).field_k = 525;
                  ((ad) this).field_q = 437;
                  ((ad) this).field_t = 623;
                  ((ad) this).field_y = 462;
                  ((ad) this).field_o = kl.field_d[12];
                  stackOut_48_0 = this;
                  stackOut_48_1 = new StringBuilder().append(kl.field_d[13]);
                  stackIn_51_0 = stackOut_48_0;
                  stackIn_51_1 = stackOut_48_1;
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  if (!param0) {
                    stackOut_51_0 = this;
                    stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                    stackOut_51_2 = kl.field_d[14];
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    break L18;
                  } else {
                    stackOut_49_0 = this;
                    stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackOut_50_0 = this;
                    stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                    stackOut_50_2 = "";
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    stackIn_52_2 = stackOut_50_2;
                    break L18;
                  }
                }
                ((ad) this).field_b = stackIn_52_2;
                ((ad) this).field_s = true;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L5;
                }
              }
              L19: {
                ((ad) this).field_o = kl.field_d[15];
                stackOut_53_0 = this;
                stackOut_53_1 = new StringBuilder().append(kl.field_d[16]);
                stackIn_56_0 = stackOut_53_0;
                stackIn_56_1 = stackOut_53_1;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                if (!param0) {
                  stackOut_56_0 = this;
                  stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
                  stackOut_56_2 = kl.field_d[17];
                  stackIn_57_0 = stackOut_56_0;
                  stackIn_57_1 = stackOut_56_1;
                  stackIn_57_2 = stackOut_56_2;
                  break L19;
                } else {
                  stackOut_54_0 = this;
                  stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackOut_55_0 = this;
                  stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                  stackOut_55_2 = "";
                  stackIn_57_0 = stackOut_55_0;
                  stackIn_57_1 = stackOut_55_1;
                  stackIn_57_2 = stackOut_55_2;
                  break L19;
                }
              }
              ((ad) this).field_b = stackIn_57_2;
              if (var5 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            L20: {
              L21: {
                L22: {
                  L23: {
                    L24: {
                      L25: {
                        L26: {
                          L27: {
                            L28: {
                              L29: {
                                L30: {
                                  L31: {
                                    var3_int = ((ad) this).field_l;
                                    if (var3_int != 0) {
                                      break L31;
                                    } else {
                                      if (var5 == 0) {
                                        break L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  L32: {
                                    if (var3_int != 1) {
                                      break L32;
                                    } else {
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  if (var3_int == 2) {
                                    break L28;
                                  } else {
                                    if (3 == var3_int) {
                                      break L27;
                                    } else {
                                      if (var3_int == 4) {
                                        break L26;
                                      } else {
                                        L33: {
                                          if (var3_int != 5) {
                                            break L33;
                                          } else {
                                            if (var5 == 0) {
                                              break L25;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                        if (var3_int == 6) {
                                          break L24;
                                        } else {
                                          if (7 == var3_int) {
                                            break L23;
                                          } else {
                                            L34: {
                                              if (var3_int != 8) {
                                                break L34;
                                              } else {
                                                if (var5 == 0) {
                                                  break L22;
                                                } else {
                                                  break L34;
                                                }
                                              }
                                            }
                                            L35: {
                                              if (var3_int != 9) {
                                                break L35;
                                              } else {
                                                if (var5 == 0) {
                                                  break L21;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                            L36: {
                                              if (var3_int != 10) {
                                                break L36;
                                              } else {
                                                if (var5 == 0) {
                                                  break L20;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            ((ad) this).field_y = 480;
                                            ((ad) this).field_s = true;
                                            ((ad) this).field_t = 640;
                                            ((ad) this).field_k = 0;
                                            ((ad) this).field_q = 0;
                                            if (var5 == 0) {
                                              break L0;
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L37: {
                                  ((ad) this).field_q = 153;
                                  ((ad) this).field_t = 639;
                                  ((ad) this).field_y = 180;
                                  ((ad) this).field_o = kl.field_d[18];
                                  stackOut_93_0 = this;
                                  stackIn_96_0 = stackOut_93_0;
                                  stackIn_94_0 = stackOut_93_0;
                                  if (param0) {
                                    stackOut_96_0 = this;
                                    stackOut_96_1 = 0;
                                    stackIn_97_0 = stackOut_96_0;
                                    stackIn_97_1 = stackOut_96_1;
                                    break L37;
                                  } else {
                                    stackOut_94_0 = this;
                                    stackIn_95_0 = stackOut_94_0;
                                    stackOut_95_0 = this;
                                    stackOut_95_1 = 1;
                                    stackIn_97_0 = stackOut_95_0;
                                    stackIn_97_1 = stackOut_95_1;
                                    break L37;
                                  }
                                }
                                L38: {
                                  ((ad) this).field_s = stackIn_97_1 != 0;
                                  ((ad) this).field_k = 540;
                                  stackOut_97_0 = this;
                                  stackOut_97_1 = new StringBuilder().append(kl.field_d[19]);
                                  stackIn_99_0 = stackOut_97_0;
                                  stackIn_99_1 = stackOut_97_1;
                                  stackIn_98_0 = stackOut_97_0;
                                  stackIn_98_1 = stackOut_97_1;
                                  if (param0) {
                                    stackOut_99_0 = this;
                                    stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
                                    stackOut_99_2 = "";
                                    stackIn_100_0 = stackOut_99_0;
                                    stackIn_100_1 = stackOut_99_1;
                                    stackIn_100_2 = stackOut_99_2;
                                    break L38;
                                  } else {
                                    stackOut_98_0 = this;
                                    stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                                    stackOut_98_2 = kl.field_d[2];
                                    stackIn_100_0 = stackOut_98_0;
                                    stackIn_100_1 = stackOut_98_1;
                                    stackIn_100_2 = stackOut_98_2;
                                    break L38;
                                  }
                                }
                                ((ad) this).field_b = stackIn_100_2;
                                if (var5 == 0) {
                                  break L0;
                                } else {
                                  break L29;
                                }
                              }
                              L39: {
                                stackOut_101_0 = this;
                                stackOut_101_1 = new StringBuilder().append(kl.field_d[21]);
                                stackIn_104_0 = stackOut_101_0;
                                stackIn_104_1 = stackOut_101_1;
                                stackIn_102_0 = stackOut_101_0;
                                stackIn_102_1 = stackOut_101_1;
                                if (param0) {
                                  stackOut_104_0 = this;
                                  stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
                                  stackOut_104_2 = "";
                                  stackIn_105_0 = stackOut_104_0;
                                  stackIn_105_1 = stackOut_104_1;
                                  stackIn_105_2 = stackOut_104_2;
                                  break L39;
                                } else {
                                  stackOut_102_0 = this;
                                  stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
                                  stackIn_103_0 = stackOut_102_0;
                                  stackIn_103_1 = stackOut_102_1;
                                  stackOut_103_0 = this;
                                  stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                                  stackOut_103_2 = kl.field_d[22];
                                  stackIn_105_0 = stackOut_103_0;
                                  stackIn_105_1 = stackOut_103_1;
                                  stackIn_105_2 = stackOut_103_2;
                                  break L39;
                                }
                              }
                              ((ad) this).field_b = stackIn_105_2;
                              ((ad) this).field_o = kl.field_d[20];
                              ((ad) this).field_a = false;
                              ((ad) this).field_t = 419;
                              ((ad) this).field_s = true;
                              ((ad) this).field_k = 220;
                              ((ad) this).field_q = 440;
                              ((ad) this).field_y = 467;
                              if (var5 == 0) {
                                break L0;
                              } else {
                                break L28;
                              }
                            }
                            L40: {
                              ((ad) this).field_o = kl.field_d[23];
                              stackOut_106_0 = this;
                              stackOut_106_1 = new StringBuilder().append(kl.field_d[24]);
                              stackIn_109_0 = stackOut_106_0;
                              stackIn_109_1 = stackOut_106_1;
                              stackIn_107_0 = stackOut_106_0;
                              stackIn_107_1 = stackOut_106_1;
                              if (!param0) {
                                stackOut_109_0 = this;
                                stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                                stackOut_109_2 = kl.field_d[2];
                                stackIn_110_0 = stackOut_109_0;
                                stackIn_110_1 = stackOut_109_1;
                                stackIn_110_2 = stackOut_109_2;
                                break L40;
                              } else {
                                stackOut_107_0 = this;
                                stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
                                stackIn_108_0 = stackOut_107_0;
                                stackIn_108_1 = stackOut_107_1;
                                stackOut_108_0 = this;
                                stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
                                stackOut_108_2 = "";
                                stackIn_110_0 = stackOut_108_0;
                                stackIn_110_1 = stackOut_108_1;
                                stackIn_110_2 = stackOut_108_2;
                                break L40;
                              }
                            }
                            ((ad) this).field_b = stackIn_110_2;
                            if (var5 == 0) {
                              break L0;
                            } else {
                              break L27;
                            }
                          }
                          L41: {
                            ((ad) this).field_k = 93;
                            ((ad) this).field_q = 413;
                            ((ad) this).field_t = 475;
                            stackOut_111_0 = this;
                            stackOut_111_1 = new StringBuilder().append(kl.field_d[26]);
                            stackIn_114_0 = stackOut_111_0;
                            stackIn_114_1 = stackOut_111_1;
                            stackIn_112_0 = stackOut_111_0;
                            stackIn_112_1 = stackOut_111_1;
                            if (param0) {
                              stackOut_114_0 = this;
                              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
                              stackOut_114_2 = "";
                              stackIn_115_0 = stackOut_114_0;
                              stackIn_115_1 = stackOut_114_1;
                              stackIn_115_2 = stackOut_114_2;
                              break L41;
                            } else {
                              stackOut_112_0 = this;
                              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                              stackIn_113_0 = stackOut_112_0;
                              stackIn_113_1 = stackOut_112_1;
                              stackOut_113_0 = this;
                              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
                              stackOut_113_2 = kl.field_d[2];
                              stackIn_115_0 = stackOut_113_0;
                              stackIn_115_1 = stackOut_113_1;
                              stackIn_115_2 = stackOut_113_2;
                              break L41;
                            }
                          }
                          ((ad) this).field_b = stackIn_115_2;
                          ((ad) this).field_s = true;
                          ((ad) this).field_o = kl.field_d[25];
                          ((ad) this).field_y = 477;
                          if (var5 == 0) {
                            break L0;
                          } else {
                            break L26;
                          }
                        }
                        L42: {
                          ((ad) this).field_k = 5;
                          stackOut_116_0 = this;
                          stackOut_116_1 = new StringBuilder().append(kl.field_d[28]);
                          stackIn_119_0 = stackOut_116_0;
                          stackIn_119_1 = stackOut_116_1;
                          stackIn_117_0 = stackOut_116_0;
                          stackIn_117_1 = stackOut_116_1;
                          if (param0) {
                            stackOut_119_0 = this;
                            stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
                            stackOut_119_2 = "";
                            stackIn_120_0 = stackOut_119_0;
                            stackIn_120_1 = stackOut_119_1;
                            stackIn_120_2 = stackOut_119_2;
                            break L42;
                          } else {
                            stackOut_117_0 = this;
                            stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
                            stackIn_118_0 = stackOut_117_0;
                            stackIn_118_1 = stackOut_117_1;
                            stackOut_118_0 = this;
                            stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
                            stackOut_118_2 = kl.field_d[29];
                            stackIn_120_0 = stackOut_118_0;
                            stackIn_120_1 = stackOut_118_1;
                            stackIn_120_2 = stackOut_118_2;
                            break L42;
                          }
                        }
                        ((ad) this).field_b = stackIn_120_2;
                        ((ad) this).field_s = true;
                        ((ad) this).field_q = 111;
                        ((ad) this).field_a = false;
                        ((ad) this).field_t = 47;
                        ((ad) this).field_o = kl.field_d[27];
                        ((ad) this).field_y = 153;
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L25;
                        }
                      }
                      L43: {
                        ((ad) this).field_t = 234;
                        ((ad) this).field_a = false;
                        ((ad) this).field_q = 372;
                        ((ad) this).field_y = 387;
                        ((ad) this).field_k = 172;
                        ((ad) this).field_s = true;
                        stackOut_121_0 = this;
                        stackOut_121_1 = new StringBuilder().append(kl.field_d[31]);
                        stackIn_124_0 = stackOut_121_0;
                        stackIn_124_1 = stackOut_121_1;
                        stackIn_122_0 = stackOut_121_0;
                        stackIn_122_1 = stackOut_121_1;
                        if (param0) {
                          stackOut_124_0 = this;
                          stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
                          stackOut_124_2 = "";
                          stackIn_125_0 = stackOut_124_0;
                          stackIn_125_1 = stackOut_124_1;
                          stackIn_125_2 = stackOut_124_2;
                          break L43;
                        } else {
                          stackOut_122_0 = this;
                          stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
                          stackIn_123_0 = stackOut_122_0;
                          stackIn_123_1 = stackOut_122_1;
                          stackOut_123_0 = this;
                          stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
                          stackOut_123_2 = kl.field_d[32];
                          stackIn_125_0 = stackOut_123_0;
                          stackIn_125_1 = stackOut_123_1;
                          stackIn_125_2 = stackOut_123_2;
                          break L43;
                        }
                      }
                      ((ad) this).field_b = stackIn_125_2;
                      ((ad) this).field_o = kl.field_d[30];
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L24;
                      }
                    }
                    L44: {
                      ((ad) this).field_a = false;
                      stackOut_126_0 = this;
                      stackOut_126_1 = new StringBuilder().append(kl.field_d[34]);
                      stackIn_129_0 = stackOut_126_0;
                      stackIn_129_1 = stackOut_126_1;
                      stackIn_127_0 = stackOut_126_0;
                      stackIn_127_1 = stackOut_126_1;
                      if (param0) {
                        stackOut_129_0 = this;
                        stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
                        stackOut_129_2 = "";
                        stackIn_130_0 = stackOut_129_0;
                        stackIn_130_1 = stackOut_129_1;
                        stackIn_130_2 = stackOut_129_2;
                        break L44;
                      } else {
                        stackOut_127_0 = this;
                        stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
                        stackIn_128_0 = stackOut_127_0;
                        stackIn_128_1 = stackOut_127_1;
                        stackOut_128_0 = this;
                        stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
                        stackOut_128_2 = kl.field_d[35];
                        stackIn_130_0 = stackOut_128_0;
                        stackIn_130_1 = stackOut_128_1;
                        stackIn_130_2 = stackOut_128_2;
                        break L44;
                      }
                    }
                    ((ad) this).field_b = stackIn_130_2;
                    ((ad) this).field_q = 90;
                    ((ad) this).field_s = true;
                    ((ad) this).field_y = 170;
                    ((ad) this).field_o = kl.field_d[33];
                    ((ad) this).field_t = 317;
                    ((ad) this).field_k = 63;
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L23;
                    }
                  }
                  L45: {
                    ((ad) this).field_o = kl.field_d[36];
                    stackOut_131_0 = this;
                    stackOut_131_1 = new StringBuilder().append(kl.field_d[37]);
                    stackIn_134_0 = stackOut_131_0;
                    stackIn_134_1 = stackOut_131_1;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    if (!param0) {
                      stackOut_134_0 = this;
                      stackOut_134_1 = (StringBuilder) (Object) stackIn_134_1;
                      stackOut_134_2 = kl.field_d[2];
                      stackIn_135_0 = stackOut_134_0;
                      stackIn_135_1 = stackOut_134_1;
                      stackIn_135_2 = stackOut_134_2;
                      break L45;
                    } else {
                      stackOut_132_0 = this;
                      stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      stackOut_133_0 = this;
                      stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
                      stackOut_133_2 = "";
                      stackIn_135_0 = stackOut_133_0;
                      stackIn_135_1 = stackOut_133_1;
                      stackIn_135_2 = stackOut_133_2;
                      break L45;
                    }
                  }
                  ((ad) this).field_b = stackIn_135_2;
                  ((ad) this).field_i.field_I.field_a[18] = ((ad) this).field_i.field_I.field_a[18] - 1;
                  ((ad) this).field_i.field_nb[2].field_b = new oh(18);
                  int discarded$2 = ((ad) this).field_i.field_nb[2].d((byte) -113);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L22;
                  }
                }
                L46: {
                  ((ad) this).field_o = kl.field_d[38];
                  stackOut_136_0 = this;
                  stackOut_136_1 = new StringBuilder().append(kl.field_d[39]);
                  stackIn_139_0 = stackOut_136_0;
                  stackIn_139_1 = stackOut_136_1;
                  stackIn_137_0 = stackOut_136_0;
                  stackIn_137_1 = stackOut_136_1;
                  if (!param0) {
                    stackOut_139_0 = this;
                    stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
                    stackOut_139_2 = kl.field_d[40];
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    stackIn_140_2 = stackOut_139_2;
                    break L46;
                  } else {
                    stackOut_137_0 = this;
                    stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
                    stackIn_138_0 = stackOut_137_0;
                    stackIn_138_1 = stackOut_137_1;
                    stackOut_138_0 = this;
                    stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
                    stackOut_138_2 = "";
                    stackIn_140_0 = stackOut_138_0;
                    stackIn_140_1 = stackOut_138_1;
                    stackIn_140_2 = stackOut_138_2;
                    break L46;
                  }
                }
                L47: {
                  ((ad) this).field_b = stackIn_140_2;
                  ((ad) this).field_a = false;
                  ((ad) this).field_k = 364;
                  ((ad) this).field_y = 280;
                  ((ad) this).field_t = 430;
                  ((ad) this).field_q = 143;
                  stackOut_140_0 = this;
                  stackIn_142_0 = stackOut_140_0;
                  stackIn_141_0 = stackOut_140_0;
                  if (param0) {
                    stackOut_142_0 = this;
                    stackOut_142_1 = 0;
                    stackIn_143_0 = stackOut_142_0;
                    stackIn_143_1 = stackOut_142_1;
                    break L47;
                  } else {
                    stackOut_141_0 = this;
                    stackOut_141_1 = 1;
                    stackIn_143_0 = stackOut_141_0;
                    stackIn_143_1 = stackOut_141_1;
                    break L47;
                  }
                }
                ((ad) this).field_s = stackIn_143_1 != 0;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L21;
                }
              }
              L48: {
                ((ad) this).field_q = 373;
                ((ad) this).field_y = 387;
                ((ad) this).field_o = kl.field_d[41];
                ((ad) this).field_k = 330;
                ((ad) this).field_t = 624;
                stackOut_144_0 = this;
                stackIn_147_0 = stackOut_144_0;
                stackIn_145_0 = stackOut_144_0;
                if (param0) {
                  stackOut_147_0 = this;
                  stackOut_147_1 = 0;
                  stackIn_148_0 = stackOut_147_0;
                  stackIn_148_1 = stackOut_147_1;
                  break L48;
                } else {
                  stackOut_145_0 = this;
                  stackIn_146_0 = stackOut_145_0;
                  stackOut_146_0 = this;
                  stackOut_146_1 = 1;
                  stackIn_148_0 = stackOut_146_0;
                  stackIn_148_1 = stackOut_146_1;
                  break L48;
                }
              }
              L49: {
                ((ad) this).field_s = stackIn_148_1 != 0;
                ((ad) this).field_a = false;
                stackOut_148_0 = this;
                stackOut_148_1 = new StringBuilder().append(kl.field_d[42]);
                stackIn_150_0 = stackOut_148_0;
                stackIn_150_1 = stackOut_148_1;
                stackIn_149_0 = stackOut_148_0;
                stackIn_149_1 = stackOut_148_1;
                if (param0) {
                  stackOut_150_0 = this;
                  stackOut_150_1 = (StringBuilder) (Object) stackIn_150_1;
                  stackOut_150_2 = "";
                  stackIn_151_0 = stackOut_150_0;
                  stackIn_151_1 = stackOut_150_1;
                  stackIn_151_2 = stackOut_150_2;
                  break L49;
                } else {
                  stackOut_149_0 = this;
                  stackOut_149_1 = (StringBuilder) (Object) stackIn_149_1;
                  stackOut_149_2 = kl.field_d[43];
                  stackIn_151_0 = stackOut_149_0;
                  stackIn_151_1 = stackOut_149_1;
                  stackIn_151_2 = stackOut_149_2;
                  break L49;
                }
              }
              ((ad) this).field_b = stackIn_151_2;
              ((ad) this).field_i.field_I.field_a[18] = ((ad) this).field_i.field_I.field_a[18] + 1;
              ((ad) this).field_i.field_nb[2].field_b = null;
              int discarded$3 = ((ad) this).field_i.field_nb[2].d((byte) -100);
              if (var5 == 0) {
                break L0;
              } else {
                break L20;
              }
            }
            ((ad) this).field_b = kl.field_d[45] + kl.field_d[46];
            ((ad) this).field_o = kl.field_d[44];
            if (var5 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          L50: {
            L51: {
              L52: {
                L53: {
                  L54: {
                    L55: {
                      L56: {
                        L57: {
                          L58: {
                            L59: {
                              L60: {
                                L61: {
                                  var3_int = ((ad) this).field_l;
                                  if (0 == var3_int) {
                                    break L61;
                                  } else {
                                    L62: {
                                      if (var3_int != 1) {
                                        break L62;
                                      } else {
                                        if (var5 == 0) {
                                          break L60;
                                        } else {
                                          break L62;
                                        }
                                      }
                                    }
                                    L63: {
                                      if (2 != var3_int) {
                                        break L63;
                                      } else {
                                        if (var5 == 0) {
                                          break L59;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                    L64: {
                                      if (var3_int != 3) {
                                        break L64;
                                      } else {
                                        if (var5 == 0) {
                                          break L58;
                                        } else {
                                          break L64;
                                        }
                                      }
                                    }
                                    L65: {
                                      if (var3_int != 4) {
                                        break L65;
                                      } else {
                                        if (var5 == 0) {
                                          break L57;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                    L66: {
                                      if (5 != var3_int) {
                                        break L66;
                                      } else {
                                        if (var5 == 0) {
                                          break L56;
                                        } else {
                                          break L66;
                                        }
                                      }
                                    }
                                    L67: {
                                      if (var3_int != 6) {
                                        break L67;
                                      } else {
                                        if (var5 == 0) {
                                          break L55;
                                        } else {
                                          break L67;
                                        }
                                      }
                                    }
                                    if (var3_int == 7) {
                                      break L54;
                                    } else {
                                      L68: {
                                        if (8 != var3_int) {
                                          break L68;
                                        } else {
                                          if (var5 == 0) {
                                            break L53;
                                          } else {
                                            break L68;
                                          }
                                        }
                                      }
                                      L69: {
                                        if (var3_int != 9) {
                                          break L69;
                                        } else {
                                          if (var5 == 0) {
                                            break L52;
                                          } else {
                                            break L69;
                                          }
                                        }
                                      }
                                      L70: {
                                        if (var3_int != 10) {
                                          break L70;
                                        } else {
                                          if (var5 == 0) {
                                            break L51;
                                          } else {
                                            break L70;
                                          }
                                        }
                                      }
                                      L71: {
                                        if (var3_int != 11) {
                                          break L71;
                                        } else {
                                          if (var5 == 0) {
                                            break L50;
                                          } else {
                                            break L71;
                                          }
                                        }
                                      }
                                      L72: {
                                        L73: {
                                          L74: {
                                            L75: {
                                              L76: {
                                                L77: {
                                                  if (var3_int == 12) {
                                                    L78: {
                                                      ((ad) this).field_o = kl.field_d[71];
                                                      ((ad) this).field_b = kl.field_d[72];
                                                      if (!param0) {
                                                        ((ad) this).field_A.a(29518, -2);
                                                        break L78;
                                                      } else {
                                                        break L78;
                                                      }
                                                    }
                                                    L79: {
                                                      if (!param0) {
                                                        ((ad) this).field_A.a(29518, -1);
                                                        break L79;
                                                      } else {
                                                        break L79;
                                                      }
                                                    }
                                                    L80: {
                                                      if (!param0) {
                                                        ((ad) this).field_A.a(-1, kl.field_d[73], -118);
                                                        break L80;
                                                      } else {
                                                        break L80;
                                                      }
                                                    }
                                                    ((ad) this).field_a = false;
                                                    if (var5 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L77;
                                                    }
                                                  } else {
                                                    if (var3_int == 13) {
                                                      break L77;
                                                    } else {
                                                      L81: {
                                                        if (var3_int != 14) {
                                                          break L81;
                                                        } else {
                                                          if (var5 == 0) {
                                                            break L76;
                                                          } else {
                                                            break L81;
                                                          }
                                                        }
                                                      }
                                                      if (var3_int == 15) {
                                                        break L75;
                                                      } else {
                                                        if (var3_int == 16) {
                                                          break L74;
                                                        } else {
                                                          if (var3_int == 17) {
                                                            break L73;
                                                          } else {
                                                            L82: {
                                                              if (var3_int != 18) {
                                                                break L82;
                                                              } else {
                                                                if (var5 == 0) {
                                                                  break L72;
                                                                } else {
                                                                  break L82;
                                                                }
                                                              }
                                                            }
                                                            ((ad) this).field_t = 640;
                                                            ((ad) this).field_s = true;
                                                            ((ad) this).field_q = 0;
                                                            ((ad) this).field_y = 480;
                                                            ((ad) this).field_k = 0;
                                                            if (var5 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L61;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L83: {
                                                  ((ad) this).field_o = kl.field_d[74];
                                                  ((ad) this).field_b = kl.field_d[75];
                                                  if (!param0) {
                                                    ((ad) this).field_A.a(29518, -1);
                                                    break L83;
                                                  } else {
                                                    break L83;
                                                  }
                                                }
                                                L84: {
                                                  if (param0) {
                                                    break L84;
                                                  } else {
                                                    ((ad) this).field_A.a(29518, -2);
                                                    break L84;
                                                  }
                                                }
                                                if (param0) {
                                                  break L0;
                                                } else {
                                                  ((ad) this).field_A.a(1, kl.field_d[76], param1 ^ -17124);
                                                  if (var5 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L76;
                                                  }
                                                }
                                              }
                                              ((ad) this).field_o = kl.field_d[77];
                                              ((ad) this).field_b = kl.field_d[78];
                                              if (var5 == 0) {
                                                break L0;
                                              } else {
                                                break L75;
                                              }
                                            }
                                            ((ad) this).field_o = kl.field_d[79];
                                            ((ad) this).field_b = kl.field_d[80];
                                            ((ad) this).field_t = 153;
                                            ((ad) this).field_k = 98;
                                            ((ad) this).field_q = 450;
                                            ((ad) this).field_y = 477;
                                            ((ad) this).field_s = true;
                                            if (var5 == 0) {
                                              break L0;
                                            } else {
                                              break L74;
                                            }
                                          }
                                          ((ad) this).field_b = kl.field_d[82];
                                          ((ad) this).field_o = kl.field_d[81];
                                          if (var5 == 0) {
                                            break L0;
                                          } else {
                                            break L73;
                                          }
                                        }
                                        ((ad) this).field_b = kl.field_d[84];
                                        ((ad) this).field_o = kl.field_d[83];
                                        ((ad) this).field_k = 306;
                                        ((ad) this).field_t = 542;
                                        ((ad) this).field_s = true;
                                        ((ad) this).field_y = 469;
                                        ((ad) this).field_q = 391;
                                        if (var5 == 0) {
                                          break L0;
                                        } else {
                                          break L72;
                                        }
                                      }
                                      ((ad) this).field_o = kl.field_d[85];
                                      ((ad) this).field_b = kl.field_d[86];
                                      ((ad) this).field_a = false;
                                      break L0;
                                    }
                                  }
                                }
                                ((ad) this).field_b = kl.field_d[48];
                                ((ad) this).field_a = true;
                                ((ad) this).field_o = kl.field_d[47];
                                if (var5 == 0) {
                                  break L0;
                                } else {
                                  break L60;
                                }
                              }
                              L85: {
                                ((ad) this).field_b = kl.field_d[50];
                                ((ad) this).field_o = kl.field_d[49];
                                if (param0) {
                                  break L85;
                                } else {
                                  ((ad) this).field_A.a(param1 + 12421, -2);
                                  break L85;
                                }
                              }
                              L86: {
                                if (param0) {
                                  break L86;
                                } else {
                                  ((ad) this).field_A.a(29518, -1);
                                  break L86;
                                }
                              }
                              L87: {
                                if (param0) {
                                  break L87;
                                } else {
                                  ((ad) this).field_A.a(-2, kl.field_d[51], -47);
                                  break L87;
                                }
                              }
                              ((ad) this).field_a = false;
                              if (var5 == 0) {
                                break L0;
                              } else {
                                break L59;
                              }
                            }
                            L88: {
                              ((ad) this).field_k = 268;
                              ((ad) this).field_y = 474;
                              ((ad) this).field_s = true;
                              ((ad) this).field_t = 290;
                              ((ad) this).field_b = kl.field_d[53];
                              ((ad) this).field_q = 452;
                              ((ad) this).field_o = kl.field_d[52];
                              if (param0) {
                                break L88;
                              } else {
                                ((ad) this).field_A.a(29518, -2);
                                break L88;
                              }
                            }
                            L89: {
                              if (param0) {
                                break L89;
                              } else {
                                ((ad) this).field_A.a(param1 + 12421, -1);
                                break L89;
                              }
                            }
                            L90: {
                              if (!param0) {
                                ((ad) this).field_A.a(-1, kl.field_d[54], -108);
                                break L90;
                              } else {
                                break L90;
                              }
                            }
                            ((ad) this).field_a = false;
                            if (var5 == 0) {
                              break L0;
                            } else {
                              break L58;
                            }
                          }
                          L91: {
                            ((ad) this).field_b = kl.field_d[56];
                            ((ad) this).field_o = kl.field_d[55];
                            ((ad) this).field_r = 4;
                            ((ad) this).field_C = 3;
                            if (param0) {
                              break L91;
                            } else {
                              ((ad) this).field_A.a(29518, -2);
                              break L91;
                            }
                          }
                          L92: {
                            if (param0) {
                              break L92;
                            } else {
                              ((ad) this).field_A.a(param1 + 12421, -1);
                              break L92;
                            }
                          }
                          L93: {
                            if (!param0) {
                              ((ad) this).field_A.a(-2, kl.field_d[57], -79);
                              break L93;
                            } else {
                              break L93;
                            }
                          }
                          ((ad) this).field_a = false;
                          if (var5 == 0) {
                            break L0;
                          } else {
                            break L57;
                          }
                        }
                        L94: {
                          ((ad) this).field_b = kl.field_d[59];
                          ((ad) this).field_o = kl.field_d[58];
                          ((ad) this).field_C = 3;
                          ((ad) this).field_r = 4;
                          if (og.field_d <= 0) {
                            break L94;
                          } else {
                            ((ad) this).field_r = ql.field_i;
                            ((ad) this).field_C = ld.field_e;
                            break L94;
                          }
                        }
                        L95: {
                          if (!param0) {
                            ((ad) this).field_A.a(29518, -2);
                            break L95;
                          } else {
                            break L95;
                          }
                        }
                        L96: {
                          if (!param0) {
                            ((ad) this).field_A.a(29518, -1);
                            break L96;
                          } else {
                            break L96;
                          }
                        }
                        L97: {
                          if (param0) {
                            break L97;
                          } else {
                            ((ad) this).field_A.a(-1, kl.field_d[60], param1 ^ -17095);
                            break L97;
                          }
                        }
                        ((ad) this).field_a = false;
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L56;
                        }
                      }
                      L98: {
                        ((ad) this).field_o = "";
                        if (!param0) {
                          ((ad) this).field_A.a(29518, -2);
                          break L98;
                        } else {
                          break L98;
                        }
                      }
                      L99: {
                        if (param0) {
                          break L99;
                        } else {
                          ((ad) this).field_A.a(29518, -1);
                          break L99;
                        }
                      }
                      L100: {
                        if (!param0) {
                          ((ad) this).field_A.a(-2, kl.field_d[61], -98);
                          break L100;
                        } else {
                          break L100;
                        }
                      }
                      ((ad) this).field_a = false;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L55;
                      }
                    }
                    L101: {
                      ((ad) this).field_b = kl.field_d[63];
                      ((ad) this).field_o = kl.field_d[62];
                      if (param0) {
                        break L101;
                      } else {
                        ((ad) this).field_A.a(param1 ^ 12679, -2);
                        break L101;
                      }
                    }
                    L102: {
                      if (!param0) {
                        ((ad) this).field_A.a(29518, -1);
                        break L102;
                      } else {
                        break L102;
                      }
                    }
                    L103: {
                      if (param0) {
                        break L103;
                      } else {
                        ((ad) this).field_A.a(-1, kl.field_d[64], -110);
                        break L103;
                      }
                    }
                    ((ad) this).field_y = 474;
                    ((ad) this).field_q = 394;
                    ((ad) this).field_s = true;
                    ((ad) this).field_a = false;
                    ((ad) this).field_t = 632;
                    ((ad) this).field_k = 612;
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L54;
                    }
                  }
                  L104: {
                    ((ad) this).field_r = 9;
                    ((ad) this).field_C = 5;
                    ((ad) this).field_b = kl.field_d[66];
                    ((ad) this).field_o = kl.field_d[65];
                    if (!param0) {
                      ((ad) this).field_A.a(29518, -2);
                      break L104;
                    } else {
                      break L104;
                    }
                  }
                  L105: {
                    if (!param0) {
                      ((ad) this).field_A.a(param1 ^ 12679, -1);
                      break L105;
                    } else {
                      break L105;
                    }
                  }
                  L106: {
                    if (!param0) {
                      ((ad) this).field_A.a(-2, kl.field_d[67], -18);
                      break L106;
                    } else {
                      break L106;
                    }
                  }
                  ((ad) this).field_a = false;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L53;
                  }
                }
                L107: {
                  ((ad) this).field_q = 452;
                  ((ad) this).field_t = 234;
                  ((ad) this).field_k = 184;
                  ((ad) this).field_y = 474;
                  ((ad) this).field_s = true;
                  ((ad) this).field_o = kl.field_d[68];
                  ((ad) this).field_b = kl.field_d[69];
                  if (!param0) {
                    ((ad) this).field_A.a(29518, -2);
                    break L107;
                  } else {
                    break L107;
                  }
                }
                L108: {
                  if (!param0) {
                    ((ad) this).field_A.a(param1 + 12421, -1);
                    break L108;
                  } else {
                    break L108;
                  }
                }
                L109: {
                  if (param0) {
                    break L109;
                  } else {
                    ((ad) this).field_A.a(-1, kl.field_d[70], -87);
                    break L109;
                  }
                }
                ((ad) this).field_a = false;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L52;
                }
              }
              L110: {
                ((ad) this).field_o = "";
                if (param0) {
                  break L110;
                } else {
                  ((ad) this).field_A.a(29518, -1);
                  break L110;
                }
              }
              if (param0) {
                break L0;
              } else {
                ((ad) this).field_A.field_C[4].field_C = 0;
                ((ad) this).field_A.field_C[4].field_t = 7;
                ((ad) this).field_A.field_C[4].field_x = 16777088;
                ((ad) this).field_A.field_C[5].field_C = 0;
                ((ad) this).field_A.field_C[5].field_x = 10460976;
                ((ad) this).field_A.field_C[5].field_t = 7;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L51;
                }
              }
            }
            ((ad) this).field_o = "";
            if (var5 == 0) {
              break L0;
            } else {
              break L50;
            }
          }
          ((ad) this).field_o = "";
          if (!param0) {
            L111: {
              ((ad) this).field_A.field_C[0].field_jb = ((ad) this).field_A.field_C[0].field_v;
              var4 = 1;
              ((ad) this).field_A.field_C[var4] = new r(((ad) this).field_A.field_G.field_nb[var4]);
              ((ad) this).field_A.field_C[var4].field_F = 7;
              ((ad) this).field_A.field_C[var4].field_H = 24;
              ((ad) this).field_A.field_C[var4].field_E = 0;
              ((ad) this).field_A.field_C[var4].field_U = 4;
              var3 = ((ad) this).field_A.field_h.a(-41, ((ad) this).field_A.field_C[var4].field_H, ((ad) this).field_A.field_C[var4].field_E, ((ad) this).field_A.field_C[var4].field_F);
              if (null == var3.field_h) {
                break L111;
              } else {
                ((ad) this).field_A.field_C[var4].field_F = ((ad) this).field_A.field_C[var4].field_F + 1;
                var3 = ((ad) this).field_A.field_h.a(param1 + -17164, ((ad) this).field_A.field_C[var4].field_H, ((ad) this).field_A.field_C[var4].field_E, ((ad) this).field_A.field_C[var4].field_F);
                break L111;
              }
            }
            L112: {
              var3.field_h = ((ad) this).field_A.field_C[var4];
              ((ad) this).field_A.field_C[var4].field_c = var3;
              var4 = 2;
              ((ad) this).field_A.field_C[var4] = new r(((ad) this).field_A.field_G.field_nb[var4]);
              ((ad) this).field_A.field_C[var4].field_F = 5;
              ((ad) this).field_A.field_C[var4].field_H = 16;
              ((ad) this).field_A.field_C[var4].field_E = 0;
              ((ad) this).field_A.field_C[var4].field_U = 1;
              var3 = ((ad) this).field_A.field_h.a(123, ((ad) this).field_A.field_C[var4].field_H, ((ad) this).field_A.field_C[var4].field_E, ((ad) this).field_A.field_C[var4].field_F);
              if (null == var3.field_h) {
                break L112;
              } else {
                ((ad) this).field_A.field_C[var4].field_F = ((ad) this).field_A.field_C[var4].field_F + 1;
                var3 = ((ad) this).field_A.field_h.a(param1 ^ -17130, ((ad) this).field_A.field_C[var4].field_H, ((ad) this).field_A.field_C[var4].field_E, ((ad) this).field_A.field_C[var4].field_F);
                break L112;
              }
            }
            L113: {
              var3.field_h = ((ad) this).field_A.field_C[var4];
              ((ad) this).field_A.field_C[var4].field_c = var3;
              var4 = 3;
              ((ad) this).field_A.field_C[var4] = new r(((ad) this).field_A.field_G.field_nb[var4]);
              ((ad) this).field_A.field_C[var4].field_F = 6;
              ((ad) this).field_A.field_C[var4].field_H = 17;
              ((ad) this).field_A.field_C[var4].field_E = 0;
              ((ad) this).field_A.field_C[var4].field_U = 2;
              var3 = ((ad) this).field_A.field_h.a(90, ((ad) this).field_A.field_C[var4].field_H, ((ad) this).field_A.field_C[var4].field_E, ((ad) this).field_A.field_C[var4].field_F);
              if (null == var3.field_h) {
                break L113;
              } else {
                ((ad) this).field_A.field_C[var4].field_F = ((ad) this).field_A.field_C[var4].field_F + 1;
                var3 = ((ad) this).field_A.field_h.a(84, ((ad) this).field_A.field_C[var4].field_H, ((ad) this).field_A.field_C[var4].field_E, ((ad) this).field_A.field_C[var4].field_F);
                break L113;
              }
            }
            var3.field_h = ((ad) this).field_A.field_C[var4];
            ((ad) this).field_A.field_C[var4].field_c = var3;
            break L0;
          } else {
            break L0;
          }
        }
        L114: {
          if (param1 == 17097) {
            break L114;
          } else {
            this.a(124);
            break L114;
          }
        }
        L115: {
          if (param0) {
            ((ad) this).field_v = -1;
            ((ad) this).field_a = true;
            break L115;
          } else {
            break L115;
          }
        }
    }

    ad(int param0) {
        try {
            ((ad) this).field_w = -255;
            ((ad) this).field_d = 0;
            ((ad) this).field_B = 0;
            ((ad) this).field_l = 0;
            ((ad) this).field_j = 0;
            ((ad) this).field_p = param0;
            this.a(false, 17097);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ad.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
        field_m = new byte[520];
    }
}
