/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class laa extends b implements tsa {
    private String[] field_A;
    static lqa field_x;
    private mia field_w;
    static java.awt.Font field_y;
    private rj[] field_z;

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        kaa var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          ((laa) this).field_u.d(param0 + -13589);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length == 0) {
              break L0;
            } else {
              L1: {
                if (param0 == 13597) {
                  break L1;
                } else {
                  field_y = null;
                  break L1;
                }
              }
              var3 = param1.length;
              ((laa) this).field_A = new String[var3];
              var4_int = 0;
              L2: while (true) {
                if (var4_int >= var3) {
                  var4 = new kaa(mj.field_J, 0, 1);
                  ((laa) this).field_z = new rj[1 + var3];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((laa) this).field_z[var3] = new rj(ll.field_h, (qc) this);
                      ((laa) this).field_z[var3].field_r = (isa) (Object) var4;
                      ((laa) this).field_z[var3].a((byte) -31, 100, 15, 0, 20 - -(var3 * 16) + 16);
                      ((laa) this).a((ae) (Object) ((laa) this).field_z[var3], -1);
                      return;
                    } else {
                      ((laa) this).field_z[var5] = new rj(((laa) this).field_A[var5], (qc) this);
                      ((laa) this).field_z[var5].field_r = (isa) (Object) var4;
                      ((laa) this).field_z[var5].field_q = qla.field_i;
                      ((laa) this).field_z[var5].a((byte) -31, 80, 15, 0, 20 + 16 * var5);
                      ((laa) this).a((ae) (Object) ((laa) this).field_z[var5], param0 ^ -13598);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((laa) this).field_A[var4_int] = wt.a(kha.b(param0, 17404), (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L2;
                }
              }
            }
          }
        }
        ((laa) this).field_A = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param4 > 44) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((laa) this).field_A.length) {
              L1: {
                if (param2 != ((laa) this).field_z[((laa) this).field_A.length]) {
                  break L1;
                } else {
                  ((laa) this).field_w.a(10000536);
                  break L1;
                }
              }
              return;
            } else {
              if (((laa) this).field_z[var6] == param2) {
                ((laa) this).field_w.a(((laa) this).field_A[var6], 38);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        il var5 = mj.field_J;
        if (null != ((laa) this).field_A) {
            int discarded$0 = var5.a(ch.field_e, param0 - -((laa) this).field_i, param1 + ((laa) this).field_n, ((laa) this).field_m, 20, 16777215, -1, 0, 0, var5.field_k + var5.field_w);
        }
    }

    public static void a(int param0) {
        field_y = null;
        field_x = null;
        if (param0 != 16964) {
            laa.a(-107);
        }
    }

    final static int a(int param0, int param1, byte[] param2, int param3, CharSequence param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var6 = -param3 + param1;
        if (param5 == -4) {
          var7 = 0;
          L0: while (true) {
            L1: {
              if (var7 >= var6) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        var8 = param4.charAt(param3 + var7);
                        if ((var8 ^ -1) >= -1) {
                          break L5;
                        } else {
                          if (var8 < 128) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var8 < 160) {
                        break L3;
                      } else {
                        if (var8 > 255) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param2[param0 - -var7] = (byte)var8;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (8364 != var8) {
                      break L6;
                    } else {
                      param2[var7 + param0] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var8 != 8218) {
                      break L7;
                    } else {
                      param2[param0 - -var7] = (byte)-126;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var8 == 402) {
                      break L8;
                    } else {
                      L9: {
                        if (var8 == 8222) {
                          break L9;
                        } else {
                          L10: {
                            if (var8 == 8230) {
                              break L10;
                            } else {
                              L11: {
                                if (var8 == 8224) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var8 != 8225) {
                                      break L12;
                                    } else {
                                      param2[var7 + param0] = (byte)-121;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var8 != 710) {
                                      break L13;
                                    } else {
                                      param2[var7 + param0] = (byte)-120;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var8 != 8240) {
                                      break L14;
                                    } else {
                                      param2[param0 + var7] = (byte)-119;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (var8 == 352) {
                                      break L15;
                                    } else {
                                      L16: {
                                        if (var8 == 8249) {
                                          break L16;
                                        } else {
                                          L17: {
                                            if (var8 != 338) {
                                              break L17;
                                            } else {
                                              param2[var7 + param0] = (byte)-116;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var8 == 381) {
                                              break L18;
                                            } else {
                                              L19: {
                                                if (var8 != 8216) {
                                                  break L19;
                                                } else {
                                                  param2[param0 - -var7] = (byte)-111;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              L20: {
                                                if (var8 != 8217) {
                                                  break L20;
                                                } else {
                                                  param2[var7 + param0] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              L21: {
                                                if (8220 != var8) {
                                                  break L21;
                                                } else {
                                                  param2[var7 + param0] = (byte)-109;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              L22: {
                                                if (var8 == 8221) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (var8 == 8226) {
                                                      break L23;
                                                    } else {
                                                      L24: {
                                                        if (8211 != var8) {
                                                          break L24;
                                                        } else {
                                                          param2[param0 - -var7] = (byte)-106;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      L25: {
                                                        if (var8 == 8212) {
                                                          break L25;
                                                        } else {
                                                          L26: {
                                                            if (var8 == 732) {
                                                              break L26;
                                                            } else {
                                                              L27: {
                                                                if (var8 == 8482) {
                                                                  break L27;
                                                                } else {
                                                                  L28: {
                                                                    if (var8 != 353) {
                                                                      break L28;
                                                                    } else {
                                                                      param2[param0 + var7] = (byte)-102;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L28;
                                                                      }
                                                                    }
                                                                  }
                                                                  L29: {
                                                                    if (8250 != var8) {
                                                                      break L29;
                                                                    } else {
                                                                      param2[param0 + var7] = (byte)-101;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  L30: {
                                                                    if (var8 != 339) {
                                                                      break L30;
                                                                    } else {
                                                                      param2[param0 - -var7] = (byte)-100;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  L31: {
                                                                    if (382 != var8) {
                                                                      break L31;
                                                                    } else {
                                                                      param2[param0 - -var7] = (byte)-98;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                  }
                                                                  L32: {
                                                                    if (var8 == 376) {
                                                                      break L32;
                                                                    } else {
                                                                      param2[var7 + param0] = (byte)63;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  param2[param0 + var7] = (byte)-97;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                              }
                                                              param2[param0 - -var7] = (byte)-103;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          param2[param0 - -var7] = (byte)-104;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      param2[param0 + var7] = (byte)-105;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  param2[var7 + param0] = (byte)-107;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              param2[var7 + param0] = (byte)-108;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          param2[var7 + param0] = (byte)-114;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      param2[var7 + param0] = (byte)-117;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  param2[var7 + param0] = (byte)-118;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              param2[param0 + var7] = (byte)-122;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2[var7 + param0] = (byte)-123;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      param2[var7 + param0] = (byte)-124;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param2[param0 + var7] = (byte)-125;
                  break L2;
                }
                var7++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var6;
          }
        } else {
          return 49;
        }
    }

    laa(mia param0) {
        super(0, 0, 0, 0, (isa) null);
        ((laa) this).field_w = param0;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(-99 != (param2 ^ -1))) {
            return ((laa) this).b(param1, (byte) -120);
        }
        if (param2 == 99) {
            return ((laa) this).a(param1, (byte) -9);
        }
        return false;
    }

    static {
    }
}
