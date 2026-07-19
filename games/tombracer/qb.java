/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class qb extends be {
    static int field_f;
    static jpa[] field_e;
    private java.net.ProxySelector field_d;

    public static void b(byte param0) {
        field_e = null;
        if (param0 != 90) {
            qb.b((byte) -30);
        }
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_20_0 = null;
        String stackOut_27_0 = null;
        String stackOut_23_0 = null;
        String stackOut_16_0 = null;
        String stackOut_13_0 = null;
        String stackOut_6_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (3 != param2) {
              L1: {
                if (param1 == 8793) {
                  break L1;
                } else {
                  field_e = (jpa[]) null;
                  break L1;
                }
              }
              if (-7 != (param2 ^ -1)) {
                if (param2 == 7) {
                  stackOut_10_0 = tla.field_j;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2 != 8) {
                    if ((param2 ^ -1) != -10) {
                      if (-11 == (param2 ^ -1)) {
                        stackOut_20_0 = cha.field_c;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (-12 != (param2 ^ -1)) {
                          if (14 == param2) {
                            stackOut_27_0 = gl.a((byte) 92, ir.field_e, new String[]{param0});
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_23_0 = esa.field_a;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_16_0 = nta.field_e;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_13_0 = ipa.field_N;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackOut_6_0 = era.field_f;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = hj.field_e;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("qb.D(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        lqa var1 = null;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        var1 = uv.b(false);
        if (param0 > -90) {
          field_f = 50;
          if (kra.field_a == var1) {
            baa.field_d.a(0, new ei[]{(ei) ((Object) paa.field_z)});
            if (var2 != 0) {
              if (var1 != paa.field_z) {
                if (nj.field_t == var1) {
                  baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                  System.gc();
                  if (uv.b(false).field_c) {
                    return;
                  } else {
                    qb.c((byte) -127);
                    return;
                  }
                } else {
                  L0: {
                    if (vea.field_c == var1) {
                      baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                      if (var2 == 0) {
                        break L0;
                      } else {
                        baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                        System.gc();
                        if (uv.b(false).field_c) {
                          return;
                        } else {
                          qb.c((byte) -127);
                          return;
                        }
                      }
                    } else {
                      if (laa.field_x != var1) {
                        if (var1 != daa.field_d) {
                          break L0;
                        } else {
                          baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                          if (var2 == 0) {
                            break L0;
                          } else {
                            baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                            if (var2 == 0) {
                              System.gc();
                              if (uv.b(false).field_c) {
                                return;
                              } else {
                                qb.c((byte) -127);
                                return;
                              }
                            } else {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                              System.gc();
                              if (uv.b(false).field_c) {
                                return;
                              } else {
                                qb.c((byte) -127);
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                        if (var2 != 0) {
                          if (var1 == daa.field_d) {
                            L1: {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                              if (var2 == 0) {
                                break L1;
                              } else {
                                baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                                if (var2 == 0) {
                                  break L1;
                                } else {
                                  baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                                  System.gc();
                                  if (uv.b(false).field_c) {
                                    return;
                                  } else {
                                    qb.c((byte) -127);
                                    return;
                                  }
                                }
                              }
                            }
                            System.gc();
                            if (uv.b(false).field_c) {
                              return;
                            } else {
                              qb.c((byte) -127);
                              return;
                            }
                          } else {
                            System.gc();
                            if (uv.b(false).field_c) {
                              return;
                            } else {
                              qb.c((byte) -127);
                              return;
                            }
                          }
                        } else {
                          System.gc();
                          if (uv.b(false).field_c) {
                            return;
                          } else {
                            qb.c((byte) -127);
                            return;
                          }
                        }
                      }
                    }
                  }
                  System.gc();
                  if (uv.b(false).field_c) {
                    return;
                  } else {
                    qb.c((byte) -127);
                    return;
                  }
                }
              } else {
                baa.field_d.a(0, new ei[]{(ei) ((Object) nj.field_t)});
                if (var2 != 0) {
                  L2: {
                    if (nj.field_t == var1) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (vea.field_c == var1) {
                            break L4;
                          } else {
                            L5: {
                              if (laa.field_x != var1) {
                                break L5;
                              } else {
                                baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                                if (var2 == 0) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (var1 != daa.field_d) {
                              break L3;
                            } else {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                              if (var2 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                        if (var2 == 0) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                      System.gc();
                      if (uv.b(false).field_c) {
                        return;
                      } else {
                        qb.c((byte) -127);
                        return;
                      }
                    }
                  }
                  L6: {
                    baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                    System.gc();
                    if (uv.b(false).field_c) {
                      break L6;
                    } else {
                      qb.c((byte) -127);
                      break L6;
                    }
                  }
                  return;
                } else {
                  System.gc();
                  if (uv.b(false).field_c) {
                    return;
                  } else {
                    qb.c((byte) -127);
                    return;
                  }
                }
              }
            } else {
              System.gc();
              if (uv.b(false).field_c) {
                return;
              } else {
                qb.c((byte) -127);
                return;
              }
            }
          } else {
            L7: {
              if (var1 != paa.field_z) {
                if (nj.field_t == var1) {
                  L8: {
                    baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                    System.gc();
                    if (uv.b(false).field_c) {
                      break L8;
                    } else {
                      qb.c((byte) -127);
                      break L8;
                    }
                  }
                  return;
                } else {
                  if (vea.field_c == var1) {
                    baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                    if (var2 == 0) {
                      break L7;
                    } else {
                      L9: {
                        baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                        System.gc();
                        if (uv.b(false).field_c) {
                          break L9;
                        } else {
                          qb.c((byte) -127);
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    if (laa.field_x != var1) {
                      if (var1 != daa.field_d) {
                        break L7;
                      } else {
                        baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                        if (var2 == 0) {
                          break L7;
                        } else {
                          L10: {
                            baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                            if (var2 == 0) {
                              break L10;
                            } else {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                              break L10;
                            }
                          }
                          L11: {
                            System.gc();
                            if (uv.b(false).field_c) {
                              break L11;
                            } else {
                              qb.c((byte) -127);
                              break L11;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                      if (var2 == 0) {
                        break L7;
                      } else {
                        L12: {
                          if (var1 != daa.field_d) {
                            break L12;
                          } else {
                            baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                            if (var2 == 0) {
                              break L12;
                            } else {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                              if (var2 == 0) {
                                break L12;
                              } else {
                                baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                                break L12;
                              }
                            }
                          }
                        }
                        L13: {
                          System.gc();
                          if (uv.b(false).field_c) {
                            break L13;
                          } else {
                            qb.c((byte) -127);
                            break L13;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              } else {
                baa.field_d.a(0, new ei[]{(ei) ((Object) nj.field_t)});
                if (var2 == 0) {
                  break L7;
                } else {
                  L14: {
                    L15: {
                      if (nj.field_t == var1) {
                        break L15;
                      } else {
                        L16: {
                          if (vea.field_c == var1) {
                            break L16;
                          } else {
                            L17: {
                              if (laa.field_x != var1) {
                                break L17;
                              } else {
                                baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                                if (var2 == 0) {
                                  break L14;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            if (var1 != daa.field_d) {
                              break L14;
                            } else {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                              if (var2 == 0) {
                                break L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                        if (var2 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                    break L14;
                  }
                  L18: {
                    System.gc();
                    if (uv.b(false).field_c) {
                      break L18;
                    } else {
                      qb.c((byte) -127);
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
            System.gc();
            if (uv.b(false).field_c) {
              return;
            } else {
              qb.c((byte) -127);
              return;
            }
          }
        } else {
          L19: {
            L20: {
              if (kra.field_a != var1) {
                break L20;
              } else {
                baa.field_d.a(0, new ei[]{(ei) ((Object) paa.field_z)});
                if (var2 == 0) {
                  break L19;
                } else {
                  break L20;
                }
              }
            }
            if (var1 != paa.field_z) {
              if (nj.field_t == var1) {
                L21: {
                  baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                  System.gc();
                  if (uv.b(false).field_c) {
                    break L21;
                  } else {
                    qb.c((byte) -127);
                    break L21;
                  }
                }
                return;
              } else {
                if (vea.field_c == var1) {
                  baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                  if (var2 == 0) {
                    break L19;
                  } else {
                    L22: {
                      baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                      System.gc();
                      if (uv.b(false).field_c) {
                        break L22;
                      } else {
                        qb.c((byte) -127);
                        break L22;
                      }
                    }
                    return;
                  }
                } else {
                  if (laa.field_x != var1) {
                    if (var1 != daa.field_d) {
                      break L19;
                    } else {
                      baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                      if (var2 == 0) {
                        break L19;
                      } else {
                        L23: {
                          baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                          if (var2 == 0) {
                            break L23;
                          } else {
                            baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                            break L23;
                          }
                        }
                        L24: {
                          System.gc();
                          if (uv.b(false).field_c) {
                            break L24;
                          } else {
                            qb.c((byte) -127);
                            break L24;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                    if (var2 == 0) {
                      break L19;
                    } else {
                      L25: {
                        if (var1 != daa.field_d) {
                          break L25;
                        } else {
                          baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                          if (var2 == 0) {
                            break L25;
                          } else {
                            baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                            if (var2 == 0) {
                              break L25;
                            } else {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                              break L25;
                            }
                          }
                        }
                      }
                      L26: {
                        System.gc();
                        if (uv.b(false).field_c) {
                          break L26;
                        } else {
                          qb.c((byte) -127);
                          break L26;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            } else {
              baa.field_d.a(0, new ei[]{(ei) ((Object) nj.field_t)});
              if (var2 == 0) {
                break L19;
              } else {
                L27: {
                  L28: {
                    if (nj.field_t == var1) {
                      break L28;
                    } else {
                      L29: {
                        if (vea.field_c == var1) {
                          break L29;
                        } else {
                          L30: {
                            if (laa.field_x != var1) {
                              break L30;
                            } else {
                              baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                              if (var2 == 0) {
                                break L27;
                              } else {
                                break L30;
                              }
                            }
                          }
                          if (var1 != daa.field_d) {
                            break L27;
                          } else {
                            baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                            if (var2 == 0) {
                              break L27;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                      if (var2 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                  break L27;
                }
                L31: {
                  System.gc();
                  if (uv.b(false).field_c) {
                    break L31;
                  } else {
                    qb.c((byte) -127);
                    break L31;
                  }
                }
                return;
              }
            }
          }
          System.gc();
          if (uv.b(false).field_c) {
            return;
          } else {
            qb.c((byte) -127);
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (msa.field_a != param0) {
            return;
        }
        if (rba.field_a == null) {
            return;
        }
        if (fna.field_j == null) {
            return;
        }
        aoa.a(83, 3);
        aoa.a(param1 ^ 125, 4);
        aoa.a(76, param1);
        aoa.a(param1 ^ 80, 6);
        aoa.a(82, 7);
        aoa.a(param1 ^ 68, 8);
    }

    final java.net.Socket a(int param0) throws IOException {
        String discarded$2 = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        wra var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_7_0 = null;
        java.net.URI stackIn_7_1 = null;
        java.net.URI stackIn_7_2 = null;
        StringBuilder stackIn_7_3 = null;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        String stackIn_12_4 = null;
        Object stackIn_19_0 = null;
        java.net.Socket stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        java.net.ProxySelector stackOut_6_0 = null;
        java.net.URI stackOut_6_1 = null;
        java.net.URI stackOut_6_2 = null;
        StringBuilder stackOut_6_3 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        String stackOut_7_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        Object stackOut_18_0 = null;
        java.net.Socket stackOut_21_0 = null;
        Object stackOut_26_0 = null;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (443 != this.field_b) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var5 = stackIn_5_0;
        try {
          L2: {
            L3: {
              stackOut_6_0 = this.field_d;
              stackOut_6_1 = null;
              stackOut_6_2 = null;
              stackOut_6_3 = new StringBuilder();
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              if (var5 == 0) {
                stackOut_8_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackOut_8_1 = null;
                stackOut_8_2 = null;
                stackOut_8_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackOut_8_4 = "http";
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                break L3;
              } else {
                stackOut_7_0 = (java.net.ProxySelector) ((Object) stackIn_7_0);
                stackOut_7_1 = null;
                stackOut_7_2 = null;
                stackOut_7_3 = (StringBuilder) ((Object) stackIn_7_3);
                stackOut_7_4 = "https";
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_a));
              stackOut_9_0 = this.field_d;
              stackOut_9_1 = null;
              stackOut_9_2 = null;
              stackOut_9_3 = new StringBuilder();
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_11_3 = stackOut_9_3;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              if (var5 != 0) {
                stackOut_11_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackOut_11_1 = null;
                stackOut_11_2 = null;
                stackOut_11_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackOut_11_4 = "http";
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                stackIn_12_4 = stackOut_11_4;
                break L4;
              } else {
                stackOut_10_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                stackOut_10_1 = null;
                stackOut_10_2 = null;
                stackOut_10_3 = (StringBuilder) ((Object) stackIn_10_3);
                stackOut_10_4 = "https";
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                stackIn_12_4 = stackOut_10_4;
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_a));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a((byte) 112);
        }
        boolean discarded$3 = var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        var9 = 0;
        L5: while (true) {
          L6: {
            L7: {
              if ((var9 ^ -1) <= (var8_array.length ^ -1)) {
                break L7;
              } else {
                var10 = var8_array[var9];
                var11 = (java.net.Proxy) (var10);
                try {
                  L8: {
                    var12_ref2 = this.a(var11, 443);
                    stackOut_18_0 = null;
                    stackIn_27_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var13 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L8;
                    } else {
                      if (stackIn_19_0 != var12_ref2) {
                        stackOut_21_0 = (java.net.Socket) (var12_ref2);
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 2;
                        break L8;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L8;
                      }
                    }
                  }
                } catch (wra decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L9: {
                    var12 = (wra) (Object) decompiledCaughtException;
                    var7 = var12;
                    decompiledRegionSelector0 = 1;
                    break L9;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    var12_ref = (IOException) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L10;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  break L6;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    var9++;
                    if (var13 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  } else {
                    return stackIn_22_0;
                  }
                }
              }
            }
            stackOut_26_0 = null;
            stackIn_27_0 = stackOut_26_0;
            break L6;
          }
          if (stackIn_27_0 != var7) {
            throw qb.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
          } else {
            if (param0 == 25927) {
              return this.a((byte) -105);
            } else {
              return (java.net.Socket) null;
            }
          }
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        RuntimeException var3 = null;
        java.net.SocketAddress var3_ref = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        Object var5 = null;
        Exception var6 = null;
        Class var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        java.net.Socket stackIn_17_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_2_0 = null;
        Object stackOut_20_0 = null;
        java.net.Socket stackOut_16_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackOut_2_0 = this.a((byte) 112);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 443) {
                  break L1;
                } else {
                  qb.b((byte) 83);
                  break L1;
                }
              }
              var3_ref = param0.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                var4_ref = (java.net.InetSocketAddress) ((Object) var3_ref);
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
                    stackOut_20_0 = var5;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4_ref.getHostName(), new Integer(var4_ref.getPort())});
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            break L3;
                          } else {
                            var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          }
                        }
                      }
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackOut_16_0 = this.a(73, var4_ref.getPort(), var4_ref.getHostName(), (String) (var5));
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("qb.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return (java.net.Socket) ((Object) stackIn_21_0);
            }
          }
        }
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        RuntimeException var5 = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        java.net.Socket stackIn_13_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_12_0 = null;
        Object stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var13 = new java.net.Socket(param2, param1);
                var13.setSoTimeout(10000);
                var6 = var13.getOutputStream();
                if (param3 == null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              if (param0 >= 11) {
                break L3;
              } else {
                qb.c((byte) -97);
                break L3;
              }
            }
            L4: {
              var8 = var7.readLine();
              if (var8 != null) {
                L5: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L5;
                  } else {
                    if (var8.startsWith("HTTP/1.1 200")) {
                      break L5;
                    } else {
                      L6: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L6;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      var8 = var7.readLine();
                      L7: while (true) {
                        L8: {
                          if (var8 == null) {
                            break L8;
                          } else {
                            if (50 <= var9) {
                              break L8;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L9: {
                                  var14 = var8.substring(var10.length()).trim();
                                  var8 = var14;
                                  var8 = var14;
                                  var8 = var14;
                                  var11 = var14.indexOf(' ');
                                  if ((var11 ^ -1) == 0) {
                                    break L9;
                                  } else {
                                    var8 = var14.substring(0, var11);
                                    break L9;
                                  }
                                }
                                throw new wra(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        throw new wra("");
                      }
                    }
                  }
                }
                stackOut_12_0 = (java.net.Socket) (var13);
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L4;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackOut_27_0 = null;
            stackIn_28_0 = stackOut_27_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("qb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_28_0);
        }
    }

    final static int a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        if ((Math.max(param6, param0) ^ -1) <= (Math.min(param7, param5) ^ -1)) {
          if ((Math.max(param3, param1) ^ -1) <= (Math.min(param9, param2) ^ -1)) {
            if (Math.max(param7, param5) < Math.min(param6, param0)) {
              return -1;
            } else {
              if (Math.max(param9, param2) >= Math.min(param3, param1)) {
                L0: {
                  param1 = param1 - param3;
                  param0 = param0 - param6;
                  param5 = param5 - param7;
                  param2 = param2 - param9;
                  param6 = param6 - param7;
                  param3 = param3 - param9;
                  var10 = -14 + Math.max(Math.max(vd.b(1, param6), vd.b(1, param0)), vd.b(1, param5));
                  if (0 >= var10) {
                    break L0;
                  } else {
                    param5 = param5 >> var10;
                    param0 = param0 >> var10;
                    param6 = param6 >> var10;
                    break L0;
                  }
                }
                if (param4 < -63) {
                  L1: {
                    var10 = Math.max(Math.max(vd.b(1, param3), vd.b(1, param1)), vd.b(1, param2)) - 14;
                    if ((var10 ^ -1) >= -1) {
                      break L1;
                    } else {
                      param1 = param1 >> var10;
                      param3 = param3 >> var10;
                      param2 = param2 >> var10;
                      break L1;
                    }
                  }
                  return nla.a(2749, param2, param1, param3, param6, param8, param0, param5);
                } else {
                  L2: {
                    field_e = (jpa[]) null;
                    var10 = Math.max(Math.max(vd.b(1, param3), vd.b(1, param1)), vd.b(1, param2)) - 14;
                    if ((var10 ^ -1) >= -1) {
                      break L2;
                    } else {
                      param1 = param1 >> var10;
                      param3 = param3 >> var10;
                      param2 = param2 >> var10;
                      break L2;
                    }
                  }
                  return nla.a(2749, param2, param1, param3, param6, param8, param0, param5);
                }
              } else {
                return -1;
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    qb() {
        this.field_d = java.net.ProxySelector.getDefault();
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
