/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends eb {
    private int[] field_x;
    private int field_z;
    private ri field_C;
    private g field_A;
    private int field_r;
    private boolean field_w;
    private ri field_y;
    static String field_v;
    private int field_D;
    private boolean field_B;
    private int field_E;
    private int[] field_F;
    private g field_u;
    private ri field_s;
    private g field_t;

    private final void a(int param0, g param1, int param2, int param3) {
        param1.b(param0, -1, 99);
        param1.c(param3, param2 + -26097);
        if (param2 != 26025) {
            ((r) this).field_C = null;
        }
    }

    final static void a(ah param0, ah param1, boolean param2, boolean param3) {
        tg.a(0, ek.field_n, t.field_o, (jb) (Object) uf.field_g, u.field_b, sd.field_rb, tn.field_b, bk.field_i, param3, rh.field_N, ek.field_o, qc.field_cb);
        ec.field_n = bf.a((byte) -99, param0, "lobby", "chatfilter");
        gk.field_a[0] = oj.field_h;
        gk.field_a[2] = mk.field_f;
        gk.field_a[1] = am.field_a;
        db.a(param1, (jb) (Object) rn.field_e, 122);
        if (!param2) {
            field_v = null;
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (-1 > ((r) this).field_z) {
          if (null != ((r) this).field_y) {
            L0: {
              ((r) this).field_A.a(param0);
              if (1048576 <= ((r) this).field_z) {
                break L0;
              } else {
                if (null != ((r) this).field_s) {
                  ((r) this).field_u.a(param0);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L1: {
              if (-1 <= (((r) this).field_D ^ -1)) {
                break L1;
              } else {
                if (null != ((r) this).field_C) {
                  ((r) this).field_t.a(param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (((r) this).field_w) {
              L2: {
                if ((((r) this).field_r ^ -1) >= -1) {
                  break L2;
                } else {
                  if (((r) this).field_A.d((byte) 107)) {
                    break L2;
                  } else {
                    ((r) this).field_r = -((r) this).field_r;
                    ((r) this).field_y = null;
                    ((r) this).field_w = false;
                    if (((r) this).field_r != 0) {
                      L3: {
                        ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
                        if (1048576 <= ((r) this).field_z) {
                          ((r) this).field_z = 1048576;
                          if (((r) this).field_w) {
                            break L3;
                          } else {
                            ((r) this).field_r = 0;
                            if (!((r) this).field_B) {
                              L4: {
                                if (((r) this).field_s != null) {
                                  ((r) this).field_u.d(80);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              ((r) this).field_s = null;
                              break L3;
                            } else {
                              return;
                            }
                          }
                        } else {
                          if (0 >= ((r) this).field_z) {
                            ((r) this).field_z = 0;
                            if (((r) this).field_w) {
                              break L3;
                            } else {
                              ((r) this).field_r = 0;
                              if (!((r) this).field_B) {
                                if (((r) this).field_y == null) {
                                  ((r) this).field_y = null;
                                  return;
                                } else {
                                  ((r) this).field_A.d(109);
                                  ((r) this).field_y = null;
                                  return;
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
                    } else {
                      return;
                    }
                  }
                }
              }
              if (-1 < (((r) this).field_r ^ -1)) {
                if (!((r) this).field_u.d((byte) 81)) {
                  L5: {
                    ((r) this).field_s = null;
                    ((r) this).field_w = false;
                    ((r) this).field_r = -((r) this).field_r;
                    if (((r) this).field_r == 0) {
                      break L5;
                    } else {
                      ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
                      if (1048576 <= ((r) this).field_z) {
                        ((r) this).field_z = 1048576;
                        if (((r) this).field_w) {
                          break L5;
                        } else {
                          ((r) this).field_r = 0;
                          if (!((r) this).field_B) {
                            L6: {
                              if (((r) this).field_s != null) {
                                ((r) this).field_u.d(80);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((r) this).field_s = null;
                            break L5;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (0 >= ((r) this).field_z) {
                          ((r) this).field_z = 0;
                          if (((r) this).field_w) {
                            break L5;
                          } else {
                            ((r) this).field_r = 0;
                            if (!((r) this).field_B) {
                              if (((r) this).field_y == null) {
                                ((r) this).field_y = null;
                                return;
                              } else {
                                ((r) this).field_A.d(109);
                                ((r) this).field_y = null;
                                return;
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
                  }
                  return;
                } else {
                  L7: {
                    if (((r) this).field_r == 0) {
                      break L7;
                    } else {
                      ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
                      if (1048576 <= ((r) this).field_z) {
                        ((r) this).field_z = 1048576;
                        if (((r) this).field_w) {
                          break L7;
                        } else {
                          ((r) this).field_r = 0;
                          if (!((r) this).field_B) {
                            L8: {
                              if (((r) this).field_s != null) {
                                ((r) this).field_u.d(80);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            ((r) this).field_s = null;
                            break L7;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (0 >= ((r) this).field_z) {
                          ((r) this).field_z = 0;
                          if (((r) this).field_w) {
                            break L7;
                          } else {
                            ((r) this).field_r = 0;
                            if (!((r) this).field_B) {
                              if (((r) this).field_y == null) {
                                ((r) this).field_y = null;
                                return;
                              } else {
                                ((r) this).field_A.d(109);
                                ((r) this).field_y = null;
                                return;
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
                  }
                  return;
                }
              } else {
                if (((r) this).field_r != 0) {
                  ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
                  if (1048576 <= ((r) this).field_z) {
                    L9: {
                      ((r) this).field_z = 1048576;
                      if (((r) this).field_w) {
                        break L9;
                      } else {
                        ((r) this).field_r = 0;
                        if (!((r) this).field_B) {
                          L10: {
                            if (((r) this).field_s != null) {
                              ((r) this).field_u.d(80);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((r) this).field_s = null;
                          break L9;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (0 >= ((r) this).field_z) {
                      ((r) this).field_z = 0;
                      if (!((r) this).field_w) {
                        ((r) this).field_r = 0;
                        if (!((r) this).field_B) {
                          if (((r) this).field_y == null) {
                            ((r) this).field_y = null;
                            return;
                          } else {
                            ((r) this).field_A.d(109);
                            ((r) this).field_y = null;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              if (((r) this).field_r != 0) {
                ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
                if (1048576 <= ((r) this).field_z) {
                  ((r) this).field_z = 1048576;
                  if (!((r) this).field_w) {
                    ((r) this).field_r = 0;
                    if (((r) this).field_B) {
                      return;
                    } else {
                      L11: {
                        if (((r) this).field_s != null) {
                          ((r) this).field_u.d(80);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      ((r) this).field_s = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (0 >= ((r) this).field_z) {
                    ((r) this).field_z = 0;
                    if (!((r) this).field_w) {
                      ((r) this).field_r = 0;
                      if (!((r) this).field_B) {
                        if (((r) this).field_y == null) {
                          ((r) this).field_y = null;
                          return;
                        } else {
                          ((r) this).field_A.d(109);
                          ((r) this).field_y = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L12: {
              if (1048576 <= ((r) this).field_z) {
                break L12;
              } else {
                if (null != ((r) this).field_s) {
                  ((r) this).field_u.a(param0);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (-1 <= (((r) this).field_D ^ -1)) {
                break L13;
              } else {
                if (null != ((r) this).field_C) {
                  ((r) this).field_t.a(param0);
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (!((r) this).field_w) {
                break L14;
              } else {
                L15: {
                  if ((((r) this).field_r ^ -1) >= -1) {
                    break L15;
                  } else {
                    if (((r) this).field_A.d((byte) 107)) {
                      break L15;
                    } else {
                      ((r) this).field_r = -((r) this).field_r;
                      ((r) this).field_y = null;
                      ((r) this).field_w = false;
                      break L14;
                    }
                  }
                }
                if (-1 >= (((r) this).field_r ^ -1)) {
                  break L14;
                } else {
                  if (!((r) this).field_u.d((byte) 81)) {
                    ((r) this).field_s = null;
                    ((r) this).field_w = false;
                    ((r) this).field_r = -((r) this).field_r;
                    break L14;
                  } else {
                    L16: {
                      if (((r) this).field_r == 0) {
                        break L16;
                      } else {
                        ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
                        if (1048576 <= ((r) this).field_z) {
                          ((r) this).field_z = 1048576;
                          if (((r) this).field_w) {
                            break L16;
                          } else {
                            ((r) this).field_r = 0;
                            if (!((r) this).field_B) {
                              L17: {
                                if (((r) this).field_s != null) {
                                  ((r) this).field_u.d(80);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((r) this).field_s = null;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        } else {
                          if (0 >= ((r) this).field_z) {
                            ((r) this).field_z = 0;
                            if (((r) this).field_w) {
                              break L16;
                            } else {
                              ((r) this).field_r = 0;
                              if (!((r) this).field_B) {
                                L18: {
                                  if (((r) this).field_y == null) {
                                    break L18;
                                  } else {
                                    ((r) this).field_A.d(109);
                                    break L18;
                                  }
                                }
                                ((r) this).field_y = null;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (((r) this).field_r != 0) {
              ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
              if (1048576 <= ((r) this).field_z) {
                ((r) this).field_z = 1048576;
                if (!((r) this).field_w) {
                  ((r) this).field_r = 0;
                  if (!((r) this).field_B) {
                    L19: {
                      if (((r) this).field_s != null) {
                        ((r) this).field_u.d(80);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    ((r) this).field_s = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (0 >= ((r) this).field_z) {
                  ((r) this).field_z = 0;
                  if (!((r) this).field_w) {
                    ((r) this).field_r = 0;
                    if (!((r) this).field_B) {
                      if (((r) this).field_y != null) {
                        ((r) this).field_A.d(109);
                        ((r) this).field_y = null;
                        return;
                      } else {
                        ((r) this).field_y = null;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          L20: {
            if (1048576 <= ((r) this).field_z) {
              break L20;
            } else {
              if (null != ((r) this).field_s) {
                ((r) this).field_u.a(param0);
                break L20;
              } else {
                break L20;
              }
            }
          }
          L21: {
            if (-1 >= ((r) this).field_D) {
              break L21;
            } else {
              if (null != ((r) this).field_C) {
                ((r) this).field_t.a(param0);
                break L21;
              } else {
                break L21;
              }
            }
          }
          L22: {
            if (!((r) this).field_w) {
              break L22;
            } else {
              L23: {
                if ((((r) this).field_r ^ -1) >= -1) {
                  break L23;
                } else {
                  if (((r) this).field_A.d((byte) 107)) {
                    break L23;
                  } else {
                    ((r) this).field_r = -((r) this).field_r;
                    ((r) this).field_y = null;
                    ((r) this).field_w = false;
                    break L22;
                  }
                }
              }
              if (-1 >= (((r) this).field_r ^ -1)) {
                break L22;
              } else {
                if (!((r) this).field_u.d((byte) 81)) {
                  ((r) this).field_s = null;
                  ((r) this).field_w = false;
                  ((r) this).field_r = -((r) this).field_r;
                  break L22;
                } else {
                  L24: {
                    if (((r) this).field_r == 0) {
                      break L24;
                    } else {
                      ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
                      if (1048576 <= ((r) this).field_z) {
                        ((r) this).field_z = 1048576;
                        if (((r) this).field_w) {
                          break L24;
                        } else {
                          ((r) this).field_r = 0;
                          if (!((r) this).field_B) {
                            L25: {
                              if (((r) this).field_s != null) {
                                ((r) this).field_u.d(80);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            ((r) this).field_s = null;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      } else {
                        if (0 >= ((r) this).field_z) {
                          ((r) this).field_z = 0;
                          if (((r) this).field_w) {
                            break L24;
                          } else {
                            ((r) this).field_r = 0;
                            if (!((r) this).field_B) {
                              L26: {
                                if (((r) this).field_y == null) {
                                  break L26;
                                } else {
                                  ((r) this).field_A.d(109);
                                  break L26;
                                }
                              }
                              ((r) this).field_y = null;
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
                  }
                  return;
                }
              }
            }
          }
          if (((r) this).field_r != 0) {
            ((r) this).field_z = ((r) this).field_z + ((r) this).field_r * param0;
            if (1048576 <= ((r) this).field_z) {
              ((r) this).field_z = 1048576;
              if (!((r) this).field_w) {
                ((r) this).field_r = 0;
                if (((r) this).field_B) {
                  return;
                } else {
                  L27: {
                    if (((r) this).field_s != null) {
                      ((r) this).field_u.d(80);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  ((r) this).field_s = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (0 >= ((r) this).field_z) {
                ((r) this).field_z = 0;
                if (!((r) this).field_w) {
                  ((r) this).field_r = 0;
                  if (!((r) this).field_B) {
                    if (((r) this).field_y != null) {
                      ((r) this).field_A.d(109);
                      ((r) this).field_y = null;
                      return;
                    } else {
                      ((r) this).field_y = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
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

    final static void a(ie param0, java.awt.Frame param1, int param2) {
        vl var3 = null;
        int var4 = 0;
        var4 = TetraLink.field_J;
        L0: while (true) {
          var3 = param0.a(param1, 0);
          L1: while (true) {
            if (0 != var3.field_d) {
              if ((var3.field_d ^ -1) == -2) {
                param1.setVisible(false);
                if (param2 != 0) {
                  field_v = null;
                  param1.dispose();
                  return;
                } else {
                  param1.dispose();
                  return;
                }
              } else {
                tb.a(false, 100L);
                continue L0;
              }
            } else {
              tb.a(false, 10L);
              continue L1;
            }
          }
        }
    }

    final synchronized void a(ri param0, int param1, boolean param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_18_0 = 0;
        g stackIn_25_0 = null;
        g stackIn_26_0 = null;
        g stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        g stackIn_35_0 = null;
        g stackIn_36_0 = null;
        g stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        g stackIn_56_0 = null;
        g stackIn_57_0 = null;
        g stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        g stackIn_66_0 = null;
        g stackIn_67_0 = null;
        g stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        g stackIn_78_0 = null;
        g stackIn_79_0 = null;
        g stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        g stackIn_88_0 = null;
        g stackIn_89_0 = null;
        g stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_96_0 = 0;
        g stackIn_103_0 = null;
        g stackIn_104_0 = null;
        g stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        g stackIn_111_0 = null;
        g stackIn_112_0 = null;
        g stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        g stackIn_120_0 = null;
        g stackIn_121_0 = null;
        g stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        Object stackIn_144_0 = null;
        Object stackIn_145_0 = null;
        Object stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_159_0 = 0;
        g stackIn_167_0 = null;
        g stackIn_168_0 = null;
        g stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        g stackIn_175_0 = null;
        g stackIn_176_0 = null;
        g stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        g stackIn_184_0 = null;
        g stackIn_185_0 = null;
        g stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        Object stackIn_190_0 = null;
        Object stackIn_191_0 = null;
        Object stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        g stackIn_206_0 = null;
        g stackIn_207_0 = null;
        g stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        g stackIn_214_0 = null;
        g stackIn_215_0 = null;
        g stackIn_216_0 = null;
        int stackIn_216_1 = 0;
        g stackIn_221_0 = null;
        g stackIn_222_0 = null;
        g stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        g stackIn_236_0 = null;
        g stackIn_237_0 = null;
        g stackIn_238_0 = null;
        int stackIn_238_1 = 0;
        g stackIn_244_0 = null;
        g stackIn_245_0 = null;
        g stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        g stackIn_251_0 = null;
        g stackIn_252_0 = null;
        g stackIn_253_0 = null;
        int stackIn_253_1 = 0;
        int stackIn_261_0 = 0;
        g stackIn_268_0 = null;
        g stackIn_269_0 = null;
        g stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        g stackIn_276_0 = null;
        g stackIn_277_0 = null;
        g stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        g stackIn_285_0 = null;
        g stackIn_286_0 = null;
        g stackIn_287_0 = null;
        int stackIn_287_1 = 0;
        Object stackOut_189_0 = null;
        Object stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        Object stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        int stackOut_260_0 = 0;
        int stackOut_259_0 = 0;
        g stackOut_284_0 = null;
        g stackOut_286_0 = null;
        int stackOut_286_1 = 0;
        g stackOut_285_0 = null;
        int stackOut_285_1 = 0;
        g stackOut_275_0 = null;
        g stackOut_277_0 = null;
        int stackOut_277_1 = 0;
        g stackOut_276_0 = null;
        int stackOut_276_1 = 0;
        g stackOut_267_0 = null;
        g stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        g stackOut_268_0 = null;
        int stackOut_268_1 = 0;
        g stackOut_250_0 = null;
        g stackOut_252_0 = null;
        int stackOut_252_1 = 0;
        g stackOut_251_0 = null;
        int stackOut_251_1 = 0;
        g stackOut_243_0 = null;
        g stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        g stackOut_244_0 = null;
        int stackOut_244_1 = 0;
        g stackOut_235_0 = null;
        g stackOut_237_0 = null;
        int stackOut_237_1 = 0;
        g stackOut_236_0 = null;
        int stackOut_236_1 = 0;
        g stackOut_220_0 = null;
        g stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        g stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        g stackOut_213_0 = null;
        g stackOut_215_0 = null;
        int stackOut_215_1 = 0;
        g stackOut_214_0 = null;
        int stackOut_214_1 = 0;
        g stackOut_205_0 = null;
        g stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        g stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        Object stackOut_143_0 = null;
        Object stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        Object stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        g stackOut_183_0 = null;
        g stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        g stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        g stackOut_174_0 = null;
        g stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        g stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        g stackOut_166_0 = null;
        g stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        g stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        g stackOut_119_0 = null;
        g stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        g stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        g stackOut_110_0 = null;
        g stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        g stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        g stackOut_102_0 = null;
        g stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        g stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        g stackOut_87_0 = null;
        g stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        g stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        g stackOut_77_0 = null;
        g stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        g stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        g stackOut_65_0 = null;
        g stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        g stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        g stackOut_55_0 = null;
        g stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        g stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        g stackOut_34_0 = null;
        g stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        g stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        g stackOut_24_0 = null;
        g stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        g stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        var8 = TetraLink.field_J;
        if (((r) this).field_w) {
          if (param2) {
            if ((((r) this).field_r ^ -1) >= -1) {
              L0: {
                if (((r) this).field_s != null) {
                  ((r) this).field_u.d(76);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((r) this).field_s = param0;
              if (param0 == null) {
                return;
              } else {
                ((r) this).field_u.a(false, param0, (byte) 113);
                this.a(param3, ((r) this).field_u, 26025, param4);
                return;
              }
            } else {
              L1: {
                if (null == ((r) this).field_y) {
                  break L1;
                } else {
                  ((r) this).field_A.d(38);
                  break L1;
                }
              }
              ((r) this).field_y = param0;
              if (param0 != null) {
                ((r) this).field_A.a(false, param0, (byte) 117);
                this.a(param3, ((r) this).field_A, 26025, param4);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param5 <= -120) {
              L2: {
                stackOut_189_0 = this;
                stackIn_191_0 = stackOut_189_0;
                stackIn_190_0 = stackOut_189_0;
                if (!param2) {
                  stackOut_191_0 = this;
                  stackOut_191_1 = 0;
                  stackIn_192_0 = stackOut_191_0;
                  stackIn_192_1 = stackOut_191_1;
                  break L2;
                } else {
                  stackOut_190_0 = this;
                  stackOut_190_1 = 1;
                  stackIn_192_0 = stackOut_190_0;
                  stackIn_192_1 = stackOut_190_1;
                  break L2;
                }
              }
              ((r) this).field_w = stackIn_192_1 != 0;
              if (param0 != ((r) this).field_y) {
                if (param0 == ((r) this).field_s) {
                  ((r) this).field_r = -param1;
                  this.a(param3, ((r) this).field_u, 26025, param4);
                  return;
                } else {
                  if (((r) this).field_y != null) {
                    if (((r) this).field_s != null) {
                      L3: {
                        if ((((r) this).field_z ^ -1) <= -524289) {
                          stackOut_260_0 = 0;
                          stackIn_261_0 = stackOut_260_0;
                          break L3;
                        } else {
                          stackOut_259_0 = 1;
                          stackIn_261_0 = stackOut_259_0;
                          break L3;
                        }
                      }
                      var7 = stackIn_261_0;
                      if (var7 == 0) {
                        if (((r) this).field_s != null) {
                          L4: {
                            ((r) this).field_u.d(68);
                            ((r) this).field_s = param0;
                            if (param0 != null) {
                              L5: {
                                stackOut_284_0 = ((r) this).field_u;
                                stackIn_286_0 = stackOut_284_0;
                                stackIn_285_0 = stackOut_284_0;
                                if (param2) {
                                  stackOut_286_0 = (g) (Object) stackIn_286_0;
                                  stackOut_286_1 = 0;
                                  stackIn_287_0 = stackOut_286_0;
                                  stackIn_287_1 = stackOut_286_1;
                                  break L5;
                                } else {
                                  stackOut_285_0 = (g) (Object) stackIn_285_0;
                                  stackOut_285_1 = 1;
                                  stackIn_287_0 = stackOut_285_0;
                                  stackIn_287_1 = stackOut_285_1;
                                  break L5;
                                }
                              }
                              ((g) (Object) stackIn_287_0).a(stackIn_287_1 != 0, param0, (byte) 76);
                              this.a(param3, ((r) this).field_u, 26025, param4);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((r) this).field_r = -param1;
                          return;
                        } else {
                          L6: {
                            ((r) this).field_s = param0;
                            if (param0 != null) {
                              L7: {
                                stackOut_275_0 = ((r) this).field_u;
                                stackIn_277_0 = stackOut_275_0;
                                stackIn_276_0 = stackOut_275_0;
                                if (param2) {
                                  stackOut_277_0 = (g) (Object) stackIn_277_0;
                                  stackOut_277_1 = 0;
                                  stackIn_278_0 = stackOut_277_0;
                                  stackIn_278_1 = stackOut_277_1;
                                  break L7;
                                } else {
                                  stackOut_276_0 = (g) (Object) stackIn_276_0;
                                  stackOut_276_1 = 1;
                                  stackIn_278_0 = stackOut_276_0;
                                  stackIn_278_1 = stackOut_276_1;
                                  break L7;
                                }
                              }
                              ((g) (Object) stackIn_278_0).a(stackIn_278_1 != 0, param0, (byte) 76);
                              this.a(param3, ((r) this).field_u, 26025, param4);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          ((r) this).field_r = -param1;
                          return;
                        }
                      } else {
                        L8: {
                          if (null != ((r) this).field_y) {
                            ((r) this).field_A.d(111);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          ((r) this).field_y = param0;
                          if (param0 != null) {
                            L10: {
                              stackOut_267_0 = ((r) this).field_A;
                              stackIn_269_0 = stackOut_267_0;
                              stackIn_268_0 = stackOut_267_0;
                              if (param2) {
                                stackOut_269_0 = (g) (Object) stackIn_269_0;
                                stackOut_269_1 = 0;
                                stackIn_270_0 = stackOut_269_0;
                                stackIn_270_1 = stackOut_269_1;
                                break L10;
                              } else {
                                stackOut_268_0 = (g) (Object) stackIn_268_0;
                                stackOut_268_1 = 1;
                                stackIn_270_0 = stackOut_268_0;
                                stackIn_270_1 = stackOut_268_1;
                                break L10;
                              }
                            }
                            ((g) (Object) stackIn_270_0).a(stackIn_270_1 != 0, param0, (byte) 52);
                            this.a(param3, ((r) this).field_A, 26025, param4);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        ((r) this).field_r = param1;
                        return;
                      }
                    } else {
                      var7 = 0;
                      if (var7 == 0) {
                        if (((r) this).field_s == null) {
                          L11: {
                            ((r) this).field_s = param0;
                            if (param0 != null) {
                              L12: {
                                stackOut_250_0 = ((r) this).field_u;
                                stackIn_252_0 = stackOut_250_0;
                                stackIn_251_0 = stackOut_250_0;
                                if (param2) {
                                  stackOut_252_0 = (g) (Object) stackIn_252_0;
                                  stackOut_252_1 = 0;
                                  stackIn_253_0 = stackOut_252_0;
                                  stackIn_253_1 = stackOut_252_1;
                                  break L12;
                                } else {
                                  stackOut_251_0 = (g) (Object) stackIn_251_0;
                                  stackOut_251_1 = 1;
                                  stackIn_253_0 = stackOut_251_0;
                                  stackIn_253_1 = stackOut_251_1;
                                  break L12;
                                }
                              }
                              ((g) (Object) stackIn_253_0).a(stackIn_253_1 != 0, param0, (byte) 76);
                              this.a(param3, ((r) this).field_u, 26025, param4);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          ((r) this).field_r = -param1;
                          return;
                        } else {
                          L13: {
                            ((r) this).field_u.d(68);
                            ((r) this).field_s = param0;
                            if (param0 != null) {
                              L14: {
                                stackOut_243_0 = ((r) this).field_u;
                                stackIn_245_0 = stackOut_243_0;
                                stackIn_244_0 = stackOut_243_0;
                                if (param2) {
                                  stackOut_245_0 = (g) (Object) stackIn_245_0;
                                  stackOut_245_1 = 0;
                                  stackIn_246_0 = stackOut_245_0;
                                  stackIn_246_1 = stackOut_245_1;
                                  break L14;
                                } else {
                                  stackOut_244_0 = (g) (Object) stackIn_244_0;
                                  stackOut_244_1 = 1;
                                  stackIn_246_0 = stackOut_244_0;
                                  stackIn_246_1 = stackOut_244_1;
                                  break L14;
                                }
                              }
                              ((g) (Object) stackIn_246_0).a(stackIn_246_1 != 0, param0, (byte) 76);
                              this.a(param3, ((r) this).field_u, 26025, param4);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          ((r) this).field_r = -param1;
                          return;
                        }
                      } else {
                        L15: {
                          if (null != ((r) this).field_y) {
                            ((r) this).field_A.d(111);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          ((r) this).field_y = param0;
                          if (param0 != null) {
                            L17: {
                              stackOut_235_0 = ((r) this).field_A;
                              stackIn_237_0 = stackOut_235_0;
                              stackIn_236_0 = stackOut_235_0;
                              if (param2) {
                                stackOut_237_0 = (g) (Object) stackIn_237_0;
                                stackOut_237_1 = 0;
                                stackIn_238_0 = stackOut_237_0;
                                stackIn_238_1 = stackOut_237_1;
                                break L17;
                              } else {
                                stackOut_236_0 = (g) (Object) stackIn_236_0;
                                stackOut_236_1 = 1;
                                stackIn_238_0 = stackOut_236_0;
                                stackIn_238_1 = stackOut_236_1;
                                break L17;
                              }
                            }
                            ((g) (Object) stackIn_238_0).a(stackIn_238_1 != 0, param0, (byte) 52);
                            this.a(param3, ((r) this).field_A, 26025, param4);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        ((r) this).field_r = param1;
                        return;
                      }
                    }
                  } else {
                    var7 = 1;
                    if (var7 == 0) {
                      if (((r) this).field_s == null) {
                        L18: {
                          ((r) this).field_s = param0;
                          if (param0 != null) {
                            L19: {
                              stackOut_220_0 = ((r) this).field_u;
                              stackIn_222_0 = stackOut_220_0;
                              stackIn_221_0 = stackOut_220_0;
                              if (param2) {
                                stackOut_222_0 = (g) (Object) stackIn_222_0;
                                stackOut_222_1 = 0;
                                stackIn_223_0 = stackOut_222_0;
                                stackIn_223_1 = stackOut_222_1;
                                break L19;
                              } else {
                                stackOut_221_0 = (g) (Object) stackIn_221_0;
                                stackOut_221_1 = 1;
                                stackIn_223_0 = stackOut_221_0;
                                stackIn_223_1 = stackOut_221_1;
                                break L19;
                              }
                            }
                            ((g) (Object) stackIn_223_0).a(stackIn_223_1 != 0, param0, (byte) 76);
                            this.a(param3, ((r) this).field_u, 26025, param4);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        ((r) this).field_r = -param1;
                        return;
                      } else {
                        L20: {
                          ((r) this).field_u.d(68);
                          ((r) this).field_s = param0;
                          if (param0 != null) {
                            L21: {
                              stackOut_213_0 = ((r) this).field_u;
                              stackIn_215_0 = stackOut_213_0;
                              stackIn_214_0 = stackOut_213_0;
                              if (param2) {
                                stackOut_215_0 = (g) (Object) stackIn_215_0;
                                stackOut_215_1 = 0;
                                stackIn_216_0 = stackOut_215_0;
                                stackIn_216_1 = stackOut_215_1;
                                break L21;
                              } else {
                                stackOut_214_0 = (g) (Object) stackIn_214_0;
                                stackOut_214_1 = 1;
                                stackIn_216_0 = stackOut_214_0;
                                stackIn_216_1 = stackOut_214_1;
                                break L21;
                              }
                            }
                            ((g) (Object) stackIn_216_0).a(stackIn_216_1 != 0, param0, (byte) 76);
                            this.a(param3, ((r) this).field_u, 26025, param4);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        ((r) this).field_r = -param1;
                        return;
                      }
                    } else {
                      L22: {
                        if (null != ((r) this).field_y) {
                          ((r) this).field_A.d(111);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      L23: {
                        ((r) this).field_y = param0;
                        if (param0 != null) {
                          L24: {
                            stackOut_205_0 = ((r) this).field_A;
                            stackIn_207_0 = stackOut_205_0;
                            stackIn_206_0 = stackOut_205_0;
                            if (param2) {
                              stackOut_207_0 = (g) (Object) stackIn_207_0;
                              stackOut_207_1 = 0;
                              stackIn_208_0 = stackOut_207_0;
                              stackIn_208_1 = stackOut_207_1;
                              break L24;
                            } else {
                              stackOut_206_0 = (g) (Object) stackIn_206_0;
                              stackOut_206_1 = 1;
                              stackIn_208_0 = stackOut_206_0;
                              stackIn_208_1 = stackOut_206_1;
                              break L24;
                            }
                          }
                          ((g) (Object) stackIn_208_0).a(stackIn_208_1 != 0, param0, (byte) 52);
                          this.a(param3, ((r) this).field_A, 26025, param4);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      ((r) this).field_r = param1;
                      return;
                    }
                  }
                }
              } else {
                ((r) this).field_r = param1;
                this.a(param3, ((r) this).field_A, 26025, param4);
                return;
              }
            } else {
              L25: {
                var9 = null;
                ((r) this).b((int[]) null, -67, 0);
                stackOut_143_0 = this;
                stackIn_145_0 = stackOut_143_0;
                stackIn_144_0 = stackOut_143_0;
                if (!param2) {
                  stackOut_145_0 = this;
                  stackOut_145_1 = 0;
                  stackIn_146_0 = stackOut_145_0;
                  stackIn_146_1 = stackOut_145_1;
                  break L25;
                } else {
                  stackOut_144_0 = this;
                  stackOut_144_1 = 1;
                  stackIn_146_0 = stackOut_144_0;
                  stackIn_146_1 = stackOut_144_1;
                  break L25;
                }
              }
              ((r) this).field_w = stackIn_146_1 != 0;
              if (param0 != ((r) this).field_y) {
                if (param0 == ((r) this).field_s) {
                  ((r) this).field_r = -param1;
                  this.a(param3, ((r) this).field_u, 26025, param4);
                  return;
                } else {
                  L26: {
                    if (((r) this).field_y != null) {
                      if (((r) this).field_s != null) {
                        L27: {
                          if ((((r) this).field_z ^ -1) <= -524289) {
                            stackOut_158_0 = 0;
                            stackIn_159_0 = stackOut_158_0;
                            break L27;
                          } else {
                            stackOut_157_0 = 1;
                            stackIn_159_0 = stackOut_157_0;
                            break L27;
                          }
                        }
                        var7 = stackIn_159_0;
                        break L26;
                      } else {
                        var7 = 0;
                        break L26;
                      }
                    } else {
                      var7 = 1;
                      break L26;
                    }
                  }
                  if (var7 == 0) {
                    if (((r) this).field_s == null) {
                      L28: {
                        ((r) this).field_s = param0;
                        if (param0 != null) {
                          L29: {
                            stackOut_183_0 = ((r) this).field_u;
                            stackIn_185_0 = stackOut_183_0;
                            stackIn_184_0 = stackOut_183_0;
                            if (param2) {
                              stackOut_185_0 = (g) (Object) stackIn_185_0;
                              stackOut_185_1 = 0;
                              stackIn_186_0 = stackOut_185_0;
                              stackIn_186_1 = stackOut_185_1;
                              break L29;
                            } else {
                              stackOut_184_0 = (g) (Object) stackIn_184_0;
                              stackOut_184_1 = 1;
                              stackIn_186_0 = stackOut_184_0;
                              stackIn_186_1 = stackOut_184_1;
                              break L29;
                            }
                          }
                          ((g) (Object) stackIn_186_0).a(stackIn_186_1 != 0, param0, (byte) 76);
                          this.a(param3, ((r) this).field_u, 26025, param4);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      ((r) this).field_r = -param1;
                      return;
                    } else {
                      L30: {
                        ((r) this).field_u.d(68);
                        ((r) this).field_s = param0;
                        if (param0 != null) {
                          L31: {
                            stackOut_174_0 = ((r) this).field_u;
                            stackIn_176_0 = stackOut_174_0;
                            stackIn_175_0 = stackOut_174_0;
                            if (param2) {
                              stackOut_176_0 = (g) (Object) stackIn_176_0;
                              stackOut_176_1 = 0;
                              stackIn_177_0 = stackOut_176_0;
                              stackIn_177_1 = stackOut_176_1;
                              break L31;
                            } else {
                              stackOut_175_0 = (g) (Object) stackIn_175_0;
                              stackOut_175_1 = 1;
                              stackIn_177_0 = stackOut_175_0;
                              stackIn_177_1 = stackOut_175_1;
                              break L31;
                            }
                          }
                          ((g) (Object) stackIn_177_0).a(stackIn_177_1 != 0, param0, (byte) 76);
                          this.a(param3, ((r) this).field_u, 26025, param4);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      ((r) this).field_r = -param1;
                      return;
                    }
                  } else {
                    L32: {
                      if (null != ((r) this).field_y) {
                        ((r) this).field_A.d(111);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      ((r) this).field_y = param0;
                      if (param0 != null) {
                        L34: {
                          stackOut_166_0 = ((r) this).field_A;
                          stackIn_168_0 = stackOut_166_0;
                          stackIn_167_0 = stackOut_166_0;
                          if (param2) {
                            stackOut_168_0 = (g) (Object) stackIn_168_0;
                            stackOut_168_1 = 0;
                            stackIn_169_0 = stackOut_168_0;
                            stackIn_169_1 = stackOut_168_1;
                            break L34;
                          } else {
                            stackOut_167_0 = (g) (Object) stackIn_167_0;
                            stackOut_167_1 = 1;
                            stackIn_169_0 = stackOut_167_0;
                            stackIn_169_1 = stackOut_167_1;
                            break L34;
                          }
                        }
                        ((g) (Object) stackIn_169_0).a(stackIn_169_1 != 0, param0, (byte) 52);
                        this.a(param3, ((r) this).field_A, 26025, param4);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    ((r) this).field_r = param1;
                    return;
                  }
                }
              } else {
                ((r) this).field_r = param1;
                this.a(param3, ((r) this).field_A, 26025, param4);
                return;
              }
            }
          }
        } else {
          if (param5 <= -120) {
            L35: {
              stackOut_40_0 = this;
              stackIn_42_0 = stackOut_40_0;
              stackIn_41_0 = stackOut_40_0;
              if (!param2) {
                stackOut_42_0 = this;
                stackOut_42_1 = 0;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                break L35;
              } else {
                stackOut_41_0 = this;
                stackOut_41_1 = 1;
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                break L35;
              }
            }
            ((r) this).field_w = stackIn_43_1 != 0;
            if (param0 != ((r) this).field_y) {
              if (param0 == ((r) this).field_s) {
                ((r) this).field_r = -param1;
                this.a(param3, ((r) this).field_u, 26025, param4);
                return;
              } else {
                if (((r) this).field_y != null) {
                  if (((r) this).field_s != null) {
                    L36: {
                      if ((((r) this).field_z ^ -1) <= -524289) {
                        stackOut_95_0 = 0;
                        stackIn_96_0 = stackOut_95_0;
                        break L36;
                      } else {
                        stackOut_94_0 = 1;
                        stackIn_96_0 = stackOut_94_0;
                        break L36;
                      }
                    }
                    var7 = stackIn_96_0;
                    if (var7 == 0) {
                      if (((r) this).field_s != null) {
                        L37: {
                          ((r) this).field_u.d(68);
                          ((r) this).field_s = param0;
                          if (param0 != null) {
                            L38: {
                              stackOut_119_0 = ((r) this).field_u;
                              stackIn_121_0 = stackOut_119_0;
                              stackIn_120_0 = stackOut_119_0;
                              if (param2) {
                                stackOut_121_0 = (g) (Object) stackIn_121_0;
                                stackOut_121_1 = 0;
                                stackIn_122_0 = stackOut_121_0;
                                stackIn_122_1 = stackOut_121_1;
                                break L38;
                              } else {
                                stackOut_120_0 = (g) (Object) stackIn_120_0;
                                stackOut_120_1 = 1;
                                stackIn_122_0 = stackOut_120_0;
                                stackIn_122_1 = stackOut_120_1;
                                break L38;
                              }
                            }
                            ((g) (Object) stackIn_122_0).a(stackIn_122_1 != 0, param0, (byte) 76);
                            this.a(param3, ((r) this).field_u, 26025, param4);
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        ((r) this).field_r = -param1;
                        return;
                      } else {
                        L39: {
                          ((r) this).field_s = param0;
                          if (param0 != null) {
                            L40: {
                              stackOut_110_0 = ((r) this).field_u;
                              stackIn_112_0 = stackOut_110_0;
                              stackIn_111_0 = stackOut_110_0;
                              if (param2) {
                                stackOut_112_0 = (g) (Object) stackIn_112_0;
                                stackOut_112_1 = 0;
                                stackIn_113_0 = stackOut_112_0;
                                stackIn_113_1 = stackOut_112_1;
                                break L40;
                              } else {
                                stackOut_111_0 = (g) (Object) stackIn_111_0;
                                stackOut_111_1 = 1;
                                stackIn_113_0 = stackOut_111_0;
                                stackIn_113_1 = stackOut_111_1;
                                break L40;
                              }
                            }
                            ((g) (Object) stackIn_113_0).a(stackIn_113_1 != 0, param0, (byte) 76);
                            this.a(param3, ((r) this).field_u, 26025, param4);
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        ((r) this).field_r = -param1;
                        return;
                      }
                    } else {
                      L41: {
                        if (null != ((r) this).field_y) {
                          ((r) this).field_A.d(111);
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      L42: {
                        ((r) this).field_y = param0;
                        if (param0 != null) {
                          L43: {
                            stackOut_102_0 = ((r) this).field_A;
                            stackIn_104_0 = stackOut_102_0;
                            stackIn_103_0 = stackOut_102_0;
                            if (param2) {
                              stackOut_104_0 = (g) (Object) stackIn_104_0;
                              stackOut_104_1 = 0;
                              stackIn_105_0 = stackOut_104_0;
                              stackIn_105_1 = stackOut_104_1;
                              break L43;
                            } else {
                              stackOut_103_0 = (g) (Object) stackIn_103_0;
                              stackOut_103_1 = 1;
                              stackIn_105_0 = stackOut_103_0;
                              stackIn_105_1 = stackOut_103_1;
                              break L43;
                            }
                          }
                          ((g) (Object) stackIn_105_0).a(stackIn_105_1 != 0, param0, (byte) 52);
                          this.a(param3, ((r) this).field_A, 26025, param4);
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      ((r) this).field_r = param1;
                      return;
                    }
                  } else {
                    L44: {
                      var7 = 0;
                      if (var7 != 0) {
                        L45: {
                          if (null != ((r) this).field_y) {
                            ((r) this).field_A.d(111);
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        L46: {
                          ((r) this).field_y = param0;
                          if (param0 != null) {
                            L47: {
                              stackOut_87_0 = ((r) this).field_A;
                              stackIn_89_0 = stackOut_87_0;
                              stackIn_88_0 = stackOut_87_0;
                              if (param2) {
                                stackOut_89_0 = (g) (Object) stackIn_89_0;
                                stackOut_89_1 = 0;
                                stackIn_90_0 = stackOut_89_0;
                                stackIn_90_1 = stackOut_89_1;
                                break L47;
                              } else {
                                stackOut_88_0 = (g) (Object) stackIn_88_0;
                                stackOut_88_1 = 1;
                                stackIn_90_0 = stackOut_88_0;
                                stackIn_90_1 = stackOut_88_1;
                                break L47;
                              }
                            }
                            ((g) (Object) stackIn_90_0).a(stackIn_90_1 != 0, param0, (byte) 52);
                            this.a(param3, ((r) this).field_A, 26025, param4);
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        ((r) this).field_r = param1;
                        break L44;
                      } else {
                        L48: {
                          if (((r) this).field_s == null) {
                            break L48;
                          } else {
                            ((r) this).field_u.d(68);
                            break L48;
                          }
                        }
                        L49: {
                          ((r) this).field_s = param0;
                          if (param0 != null) {
                            L50: {
                              stackOut_77_0 = ((r) this).field_u;
                              stackIn_79_0 = stackOut_77_0;
                              stackIn_78_0 = stackOut_77_0;
                              if (param2) {
                                stackOut_79_0 = (g) (Object) stackIn_79_0;
                                stackOut_79_1 = 0;
                                stackIn_80_0 = stackOut_79_0;
                                stackIn_80_1 = stackOut_79_1;
                                break L50;
                              } else {
                                stackOut_78_0 = (g) (Object) stackIn_78_0;
                                stackOut_78_1 = 1;
                                stackIn_80_0 = stackOut_78_0;
                                stackIn_80_1 = stackOut_78_1;
                                break L50;
                              }
                            }
                            ((g) (Object) stackIn_80_0).a(stackIn_80_1 != 0, param0, (byte) 76);
                            this.a(param3, ((r) this).field_u, 26025, param4);
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        ((r) this).field_r = -param1;
                        break L44;
                      }
                    }
                    return;
                  }
                } else {
                  L51: {
                    var7 = 1;
                    if (var7 != 0) {
                      L52: {
                        if (null != ((r) this).field_y) {
                          ((r) this).field_A.d(111);
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                      L53: {
                        ((r) this).field_y = param0;
                        if (param0 != null) {
                          L54: {
                            stackOut_65_0 = ((r) this).field_A;
                            stackIn_67_0 = stackOut_65_0;
                            stackIn_66_0 = stackOut_65_0;
                            if (param2) {
                              stackOut_67_0 = (g) (Object) stackIn_67_0;
                              stackOut_67_1 = 0;
                              stackIn_68_0 = stackOut_67_0;
                              stackIn_68_1 = stackOut_67_1;
                              break L54;
                            } else {
                              stackOut_66_0 = (g) (Object) stackIn_66_0;
                              stackOut_66_1 = 1;
                              stackIn_68_0 = stackOut_66_0;
                              stackIn_68_1 = stackOut_66_1;
                              break L54;
                            }
                          }
                          ((g) (Object) stackIn_68_0).a(stackIn_68_1 != 0, param0, (byte) 52);
                          this.a(param3, ((r) this).field_A, 26025, param4);
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                      ((r) this).field_r = param1;
                      break L51;
                    } else {
                      L55: {
                        if (((r) this).field_s == null) {
                          break L55;
                        } else {
                          ((r) this).field_u.d(68);
                          break L55;
                        }
                      }
                      L56: {
                        ((r) this).field_s = param0;
                        if (param0 != null) {
                          L57: {
                            stackOut_55_0 = ((r) this).field_u;
                            stackIn_57_0 = stackOut_55_0;
                            stackIn_56_0 = stackOut_55_0;
                            if (param2) {
                              stackOut_57_0 = (g) (Object) stackIn_57_0;
                              stackOut_57_1 = 0;
                              stackIn_58_0 = stackOut_57_0;
                              stackIn_58_1 = stackOut_57_1;
                              break L57;
                            } else {
                              stackOut_56_0 = (g) (Object) stackIn_56_0;
                              stackOut_56_1 = 1;
                              stackIn_58_0 = stackOut_56_0;
                              stackIn_58_1 = stackOut_56_1;
                              break L57;
                            }
                          }
                          ((g) (Object) stackIn_58_0).a(stackIn_58_1 != 0, param0, (byte) 76);
                          this.a(param3, ((r) this).field_u, 26025, param4);
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                      ((r) this).field_r = -param1;
                      break L51;
                    }
                  }
                  return;
                }
              }
            } else {
              ((r) this).field_r = param1;
              this.a(param3, ((r) this).field_A, 26025, param4);
              return;
            }
          } else {
            L58: {
              var9 = null;
              ((r) this).b((int[]) null, -67, 0);
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param2) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L58;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L58;
              }
            }
            ((r) this).field_w = stackIn_5_1 != 0;
            if (param0 != ((r) this).field_y) {
              if (param0 == ((r) this).field_s) {
                ((r) this).field_r = -param1;
                this.a(param3, ((r) this).field_u, 26025, param4);
                return;
              } else {
                L59: {
                  if (((r) this).field_y != null) {
                    if (((r) this).field_s != null) {
                      L60: {
                        if ((((r) this).field_z ^ -1) <= -524289) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L60;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L60;
                        }
                      }
                      var7 = stackIn_18_0;
                      break L59;
                    } else {
                      var7 = 0;
                      break L59;
                    }
                  } else {
                    var7 = 1;
                    break L59;
                  }
                }
                L61: {
                  if (var7 != 0) {
                    L62: {
                      if (null != ((r) this).field_y) {
                        ((r) this).field_A.d(111);
                        break L62;
                      } else {
                        break L62;
                      }
                    }
                    L63: {
                      ((r) this).field_y = param0;
                      if (param0 != null) {
                        L64: {
                          stackOut_34_0 = ((r) this).field_A;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_35_0 = stackOut_34_0;
                          if (param2) {
                            stackOut_36_0 = (g) (Object) stackIn_36_0;
                            stackOut_36_1 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            break L64;
                          } else {
                            stackOut_35_0 = (g) (Object) stackIn_35_0;
                            stackOut_35_1 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            stackIn_37_1 = stackOut_35_1;
                            break L64;
                          }
                        }
                        ((g) (Object) stackIn_37_0).a(stackIn_37_1 != 0, param0, (byte) 52);
                        this.a(param3, ((r) this).field_A, 26025, param4);
                        break L63;
                      } else {
                        break L63;
                      }
                    }
                    ((r) this).field_r = param1;
                    break L61;
                  } else {
                    L65: {
                      if (((r) this).field_s == null) {
                        break L65;
                      } else {
                        ((r) this).field_u.d(68);
                        break L65;
                      }
                    }
                    L66: {
                      ((r) this).field_s = param0;
                      if (param0 != null) {
                        L67: {
                          stackOut_24_0 = ((r) this).field_u;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (param2) {
                            stackOut_26_0 = (g) (Object) stackIn_26_0;
                            stackOut_26_1 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            break L67;
                          } else {
                            stackOut_25_0 = (g) (Object) stackIn_25_0;
                            stackOut_25_1 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            break L67;
                          }
                        }
                        ((g) (Object) stackIn_27_0).a(stackIn_27_1 != 0, param0, (byte) 76);
                        this.a(param3, ((r) this).field_u, 26025, param4);
                        break L66;
                      } else {
                        break L66;
                      }
                    }
                    ((r) this).field_r = -param1;
                    break L61;
                  }
                }
                return;
              }
            } else {
              ((r) this).field_r = param1;
              this.a(param3, ((r) this).field_A, 26025, param4);
              return;
            }
          }
        }
    }

    final static boolean d(int param0) {
        if (param0 != 0) {
            return true;
        }
        if (wa.field_e == null) {
            return false;
        }
        if (li.field_a != qi.field_p) {
            return false;
        }
        return true;
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_191_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var11 = TetraLink.field_J;
        if (((r) this).field_E > 0) {
          L0: {
            if (((r) this).field_w) {
              L1: {
                if ((((r) this).field_r ^ -1) >= -1) {
                  break L1;
                } else {
                  if (!((r) this).field_A.d((byte) -54)) {
                    ((r) this).field_y = null;
                    ((r) this).field_r = -((r) this).field_r;
                    ((r) this).field_w = false;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((r) this).field_r >= 0) {
                break L0;
              } else {
                if (!((r) this).field_u.d((byte) 78)) {
                  ((r) this).field_r = -((r) this).field_r;
                  ((r) this).field_w = false;
                  ((r) this).field_s = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = (((r) this).field_z >> 654791724) * ((r) this).field_E / 256;
            var5 = -var4 + ((r) this).field_E;
            if (((r) this).field_r != 0) {
              ((r) this).field_z = ((r) this).field_z + param2 * ((r) this).field_r;
              if (((r) this).field_z >= 1048576) {
                ((r) this).field_z = 1048576;
                if (((r) this).field_w) {
                  break L2;
                } else {
                  ((r) this).field_r = 0;
                  if (((r) this).field_B) {
                    break L2;
                  } else {
                    if (((r) this).field_s == null) {
                      ((r) this).field_s = null;
                      break L2;
                    } else {
                      ((r) this).field_u.d(105);
                      ((r) this).field_s = null;
                      break L2;
                    }
                  }
                }
              } else {
                if (0 >= ((r) this).field_z) {
                  ((r) this).field_z = 0;
                  if (((r) this).field_w) {
                    break L2;
                  } else {
                    ((r) this).field_r = 0;
                    if (((r) this).field_B) {
                      break L2;
                    } else {
                      L3: {
                        if (((r) this).field_y != null) {
                          ((r) this).field_A.d(111);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((r) this).field_y = null;
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (!nk.field_s) {
              stackOut_31_0 = param2;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            } else {
              stackOut_30_0 = param2 << 1451994497;
              stackIn_32_0 = stackOut_30_0;
              break L4;
            }
          }
          var6 = stackIn_32_0;
          if (256 > ((r) this).field_D) {
            L5: {
              if (null != ((r) this).field_y) {
                break L5;
              } else {
                if (null != ((r) this).field_s) {
                  break L5;
                } else {
                  if (((r) this).field_C != null) {
                    if (-1 != (((r) this).field_D ^ -1)) {
                      if (((r) this).field_x != null) {
                        if (((r) this).field_x.length < var6) {
                          L6: {
                            ((r) this).field_x = new int[var6];
                            ((r) this).field_F = new int[var6];
                            ((r) this).field_t.b(((r) this).field_x, 0, param2);
                            if (!nk.field_s) {
                              stackOut_85_0 = param1;
                              stackIn_86_0 = stackOut_85_0;
                              break L6;
                            } else {
                              param1 = param1 << 1;
                              stackOut_84_0 = param1 << 1;
                              stackIn_86_0 = stackOut_84_0;
                              break L6;
                            }
                          }
                          var7 = stackIn_86_0;
                          var8 = ((r) this).field_E * ((r) this).field_D / 256;
                          var9 = -var8 + ((r) this).field_E;
                          var10 = 0;
                          L7: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                              var10++;
                              continue L7;
                            }
                          }
                        } else {
                          L8: {
                            rd.a(((r) this).field_x, 0, var6);
                            ((r) this).field_t.b(((r) this).field_x, 0, param2);
                            if (!nk.field_s) {
                              stackOut_78_0 = param1;
                              stackIn_79_0 = stackOut_78_0;
                              break L8;
                            } else {
                              param1 = param1 << 1;
                              stackOut_77_0 = param1 << 1;
                              stackIn_79_0 = stackOut_77_0;
                              break L8;
                            }
                          }
                          var7 = stackIn_79_0;
                          var8 = ((r) this).field_E * ((r) this).field_D / 256;
                          var9 = -var8 + ((r) this).field_E;
                          var10 = 0;
                          L9: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        L10: {
                          ((r) this).field_x = new int[var6];
                          ((r) this).field_F = new int[var6];
                          ((r) this).field_t.b(((r) this).field_x, 0, param2);
                          if (!nk.field_s) {
                            stackOut_70_0 = param1;
                            stackIn_71_0 = stackOut_70_0;
                            break L10;
                          } else {
                            param1 = param1 << 1;
                            stackOut_69_0 = param1 << 1;
                            stackIn_71_0 = stackOut_69_0;
                            break L10;
                          }
                        }
                        var7 = stackIn_71_0;
                        var8 = ((r) this).field_E * ((r) this).field_D / 256;
                        var9 = -var8 + ((r) this).field_E;
                        var10 = 0;
                        L11: while (true) {
                          if (var6 <= var10) {
                            return;
                          } else {
                            param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                            var10++;
                            continue L11;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (var4 == 256) {
              ((r) this).field_A.b(param0, param1, param2);
              if (((r) this).field_C != null) {
                if (-1 != (((r) this).field_D ^ -1)) {
                  if (((r) this).field_x != null) {
                    if (((r) this).field_x.length >= var6) {
                      L12: {
                        rd.a(((r) this).field_x, 0, var6);
                        ((r) this).field_t.b(((r) this).field_x, 0, param2);
                        if (!nk.field_s) {
                          stackOut_163_0 = param1;
                          stackIn_164_0 = stackOut_163_0;
                          break L12;
                        } else {
                          param1 = param1 << 1;
                          stackOut_162_0 = param1 << 1;
                          stackIn_164_0 = stackOut_162_0;
                          break L12;
                        }
                      }
                      var7 = stackIn_164_0;
                      var8 = ((r) this).field_E * ((r) this).field_D / 256;
                      var9 = -var8 + ((r) this).field_E;
                      var10 = 0;
                      L13: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      L14: {
                        ((r) this).field_x = new int[var6];
                        ((r) this).field_F = new int[var6];
                        ((r) this).field_t.b(((r) this).field_x, 0, param2);
                        if (!nk.field_s) {
                          stackOut_155_0 = param1;
                          stackIn_156_0 = stackOut_155_0;
                          break L14;
                        } else {
                          param1 = param1 << 1;
                          stackOut_154_0 = param1 << 1;
                          stackIn_156_0 = stackOut_154_0;
                          break L14;
                        }
                      }
                      var7 = stackIn_156_0;
                      var8 = ((r) this).field_E * ((r) this).field_D / 256;
                      var9 = -var8 + ((r) this).field_E;
                      var10 = 0;
                      L15: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  } else {
                    L16: {
                      ((r) this).field_x = new int[var6];
                      ((r) this).field_F = new int[var6];
                      ((r) this).field_t.b(((r) this).field_x, 0, param2);
                      if (!nk.field_s) {
                        stackOut_147_0 = param1;
                        stackIn_148_0 = stackOut_147_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_146_0 = param1 << 1;
                        stackIn_148_0 = stackOut_146_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_148_0;
                    var8 = ((r) this).field_E * ((r) this).field_D / 256;
                    var9 = -var8 + ((r) this).field_E;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L18: {
                if (var5 != 256) {
                  L19: {
                    if (null == ((r) this).field_x) {
                      break L19;
                    } else {
                      if (((r) this).field_x.length >= var6) {
                        L20: {
                          rd.a(((r) this).field_x, 0, var6);
                          rd.a(((r) this).field_F, 0, var6);
                          ((r) this).field_A.b(((r) this).field_x, 0, param2);
                          ((r) this).field_u.b(((r) this).field_F, 0, param2);
                          if (nk.field_s) {
                            param1 = param1 << 1;
                            stackOut_100_0 = param1 << 1;
                            stackIn_101_0 = stackOut_100_0;
                            break L20;
                          } else {
                            stackOut_99_0 = param1;
                            stackIn_101_0 = stackOut_99_0;
                            break L20;
                          }
                        }
                        var7 = stackIn_101_0;
                        var8 = 0;
                        L21: while (true) {
                          if (var6 <= var8) {
                            if (((r) this).field_C != null) {
                              if (-1 != (((r) this).field_D ^ -1)) {
                                if (((r) this).field_x != null) {
                                  if (((r) this).field_x.length < var6) {
                                    L22: {
                                      ((r) this).field_x = new int[var6];
                                      ((r) this).field_F = new int[var6];
                                      ((r) this).field_t.b(((r) this).field_x, 0, param2);
                                      if (!nk.field_s) {
                                        stackOut_126_0 = param1;
                                        stackIn_127_0 = stackOut_126_0;
                                        break L22;
                                      } else {
                                        param1 = param1 << 1;
                                        stackOut_125_0 = param1 << 1;
                                        stackIn_127_0 = stackOut_125_0;
                                        break L22;
                                      }
                                    }
                                    var7 = stackIn_127_0;
                                    var8 = ((r) this).field_E * ((r) this).field_D / 256;
                                    var9 = -var8 + ((r) this).field_E;
                                    var10 = 0;
                                    L23: while (true) {
                                      if (var6 <= var10) {
                                        return;
                                      } else {
                                        param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                                        var10++;
                                        continue L23;
                                      }
                                    }
                                  } else {
                                    L24: {
                                      rd.a(((r) this).field_x, 0, var6);
                                      ((r) this).field_t.b(((r) this).field_x, 0, param2);
                                      if (!nk.field_s) {
                                        stackOut_119_0 = param1;
                                        stackIn_120_0 = stackOut_119_0;
                                        break L24;
                                      } else {
                                        param1 = param1 << 1;
                                        stackOut_118_0 = param1 << 1;
                                        stackIn_120_0 = stackOut_118_0;
                                        break L24;
                                      }
                                    }
                                    var7 = stackIn_120_0;
                                    var8 = ((r) this).field_E * ((r) this).field_D / 256;
                                    var9 = -var8 + ((r) this).field_E;
                                    var10 = 0;
                                    L25: while (true) {
                                      if (var6 <= var10) {
                                        return;
                                      } else {
                                        param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                                        var10++;
                                        continue L25;
                                      }
                                    }
                                  }
                                } else {
                                  L26: {
                                    ((r) this).field_x = new int[var6];
                                    ((r) this).field_F = new int[var6];
                                    ((r) this).field_t.b(((r) this).field_x, 0, param2);
                                    if (!nk.field_s) {
                                      stackOut_111_0 = param1;
                                      stackIn_112_0 = stackOut_111_0;
                                      break L26;
                                    } else {
                                      param1 = param1 << 1;
                                      stackOut_110_0 = param1 << 1;
                                      stackIn_112_0 = stackOut_110_0;
                                      break L26;
                                    }
                                  }
                                  var7 = stackIn_112_0;
                                  var8 = ((r) this).field_E * ((r) this).field_D / 256;
                                  var9 = -var8 + ((r) this).field_E;
                                  var10 = 0;
                                  L27: while (true) {
                                    if (var6 <= var10) {
                                      return;
                                    } else {
                                      param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                                      var10++;
                                      continue L27;
                                    }
                                  }
                                }
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            param0[var7 + var8] = param0[var7 + var8] + (var5 * ((r) this).field_F[var8] + ((r) this).field_x[var8] * var4 >> -1406840280);
                            var8++;
                            continue L21;
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                  }
                  ((r) this).field_F = new int[var6];
                  ((r) this).field_x = new int[var6];
                  L28: {
                    ((r) this).field_A.b(((r) this).field_x, 0, param2);
                    ((r) this).field_u.b(((r) this).field_F, 0, param2);
                    if (nk.field_s) {
                      param1 = param1 << 1;
                      stackOut_135_0 = param1 << 1;
                      stackIn_136_0 = stackOut_135_0;
                      break L28;
                    } else {
                      stackOut_134_0 = param1;
                      stackIn_136_0 = stackOut_134_0;
                      break L28;
                    }
                  }
                  var7 = stackIn_136_0;
                  var8 = 0;
                  L29: while (true) {
                    if (var6 <= var8) {
                      break L18;
                    } else {
                      param0[var7 + var8] = param0[var7 + var8] + (var5 * ((r) this).field_F[var8] + ((r) this).field_x[var8] * var4 >> -1406840280);
                      var8++;
                      continue L29;
                    }
                  }
                } else {
                  ((r) this).field_u.b(param0, param1, param2);
                  break L18;
                }
              }
              if (((r) this).field_C == null) {
                return;
              } else {
                if (-1 != (((r) this).field_D ^ -1)) {
                  if (((r) this).field_x == null) {
                    L30: {
                      ((r) this).field_x = new int[var6];
                      ((r) this).field_F = new int[var6];
                      ((r) this).field_t.b(((r) this).field_x, 0, param2);
                      if (!nk.field_s) {
                        stackOut_183_0 = param1;
                        stackIn_184_0 = stackOut_183_0;
                        break L30;
                      } else {
                        param1 = param1 << 1;
                        stackOut_182_0 = param1 << 1;
                        stackIn_184_0 = stackOut_182_0;
                        break L30;
                      }
                    }
                    var7 = stackIn_184_0;
                    var8 = ((r) this).field_E * ((r) this).field_D / 256;
                    var9 = -var8 + ((r) this).field_E;
                    var10 = 0;
                    L31: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                        var10++;
                        continue L31;
                      }
                    }
                  } else {
                    if (((r) this).field_x.length >= var6) {
                      L32: {
                        rd.a(((r) this).field_x, 0, var6);
                        ((r) this).field_t.b(((r) this).field_x, 0, param2);
                        if (!nk.field_s) {
                          stackOut_190_0 = param1;
                          stackIn_191_0 = stackOut_190_0;
                          break L32;
                        } else {
                          param1 = param1 << 1;
                          stackOut_189_0 = param1 << 1;
                          stackIn_191_0 = stackOut_189_0;
                          break L32;
                        }
                      }
                      var7 = stackIn_191_0;
                      var8 = ((r) this).field_E * ((r) this).field_D / 256;
                      var9 = -var8 + ((r) this).field_E;
                      var10 = 0;
                      L33: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                          var10++;
                          continue L33;
                        }
                      }
                    } else {
                      L34: {
                        ((r) this).field_x = new int[var6];
                        ((r) this).field_F = new int[var6];
                        ((r) this).field_t.b(((r) this).field_x, 0, param2);
                        if (!nk.field_s) {
                          stackOut_176_0 = param1;
                          stackIn_177_0 = stackOut_176_0;
                          break L34;
                        } else {
                          param1 = param1 << 1;
                          stackOut_175_0 = param1 << 1;
                          stackIn_177_0 = stackOut_175_0;
                          break L34;
                        }
                      }
                      var7 = stackIn_177_0;
                      var8 = ((r) this).field_E * ((r) this).field_D / 256;
                      var9 = -var8 + ((r) this).field_E;
                      var10 = 0;
                      L35: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                          var10++;
                          continue L35;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            if (((r) this).field_C != null) {
              if (-1 != (((r) this).field_D ^ -1)) {
                if (((r) this).field_x != null) {
                  if (((r) this).field_x.length < var6) {
                    L36: {
                      ((r) this).field_x = new int[var6];
                      ((r) this).field_F = new int[var6];
                      ((r) this).field_t.b(((r) this).field_x, 0, param2);
                      if (!nk.field_s) {
                        stackOut_55_0 = param1;
                        stackIn_56_0 = stackOut_55_0;
                        break L36;
                      } else {
                        param1 = param1 << 1;
                        stackOut_54_0 = param1 << 1;
                        stackIn_56_0 = stackOut_54_0;
                        break L36;
                      }
                    }
                    var7 = stackIn_56_0;
                    var8 = ((r) this).field_E * ((r) this).field_D / 256;
                    var9 = -var8 + ((r) this).field_E;
                    var10 = 0;
                    L37: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                        var10++;
                        continue L37;
                      }
                    }
                  } else {
                    L38: {
                      rd.a(((r) this).field_x, 0, var6);
                      ((r) this).field_t.b(((r) this).field_x, 0, param2);
                      if (!nk.field_s) {
                        stackOut_48_0 = param1;
                        stackIn_49_0 = stackOut_48_0;
                        break L38;
                      } else {
                        param1 = param1 << 1;
                        stackOut_47_0 = param1 << 1;
                        stackIn_49_0 = stackOut_47_0;
                        break L38;
                      }
                    }
                    var7 = stackIn_49_0;
                    var8 = ((r) this).field_E * ((r) this).field_D / 256;
                    var9 = -var8 + ((r) this).field_E;
                    var10 = 0;
                    L39: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                        var10++;
                        continue L39;
                      }
                    }
                  }
                } else {
                  L40: {
                    ((r) this).field_x = new int[var6];
                    ((r) this).field_F = new int[var6];
                    ((r) this).field_t.b(((r) this).field_x, 0, param2);
                    if (!nk.field_s) {
                      stackOut_40_0 = param1;
                      stackIn_41_0 = stackOut_40_0;
                      break L40;
                    } else {
                      param1 = param1 << 1;
                      stackOut_39_0 = param1 << 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L40;
                    }
                  }
                  var7 = stackIn_41_0;
                  var8 = ((r) this).field_E * ((r) this).field_D / 256;
                  var9 = -var8 + ((r) this).field_E;
                  var10 = 0;
                  L41: while (true) {
                    if (var6 <= var10) {
                      return;
                    } else {
                      param0[var10 + var7] = ((r) this).field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                      var10++;
                      continue L41;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ((r) this).a(param2);
          return;
        }
    }

    public static void c(int param0) {
        int var1 = 57 / ((-10 - param0) / 44);
        field_v = null;
    }

    final synchronized void b(int param0, int param1) {
        ((r) this).field_E = param0;
        if (param1 != 1) {
            ((r) this).field_w = false;
        }
    }

    final synchronized int a() {
        return 2;
    }

    final eb b() {
        return null;
    }

    final static fj a(int param0, int param1, int param2, int param3) {
        fj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fj var8_ref_fj = null;
        int var9 = 0;
        fj var9_ref_fj = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        var13 = TetraLink.field_J;
        id.field_M.field_Pb.field_fb.b(1);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = pl.field_d + -1;
        L0: while (true) {
          if (-1 < (var7 ^ -1)) {
            var7 = 0;
            var8 = param3;
            L1: while (true) {
              if (pl.field_d <= var8) {
                var8 = id.field_M.field_Pb.field_mb + id.field_M.field_Pb.field_R - var7 - -var6;
                id.field_M.field_Pb.field_yb = id.field_M.field_Pb.field_yb + var8;
                id.field_M.field_Pb.field_R = id.field_M.field_Pb.field_R - var8;
                if (!hg.field_c) {
                  if (!hg.field_c) {
                    id.field_M.field_Pb.field_mb = -id.field_M.field_Pb.field_R + var7;
                    if (cl.field_e) {
                      if (gn.field_I != null) {
                        L2: {
                          fi.field_Cb = true;
                          var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                          if (fi.field_Cb) {
                            id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        L3: {
                          id.field_M.a(-1, true, param1 * param2 * 2, param2);
                          if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                            stackOut_109_0 = 0;
                            stackIn_110_0 = stackOut_109_0;
                            break L3;
                          } else {
                            stackOut_108_0 = 1;
                            stackIn_110_0 = stackOut_108_0;
                            break L3;
                          }
                        }
                        fi.field_Cb = stackIn_110_0 != 0;
                        return var4;
                      } else {
                        L4: {
                          var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                          if (fi.field_Cb) {
                            id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          id.field_M.a(-1, true, param1 * param2 * 2, param2);
                          if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                            stackOut_102_0 = 0;
                            stackIn_103_0 = stackOut_102_0;
                            break L5;
                          } else {
                            stackOut_101_0 = 1;
                            stackIn_103_0 = stackOut_101_0;
                            break L5;
                          }
                        }
                        fi.field_Cb = stackIn_103_0 != 0;
                        return var4;
                      }
                    } else {
                      L6: {
                        var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                        if (fi.field_Cb) {
                          id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        id.field_M.a(-1, true, param1 * param2 * 2, param2);
                        if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                          stackOut_94_0 = 0;
                          stackIn_95_0 = stackOut_94_0;
                          break L7;
                        } else {
                          stackOut_93_0 = 1;
                          stackIn_95_0 = stackOut_93_0;
                          break L7;
                        }
                      }
                      fi.field_Cb = stackIn_95_0 != 0;
                      return var4;
                    }
                  } else {
                    fi.field_Cb = true;
                    hg.field_c = false;
                    id.field_M.field_Pb.field_Db = 0;
                    id.field_M.field_Pb.field_yb = -id.field_M.field_Pb.field_R + id.field_M.field_Ob.field_R;
                    id.field_M.field_Pb.field_mb = -id.field_M.field_Pb.field_R + var7;
                    if (cl.field_e) {
                      if (gn.field_I == null) {
                        L8: {
                          var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                          if (fi.field_Cb) {
                            id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          id.field_M.a(-1, true, param1 * param2 * 2, param2);
                          if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                            stackOut_85_0 = 0;
                            stackIn_86_0 = stackOut_85_0;
                            break L9;
                          } else {
                            stackOut_84_0 = 1;
                            stackIn_86_0 = stackOut_84_0;
                            break L9;
                          }
                        }
                        fi.field_Cb = stackIn_86_0 != 0;
                        return var4;
                      } else {
                        L10: {
                          fi.field_Cb = true;
                          var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                          if (fi.field_Cb) {
                            id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          id.field_M.a(-1, true, param1 * param2 * 2, param2);
                          if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                            stackOut_78_0 = 0;
                            stackIn_79_0 = stackOut_78_0;
                            break L11;
                          } else {
                            stackOut_77_0 = 1;
                            stackIn_79_0 = stackOut_77_0;
                            break L11;
                          }
                        }
                        fi.field_Cb = stackIn_79_0 != 0;
                        return var4;
                      }
                    } else {
                      L12: {
                        var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                        if (fi.field_Cb) {
                          id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        id.field_M.a(-1, true, param1 * param2 * 2, param2);
                        if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                          stackOut_70_0 = 0;
                          stackIn_71_0 = stackOut_70_0;
                          break L13;
                        } else {
                          stackOut_69_0 = 1;
                          stackIn_71_0 = stackOut_69_0;
                          break L13;
                        }
                      }
                      fi.field_Cb = stackIn_71_0 != 0;
                      return var4;
                    }
                  }
                } else {
                  id.field_M.field_Pb.field_R = var7;
                  if (hg.field_c) {
                    fi.field_Cb = true;
                    hg.field_c = false;
                    id.field_M.field_Pb.field_Db = 0;
                    id.field_M.field_Pb.field_yb = -id.field_M.field_Pb.field_R + id.field_M.field_Ob.field_R;
                    id.field_M.field_Pb.field_mb = -id.field_M.field_Pb.field_R + var7;
                    if (cl.field_e) {
                      if (gn.field_I != null) {
                        L14: {
                          fi.field_Cb = true;
                          var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                          if (fi.field_Cb) {
                            id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          id.field_M.a(-1, true, param1 * param2 * 2, param2);
                          if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                            stackOut_60_0 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            break L15;
                          } else {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L15;
                          }
                        }
                        fi.field_Cb = stackIn_61_0 != 0;
                        return var4;
                      } else {
                        L16: {
                          var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                          if (fi.field_Cb) {
                            id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          id.field_M.a(-1, true, param1 * param2 * 2, param2);
                          if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L17;
                          } else {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L17;
                          }
                        }
                        fi.field_Cb = stackIn_54_0 != 0;
                        return var4;
                      }
                    } else {
                      L18: {
                        var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                        if (fi.field_Cb) {
                          id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        id.field_M.a(-1, true, param1 * param2 * 2, param2);
                        if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                          stackOut_45_0 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          break L19;
                        } else {
                          stackOut_44_0 = 1;
                          stackIn_46_0 = stackOut_44_0;
                          break L19;
                        }
                      }
                      fi.field_Cb = stackIn_46_0 != 0;
                      return var4;
                    }
                  } else {
                    L20: {
                      id.field_M.field_Pb.field_mb = -id.field_M.field_Pb.field_R + var7;
                      if (!cl.field_e) {
                        break L20;
                      } else {
                        if (gn.field_I == null) {
                          break L20;
                        } else {
                          fi.field_Cb = true;
                          break L20;
                        }
                      }
                    }
                    L21: {
                      var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                      if (fi.field_Cb) {
                        id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      id.field_M.a(-1, true, param1 * param2 * 2, param2);
                      if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        break L22;
                      } else {
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        break L22;
                      }
                    }
                    fi.field_Cb = stackIn_38_0 != 0;
                    return var4;
                  }
                }
              } else {
                var9_ref_fj = n.field_L[var8];
                if (var9_ref_fj.field_f != null) {
                  id.field_M.field_Pb.a((byte) -118, var9_ref_fj.field_f);
                  var9_ref_fj.field_f.a((byte) -126, var9_ref_fj.field_f.f(param3 + -121), var7, param2, param0);
                  var7 = var7 + param2;
                  if (-1 != (var9_ref_fj.field_f.field_F ^ -1)) {
                    var4 = var9_ref_fj;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L23: {
              var8_ref_fj = n.field_L[var7];
              var9 = 0;
              if (cd.field_a) {
                break L23;
              } else {
                if (var5 >= fh.field_a) {
                  break L23;
                } else {
                  var10_int = fh.a((byte) 79, var8_ref_fj.field_i);
                  if (var8_ref_fj.a((byte) -63) < var10_int) {
                    break L23;
                  } else {
                    L24: {
                      if (var8_ref_fj.field_l) {
                        break L24;
                      } else {
                        if (!sb.a((byte) 2, var8_ref_fj.field_n)) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    var9 = 1;
                    break L23;
                  }
                }
              }
            }
            if (var9 != 0) {
              L25: {
                if (null == var8_ref_fj.field_f) {
                  break L25;
                } else {
                  if (hg.field_c) {
                    break L25;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L26: {
                if (var8_ref_fj.field_f == null) {
                  lb.field_R = lb.field_R + 1;
                  break L26;
                } else {
                  break L26;
                }
              }
              var10 = u.a(18440, var8_ref_fj);
              var11 = var10 + jb.c(var8_ref_fj.field_h);
              var12 = fi.a((byte) 100, var8_ref_fj);
              var8_ref_fj.field_f = new hl(0L, ll.field_A, var11);
              var6 = var6 + param2;
              var8_ref_fj.field_f.field_ib = var12 - (((var12 & 16711422) >> 1739337569) - ((16711423 & ll.field_A.field_ib) >> -1618365503));
              var8_ref_fj.field_f.field_N = var12;
              var8_ref_fj.field_f.field_L = -((var12 & 16711422) >> -2050513791) + (var12 + (8355711 & ll.field_A.field_L >> -790971679));
              var8_ref_fj.field_f.field_Ib = we.field_k;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_fj.field_f = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    final eb c() {
        return null;
    }

    private r() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Public";
    }
}
