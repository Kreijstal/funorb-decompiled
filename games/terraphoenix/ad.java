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
            jb stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            jb stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == -3109) {
                    break L1;
                  } else {
                    ad.b((byte) -71);
                    break L1;
                  }
                }
                stackOut_2_0 = (jb) Class.forName("ii").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 > 68) {
            break L0;
          } else {
            field_h = -126;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (95 == param1) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        r var4_ref_r = null;
        int var5 = 0;
        int var6 = 0;
        r var7 = null;
        int stackIn_247_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_245_0 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          if (((ad) this).field_p != 0) {
            break L0;
          } else {
            if (((ad) this).field_w == 0) {
              L1: {
                var2 = (((ad) this).field_A.field_q.field_F + -((ad) this).field_A.field_q.field_H) * 32;
                var3 = -(((ad) this).field_A.field_q.field_E * 48) + 16 * (((ad) this).field_A.field_q.field_H + ((ad) this).field_A.field_q.field_F);
                if (((ad) this).field_l == ((ad) this).field_d) {
                  if (((ad) this).field_d != ((ad) this).field_l) {
                    break L1;
                  } else {
                    if (2 != ((ad) this).field_d) {
                      break L1;
                    } else {
                      if (Math.abs(sj.field_b + -var2) + Math.abs(-var3 + lg.field_c) != 0) {
                        break L1;
                      } else {
                        ((ad) this).field_B = 3;
                        ((ad) this).field_w = 5;
                        break L1;
                      }
                    }
                  }
                } else {
                  if (((ad) this).field_d != ((ad) this).field_l) {
                    break L1;
                  } else {
                    if (2 != ((ad) this).field_d) {
                      break L1;
                    } else {
                      if (Math.abs(sj.field_b + -var2) + Math.abs(-var3 + lg.field_c) != 0) {
                        break L1;
                      } else {
                        ((ad) this).field_B = 3;
                        ((ad) this).field_w = 5;
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L2;
                } else {
                  L3: {
                    if (((ad) this).field_d == 3) {
                      break L3;
                    } else {
                      if (((ad) this).field_d != 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (0 >= og.field_d) {
                    break L2;
                  } else {
                    ((ad) this).field_w = 5;
                    ((ad) this).field_B = 4;
                    break L2;
                  }
                }
              }
              L4: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L4;
                } else {
                  if (((ad) this).field_d > 4) {
                    break L4;
                  } else {
                    L5: {
                      if (3 != ((ad) this).field_A.field_q.field_F) {
                        break L5;
                      } else {
                        if (((ad) this).field_A.field_q.field_H != 4) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((ad) this).field_B = 5;
                    ((ad) this).field_w = 5;
                    break L4;
                  }
                }
              }
              L6: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L6;
                } else {
                  if (((ad) this).field_d > 5) {
                    break L6;
                  } else {
                    L7: {
                      if (((ad) this).field_A.field_q.field_F > 7) {
                        break L7;
                      } else {
                        if (7 < ((ad) this).field_A.field_q.field_H) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ((ad) this).field_B = 6;
                    ((ad) this).field_w = 5;
                    break L6;
                  }
                }
              }
              L8: {
                if (((ad) this).field_d >= 6) {
                  break L8;
                } else {
                  if (((ad) this).field_A.field_q.field_v / 2 < ((ad) this).field_A.field_q.field_jb) {
                    break L8;
                  } else {
                    ((ad) this).field_A.a(29518, -1);
                    ((ad) this).field_A.a(param0 + 29518, -2);
                    ((ad) this).field_B = 6;
                    ((ad) this).field_w = 5;
                    break L8;
                  }
                }
              }
              L9: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L9;
                } else {
                  if (((ad) this).field_d != 6) {
                    break L9;
                  } else {
                    if (((ad) this).field_A.field_q.field_v * 3 / 4 < ((ad) this).field_A.field_q.field_jb) {
                      ((ad) this).field_B = 7;
                      ((ad) this).field_w = 5;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L10: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L10;
                } else {
                  if (((ad) this).field_d > 7) {
                    break L10;
                  } else {
                    if (((ad) this).field_A.field_q.field_E > 0) {
                      ((ad) this).field_B = 8;
                      ((ad) this).field_w = 5;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              L11: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L11;
                } else {
                  if (8 <= ((ad) this).field_d) {
                    break L11;
                  } else {
                    if (0 != ((ad) this).field_A.field_q.field_E) {
                      break L11;
                    } else {
                      if (((ad) this).field_A.field_q.field_H < 9) {
                        break L11;
                      } else {
                        if (((ad) this).field_A.field_q.field_F <= 8) {
                          ((ad) this).field_B = 9;
                          ((ad) this).field_w = 5;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
              }
              L12: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L12;
                } else {
                  if (((ad) this).field_d != 8) {
                    break L12;
                  } else {
                    if (0 == ((ad) this).field_A.field_q.field_E) {
                      ((ad) this).field_B = 9;
                      ((ad) this).field_w = 5;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L13: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L13;
                } else {
                  if (((ad) this).field_d > 12) {
                    break L13;
                  } else {
                    if (((ad) this).field_A.field_q != ((ad) this).field_A.field_C[0]) {
                      ((ad) this).field_B = 13;
                      ((ad) this).field_w = 5;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              L14: {
                if (((ad) this).field_d == ((ad) this).field_l) {
                  if (((ad) this).field_l != ((ad) this).field_d) {
                    break L14;
                  } else {
                    if (((ad) this).field_d > 14) {
                      break L14;
                    } else {
                      if (((ad) this).field_A.field_C[6].field_P > 0) {
                        break L14;
                      } else {
                        if (0 < ((ad) this).field_A.field_C[7].field_P) {
                          break L14;
                        } else {
                          ((ad) this).field_B = 15;
                          ((ad) this).field_w = 5;
                          break L14;
                        }
                      }
                    }
                  }
                } else {
                  if (((ad) this).field_l != ((ad) this).field_d) {
                    break L14;
                  } else {
                    if (((ad) this).field_d > 14) {
                      break L14;
                    } else {
                      if (((ad) this).field_A.field_C[6].field_P > 0) {
                        break L14;
                      } else {
                        if (0 < ((ad) this).field_A.field_C[7].field_P) {
                          break L14;
                        } else {
                          ((ad) this).field_B = 15;
                          ((ad) this).field_w = 5;
                          break L14;
                        }
                      }
                    }
                  }
                }
              }
              L15: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L15;
                } else {
                  if (((ad) this).field_d != 15) {
                    break L15;
                  } else {
                    L16: {
                      if (((ad) this).field_A.field_q.field_B == 0) {
                        break L16;
                      } else {
                        if (((ad) this).field_A.field_C[8].field_P <= 0) {
                          break L16;
                        } else {
                          if (((ad) this).field_A.field_C[9].field_P > 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    ((ad) this).field_B = 16;
                    ((ad) this).field_w = 5;
                    break L15;
                  }
                }
              }
              L17: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L17;
                } else {
                  if (16 < ((ad) this).field_d) {
                    break L17;
                  } else {
                    L18: {
                      if (((ad) this).field_A.field_C[8].field_P <= 0) {
                        break L18;
                      } else {
                        if (((ad) this).field_A.field_C[9].field_P <= 0) {
                          break L18;
                        } else {
                          break L17;
                        }
                      }
                    }
                    ((ad) this).field_w = 5;
                    ((ad) this).field_B = 17;
                    break L17;
                  }
                }
              }
              L19: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L19;
                } else {
                  L20: {
                    if (9 == ((ad) this).field_l) {
                      break L20;
                    } else {
                      if (((ad) this).field_l != 10) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    var4_ref_r = ((ad) this).field_A.field_C[4];
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (var4_ref_r.field_S) {
                      break L21;
                    } else {
                      var4_ref_r.field_d = 2;
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_S = true;
                      var4_ref_r.field_A = 0;
                      var4_ref_r.field_X = 32;
                      var4_ref_r.field_n = 16;
                      break L21;
                    }
                  }
                  L22: {
                    var4_ref_r.field_B = 0;
                    var4_ref_r.field_nb.field_c = 20;
                    var4_ref_r = ((ad) this).field_A.field_C[5];
                    if (var4_ref_r.field_S) {
                      break L22;
                    } else {
                      var4_ref_r.field_d = 2;
                      var4_ref_r.field_n = 28;
                      var4_ref_r.field_S = true;
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_X = 33;
                      var4_ref_r.field_A = 0;
                      break L22;
                    }
                  }
                  var4_ref_r.field_nb.field_c = 20;
                  var4_ref_r.field_jb = var4_ref_r.field_v;
                  break L19;
                }
              }
              L23: {
                if (((ad) this).field_l != ((ad) this).field_d) {
                  break L23;
                } else {
                  if (((ad) this).field_d > 17) {
                    break L23;
                  } else {
                    if (0 < ((ad) this).field_A.field_C[8].field_P) {
                      break L23;
                    } else {
                      if (((ad) this).field_A.field_C[9].field_P <= 0) {
                        ((ad) this).field_B = 18;
                        ((ad) this).field_w = 5;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
              }
              L24: {
                if (((ad) this).field_d != ((ad) this).field_l) {
                  break L24;
                } else {
                  if (((ad) this).field_l == 10) {
                    L25: {
                      var4_ref_r = ((ad) this).field_A.field_C[6];
                      if (var4_ref_r.field_S) {
                        break L25;
                      } else {
                        if (0 >= ((ad) this).field_A.field_C[5].field_P) {
                          break L25;
                        } else {
                          var4_ref_r.field_S = true;
                          var4_ref_r.field_A = 0;
                          var4_ref_r.field_X = 19;
                          var4_ref_r.field_n = 20;
                          var4_ref_r.field_N = 0;
                          var4_ref_r.field_d = 2;
                          break L25;
                        }
                      }
                    }
                    L26: {
                      var4_ref_r.field_jb = var4_ref_r.field_v;
                      var4_ref_r.field_nb.field_c = 20;
                      var4_ref_r = ((ad) this).field_A.field_C[7];
                      if (var4_ref_r.field_S) {
                        break L26;
                      } else {
                        if (((ad) this).field_A.field_C[4].field_P <= 0) {
                          break L26;
                        } else {
                          var4_ref_r.field_N = 0;
                          var4_ref_r.field_A = 0;
                          var4_ref_r.field_n = 16;
                          var4_ref_r.field_S = true;
                          var4_ref_r.field_X = 20;
                          var4_ref_r.field_d = 2;
                          break L26;
                        }
                      }
                    }
                    var4_ref_r.field_nb.field_c = 20;
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (((ad) this).field_A.field_C[4].field_P > 0) {
                      break L24;
                    } else {
                      if (0 >= ((ad) this).field_A.field_C[5].field_P) {
                        ((ad) this).field_B = ((ad) this).field_l - -1;
                        ((ad) this).field_l = ((ad) this).field_B;
                        ((ad) this).field_d = ((ad) this).field_l;
                        this.a(false, 17097);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  } else {
                    break L24;
                  }
                }
              }
              if (((ad) this).field_l != ((ad) this).field_d) {
                break L0;
              } else {
                if (((ad) this).field_l == 11) {
                  L27: {
                    var4_ref_r = ((ad) this).field_A.field_C[6];
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (var4_ref_r.field_S) {
                      break L27;
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
                        break L27;
                      } else {
                        if (var4_ref_r.field_H != var4_ref_r.field_n) {
                          break L27;
                        } else {
                          var4_ref_r.field_S = false;
                          break L27;
                        }
                      }
                    }
                  }
                  L28: {
                    var7 = ((ad) this).field_A.field_C[7];
                    var4_ref_r = var7;
                    var4_ref_r.field_jb = var4_ref_r.field_v;
                    if (var4_ref_r.field_S) {
                      break L28;
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
                      if (var4_ref_r.field_X != var4_ref_r.field_F) {
                        break L28;
                      } else {
                        if (var4_ref_r.field_n == var4_ref_r.field_H) {
                          var7.field_S = false;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                  var4_ref_r = ((ad) this).field_A.field_C[1];
                  var4_ref_r.field_jb = var4_ref_r.field_v;
                  if (var4_ref_r.field_S) {
                    break L0;
                  } else {
                    L29: {
                      var4_ref_r.field_n = 19;
                      var4_ref_r.field_jb = 3 * var4_ref_r.field_jb / 2;
                      var4_ref_r.field_N = 0;
                      var4_ref_r.field_X = 5;
                      var4_ref_r.field_B = 0;
                      var4_ref_r.field_r = null;
                      var4_ref_r.field_S = true;
                      var4_ref_r.field_d = var4_ref_r.field_B;
                      var4_ref_r.field_A = 0;
                      if (var4_ref_r.field_X != var4_ref_r.field_F) {
                        break L29;
                      } else {
                        if (var4_ref_r.field_n == var4_ref_r.field_H) {
                          var4_ref_r.field_S = false;
                          break L29;
                        } else {
                          break L29;
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
        L30: {
          ((ad) this).field_j = ((ad) this).field_j + 1;
          if (((ad) this).field_j > 10) {
            ((ad) this).field_j = 0;
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = param0;
          var3 = 260;
          var4 = 40;
          if (1 != ((ad) this).field_p) {
            break L31;
          } else {
            var2 = 640 + -wh.field_e.field_r;
            var4 = 77;
            break L31;
          }
        }
        L32: {
          if (((ad) this).field_p != 2) {
            break L32;
          } else {
            var2 = -wh.field_e.field_r + 640;
            var4 = 53;
            break L32;
          }
        }
        L33: {
          var5 = og.field_f.field_s * (og.field_f.c(((ad) this).field_b, var3) + 1) + 32;
          if (((ad) this).field_o != "") {
            if (((ad) this).field_a) {
              if (((ad) this).field_w != 0) {
                break L33;
              } else {
                if (((ad) this).field_z != 1) {
                  break L33;
                } else {
                  if (((ad) this).field_g < var2) {
                    break L33;
                  } else {
                    if (wh.field_e.field_r + var2 <= ((ad) this).field_g) {
                      break L33;
                    } else {
                      if (((ad) this).field_c < var5 - -var4) {
                        break L33;
                      } else {
                        if (wh.field_e.field_t + var5 - -var4 > ((ad) this).field_c) {
                          ((ad) this).field_B = 1 + ((ad) this).field_l;
                          ((ad) this).field_w = 5;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L34: {
                if (0 == ((ad) this).field_p) {
                  if (((ad) this).field_w != 0) {
                    break L34;
                  } else {
                    if (((ad) this).field_z != 1) {
                      break L34;
                    } else {
                      if (((ad) this).field_g < var2) {
                        break L34;
                      } else {
                        if (qh.field_b.field_r + var2 <= ((ad) this).field_g) {
                          break L34;
                        } else {
                          if (((ad) this).field_c < var4 + var5) {
                            break L34;
                          } else {
                            if (var5 + var4 + qh.field_b.field_t <= ((ad) this).field_c) {
                              break L34;
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
                  break L34;
                }
              }
              if (((ad) this).field_A != null) {
                break L33;
              } else {
                if (((ad) this).field_s) {
                  if (((ad) this).field_k > ((ad) this).field_g) {
                    break L33;
                  } else {
                    if (((ad) this).field_t < ((ad) this).field_g) {
                      break L33;
                    } else {
                      if (((ad) this).field_q > ((ad) this).field_c) {
                        break L33;
                      } else {
                        if (((ad) this).field_y < ((ad) this).field_c) {
                          break L33;
                        } else {
                          if (((ad) this).field_w == 0) {
                            if (1 == ((ad) this).field_z) {
                              L35: {
                                ((ad) this).field_w = 5;
                                if (((ad) this).field_l == 4) {
                                  if (((ad) this).field_p == 1) {
                                    ((ad) this).field_i.field_hb = 1;
                                    ((ad) this).field_B = 1 + ((ad) this).field_l;
                                    if (((ad) this).field_l != 2) {
                                      break L35;
                                    } else {
                                      if (3 != ((ad) this).field_p) {
                                        break L35;
                                      } else {
                                        ((ad) this).field_i.field_D = 6;
                                        break L35;
                                      }
                                    }
                                  } else {
                                    ((ad) this).field_B = 1 + ((ad) this).field_l;
                                    if (((ad) this).field_l != 2) {
                                      break L35;
                                    } else {
                                      if (3 != ((ad) this).field_p) {
                                        break L35;
                                      } else {
                                        ((ad) this).field_i.field_D = 6;
                                        break L35;
                                      }
                                    }
                                  }
                                } else {
                                  ((ad) this).field_B = 1 + ((ad) this).field_l;
                                  if (((ad) this).field_l != 2) {
                                    break L35;
                                  } else {
                                    if (3 != ((ad) this).field_p) {
                                      break L35;
                                    } else {
                                      ((ad) this).field_i.field_D = 6;
                                      break L35;
                                    }
                                  }
                                }
                              }
                              if (((ad) this).field_l == 1) {
                                if (((ad) this).field_p == 2) {
                                  ((ad) this).field_i.field_hb = 4;
                                  return true;
                                } else {
                                  return true;
                                }
                              } else {
                                return true;
                              }
                            } else {
                              return true;
                            }
                          } else {
                            break L33;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L33;
                }
              }
            }
          } else {
            break L33;
          }
        }
        L36: {
          L37: {
            if (((ad) this).field_w >= 0) {
              break L37;
            } else {
              ((ad) this).field_w = ((ad) this).field_w + 15;
              if (((ad) this).field_w <= 0) {
                break L36;
              } else {
                ((ad) this).field_w = 0;
                if (var6 == 0) {
                  break L36;
                } else {
                  break L37;
                }
              }
            }
          }
          L38: {
            if (0 < ((ad) this).field_w) {
              break L38;
            } else {
              if (((ad) this).field_B != ((ad) this).field_l) {
                ((ad) this).field_w = 5;
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
          ((ad) this).field_w = ((ad) this).field_w + 15;
          if (255 >= ((ad) this).field_w) {
            break L36;
          } else {
            L39: {
              ((ad) this).field_l = ((ad) this).field_B;
              ((ad) this).field_w = -255;
              if (((ad) this).field_d > ((ad) this).field_l) {
                break L39;
              } else {
                L40: {
                  if (((ad) this).field_d >= ((ad) this).field_l) {
                    break L40;
                  } else {
                    ((ad) this).field_d = ((ad) this).field_l;
                    break L40;
                  }
                }
                this.a(false, param0 ^ 17097);
                if (var6 == 0) {
                  break L36;
                } else {
                  break L39;
                }
              }
            }
            this.a(87);
            break L36;
          }
        }
        L41: {
          if (0 != ((ad) this).field_p) {
            break L41;
          } else {
            if (((ad) this).field_l != 19) {
              break L41;
            } else {
              le.field_q = null;
              ((ad) this).field_A.a(((ad) this).field_A.field_G, (byte) 122);
              ((ad) this).field_A.field_C[9].field_jb = ((ad) this).field_A.field_C[9].field_v;
              ((ad) this).field_A.field_C[10].field_jb = 2 * ((ad) this).field_A.field_C[10].field_v;
              ((ad) this).field_A.field_C[11].field_jb = ((ad) this).field_A.field_C[11].field_v;
              break L41;
            }
          }
        }
        L42: {
          if (1 != ((ad) this).field_p) {
            break L42;
          } else {
            if (((ad) this).field_l != 11) {
              break L42;
            } else {
              ((ad) this).field_i.field_wb = null;
              break L42;
            }
          }
        }
        L43: {
          if (2 != ((ad) this).field_p) {
            break L43;
          } else {
            if (((ad) this).field_l != 6) {
              break L43;
            } else {
              ((ad) this).field_i.field_wb = null;
              break L43;
            }
          }
        }
        if (!((ad) this).field_n) {
          L44: {
            var5 += 16;
            if (0 != ((ad) this).field_p) {
              break L44;
            } else {
              if (((ad) this).field_l != ((ad) this).field_d) {
                break L44;
              } else {
                if (0 == ((ad) this).field_d) {
                  return false;
                } else {
                  break L44;
                }
              }
            }
          }
          if (null == ((ad) this).field_A) {
            return false;
          } else {
            L45: {
              if (((ad) this).field_p == 0) {
                if (((ad) this).field_g < 0) {
                  break L45;
                } else {
                  if (var3 + 12 < ((ad) this).field_g) {
                    break L45;
                  } else {
                    if (var4 > ((ad) this).field_c) {
                      break L45;
                    } else {
                      if (((ad) this).field_c > var5 - -var4) {
                        break L45;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              } else {
                if (-12 + -var3 + 640 > ((ad) this).field_g) {
                  break L45;
                } else {
                  if (((ad) this).field_g > 640) {
                    break L45;
                  } else {
                    if (var4 > ((ad) this).field_c) {
                      break L45;
                    } else {
                      if (((ad) this).field_c <= var4 + var5) {
                        return false;
                      } else {
                        break L45;
                      }
                    }
                  }
                }
              }
            }
            var2 = -aa.field_j.field_r + 534;
            if (!((ad) this).field_a) {
              if (((ad) this).field_g >= var2) {
                if (((ad) this).field_g <= wh.field_e.field_r + var2) {
                  if (((ad) this).field_c >= var5 + -16) {
                    L46: {
                      if (((ad) this).field_c <= -16 + var5 + wh.field_e.field_t) {
                        stackOut_246_0 = 0;
                        stackIn_247_0 = stackOut_246_0;
                        break L46;
                      } else {
                        stackOut_245_0 = 1;
                        stackIn_247_0 = stackOut_245_0;
                        break L46;
                      }
                    }
                    return stackIn_247_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    public static void b(byte param0) {
        field_u = null;
        field_m = null;
        field_e = null;
        field_x = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        l.d(0, 0, l.field_k, l.field_j, 0, 192);
        if (Terraphoenix.field_V != 0) {
            l.a();
        }
        oi.a(-22417, true);
        if (param1 != 0) {
            ad.a(30, -91);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Terraphoenix.field_V;
          if (((ad) this).field_A == null) {
            break L0;
          } else {
            if (((ad) this).field_A.field_J) {
              break L0;
            } else {
              return;
            }
          }
        }
        if (((ad) this).field_n) {
          return;
        } else {
          L1: {
            if (param0 == -100) {
              break L1;
            } else {
              boolean discarded$3 = ((ad) this).b(120);
              break L1;
            }
          }
          L2: {
            var2 = 40;
            if (((ad) this).field_p == 1) {
              var2 = 77;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((ad) this).field_p == 2) {
              var2 = 53;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((ad) this).field_l != 0) {
              break L4;
            } else {
              if (((ad) this).field_d != 0) {
                break L4;
              } else {
                L5: {
                  if (((ad) this).field_w >= 0) {
                    break L5;
                  } else {
                    l.d(0, var2, 640, 480 + -var2, 0, 128);
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                l.d(0, var2, 640, 480 + -var2, 0, 255 + -((128 + ((ad) this).field_w) / 2));
                break L4;
              }
            }
          }
          L6: {
            if (34 == ((ad) this).field_l) {
              lg.field_c = (9 * lg.field_c - -768) / 10;
              sj.field_b = (-488 + 9 * sj.field_b) / 10;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            L8: {
              if (((ad) this).field_l == 35) {
                break L8;
              } else {
                if (38 != ((ad) this).field_l) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            sj.field_b = (sj.field_b * 9 + -496) / 10;
            lg.field_c = (lg.field_c * 9 + 896) / 10;
            break L7;
          }
          L9: {
            if (((ad) this).field_o != "") {
              L10: {
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
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                L12: {
                  var3 = og.field_f.field_s * (og.field_f.c(((ad) this).field_b, var4) + 1) + 32;
                  if (0 != ((ad) this).field_p) {
                    break L12;
                  } else {
                    l.d(3, var2 + 3, 6 + var4, var3 - 6, 0, 192);
                    if (var9 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                l.d(643 - (var4 - -12), var2 + 3, 6 + var4, var3 + -6, 0, 192);
                break L11;
              }
              L13: {
                L14: {
                  if (((ad) this).field_p == 0) {
                    break L14;
                  } else {
                    jl.a(jc.field_G, var3, var2, 12 + var4, (byte) -127, -var4 + 628);
                    if (var9 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                jl.a(jc.field_G, var3, var2, 12 + var4, (byte) -121, 0);
                break L13;
              }
              L15: {
                L16: {
                  if (((ad) this).field_p == 0) {
                    break L16;
                  } else {
                    og.field_f.b(((ad) this).field_o, 32 + (-var4 + 640), var2 + 16, 16777215, -1);
                    if (var9 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                og.field_f.b(((ad) this).field_o, 32, var2 + 16, 16777215, -1);
                break L15;
              }
              L17: {
                L18: {
                  if (((ad) this).field_p == 0) {
                    break L18;
                  } else {
                    int discarded$4 = ji.a(-6 + (-var4 + 640), og.field_f.field_s, 16777215, og.field_f.field_s + (var2 - -33), ((ad) this).field_b, (byte) 98, 637);
                    if (var9 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                int discarded$5 = ji.a(6, og.field_f.field_s, 16777215, og.field_f.field_s + (var2 - -32), ((ad) this).field_b, (byte) 90, var4);
                break L17;
              }
              L19: {
                var6 = ((ad) this).field_l;
                if (var6 <= 9) {
                  break L19;
                } else {
                  var6 -= 3;
                  break L19;
                }
              }
              L20: {
                L21: {
                  var7 = ((ad) this).field_d;
                  if (((ad) this).field_p == 0) {
                    break L21;
                  } else {
                    L22: {
                      if (((ad) this).field_w > 0) {
                        l.d(640 + (-var4 - 12) + 3, var2 - -3, 12 + (-6 + var4), var3 - 6, 0, ((ad) this).field_w);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    if (((ad) this).field_w >= 0) {
                      break L20;
                    } else {
                      l.d(-var4 + 631, var2 - -3, var4 + 6, var3 + -6, 16711680, -((ad) this).field_w);
                      if (var9 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
                L23: {
                  if (0 < ((ad) this).field_w) {
                    l.d(3, var2 - -3, 6 + var4, -6 + var3, 0, ((ad) this).field_w);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                if (((ad) this).field_w < 0) {
                  l.d(3, 3 + var2, 12 + (var4 - 6), var3 + -6, 16711680, -((ad) this).field_w);
                  break L20;
                } else {
                  break L20;
                }
              }
              L24: {
                var5 = 0;
                if (var7 <= 9) {
                  break L24;
                } else {
                  var7 -= 3;
                  break L24;
                }
              }
              L25: {
                if (0 >= ((ad) this).field_p) {
                  break L25;
                } else {
                  var5 = 640 - wh.field_e.field_r;
                  break L25;
                }
              }
              L26: {
                if (((ad) this).field_a) {
                  break L26;
                } else {
                  if (((ad) this).field_p != 0) {
                    break L9;
                  } else {
                    qh.field_b.b(var5, var2 + var3);
                    if (~var5 < ~((ad) this).field_g) {
                      break L9;
                    } else {
                      if (~(qh.field_b.field_r + var5) >= ~((ad) this).field_g) {
                        break L9;
                      } else {
                        if (var3 - -var2 > ((ad) this).field_c) {
                          break L9;
                        } else {
                          if (qh.field_b.field_t + var3 + var2 > ((ad) this).field_c) {
                            l.d(var5, var3 + var2, qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
                            if (var9 == 0) {
                              break L9;
                            } else {
                              break L26;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L27: {
                aa.field_j.b(var5, var3 - -var2);
                if (~((ad) this).field_g > ~var5) {
                  break L27;
                } else {
                  if (((ad) this).field_g >= wh.field_e.field_r + var5) {
                    break L27;
                  } else {
                    if (~(var3 - -var2) < ~((ad) this).field_c) {
                      break L27;
                    } else {
                      if (~((ad) this).field_c <= ~(wh.field_e.field_t + (var3 - -var2))) {
                        break L27;
                      } else {
                        l.d(var5, var3 - -var2, wh.field_e.field_r, wh.field_e.field_t, 16777215, 128);
                        break L27;
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
                break L9;
              } else {
                break L9;
              }
            } else {
              break L9;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Terraphoenix.field_V;
            var2 = 0;
            var3 = kf.field_f;
            if (var3 >= 90) {
              break L1;
            } else {
              var2 = var3 * var3 * 8192 / 1100;
              if (var6 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (var3 < 105) {
              break L2;
            } else {
              if (var3 < 120) {
                var3 = -var3 + 120;
                var2 = -(8192 * var3 * var3 / 3300) + 8192;
                if (var6 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              } else {
                break L0;
              }
            }
          }
          var2 = (-40960 + 16384 * var3) / 220;
          break L0;
        }
        L3: {
          var4 = 1;
          var5 = 0;
          if (param0 != 3) {
            break L3;
          } else {
            var4 = -1;
            break L3;
          }
        }
        L4: {
          if (1 == param0) {
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 == 5) {
            var4 = -1;
            var5 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (param0 == 6) {
            var5 = -1;
            var4 = 1;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            if (param0 == 7) {
              break L9;
            } else {
              if (param0 != 8) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          var4 = -1;
          var5 = -1;
          break L8;
        }
        L10: {
          if (11 != param0) {
            break L10;
          } else {
            var4 = -1;
            break L10;
          }
        }
        L11: {
          if (param0 != 12) {
            break L11;
          } else {
            var5 = -1;
            var4 = -1;
            break L11;
          }
        }
        L12: {
          if (param0 != 13) {
            break L12;
          } else {
            var5 = -1;
            var4 = 1;
            break L12;
          }
        }
        L13: {
          if (param0 != 14) {
            break L13;
          } else {
            var5 = 1;
            var4 = -1;
            break L13;
          }
        }
        L14: {
          if (param0 != 15) {
            break L14;
          } else {
            var5 = 1;
            var4 = 1;
            break L14;
          }
        }
        ld.field_a = jb.a(var5 * var2, var2 * var4, 0);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        r var4 = null;
        L0: {
          if (!param0) {
            break L0;
          } else {
            boolean discarded$1 = ((ad) this).b(117);
            break L0;
          }
        }
        L1: {
          if (((ad) this).field_l != ((ad) this).field_d) {
            break L1;
          } else {
            if (9 == ((ad) this).field_l) {
              var2 = 134;
              var3 = 664;
              sj.field_b = (var2 + sj.field_b * 9) / 10;
              lg.field_c = (var3 + lg.field_c * 9) / 10;
              if (Math.abs(-var2 + sj.field_b) - -Math.abs(lg.field_c - var3) >= 32) {
                break L1;
              } else {
                ((ad) this).field_B = 1 + ((ad) this).field_l;
                ((ad) this).field_l = ((ad) this).field_B;
                ((ad) this).field_d = ((ad) this).field_l;
                this.a(false, 17097);
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((ad) this).field_l != ((ad) this).field_d) {
            break L2;
          } else {
            if (((ad) this).field_l == 11) {
              var4 = ((ad) this).field_A.field_C[1];
              var2 = 32 * (-var4.field_H + var4.field_F);
              var4.field_jb = var4.field_v;
              var3 = (var4.field_H + var4.field_F) * 16 - 48 * var4.field_E;
              lg.field_c = (var3 + lg.field_c * 9) / 10;
              sj.field_b = (var2 + 9 * sj.field_b) / 10;
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    final void c(byte param0) {
        dl var2 = null;
        int var3 = 0;
        dl var4 = null;
        L0: {
          if (((ad) this).field_p != 0) {
            break L0;
          } else {
            L1: {
              ((ad) this).field_A.a(29518, -1);
              ((ad) this).field_A.a(29518, -2);
              if (((ad) this).field_l == 0) {
                L2: {
                  ((ad) this).field_A.field_C[0].field_c = null;
                  ((ad) this).field_A.field_C[0].field_H = 18;
                  ((ad) this).field_A.field_C[0].field_F = 3;
                  var2 = ((ad) this).field_A.field_h.a(-66, ((ad) this).field_A.field_C[0].field_H, ((ad) this).field_A.field_C[0].field_E, ((ad) this).field_A.field_C[0].field_F);
                  if (var2.field_h == null) {
                    break L2;
                  } else {
                    ((ad) this).field_A.field_C[0].field_F = ((ad) this).field_A.field_C[0].field_F + 1;
                    var2 = ((ad) this).field_A.field_h.a(-104, ((ad) this).field_A.field_C[0].field_H, ((ad) this).field_A.field_C[0].field_E, ((ad) this).field_A.field_C[0].field_F);
                    break L2;
                  }
                }
                ((ad) this).field_A.field_C[0].field_c = var2;
                var2.field_h = ((ad) this).field_A.field_C[0];
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (9 <= ((ad) this).field_l) {
                break L3;
              } else {
                L4: {
                  ((ad) this).field_A.field_C[4].field_t = 7;
                  var4 = ((ad) this).field_A.field_C[4].field_c;
                  var2 = var4;
                  ((ad) this).field_A.field_C[4].field_C = 0;
                  ((ad) this).field_A.field_C[4].field_P = 0;
                  var2.field_m = 7;
                  if (7 != var2.field_m) {
                    break L4;
                  } else {
                    var2.field_m = 7;
                    break L4;
                  }
                }
                L5: {
                  var2.field_t = 16777088;
                  var4.field_h = null;
                  var2 = ((ad) this).field_A.field_C[5].field_c;
                  ((ad) this).field_A.field_C[5].field_C = 0;
                  ((ad) this).field_A.field_C[5].field_P = 0;
                  ((ad) this).field_A.field_C[5].field_t = 7;
                  var2.field_m = 7;
                  if (7 == var2.field_m) {
                    var2.field_m = 7;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var2.field_t = 10460976;
                var2.field_h = null;
                break L3;
              }
            }
            if (((ad) this).field_l >= 11) {
              break L0;
            } else {
              L6: {
                var3 = 1;
                ((ad) this).field_A.field_C[var3] = new r(((ad) this).field_A.field_G.field_nb[var3]);
                ((ad) this).field_A.field_C[var3].field_F = 7;
                ((ad) this).field_A.field_C[var3].field_H = 24;
                ((ad) this).field_A.field_C[var3].field_E = 0;
                ((ad) this).field_A.field_C[var3].field_U = 4;
                var2 = ((ad) this).field_A.field_h.a(88, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                if (null == var2.field_h) {
                  break L6;
                } else {
                  ((ad) this).field_A.field_C[var3].field_F = ((ad) this).field_A.field_C[var3].field_F + 1;
                  var2 = ((ad) this).field_A.field_h.a(-26, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                  break L6;
                }
              }
              L7: {
                var2.field_h = ((ad) this).field_A.field_C[var3];
                ((ad) this).field_A.field_C[var3].field_c = var2;
                var3 = 2;
                ((ad) this).field_A.field_C[var3] = new r(((ad) this).field_A.field_G.field_nb[var3]);
                ((ad) this).field_A.field_C[var3].field_F = 5;
                ((ad) this).field_A.field_C[var3].field_H = 16;
                ((ad) this).field_A.field_C[var3].field_E = 0;
                ((ad) this).field_A.field_C[var3].field_U = 1;
                var2 = ((ad) this).field_A.field_h.a(-48, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                if (var2.field_h == null) {
                  break L7;
                } else {
                  ((ad) this).field_A.field_C[var3].field_F = ((ad) this).field_A.field_C[var3].field_F + 1;
                  var2 = ((ad) this).field_A.field_h.a(112, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                  break L7;
                }
              }
              L8: {
                var2.field_h = ((ad) this).field_A.field_C[var3];
                ((ad) this).field_A.field_C[var3].field_c = var2;
                var3 = 3;
                ((ad) this).field_A.field_C[var3] = new r(((ad) this).field_A.field_G.field_nb[var3]);
                ((ad) this).field_A.field_C[var3].field_F = 6;
                ((ad) this).field_A.field_C[var3].field_H = 17;
                ((ad) this).field_A.field_C[var3].field_E = 0;
                ((ad) this).field_A.field_C[var3].field_U = 2;
                var2 = ((ad) this).field_A.field_h.a(102, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                if (var2.field_h != null) {
                  ((ad) this).field_A.field_C[var3].field_F = ((ad) this).field_A.field_C[var3].field_F + 1;
                  var2 = ((ad) this).field_A.field_h.a(-30, ((ad) this).field_A.field_C[var3].field_H, ((ad) this).field_A.field_C[var3].field_E, ((ad) this).field_A.field_C[var3].field_F);
                  break L8;
                } else {
                  break L8;
                }
              }
              var2.field_h = ((ad) this).field_A.field_C[var3];
              ((ad) this).field_A.field_C[var3].field_c = var2;
              break L0;
            }
          }
        }
        L9: {
          if (param0 >= 28) {
            break L9;
          } else {
            ad.a(false, 108, true);
            break L9;
          }
        }
    }

    private final void a(int param0) {
        this.a(true, 17097);
        int var2 = 19 % ((param0 - -8) / 48);
        ((ad) this).field_a = true;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((ad) this).field_A != null) {
            if (!((ad) this).field_A.field_J) {
                return;
            }
        }
        if (!(!((ad) this).field_n)) {
            return;
        }
        if (!((ad) this).field_s) {
            if (!(((ad) this).field_v != -1)) {
                var2 = 320 + -sj.field_b + (((ad) this).field_r * 32 - ((ad) this).field_C * 32);
                var3 = -lg.field_c + 16 * ((ad) this).field_C + ((ad) this).field_r * 16 - -240;
                var4 = 1052688 * ((ad) this).field_j - -11513775;
                if (-1 != ((ad) this).field_r) {
                    l.c(var2 + -32, var3, var2, -16 + var3, var4);
                    l.c(var2 + -32, var3, var2, var3 - -16, var4);
                    l.c(32 + var2, var3, var2, var3 + -16, var4);
                    l.c(var2 - -32, var3, var2, 16 + var3, var4);
                }
            }
        }
        if (param0 <= 116) {
            ((ad) this).field_v = 90;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    private final void a(boolean param0, int param1) {
        int var3_int = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        Object stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        Object stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        Object stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        Object stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        Object stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        Object stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        Object stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        Object stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        Object stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        Object stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        Object stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        Object stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        Object stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        Object stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        Object stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        Object stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        Object stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        Object stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        Object stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        Object stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        Object stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        Object stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        Object stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        Object stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        Object stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        Object stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        Object stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        Object stackIn_108_0 = null;
        Object stackIn_109_0 = null;
        Object stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        Object stackIn_112_0 = null;
        Object stackIn_113_0 = null;
        Object stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        Object stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        Object stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        Object stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        Object stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        Object stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        Object stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        Object stackOut_69_0 = null;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        Object stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        Object stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        Object stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        Object stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        Object stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        Object stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        Object stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        Object stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        Object stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        Object stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        Object stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        Object stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        Object stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        Object stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        Object stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        Object stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        Object stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        Object stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        Object stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        Object stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        Object stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        Object stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        Object stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        Object stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        Object stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        Object stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        Object stackOut_107_0 = null;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_111_0 = null;
        Object stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        Object stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        Object stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        Object stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
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
                          stackOut_20_0 = this;
                          stackOut_20_1 = new StringBuilder().append(kl.field_d[1]);
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          if (!param0) {
                            stackOut_22_0 = this;
                            stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                            stackOut_22_2 = kl.field_d[2];
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            stackIn_23_2 = stackOut_22_2;
                            break L14;
                          } else {
                            stackOut_21_0 = this;
                            stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                            stackOut_21_2 = "";
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            stackIn_23_2 = stackOut_21_2;
                            break L14;
                          }
                        }
                        ((ad) this).field_b = stackIn_23_2;
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
                        stackOut_24_0 = this;
                        stackOut_24_1 = new StringBuilder().append(kl.field_d[4]);
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (!param0) {
                          stackOut_26_0 = this;
                          stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                          stackOut_26_2 = kl.field_d[5];
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          stackIn_27_2 = stackOut_26_2;
                          break L15;
                        } else {
                          stackOut_25_0 = this;
                          stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                          stackOut_25_2 = "";
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          stackIn_27_2 = stackOut_25_2;
                          break L15;
                        }
                      }
                      ((ad) this).field_b = stackIn_27_2;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L8;
                      }
                    }
                    L16: {
                      stackOut_28_0 = this;
                      stackOut_28_1 = new StringBuilder().append(kl.field_d[7]);
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      if (!param0) {
                        stackOut_30_0 = this;
                        stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                        stackOut_30_2 = kl.field_d[8];
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        break L16;
                      } else {
                        stackOut_29_0 = this;
                        stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                        stackOut_29_2 = "";
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        break L16;
                      }
                    }
                    ((ad) this).field_b = stackIn_31_2;
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
                    stackOut_32_0 = this;
                    stackOut_32_1 = new StringBuilder().append(kl.field_d[10]);
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    if (!param0) {
                      stackOut_34_0 = this;
                      stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                      stackOut_34_2 = kl.field_d[11];
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      break L17;
                    } else {
                      stackOut_33_0 = this;
                      stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                      stackOut_33_2 = "";
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      stackIn_35_2 = stackOut_33_2;
                      break L17;
                    }
                  }
                  ((ad) this).field_b = stackIn_35_2;
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
                  stackOut_36_0 = this;
                  stackOut_36_1 = new StringBuilder().append(kl.field_d[13]);
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (!param0) {
                    stackOut_38_0 = this;
                    stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                    stackOut_38_2 = kl.field_d[14];
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L18;
                  } else {
                    stackOut_37_0 = this;
                    stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                    stackOut_37_2 = "";
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L18;
                  }
                }
                ((ad) this).field_b = stackIn_39_2;
                ((ad) this).field_s = true;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L5;
                }
              }
              L19: {
                ((ad) this).field_o = kl.field_d[15];
                stackOut_40_0 = this;
                stackOut_40_1 = new StringBuilder().append(kl.field_d[16]);
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                if (!param0) {
                  stackOut_42_0 = this;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = kl.field_d[17];
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  break L19;
                } else {
                  stackOut_41_0 = this;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "";
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  break L19;
                }
              }
              ((ad) this).field_b = stackIn_43_2;
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
                                  stackOut_69_0 = this;
                                  stackIn_71_0 = stackOut_69_0;
                                  stackIn_70_0 = stackOut_69_0;
                                  if (param0) {
                                    stackOut_71_0 = this;
                                    stackOut_71_1 = 0;
                                    stackIn_72_0 = stackOut_71_0;
                                    stackIn_72_1 = stackOut_71_1;
                                    break L37;
                                  } else {
                                    stackOut_70_0 = this;
                                    stackOut_70_1 = 1;
                                    stackIn_72_0 = stackOut_70_0;
                                    stackIn_72_1 = stackOut_70_1;
                                    break L37;
                                  }
                                }
                                L38: {
                                  ((ad) this).field_s = stackIn_72_1 != 0;
                                  ((ad) this).field_k = 540;
                                  stackOut_72_0 = this;
                                  stackOut_72_1 = new StringBuilder().append(kl.field_d[19]);
                                  stackIn_74_0 = stackOut_72_0;
                                  stackIn_74_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (param0) {
                                    stackOut_74_0 = this;
                                    stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                                    stackOut_74_2 = "";
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    stackIn_75_2 = stackOut_74_2;
                                    break L38;
                                  } else {
                                    stackOut_73_0 = this;
                                    stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                                    stackOut_73_2 = kl.field_d[2];
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    stackIn_75_2 = stackOut_73_2;
                                    break L38;
                                  }
                                }
                                ((ad) this).field_b = stackIn_75_2;
                                if (var5 == 0) {
                                  break L0;
                                } else {
                                  break L29;
                                }
                              }
                              L39: {
                                stackOut_76_0 = this;
                                stackOut_76_1 = new StringBuilder().append(kl.field_d[21]);
                                stackIn_78_0 = stackOut_76_0;
                                stackIn_78_1 = stackOut_76_1;
                                stackIn_77_0 = stackOut_76_0;
                                stackIn_77_1 = stackOut_76_1;
                                if (param0) {
                                  stackOut_78_0 = this;
                                  stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
                                  stackOut_78_2 = "";
                                  stackIn_79_0 = stackOut_78_0;
                                  stackIn_79_1 = stackOut_78_1;
                                  stackIn_79_2 = stackOut_78_2;
                                  break L39;
                                } else {
                                  stackOut_77_0 = this;
                                  stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
                                  stackOut_77_2 = kl.field_d[22];
                                  stackIn_79_0 = stackOut_77_0;
                                  stackIn_79_1 = stackOut_77_1;
                                  stackIn_79_2 = stackOut_77_2;
                                  break L39;
                                }
                              }
                              ((ad) this).field_b = stackIn_79_2;
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
                              stackOut_80_0 = this;
                              stackOut_80_1 = new StringBuilder().append(kl.field_d[24]);
                              stackIn_82_0 = stackOut_80_0;
                              stackIn_82_1 = stackOut_80_1;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              if (!param0) {
                                stackOut_82_0 = this;
                                stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
                                stackOut_82_2 = kl.field_d[2];
                                stackIn_83_0 = stackOut_82_0;
                                stackIn_83_1 = stackOut_82_1;
                                stackIn_83_2 = stackOut_82_2;
                                break L40;
                              } else {
                                stackOut_81_0 = this;
                                stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
                                stackOut_81_2 = "";
                                stackIn_83_0 = stackOut_81_0;
                                stackIn_83_1 = stackOut_81_1;
                                stackIn_83_2 = stackOut_81_2;
                                break L40;
                              }
                            }
                            ((ad) this).field_b = stackIn_83_2;
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
                            stackOut_84_0 = this;
                            stackOut_84_1 = new StringBuilder().append(kl.field_d[26]);
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            stackIn_85_0 = stackOut_84_0;
                            stackIn_85_1 = stackOut_84_1;
                            if (param0) {
                              stackOut_86_0 = this;
                              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
                              stackOut_86_2 = "";
                              stackIn_87_0 = stackOut_86_0;
                              stackIn_87_1 = stackOut_86_1;
                              stackIn_87_2 = stackOut_86_2;
                              break L41;
                            } else {
                              stackOut_85_0 = this;
                              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
                              stackOut_85_2 = kl.field_d[2];
                              stackIn_87_0 = stackOut_85_0;
                              stackIn_87_1 = stackOut_85_1;
                              stackIn_87_2 = stackOut_85_2;
                              break L41;
                            }
                          }
                          ((ad) this).field_b = stackIn_87_2;
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
                          stackOut_88_0 = this;
                          stackOut_88_1 = new StringBuilder().append(kl.field_d[28]);
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          stackIn_89_0 = stackOut_88_0;
                          stackIn_89_1 = stackOut_88_1;
                          if (param0) {
                            stackOut_90_0 = this;
                            stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
                            stackOut_90_2 = "";
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            stackIn_91_2 = stackOut_90_2;
                            break L42;
                          } else {
                            stackOut_89_0 = this;
                            stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
                            stackOut_89_2 = kl.field_d[29];
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_91_1 = stackOut_89_1;
                            stackIn_91_2 = stackOut_89_2;
                            break L42;
                          }
                        }
                        ((ad) this).field_b = stackIn_91_2;
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
                        stackOut_92_0 = this;
                        stackOut_92_1 = new StringBuilder().append(kl.field_d[31]);
                        stackIn_94_0 = stackOut_92_0;
                        stackIn_94_1 = stackOut_92_1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        if (param0) {
                          stackOut_94_0 = this;
                          stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
                          stackOut_94_2 = "";
                          stackIn_95_0 = stackOut_94_0;
                          stackIn_95_1 = stackOut_94_1;
                          stackIn_95_2 = stackOut_94_2;
                          break L43;
                        } else {
                          stackOut_93_0 = this;
                          stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                          stackOut_93_2 = kl.field_d[32];
                          stackIn_95_0 = stackOut_93_0;
                          stackIn_95_1 = stackOut_93_1;
                          stackIn_95_2 = stackOut_93_2;
                          break L43;
                        }
                      }
                      ((ad) this).field_b = stackIn_95_2;
                      ((ad) this).field_o = kl.field_d[30];
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L24;
                      }
                    }
                    L44: {
                      ((ad) this).field_a = false;
                      stackOut_96_0 = this;
                      stackOut_96_1 = new StringBuilder().append(kl.field_d[34]);
                      stackIn_98_0 = stackOut_96_0;
                      stackIn_98_1 = stackOut_96_1;
                      stackIn_97_0 = stackOut_96_0;
                      stackIn_97_1 = stackOut_96_1;
                      if (param0) {
                        stackOut_98_0 = this;
                        stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                        stackOut_98_2 = "";
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        stackIn_99_2 = stackOut_98_2;
                        break L44;
                      } else {
                        stackOut_97_0 = this;
                        stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                        stackOut_97_2 = kl.field_d[35];
                        stackIn_99_0 = stackOut_97_0;
                        stackIn_99_1 = stackOut_97_1;
                        stackIn_99_2 = stackOut_97_2;
                        break L44;
                      }
                    }
                    ((ad) this).field_b = stackIn_99_2;
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
                    stackOut_100_0 = this;
                    stackOut_100_1 = new StringBuilder().append(kl.field_d[37]);
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_102_1 = stackOut_100_1;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    if (!param0) {
                      stackOut_102_0 = this;
                      stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
                      stackOut_102_2 = kl.field_d[2];
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      stackIn_103_2 = stackOut_102_2;
                      break L45;
                    } else {
                      stackOut_101_0 = this;
                      stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
                      stackOut_101_2 = "";
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      stackIn_103_2 = stackOut_101_2;
                      break L45;
                    }
                  }
                  ((ad) this).field_b = stackIn_103_2;
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
                  stackOut_104_0 = this;
                  stackOut_104_1 = new StringBuilder().append(kl.field_d[39]);
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_106_1 = stackOut_104_1;
                  stackIn_105_0 = stackOut_104_0;
                  stackIn_105_1 = stackOut_104_1;
                  if (!param0) {
                    stackOut_106_0 = this;
                    stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
                    stackOut_106_2 = kl.field_d[40];
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    stackIn_107_2 = stackOut_106_2;
                    break L46;
                  } else {
                    stackOut_105_0 = this;
                    stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
                    stackOut_105_2 = "";
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    stackIn_107_2 = stackOut_105_2;
                    break L46;
                  }
                }
                L47: {
                  ((ad) this).field_b = stackIn_107_2;
                  ((ad) this).field_a = false;
                  ((ad) this).field_k = 364;
                  ((ad) this).field_y = 280;
                  ((ad) this).field_t = 430;
                  ((ad) this).field_q = 143;
                  stackOut_107_0 = this;
                  stackIn_109_0 = stackOut_107_0;
                  stackIn_108_0 = stackOut_107_0;
                  if (param0) {
                    stackOut_109_0 = this;
                    stackOut_109_1 = 0;
                    stackIn_110_0 = stackOut_109_0;
                    stackIn_110_1 = stackOut_109_1;
                    break L47;
                  } else {
                    stackOut_108_0 = this;
                    stackOut_108_1 = 1;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_110_1 = stackOut_108_1;
                    break L47;
                  }
                }
                ((ad) this).field_s = stackIn_110_1 != 0;
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
                stackOut_111_0 = this;
                stackIn_113_0 = stackOut_111_0;
                stackIn_112_0 = stackOut_111_0;
                if (param0) {
                  stackOut_113_0 = this;
                  stackOut_113_1 = 0;
                  stackIn_114_0 = stackOut_113_0;
                  stackIn_114_1 = stackOut_113_1;
                  break L48;
                } else {
                  stackOut_112_0 = this;
                  stackOut_112_1 = 1;
                  stackIn_114_0 = stackOut_112_0;
                  stackIn_114_1 = stackOut_112_1;
                  break L48;
                }
              }
              L49: {
                ((ad) this).field_s = stackIn_114_1 != 0;
                ((ad) this).field_a = false;
                stackOut_114_0 = this;
                stackOut_114_1 = new StringBuilder().append(kl.field_d[42]);
                stackIn_116_0 = stackOut_114_0;
                stackIn_116_1 = stackOut_114_1;
                stackIn_115_0 = stackOut_114_0;
                stackIn_115_1 = stackOut_114_1;
                if (param0) {
                  stackOut_116_0 = this;
                  stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
                  stackOut_116_2 = "";
                  stackIn_117_0 = stackOut_116_0;
                  stackIn_117_1 = stackOut_116_1;
                  stackIn_117_2 = stackOut_116_2;
                  break L49;
                } else {
                  stackOut_115_0 = this;
                  stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                  stackOut_115_2 = kl.field_d[43];
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  stackIn_117_2 = stackOut_115_2;
                  break L49;
                }
              }
              ((ad) this).field_b = stackIn_117_2;
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
        ((ad) this).field_w = -255;
        ((ad) this).field_d = 0;
        ((ad) this).field_B = 0;
        ((ad) this).field_l = 0;
        ((ad) this).field_j = 0;
        ((ad) this).field_p = param0;
        this.a(false, 17097);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
        field_m = new byte[520];
    }
}
