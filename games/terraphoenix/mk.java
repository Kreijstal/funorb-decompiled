/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mk {
    private int field_l;
    int field_a;
    int field_b;
    int field_g;
    private dk field_i;
    private int field_n;
    static String field_h;
    int field_e;
    private int field_c;
    static String field_f;
    private int field_m;
    int field_d;
    int field_k;
    static uc field_j;

    public static void d(byte param0) {
        try {
            field_j = null;
            field_f = null;
            int var1_int = 61 % ((-36 - param0) / 54);
            field_h = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "mk.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        dl stackIn_174_0 = null;
        dl stackIn_176_0 = null;
        dl stackIn_178_0 = null;
        dl stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        dl stackIn_182_0 = null;
        dl stackIn_184_0 = null;
        dl stackIn_186_0 = null;
        dl stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        dl stackIn_194_0 = null;
        dl stackIn_196_0 = null;
        dl stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        RuntimeException decompiledCaughtException = null;
        dl stackOut_173_0 = null;
        dl stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        dl stackOut_174_0 = null;
        dl stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        dl stackOut_181_0 = null;
        dl stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        dl stackOut_182_0 = null;
        dl stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        dl stackOut_193_0 = null;
        dl stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        dl stackOut_194_0 = null;
        int stackOut_194_1 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (1 == ((mk) this).field_a) {
                L2: {
                  if (((mk) this).field_b <= 0) {
                    break L2;
                  } else {
                    ((mk) this).field_b = ((mk) this).field_b - 1;
                    ((mk) this).field_m = ((mk) this).field_m + 1;
                    break L2;
                  }
                }
                L3: {
                  if (((mk) this).field_b >= 0) {
                    break L3;
                  } else {
                    ((mk) this).field_b = ((mk) this).field_b + 1;
                    ((mk) this).field_m = ((mk) this).field_m - 1;
                    break L3;
                  }
                }
                L4: {
                  if (((mk) this).field_m < 0) {
                    ((mk) this).field_m = ((mk) this).field_m + 16;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (16 > ((mk) this).field_m) {
                  break L1;
                } else {
                  ((mk) this).field_m = ((mk) this).field_m - 16;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (0 >= j.field_R) {
                break L5;
              } else {
                j.field_R = j.field_R - 1;
                break L5;
              }
            }
            L6: {
              if (((mk) this).field_a == 2) {
                L7: {
                  if (((mk) this).field_b <= 0) {
                    break L7;
                  } else {
                    ((mk) this).field_b = ((mk) this).field_b - 1;
                    ((mk) this).field_l = ((mk) this).field_l + 4;
                    break L7;
                  }
                }
                L8: {
                  if (((mk) this).field_b < 0) {
                    ((mk) this).field_b = ((mk) this).field_b + 1;
                    ((mk) this).field_l = ((mk) this).field_l - 4;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (((mk) this).field_l < 0) {
                    ((mk) this).field_l = ((mk) this).field_l + 84;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (((mk) this).field_l < 84) {
                  break L6;
                } else {
                  ((mk) this).field_l = ((mk) this).field_l - 84;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L10: {
              var2_int = -51 % ((param0 - 35) / 37);
              if (3 != ((mk) this).field_a) {
                break L10;
              } else {
                L11: {
                  if (((mk) this).field_b <= 0) {
                    break L11;
                  } else {
                    ((mk) this).field_b = ((mk) this).field_b - 1;
                    ((mk) this).field_n = ((mk) this).field_n + 1;
                    break L11;
                  }
                }
                L12: {
                  if (((mk) this).field_b >= 0) {
                    break L12;
                  } else {
                    ((mk) this).field_n = ((mk) this).field_n - 1;
                    ((mk) this).field_b = ((mk) this).field_b + 1;
                    break L12;
                  }
                }
                L13: {
                  if (((mk) this).field_n < 0) {
                    ((mk) this).field_n = ((mk) this).field_n + 80;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                if (((mk) this).field_n < 80) {
                  break L10;
                } else {
                  ((mk) this).field_n = ((mk) this).field_n - 80;
                  break L10;
                }
              }
            }
            L14: {
              L15: {
                if (((mk) this).field_g != 0) {
                  break L15;
                } else {
                  if (((mk) this).field_e == 0) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              if (null == ((mk) this).field_i) {
                break L14;
              } else {
                if (uf.field_c != -1) {
                  L16: {
                    var3 = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
                    if (((mk) this).field_a != 0) {
                      L17: {
                        if (var3 != null) {
                          break L17;
                        } else {
                          ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, ((mk) this).field_i);
                          break L17;
                        }
                      }
                      var3 = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    if (tg.field_l <= 0) {
                      break L18;
                    } else {
                      if (var3 == null) {
                        break L18;
                      } else {
                        L19: {
                          if (null == var3.field_C) {
                            break L19;
                          } else {
                            if (tg.field_l <= var3.field_r) {
                              break L19;
                            } else {
                              var3 = var3.field_C;
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (var3.field_C == null) {
                            break L20;
                          } else {
                            if (~var3.field_r <= ~tg.field_l) {
                              break L20;
                            } else {
                              var3 = var3.field_C;
                              break L20;
                            }
                          }
                        }
                        L21: {
                          if (null == var3.field_C) {
                            break L21;
                          } else {
                            if (~tg.field_l >= ~var3.field_r) {
                              break L21;
                            } else {
                              var3 = var3.field_C;
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (var3.field_C == null) {
                            break L22;
                          } else {
                            if (~var3.field_r <= ~tg.field_l) {
                              break L22;
                            } else {
                              var3 = var3.field_C;
                              break L22;
                            }
                          }
                        }
                        L23: while (true) {
                          if (~var3.field_r <= ~tg.field_l) {
                            break L18;
                          } else {
                            var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, ((mk) this).field_i);
                            var3.field_C.field_c = var3;
                            var3 = var3.field_C;
                            if (var5 != 0) {
                              break L14;
                            } else {
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L24: {
                    L25: {
                      L26: {
                        L27: {
                          L28: {
                            var4 = ((mk) this).field_a;
                            if (var4 != 0) {
                              break L28;
                            } else {
                              if (var5 == 0) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                          L29: {
                            if (var4 != 1) {
                              break L29;
                            } else {
                              if (var5 == 0) {
                                break L26;
                              } else {
                                break L29;
                              }
                            }
                          }
                          L30: {
                            if (var4 != 2) {
                              break L30;
                            } else {
                              if (var5 == 0) {
                                break L25;
                              } else {
                                break L30;
                              }
                            }
                          }
                          if (var4 != 3) {
                            break L14;
                          } else {
                            if (var5 == 0) {
                              break L24;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L31: {
                          if (((mk) this).field_g != 1) {
                            break L31;
                          } else {
                            L32: {
                              if (var3 != null) {
                                break L32;
                              } else {
                                ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, ((mk) this).field_i);
                                if (var5 == 0) {
                                  break L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            L33: while (true) {
                              L34: {
                                L35: {
                                  if (null == var3.field_C) {
                                    break L35;
                                  } else {
                                    var3 = var3.field_C;
                                    if (var5 != 0) {
                                      break L34;
                                    } else {
                                      if (var5 == 0) {
                                        continue L33;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, ((mk) this).field_i);
                                break L34;
                              }
                              var3.field_C.field_c = var3;
                              break L31;
                            }
                          }
                        }
                        if (((mk) this).field_e != 2) {
                          break L14;
                        } else {
                          if (var3 != null) {
                            L36: while (true) {
                              L37: {
                                L38: {
                                  if (null == var3.field_C) {
                                    break L38;
                                  } else {
                                    var3 = var3.field_C;
                                    if (var5 != 0) {
                                      break L37;
                                    } else {
                                      if (var5 == 0) {
                                        continue L36;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                L39: {
                                  if (var3.field_c == null) {
                                    break L39;
                                  } else {
                                    var3.field_c.field_C = null;
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = null;
                                break L37;
                              }
                              if (var5 == 0) {
                                break L14;
                              } else {
                                break L26;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      L40: {
                        if (1 != ((mk) this).field_e) {
                          break L40;
                        } else {
                          var3.field_b = ((mk) this).field_m;
                          break L40;
                        }
                      }
                      if (((mk) this).field_e != 2) {
                        break L14;
                      } else {
                        var3.field_b = -1;
                        if (var5 == 0) {
                          break L14;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L41: {
                      if (((mk) this).field_g != 2) {
                        break L41;
                      } else {
                        L42: {
                          stackOut_173_0 = (dl) var3;
                          stackIn_178_0 = stackOut_173_0;
                          stackIn_174_0 = stackOut_173_0;
                          if (~((mk) this).field_l == ~var3.field_k) {
                            stackOut_178_0 = (dl) (Object) stackIn_178_0;
                            stackOut_178_1 = -1;
                            stackIn_179_0 = stackOut_178_0;
                            stackIn_179_1 = stackOut_178_1;
                            break L42;
                          } else {
                            stackOut_174_0 = (dl) (Object) stackIn_174_0;
                            stackIn_176_0 = stackOut_174_0;
                            stackOut_176_0 = (dl) (Object) stackIn_176_0;
                            stackOut_176_1 = ((mk) this).field_l;
                            stackIn_179_0 = stackOut_176_0;
                            stackIn_179_1 = stackOut_176_1;
                            break L42;
                          }
                        }
                        stackIn_179_0.field_k = stackIn_179_1;
                        break L41;
                      }
                    }
                    if (((mk) this).field_g != 1) {
                      break L14;
                    } else {
                      L43: {
                        stackOut_181_0 = (dl) var3;
                        stackIn_186_0 = stackOut_181_0;
                        stackIn_182_0 = stackOut_181_0;
                        if (~var3.field_g != ~((mk) this).field_l) {
                          stackOut_186_0 = (dl) (Object) stackIn_186_0;
                          stackOut_186_1 = ((mk) this).field_l;
                          stackIn_187_0 = stackOut_186_0;
                          stackIn_187_1 = stackOut_186_1;
                          break L43;
                        } else {
                          stackOut_182_0 = (dl) (Object) stackIn_182_0;
                          stackIn_184_0 = stackOut_182_0;
                          stackOut_184_0 = (dl) (Object) stackIn_184_0;
                          stackOut_184_1 = -1;
                          stackIn_187_0 = stackOut_184_0;
                          stackIn_187_1 = stackOut_184_1;
                          break L43;
                        }
                      }
                      stackIn_187_0.field_g = stackIn_187_1;
                      if (var5 == 0) {
                        break L14;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L44: {
                    if (1 == ((mk) this).field_g) {
                      L45: {
                        stackOut_193_0 = (dl) var3;
                        stackIn_196_0 = stackOut_193_0;
                        stackIn_194_0 = stackOut_193_0;
                        if (~((mk) this).field_n != ~var3.field_j) {
                          stackOut_196_0 = (dl) (Object) stackIn_196_0;
                          stackOut_196_1 = ((mk) this).field_n;
                          stackIn_197_0 = stackOut_196_0;
                          stackIn_197_1 = stackOut_196_1;
                          break L45;
                        } else {
                          stackOut_194_0 = (dl) (Object) stackIn_194_0;
                          stackOut_194_1 = -1;
                          stackIn_197_0 = stackOut_194_0;
                          stackIn_197_1 = stackOut_194_1;
                          break L45;
                        }
                      }
                      stackIn_197_0.field_j = stackIn_197_1;
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                  if (((mk) this).field_e == 2) {
                    var3.field_j = -1;
                    break L14;
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "mk.E(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        Object var2 = null;
        byte[] var2_array = of.field_k[((mk) this).field_c];
        if (null == var2_array) {
            ((mk) this).field_i = new dk(16, 16);
            ((mk) this).field_i.field_l = (mk) this;
            return;
        }
        try {
            this.a(false, var2_array);
            if (param0 > -42) {
                this.a(true, (byte[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "mk.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        dl var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var2_ref = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
              if (param0 > 121) {
                break L1;
              } else {
                mk.d((byte) 89);
                break L1;
              }
            }
            L2: {
              if (0 != ((mk) this).field_a) {
                L3: {
                  if (var2_ref != null) {
                    break L3;
                  } else {
                    ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, ((mk) this).field_i);
                    break L3;
                  }
                }
                var2_ref = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              L5: {
                L6: {
                  if (tg.field_l <= 0) {
                    break L6;
                  } else {
                    if (var2_ref == null) {
                      break L6;
                    } else {
                      L7: {
                        if (null == var2_ref.field_C) {
                          break L7;
                        } else {
                          if (~var2_ref.field_r <= ~tg.field_l) {
                            break L7;
                          } else {
                            var2_ref = var2_ref.field_C;
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (null == var2_ref.field_C) {
                          break L8;
                        } else {
                          if (~var2_ref.field_r > ~tg.field_l) {
                            var2_ref = var2_ref.field_C;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (null == var2_ref.field_C) {
                          break L9;
                        } else {
                          if (var2_ref.field_r < tg.field_l) {
                            var2_ref = var2_ref.field_C;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var2_ref.field_C == null) {
                          break L10;
                        } else {
                          if (var2_ref.field_r >= tg.field_l) {
                            break L10;
                          } else {
                            var2_ref = var2_ref.field_C;
                            break L10;
                          }
                        }
                      }
                      L11: while (true) {
                        if (~tg.field_l >= ~var2_ref.field_r) {
                          break L6;
                        } else {
                          var2_ref.field_C = new dl(uf.field_c, vf.field_a, 1 + var2_ref.field_r, ((mk) this).field_i);
                          var2_ref.field_C.field_c = var2_ref;
                          var2_ref = var2_ref.field_C;
                          if (var3 != 0) {
                            break L5;
                          } else {
                            if (var3 == 0) {
                              continue L11;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (null != var2_ref) {
                  break L5;
                } else {
                  break L4;
                }
              }
              L12: {
                if (var2_ref.field_k == -1) {
                  break L12;
                } else {
                  var2_ref.field_k = 3 + var2_ref.field_k / 4 * 4;
                  break L12;
                }
              }
              if (var2_ref.field_g != -1) {
                var2_ref.field_g = 3 + 4 * (var2_ref.field_g / 4);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "mk.G(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((mk) this).c(-13859);
              ((mk) this).field_c = ((mk) this).field_c + param1;
              if (param0 == 23172) {
                break L1;
              } else {
                this.a(true, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (((mk) this).field_c >= 0) {
                break L2;
              } else {
                ((mk) this).field_c = ph.field_n.length + -1;
                break L2;
              }
            }
            L3: {
              if (((mk) this).field_c >= ph.field_n.length) {
                ((mk) this).field_c = 0;
                break L3;
              } else {
                break L3;
              }
            }
            ((mk) this).a((byte) -118);
            fg.field_c = "LEVEL CHANGED";
            j.field_R = 256;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "mk.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException runtimeException = null;
        String var2 = null;
        byte[] var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((mk) this).field_i) {
              return;
            } else {
              L1: {
                fg.field_c = "MAP SAVING";
                j.field_R = 256;
                var2 = ph.field_n[((mk) this).field_c] + ".lev";
                var3 = ((mk) this).field_i.a(true);
                of.field_k[wf.a(var2, true)] = var3;
                fg.field_c = "MAP SAVED";
                j.field_R = 256;
                if (param0 == -13859) {
                  break L1;
                } else {
                  ((mk) this).b(-93, 17);
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "mk.K(" + param0 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            stackOut_3_0 = -vi.field_o + ql.field_g;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "mk.F(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(boolean param0, String param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            og.field_f.a(param1, param4 - -3, param2 - -3, 8421504, -1);
            og.field_f.a(param1, param4 - -2, param2 + 2, 8421504, -1);
            if (!param0) {
              og.field_f.a(param1, 1 + param4, param2 + 1, 8421504, -1);
              og.field_f.a(param1, param4 - -1, param2, 0, -1);
              og.field_f.a(param1, param4 + -1, param2, 0, -1);
              og.field_f.a(param1, param4, -1 + param2, 0, -1);
              og.field_f.a(param1, param4, param2 - -1, 0, -1);
              og.field_f.a(param1, param4, param2, param3, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("mk.I(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, byte[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              fg.field_c = "MAP LOADING";
              j.field_R = 256;
              ((mk) this).field_i = new dk(param1);
              if (!param0) {
                break L1;
              } else {
                ((mk) this).b((byte) -127);
                break L1;
              }
            }
            L2: {
              fg.field_c = "MAP LOADED";
              j.field_R = 256;
              if (((mk) this).field_i == null) {
                break L2;
              } else {
                ((mk) this).field_i.field_l = (mk) this;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("mk.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        String var6 = null;
        Exception var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((mk) this).field_i) {
                break L1;
              } else {
                L2: {
                  if (param0 <= 0) {
                    break L2;
                  } else {
                    var3_int = param0 + ((mk) this).field_i.field_b;
                    var4 = ((mk) this).field_i.field_e + param0;
                    ((mk) this).c(-13859);
                    var5 = null;
                    var6 = ph.field_n[((mk) this).field_c] + ".lev";
                    try {
                      L3: {
                        var5_array = vl.a(75, new File(var6));
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var7 = (Exception) (Object) decompiledCaughtException;
                        System.out.println((Object) (Object) var7);
                        break L4;
                      }
                    }
                    L5: {
                      ((mk) this).field_i = new dk(var3_int, var4);
                      ((mk) this).field_i.field_l = (mk) this;
                      if (var5_array == null) {
                        break L5;
                      } else {
                        ((mk) this).field_i.a(0, (byte) 104, 0, var5_array);
                        break L5;
                      }
                    }
                    if (Terraphoenix.field_V == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L6: {
                  ((mk) this).field_i.field_b = ((mk) this).field_i.field_b + param0;
                  ((mk) this).field_i.field_e = ((mk) this).field_i.field_e + param0;
                  if (((mk) this).field_i.field_b < 2) {
                    ((mk) this).field_i.field_b = 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((mk) this).field_i.field_e >= 2) {
                  break L1;
                } else {
                  ((mk) this).field_i.field_e = 2;
                  break L1;
                }
              }
            }
            L7: {
              if (param1 > 83) {
                break L7;
              } else {
                ((mk) this).b(51, -121);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "mk.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        byte stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              L2: {
                vc.field_f.b(ph.field_n[((mk) this).field_c], 24, 24, 0, -1);
                if (((mk) this).field_i == null) {
                  break L2;
                } else {
                  vc.field_f.b("MAP: " + ((mk) this).field_i.field_b + " x " + ((mk) this).field_i.field_e, 24, 48, 16711935, -1);
                  vc.field_f.b("Level:" + tg.field_l, 24, 72, 16711935, -1);
                  ((mk) this).field_i.d(-125);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              vc.field_f.b("MAP IS NULL", 24, 48, 16711680, -1);
              break L1;
            }
            L3: {
              if (((mk) this).field_a < 0) {
                ((mk) this).field_a = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (3 < ((mk) this).field_a) {
                ((mk) this).field_a = 3;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != ((mk) this).field_a) {
                break L5;
              } else {
                var2_int = 616;
                var3 = 36;
                this.a(false, "MODE: Add/Remove Squares", var3, 16777215, var2_int);
                var3 += 14;
                this.a(false, "lmb - add square", var3, 16777215, var2_int);
                var3 += 12;
                this.a(false, "rmb - remove square", var3, 16777215, var2_int);
                var3 += 20;
                this.a(false, "a/s - change mode", var3, 16777215, var2_int);
                break L5;
              }
            }
            L6: {
              if (((mk) this).field_a == 1) {
                var2_int = 616;
                var3 = 36;
                this.a(false, "MODE: Floors", var3, 16777215, var2_int);
                var3 += 14;
                this.a(false, "lmb - set floor", var3, 16777215, var2_int);
                var3 += 12;
                this.a(false, "rmb - remove floor", var3, 16777215, var2_int);
                var3 += 12;
                this.a(false, "z/x - change floor", var3, 16777215, var2_int);
                var3 += 20;
                this.a(false, "a/s - change mode", var3, 16777215, var2_int);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              L8: {
                if (2 != ((mk) this).field_a) {
                  break L8;
                } else {
                  var2_int = 616;
                  var3 = 36;
                  this.a(false, "MODE: Walls", var3, 16777215, var2_int);
                  var3 += 14;
                  this.a(false, "lmb - toggle left", var3, 16777215, var2_int);
                  var3 += 12;
                  this.a(false, "rmb - toggle right", var3, 16777215, var2_int);
                  var3 += 12;
                  this.a(false, "z/x - change wall", var3, 16777215, var2_int);
                  var3 += 20;
                  this.a(false, "a/s - change mode", var3, 16777215, var2_int);
                  this.a(false, "MODE: Objects", var3, 16777215, var2_int);
                  var3 += 14;
                  this.a(false, "lmb - add object", var3, 16777215, var2_int);
                  var3 += 12;
                  this.a(false, "rmb - remove object", var3, 16777215, var2_int);
                  var3 += 12;
                  this.a(false, "z/x - change object", var3, 16777215, var2_int);
                  var3 += 20;
                  this.a(false, "a/s - change mode", var3, 16777215, var2_int);
                  var4 = 40;
                  var5 = 32;
                  var6 = 0;
                  L9: while (true) {
                    if (80 <= var6) {
                      break L8;
                    } else {
                      var3 = -192 + (var5 * (var6 / 16) - -480);
                      var2_int = var4 * (var6 % 16);
                      kg.field_r[var6].a(var2_int, var3, var4, var5);
                      stackOut_24_0 = ((mk) this).field_n;
                      stackOut_24_1 = var6;
                      stackIn_51_0 = stackOut_24_0;
                      stackIn_51_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (var7 != 0) {
                        break L7;
                      } else {
                        L10: {
                          if (stackIn_25_0 == stackIn_25_1) {
                            l.e(var2_int, var3, var4, var5, 65280);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var6++;
                        if (var7 == 0) {
                          continue L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
              }
              L11: {
                var2_int = 616;
                var3 = 110;
                this.a(false, "9 / 0 - change level size", var3, 16711680, var2_int);
                var3 += 14;
                this.a(false, "[ / ] - switch level", var3, 16711680, var2_int);
                var3 += 14;
                this.a(false, "o / p - change view level", var3, 16777215, var2_int);
                var3 += 14;
                if (!dh.field_j) {
                  break L11;
                } else {
                  this.a(false, "q - view current level", var3, 65535, var2_int);
                  break L11;
                }
              }
              L12: {
                var3 += 14;
                if (dh.field_j) {
                  break L12;
                } else {
                  this.a(false, "q - view below", var3, 16776960, var2_int);
                  break L12;
                }
              }
              L13: {
                var3 += 14;
                if (!ll.field_c) {
                  break L13;
                } else {
                  this.a(false, "w - turn off walls", var3, 65535, var2_int);
                  break L13;
                }
              }
              L14: {
                var3 += 14;
                if (ll.field_c) {
                  break L14;
                } else {
                  this.a(false, "w - turn on walls", var3, 16776960, var2_int);
                  break L14;
                }
              }
              L15: {
                var3 += 14;
                if (!jb.field_a) {
                  break L15;
                } else {
                  this.a(false, "e - hide objects", var3, 65535, var2_int);
                  break L15;
                }
              }
              L16: {
                var3 += 14;
                if (!jb.field_a) {
                  this.a(false, "e - show objects", var3, 16776960, var2_int);
                  break L16;
                } else {
                  break L16;
                }
              }
              var3 += 14;
              var3 += 14;
              this.a(false, "IMPORTANT", var3, 16711680, var2_int);
              var3 += 14;
              this.a(false, "YOU CANNOT SAVE LEVELS", var3, 16711680, var2_int);
              var3 += 14;
              this.a(false, "DO NOT BUILD LEVELS ON", var3, 16711680, var2_int);
              stackOut_50_0 = param0;
              stackOut_50_1 = -17;
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              break L7;
            }
            if (stackIn_51_0 <= stackIn_51_1) {
              L17: {
                var3 += 14;
                this.a(false, "THIS VERSION THAT YOU", var3, 16711680, var2_int);
                var3 += 14;
                this.a(false, "WISH TO KEEP", var3, 16711680, var2_int);
                var3 += 14;
                if (null != fg.field_c) {
                  vc.field_f.b(fg.field_c, 24, 456, j.field_R, -1);
                  break L17;
                } else {
                  break L17;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "mk.D(" + param0 + ')');
        }
    }

    mk() {
        try {
            j.field_R = 256;
            ((mk) this).field_l = 0;
            ((mk) this).field_a = 0;
            ((mk) this).field_n = 0;
            ((mk) this).field_m = 0;
            ((mk) this).field_b = 0;
            ((mk) this).field_c = 0;
            fg.field_c = "Editor started";
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "mk.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Try again";
        field_f = "Enemy Turn";
    }
}
