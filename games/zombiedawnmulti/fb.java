/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static qd field_e;
    int field_m;
    private int field_n;
    static String field_g;
    private boolean field_k;
    private int field_c;
    private int field_f;
    static int[] field_d;
    private int field_j;
    int field_l;
    private int field_a;
    private int field_i;
    private int field_h;
    boolean field_b;

    final boolean b(byte param0) {
        if (param0 < 14) {
            ((fb) this).field_c = -121;
            return ((fb) this).field_k;
        }
        return ((fb) this).field_k;
    }

    public static void d(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        if (param0 > -29) {
            field_d = null;
        }
    }

    final int a(int param0, byte param1) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 <= -43) {
          if (!((fb) this).field_b) {
            if (((fb) this).field_h <= 55) {
              return -1;
            } else {
              L0: {
                L1: {
                  if (param0 + -((fb) this).field_m <= 0) {
                    break L1;
                  } else {
                    if (-((fb) this).field_m + param0 >= 40) {
                      break L1;
                    } else {
                      stackOut_16_0 = ((fb) this).field_n;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = -1;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0;
            }
          } else {
            return -1;
          }
        } else {
          ((fb) this).field_b = false;
          if (!((fb) this).field_b) {
            if (((fb) this).field_h > 55) {
              if (param0 + -((fb) this).field_m > 0) {
                if (-((fb) this).field_m + param0 >= 40) {
                  return -1;
                } else {
                  return ((fb) this).field_n;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final static void a(ob param0, byte param1) {
        try {
            param0.field_D = new char[]{'?'};
            int var2_int = 54;
            param0.field_B = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "fb.A(" + (param0 != null ? "{...}" : "null") + 44 + -19 + 41);
        }
    }

    final static void a(int param0, int param1) {
        jk.field_j = param0;
        if (param1 < 43) {
            fb.d(-36);
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        var4 = Math.abs(20 + (((fb) this).field_m - param2));
        if (param0 < 81) {
          return 73;
        } else {
          L0: {
            var5 = 480 - param1;
            var6 = 55;
            var7 = (float)(-(var4 * var4) + -(var5 * var5)) + 8100.0f;
            if (0.0f < var7) {
              L1: {
                if (var7 <= 8000.0f) {
                  break L1;
                } else {
                  var7 = 8000.0f;
                  break L1;
                }
              }
              var6 = var6 + (int)(10.0f * (var7 / 8000.0f));
              break L0;
            } else {
              break L0;
            }
          }
          return var6;
        }
    }

    final void b(int param0) {
        ((fb) this).field_a = param0;
        ((fb) this).field_k = true;
        ((fb) this).field_b = false;
    }

    final void c(byte param0) {
        ((fb) this).field_k = false;
        if (param0 != 18) {
            ((fb) this).field_b = false;
        }
    }

    final void a(int param0) {
        ((fb) this).field_k = false;
        ((fb) this).field_b = true;
        ((fb) this).field_a = param0;
        ((fb) this).field_h = 0;
        ((fb) this).field_c = 0;
    }

    final int a(byte param0) {
        if (param0 < 37) {
            int discarded$0 = ((fb) this).a((byte) -62);
            return ((fb) this).field_n;
        }
        return ((fb) this).field_n;
    }

    final boolean a(int param0, int param1, byte param2) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param2 < -32) {
          if (55 > 480 + -param0) {
            if (((fb) this).field_b) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param1 <= ((fb) this).field_m) {
                    break L1;
                  } else {
                    if (param1 >= ((fb) this).field_m - -40) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          int discarded$7 = ((fb) this).a(83, (byte) -68);
          if (55 > 480 + -param0) {
            if (!((fb) this).field_b) {
              if (param1 > ((fb) this).field_m) {
                if (param1 >= ((fb) this).field_m - -40) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var9 = null;
        var2 = 76 / ((param0 - 82) / 33);
        if (((fb) this).field_h > 0) {
          if (((fb) this).field_l == 0) {
            return;
          } else {
            L0: {
              var3 = -(255 * (-((fb) this).field_c + ((fb) this).field_l) / ((fb) this).field_l) + 255;
              if (var3 < 0) {
                var3 = 0;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var3 <= 255) {
                break L1;
              } else {
                var3 = 255;
                break L1;
              }
            }
            el.field_H[((fb) this).field_a].c(((fb) this).field_m, -((fb) this).field_h + 480, var3);
            if (((fb) this).field_a == 2) {
              if (((fb) this).field_l <= ((fb) this).field_c) {
                var4 = (((fb) this).field_i - -(((fb) this).field_m / 3)) % 50;
                if (25 >= var4) {
                  if (((fb) this).field_k) {
                    L2: {
                      el.field_H[((fb) this).field_a].e(((fb) this).field_m, -((fb) this).field_h + 480, lh.field_b[((fb) this).field_i] + 96);
                      wa.field_b[((fb) this).field_n].g(((fb) this).field_m + 8, -((fb) this).field_h + 504);
                      if (((fb) this).field_k) {
                        wa.field_b[((fb) this).field_n].e(8 + ((fb) this).field_m, 24 + (480 - ((fb) this).field_h), 196 + lh.field_b[((fb) this).field_i]);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    el.field_H[3].g(((fb) this).field_m, 480 - ((fb) this).field_h);
                    return;
                  } else {
                    L3: {
                      wa.field_b[((fb) this).field_n].g(((fb) this).field_m + 8, -((fb) this).field_h + 504);
                      if (((fb) this).field_k) {
                        wa.field_b[((fb) this).field_n].e(8 + ((fb) this).field_m, 24 + (480 - ((fb) this).field_h), 196 + lh.field_b[((fb) this).field_i]);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    el.field_H[3].g(((fb) this).field_m, 480 - ((fb) this).field_h);
                    return;
                  }
                } else {
                  oo.d(wa.field_b[((fb) this).field_n].field_x / 2 + 8 + ((fb) this).field_m, 504 - (((fb) this).field_h + -(wa.field_b[((fb) this).field_n].field_w / 2)), lh.field_b[var4] * 5 / 8, 13421772, 68 + -var4);
                  oo.d(wa.field_b[((fb) this).field_n].field_x / 2 + (((fb) this).field_m + 8), -((fb) this).field_h + 480 + (24 - -(wa.field_b[((fb) this).field_n].field_w / 2)), 4 * lh.field_b[var4] / 8, 11206570, 118 + -var4);
                  if (!((fb) this).field_k) {
                    L4: {
                      wa.field_b[((fb) this).field_n].g(((fb) this).field_m + 8, -((fb) this).field_h + 504);
                      if (((fb) this).field_k) {
                        wa.field_b[((fb) this).field_n].e(8 + ((fb) this).field_m, 24 + (480 - ((fb) this).field_h), 196 + lh.field_b[((fb) this).field_i]);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    el.field_H[3].g(((fb) this).field_m, 480 - ((fb) this).field_h);
                    return;
                  } else {
                    L5: {
                      el.field_H[((fb) this).field_a].e(((fb) this).field_m, -((fb) this).field_h + 480, lh.field_b[((fb) this).field_i] + 96);
                      wa.field_b[((fb) this).field_n].g(((fb) this).field_m + 8, -((fb) this).field_h + 504);
                      if (((fb) this).field_k) {
                        wa.field_b[((fb) this).field_n].e(8 + ((fb) this).field_m, 24 + (480 - ((fb) this).field_h), 196 + lh.field_b[((fb) this).field_i]);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    el.field_H[3].g(((fb) this).field_m, 480 - ((fb) this).field_h);
                    return;
                  }
                }
              } else {
                L6: {
                  if (!((fb) this).field_k) {
                    break L6;
                  } else {
                    el.field_H[((fb) this).field_a].e(((fb) this).field_m, -((fb) this).field_h + 480, lh.field_b[((fb) this).field_i] + 96);
                    break L6;
                  }
                }
                L7: {
                  wa.field_b[((fb) this).field_n].g(((fb) this).field_m + 8, -((fb) this).field_h + 504);
                  if (((fb) this).field_k) {
                    wa.field_b[((fb) this).field_n].e(8 + ((fb) this).field_m, 24 + (480 - ((fb) this).field_h), 196 + lh.field_b[((fb) this).field_i]);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                el.field_H[3].g(((fb) this).field_m, 480 - ((fb) this).field_h);
                return;
              }
            } else {
              var4 = wa.field_b[((fb) this).field_n].field_w + -(wa.field_b[((fb) this).field_n].field_w * (-((fb) this).field_c + ((fb) this).field_l) / ((fb) this).field_l);
              wa.field_b[((fb) this).field_n].c(((fb) this).field_m - -8, -((fb) this).field_h + 504, var3);
              var9 = new int[4];
              oo.a(var9);
              oo.h(8 + ((fb) this).field_m, -var4 + (wa.field_b[((fb) this).field_n].field_w + 24) + (480 + -((fb) this).field_h), wa.field_b[((fb) this).field_n].field_x + 8 + ((fb) this).field_m, wa.field_b[((fb) this).field_n].field_w + (24 + -((fb) this).field_h + 480));
              wa.field_b[((fb) this).field_n].g(((fb) this).field_m + 8, -((fb) this).field_h + 504);
              oo.b(var9);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_66_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          int fieldTemp$1 = ((fb) this).field_i + 1;
          ((fb) this).field_i = ((fb) this).field_i + 1;
          if (fieldTemp$1 == 50) {
            ((fb) this).field_i = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((fb) this).field_m <= ((fb) this).field_f) {
            break L1;
          } else {
            ((fb) this).field_m = ((fb) this).field_m - 2;
            if (((fb) this).field_m < ((fb) this).field_f) {
              ((fb) this).field_m = ((fb) this).field_f;
              break L1;
            } else {
              L2: {
                if (!((fb) this).field_b) {
                  if (((fb) this).field_k) {
                    ((fb) this).field_h = 70;
                    break L2;
                  } else {
                    L3: {
                      var4 = 425;
                      if (var4 > param1) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = this.a((byte) 118, param1, param0);
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var5 = stackIn_14_0;
                      if (Math.abs(-((fb) this).field_h + var5) > 2) {
                        if (~((fb) this).field_h <= ~var5) {
                          ((fb) this).field_h = ((fb) this).field_h - 2;
                          break L4;
                        } else {
                          ((fb) this).field_h = ((fb) this).field_h + 2;
                          break L4;
                        }
                      } else {
                        ((fb) this).field_h = var5;
                        break L4;
                      }
                    }
                    if (65 < ((fb) this).field_h) {
                      ((fb) this).field_h = 65;
                      if (((fb) this).field_h < 55) {
                        ((fb) this).field_h = 55;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L5: {
                        if (((fb) this).field_h < 55) {
                          ((fb) this).field_h = 55;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (((fb) this).field_k) {
                          break L6;
                        } else {
                          if (((fb) this).field_h > 65) {
                            ((fb) this).field_h = 65;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (param2 == 255) {
                          break L7;
                        } else {
                          fb.d(30);
                          break L7;
                        }
                      }
                      L8: {
                        if (((fb) this).field_b) {
                          break L8;
                        } else {
                          if (((fb) this).field_h < 55) {
                            ((fb) this).field_h = 55;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  ((fb) this).field_a = 1;
                  ((fb) this).field_h = 65;
                  ((fb) this).field_c = ((fb) this).field_c + 1;
                  ((fb) this).field_c = op.field_m.field_H - (tg.field_e.field_b[((fb) this).field_j] - field_e.a(((fb) this).field_j, (byte) 109));
                  ((fb) this).field_l = field_e.a(((fb) this).field_j, (byte) 108);
                  if (~((fb) this).field_l < ~((fb) this).field_c) {
                    return;
                  } else {
                    ((fb) this).field_a = 2;
                    ((fb) this).field_c = ((fb) this).field_l;
                    ((fb) this).field_b = false;
                    break L2;
                  }
                }
              }
              if (!((fb) this).field_k) {
                L9: {
                  if (((fb) this).field_h > 65) {
                    ((fb) this).field_h = 65;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param2 == 255) {
                    break L10;
                  } else {
                    fb.d(30);
                    break L10;
                  }
                }
                L11: {
                  if (((fb) this).field_b) {
                    break L11;
                  } else {
                    if (((fb) this).field_h < 55) {
                      ((fb) this).field_h = 55;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                return;
              } else {
                L12: {
                  if (param2 == 255) {
                    break L12;
                  } else {
                    fb.d(30);
                    break L12;
                  }
                }
                L13: {
                  if (((fb) this).field_b) {
                    break L13;
                  } else {
                    if (((fb) this).field_h < 55) {
                      ((fb) this).field_h = 55;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        L14: {
          if (!((fb) this).field_b) {
            if (((fb) this).field_k) {
              L15: {
                ((fb) this).field_h = 70;
                if (((fb) this).field_k) {
                  break L15;
                } else {
                  if (((fb) this).field_h > 65) {
                    ((fb) this).field_h = 65;
                    break L15;
                  } else {
                    L16: {
                      if (param2 == 255) {
                        break L16;
                      } else {
                        fb.d(30);
                        break L16;
                      }
                    }
                    L17: {
                      if (((fb) this).field_b) {
                        break L17;
                      } else {
                        if (((fb) this).field_h < 55) {
                          ((fb) this).field_h = 55;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (param2 == 255) {
                L18: {
                  if (((fb) this).field_b) {
                    break L18;
                  } else {
                    if (((fb) this).field_h < 55) {
                      ((fb) this).field_h = 55;
                      break L18;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L19: {
                  fb.d(30);
                  if (((fb) this).field_b) {
                    break L19;
                  } else {
                    if (((fb) this).field_h < 55) {
                      ((fb) this).field_h = 55;
                      break L19;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              L20: {
                var4 = 425;
                if (var4 > param1) {
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  break L20;
                } else {
                  stackOut_64_0 = this.a((byte) 118, param1, param0);
                  stackIn_66_0 = stackOut_64_0;
                  break L20;
                }
              }
              L21: {
                var5 = stackIn_66_0;
                if (Math.abs(-((fb) this).field_h + var5) > 2) {
                  if (~((fb) this).field_h <= ~var5) {
                    L22: {
                      ((fb) this).field_h = ((fb) this).field_h - 2;
                      if (65 >= ((fb) this).field_h) {
                        break L22;
                      } else {
                        ((fb) this).field_h = 65;
                        break L22;
                      }
                    }
                    L23: {
                      if (((fb) this).field_h < 55) {
                        ((fb) this).field_h = 55;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    if (!((fb) this).field_k) {
                      L24: {
                        if (((fb) this).field_h > 65) {
                          ((fb) this).field_h = 65;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      if (param2 != 255) {
                        L25: {
                          fb.d(30);
                          if (((fb) this).field_b) {
                            break L25;
                          } else {
                            if (((fb) this).field_h < 55) {
                              ((fb) this).field_h = 55;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L26: {
                          if (((fb) this).field_b) {
                            break L26;
                          } else {
                            if (((fb) this).field_h < 55) {
                              ((fb) this).field_h = 55;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L27: {
                        if (param2 == 255) {
                          break L27;
                        } else {
                          fb.d(30);
                          break L27;
                        }
                      }
                      L28: {
                        if (((fb) this).field_b) {
                          break L28;
                        } else {
                          if (((fb) this).field_h < 55) {
                            ((fb) this).field_h = 55;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    ((fb) this).field_h = ((fb) this).field_h + 2;
                    break L21;
                  }
                } else {
                  ((fb) this).field_h = var5;
                  break L21;
                }
              }
              if (65 >= ((fb) this).field_h) {
                if (((fb) this).field_h < 55) {
                  ((fb) this).field_h = 55;
                  break L14;
                } else {
                  break L14;
                }
              } else {
                L29: {
                  ((fb) this).field_h = 65;
                  if (((fb) this).field_h < 55) {
                    ((fb) this).field_h = 55;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (((fb) this).field_k) {
                    break L30;
                  } else {
                    if (((fb) this).field_h > 65) {
                      ((fb) this).field_h = 65;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                L31: {
                  if (param2 == 255) {
                    break L31;
                  } else {
                    fb.d(30);
                    break L31;
                  }
                }
                L32: {
                  if (((fb) this).field_b) {
                    break L32;
                  } else {
                    if (((fb) this).field_h < 55) {
                      ((fb) this).field_h = 55;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                }
                return;
              }
            }
          } else {
            ((fb) this).field_a = 1;
            ((fb) this).field_h = 65;
            ((fb) this).field_c = ((fb) this).field_c + 1;
            ((fb) this).field_c = op.field_m.field_H - (tg.field_e.field_b[((fb) this).field_j] - field_e.a(((fb) this).field_j, (byte) 109));
            ((fb) this).field_l = field_e.a(((fb) this).field_j, (byte) 108);
            if (~((fb) this).field_l < ~((fb) this).field_c) {
              return;
            } else {
              ((fb) this).field_a = 2;
              ((fb) this).field_c = ((fb) this).field_l;
              ((fb) this).field_b = false;
              break L14;
            }
          }
        }
        L33: {
          if (((fb) this).field_k) {
            break L33;
          } else {
            if (((fb) this).field_h > 65) {
              ((fb) this).field_h = 65;
              break L33;
            } else {
              if (param2 == 255) {
                L34: {
                  if (((fb) this).field_b) {
                    break L34;
                  } else {
                    if (((fb) this).field_h < 55) {
                      ((fb) this).field_h = 55;
                      break L34;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L35: {
                  fb.d(30);
                  if (((fb) this).field_b) {
                    break L35;
                  } else {
                    if (((fb) this).field_h < 55) {
                      ((fb) this).field_h = 55;
                      break L35;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        if (param2 == 255) {
          L36: {
            if (((fb) this).field_b) {
              break L36;
            } else {
              if (((fb) this).field_h < 55) {
                ((fb) this).field_h = 55;
                break L36;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L37: {
            fb.d(30);
            if (((fb) this).field_b) {
              break L37;
            } else {
              if (((fb) this).field_h < 55) {
                ((fb) this).field_h = 55;
                break L37;
              } else {
                return;
              }
            }
          }
          return;
        }
    }

    fb(int param0, int param1, int param2) {
        ((fb) this).field_k = false;
        ((fb) this).field_b = false;
        ((fb) this).field_m = param0;
        ((fb) this).field_f = ((fb) this).field_m;
        ((fb) this).field_a = 2;
        ((fb) this).field_j = param2;
        ((fb) this).field_h = 0;
        ((fb) this).field_n = param1;
        ((fb) this).field_c = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You know what you want, so should your zombies. This will hurry them up, making them move faster.";
    }
}
