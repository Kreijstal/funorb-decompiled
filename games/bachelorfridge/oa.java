/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends sna {
    private StringBuilder field_Ab;
    static int field_vb;
    private sna field_xb;
    static String field_wb;
    private int field_zb;
    private sna field_yb;
    static kv field_Bb;

    oa(int param0, int param1, int param2, int param3, String param4, sna param5, sna param6, sna param7) {
        super(0L, param5);
        ((oa) this).field_zb = 0;
        ((oa) this).field_xb = new sna(0L, param6, param4);
        ((oa) this).a(-1, ((oa) this).field_xb);
        ((oa) this).field_yb = new sna(0L, param7);
        ((oa) this).field_yb.field_gb = 16764006;
        ((oa) this).a(-1, ((oa) this).field_yb);
        ((oa) this).field_yb.field_pb = "|";
        ((oa) this).field_Ab = new StringBuilder(12);
        int var9 = ((oa) this).field_xb.e(-1);
        ((oa) this).field_xb.a(rg.field_h, 31407, var9, 5, 3);
        ((oa) this).field_yb.a(rg.field_h, 31407, var9, 5, 3 + rg.field_h);
        int var10 = 5 - -var9 - -5;
        int var11 = 6 - -(rg.field_h * 2);
        int var12 = oi.a(param2, var10, param0, -21264);
        int var13 = nga.a(var11, param1, (byte) 99, param3);
        ((oa) this).a(var11, 31407, var10, var12, var13);
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var3 = -46 / ((param1 - 30) / 32);
        ((oa) this).a(19842, param0);
        if (!param0) {
          ((oa) this).field_yb.field_Z = ((oa) this).field_Ab.toString();
          if (param0) {
            if (lf.field_c != 0) {
              if (((oa) this).field_R == 0) {
                ((oa) this).field_zb = 1;
                return ((oa) this).field_zb;
              } else {
                return ((oa) this).field_zb;
              }
            } else {
              return ((oa) this).field_zb;
            }
          } else {
            return ((oa) this).field_zb;
          }
        } else {
          L0: while (true) {
            if (kaa.b(127)) {
              L1: {
                if (gf.field_k != 85) {
                  break L1;
                } else {
                  if (((oa) this).field_Ab.length() > 0) {
                    StringBuilder discarded$5 = sw.a(((oa) this).field_Ab, 4, ((oa) this).field_Ab.length() - 1, ' ');
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (ok.a((CharSequence) (Object) ((oa) this).field_Ab, dla.field_j, (byte) -19)) {
                  StringBuilder discarded$6 = ((oa) this).field_Ab.append(dla.field_j);
                  break L2;
                } else {
                  L3: {
                    if (((oa) this).field_Ab.length() != 0) {
                      break L3;
                    } else {
                      if (dla.field_j == 91) {
                        StringBuilder discarded$7 = ((oa) this).field_Ab.append(dla.field_j);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (((oa) this).field_Ab.length() != 1) {
                      break L4;
                    } else {
                      if (dla.field_j == 35) {
                        StringBuilder discarded$8 = ((oa) this).field_Ab.append(dla.field_j);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (dla.field_j != 93) {
                    break L2;
                  } else {
                    StringBuilder discarded$9 = ((oa) this).field_Ab.append(dla.field_j);
                    break L2;
                  }
                }
              }
              if (84 == gf.field_k) {
                if ((((oa) this).field_Ab.length() ^ -1) >= -1) {
                  return 1;
                } else {
                  ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                  return 2;
                }
              } else {
                if (gf.field_k != 13) {
                  continue L0;
                } else {
                  return 1;
                }
              }
            } else {
              ((oa) this).field_yb.field_Z = ((oa) this).field_Ab.toString();
              if (lf.field_c != 0) {
                if (((oa) this).field_R != 0) {
                  return ((oa) this).field_zb;
                } else {
                  ((oa) this).field_zb = 1;
                  return ((oa) this).field_zb;
                }
              } else {
                return ((oa) this).field_zb;
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_Bb = null;
        field_wb = null;
        if (param0 <= 107) {
            field_Bb = null;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7, int param8, int param9, boolean param10, int param11, boolean param12, boolean param13) {
        jja.field_m = null;
        er.e(9941);
        param1 = ot.a(param8, param11, param1, param3, param2, param6, (byte) 92);
        lr.a(param7, param5, param0, param9, param2, 1, param4, param13, param10, param1);
        bf.a(param5, param10, (byte) -88);
        rh.a(param5, 67, param1, param8);
        if (param12) {
          field_Bb = null;
          return;
        } else {
          return;
        }
    }

    final boolean b(boolean param0) {
        int var2 = 0;
        if (-1 != ((oa) this).field_zb) {
          return false;
        } else {
          if (!param0) {
            int discarded$20 = ((oa) this).b(true, -4);
            if (85 == gf.field_k) {
              L0: {
                if (-1 <= (((oa) this).field_Ab.length() ^ -1)) {
                  break L0;
                } else {
                  StringBuilder discarded$21 = sw.a(((oa) this).field_Ab, 4, ((oa) this).field_Ab.length() - 1, ' ');
                  break L0;
                }
              }
              if (((oa) this).field_Ab.length() < 12) {
                L1: {
                  var2 = Character.toLowerCase(dla.field_j);
                  if (var2 == 32) {
                    var2 = 95;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (var2 == 95) {
                  if (0 < ((oa) this).field_Ab.length()) {
                    L2: {
                      StringBuilder discarded$22 = ((oa) this).field_Ab.append(var2);
                      if (ml.a(-130697146, (char) var2)) {
                        StringBuilder discarded$23 = ((oa) this).field_Ab.append(var2);
                        break L2;
                      } else {
                        if (!ula.a((char) var2, 48)) {
                          break L2;
                        } else {
                          StringBuilder discarded$24 = ((oa) this).field_Ab.append(var2);
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if ((gf.field_k ^ -1) != -85) {
                        break L3;
                      } else {
                        if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                          ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                          ((oa) this).field_zb = 2;
                          break L3;
                        } else {
                          ((oa) this).field_zb = 1;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (13 != gf.field_k) {
                        break L4;
                      } else {
                        ((oa) this).field_zb = 1;
                        break L4;
                      }
                    }
                    return true;
                  } else {
                    if (ml.a(-130697146, (char) var2)) {
                      L5: {
                        StringBuilder discarded$25 = ((oa) this).field_Ab.append(var2);
                        if ((gf.field_k ^ -1) != -85) {
                          break L5;
                        } else {
                          if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                            ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                            ((oa) this).field_zb = 2;
                            break L5;
                          } else {
                            ((oa) this).field_zb = 1;
                            break L5;
                          }
                        }
                      }
                      if (13 != gf.field_k) {
                        return true;
                      } else {
                        ((oa) this).field_zb = 1;
                        return true;
                      }
                    } else {
                      if (!ula.a((char) var2, 48)) {
                        if ((gf.field_k ^ -1) != -85) {
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            ((oa) this).field_zb = 1;
                            return true;
                          }
                        } else {
                          if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                            ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                            ((oa) this).field_zb = 2;
                            if (13 != gf.field_k) {
                              return true;
                            } else {
                              ((oa) this).field_zb = 1;
                              return true;
                            }
                          } else {
                            ((oa) this).field_zb = 1;
                            if (13 != gf.field_k) {
                              return true;
                            } else {
                              ((oa) this).field_zb = 1;
                              return true;
                            }
                          }
                        }
                      } else {
                        StringBuilder discarded$26 = ((oa) this).field_Ab.append(var2);
                        if ((gf.field_k ^ -1) != -85) {
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            ((oa) this).field_zb = 1;
                            return true;
                          }
                        } else {
                          if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                            L6: {
                              ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                              ((oa) this).field_zb = 2;
                              if (13 != gf.field_k) {
                                break L6;
                              } else {
                                ((oa) this).field_zb = 1;
                                break L6;
                              }
                            }
                            return true;
                          } else {
                            L7: {
                              ((oa) this).field_zb = 1;
                              if (13 != gf.field_k) {
                                break L7;
                              } else {
                                ((oa) this).field_zb = 1;
                                break L7;
                              }
                            }
                            return true;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (ml.a(-130697146, (char) var2)) {
                    L8: {
                      StringBuilder discarded$27 = ((oa) this).field_Ab.append(var2);
                      if ((gf.field_k ^ -1) != -85) {
                        break L8;
                      } else {
                        if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                          ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                          ((oa) this).field_zb = 2;
                          break L8;
                        } else {
                          ((oa) this).field_zb = 1;
                          break L8;
                        }
                      }
                    }
                    if (13 == gf.field_k) {
                      ((oa) this).field_zb = 1;
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if (!ula.a((char) var2, 48)) {
                      if ((gf.field_k ^ -1) != -85) {
                        if (13 != gf.field_k) {
                          return true;
                        } else {
                          ((oa) this).field_zb = 1;
                          return true;
                        }
                      } else {
                        if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                          ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                          ((oa) this).field_zb = 2;
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            ((oa) this).field_zb = 1;
                            return true;
                          }
                        } else {
                          ((oa) this).field_zb = 1;
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            ((oa) this).field_zb = 1;
                            return true;
                          }
                        }
                      }
                    } else {
                      StringBuilder discarded$28 = ((oa) this).field_Ab.append(var2);
                      if ((gf.field_k ^ -1) != -85) {
                        if (13 == gf.field_k) {
                          ((oa) this).field_zb = 1;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        if ((((oa) this).field_Ab.length() ^ -1) >= -1) {
                          L9: {
                            ((oa) this).field_zb = 1;
                            if (13 != gf.field_k) {
                              break L9;
                            } else {
                              ((oa) this).field_zb = 1;
                              break L9;
                            }
                          }
                          return true;
                        } else {
                          L10: {
                            ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                            ((oa) this).field_zb = 2;
                            if (13 != gf.field_k) {
                              break L10;
                            } else {
                              ((oa) this).field_zb = 1;
                              break L10;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                }
              } else {
                if ((gf.field_k ^ -1) != -85) {
                  if (13 != gf.field_k) {
                    return true;
                  } else {
                    ((oa) this).field_zb = 1;
                    return true;
                  }
                } else {
                  if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                    ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                    ((oa) this).field_zb = 2;
                    if (13 != gf.field_k) {
                      return true;
                    } else {
                      ((oa) this).field_zb = 1;
                      return true;
                    }
                  } else {
                    ((oa) this).field_zb = 1;
                    if (13 != gf.field_k) {
                      return true;
                    } else {
                      ((oa) this).field_zb = 1;
                      return true;
                    }
                  }
                }
              }
            } else {
              L11: {
                if (((oa) this).field_Ab.length() < 12) {
                  L12: {
                    var2 = Character.toLowerCase(dla.field_j);
                    if (var2 == 32) {
                      var2 = 95;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var2 != 95) {
                      break L13;
                    } else {
                      if (0 >= ((oa) this).field_Ab.length()) {
                        break L13;
                      } else {
                        L14: {
                          StringBuilder discarded$29 = ((oa) this).field_Ab.append(var2);
                          if (ml.a(-130697146, (char) var2)) {
                            StringBuilder discarded$30 = ((oa) this).field_Ab.append(var2);
                            break L14;
                          } else {
                            if (!ula.a((char) var2, 48)) {
                              break L14;
                            } else {
                              StringBuilder discarded$31 = ((oa) this).field_Ab.append(var2);
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if ((gf.field_k ^ -1) != -85) {
                            break L15;
                          } else {
                            if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                              ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                              ((oa) this).field_zb = 2;
                              break L15;
                            } else {
                              ((oa) this).field_zb = 1;
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (13 != gf.field_k) {
                            break L16;
                          } else {
                            ((oa) this).field_zb = 1;
                            break L16;
                          }
                        }
                        return true;
                      }
                    }
                  }
                  if (ml.a(-130697146, (char) var2)) {
                    L17: {
                      StringBuilder discarded$32 = ((oa) this).field_Ab.append(var2);
                      if ((gf.field_k ^ -1) != -85) {
                        break L17;
                      } else {
                        if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                          ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                          ((oa) this).field_zb = 2;
                          break L17;
                        } else {
                          ((oa) this).field_zb = 1;
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (13 != gf.field_k) {
                        break L18;
                      } else {
                        ((oa) this).field_zb = 1;
                        break L18;
                      }
                    }
                    return true;
                  } else {
                    if (!ula.a((char) var2, 48)) {
                      break L11;
                    } else {
                      L19: {
                        StringBuilder discarded$33 = ((oa) this).field_Ab.append(var2);
                        if ((gf.field_k ^ -1) != -85) {
                          break L19;
                        } else {
                          if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                            ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                            ((oa) this).field_zb = 2;
                            break L19;
                          } else {
                            ((oa) this).field_zb = 1;
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (13 != gf.field_k) {
                          break L20;
                        } else {
                          ((oa) this).field_zb = 1;
                          break L20;
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  break L11;
                }
              }
              if ((gf.field_k ^ -1) != -85) {
                if (13 == gf.field_k) {
                  ((oa) this).field_zb = 1;
                  return true;
                } else {
                  return true;
                }
              } else {
                if ((((oa) this).field_Ab.length() ^ -1) >= -1) {
                  L21: {
                    ((oa) this).field_zb = 1;
                    if (13 != gf.field_k) {
                      break L21;
                    } else {
                      ((oa) this).field_zb = 1;
                      break L21;
                    }
                  }
                  return true;
                } else {
                  L22: {
                    ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                    ((oa) this).field_zb = 2;
                    if (13 != gf.field_k) {
                      break L22;
                    } else {
                      ((oa) this).field_zb = 1;
                      break L22;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L23: {
              if (85 != gf.field_k) {
                break L23;
              } else {
                if (-1 >= ((oa) this).field_Ab.length()) {
                  break L23;
                } else {
                  StringBuilder discarded$34 = sw.a(((oa) this).field_Ab, 4, ((oa) this).field_Ab.length() - 1, ' ');
                  break L23;
                }
              }
            }
            L24: {
              if (((oa) this).field_Ab.length() < 12) {
                L25: {
                  var2 = Character.toLowerCase(dla.field_j);
                  if (var2 == 32) {
                    var2 = 95;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var2 != 95) {
                    break L26;
                  } else {
                    if (0 >= ((oa) this).field_Ab.length()) {
                      break L26;
                    } else {
                      L27: {
                        StringBuilder discarded$35 = ((oa) this).field_Ab.append(var2);
                        if (ml.a(-130697146, (char) var2)) {
                          StringBuilder discarded$36 = ((oa) this).field_Ab.append(var2);
                          break L27;
                        } else {
                          if (!ula.a((char) var2, 48)) {
                            break L27;
                          } else {
                            StringBuilder discarded$37 = ((oa) this).field_Ab.append(var2);
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if ((gf.field_k ^ -1) != -85) {
                          break L28;
                        } else {
                          if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                            ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                            ((oa) this).field_zb = 2;
                            break L28;
                          } else {
                            ((oa) this).field_zb = 1;
                            break L28;
                          }
                        }
                      }
                      if (13 == gf.field_k) {
                        ((oa) this).field_zb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                if (ml.a(-130697146, (char) var2)) {
                  L29: {
                    StringBuilder discarded$38 = ((oa) this).field_Ab.append(var2);
                    if ((gf.field_k ^ -1) != -85) {
                      break L29;
                    } else {
                      if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                        ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                        ((oa) this).field_zb = 2;
                        break L29;
                      } else {
                        ((oa) this).field_zb = 1;
                        break L29;
                      }
                    }
                  }
                  L30: {
                    if (13 != gf.field_k) {
                      break L30;
                    } else {
                      ((oa) this).field_zb = 1;
                      break L30;
                    }
                  }
                  return true;
                } else {
                  if (!ula.a((char) var2, 48)) {
                    break L24;
                  } else {
                    L31: {
                      StringBuilder discarded$39 = ((oa) this).field_Ab.append(var2);
                      if ((gf.field_k ^ -1) != -85) {
                        break L31;
                      } else {
                        if ((((oa) this).field_Ab.length() ^ -1) < -1) {
                          ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                          ((oa) this).field_zb = 2;
                          break L31;
                        } else {
                          ((oa) this).field_zb = 1;
                          break L31;
                        }
                      }
                    }
                    L32: {
                      if (13 != gf.field_k) {
                        break L32;
                      } else {
                        ((oa) this).field_zb = 1;
                        break L32;
                      }
                    }
                    return true;
                  }
                }
              } else {
                break L24;
              }
            }
            if ((gf.field_k ^ -1) != -85) {
              if (13 == gf.field_k) {
                ((oa) this).field_zb = 1;
                return true;
              } else {
                return true;
              }
            } else {
              if ((((oa) this).field_Ab.length() ^ -1) >= -1) {
                L33: {
                  ((oa) this).field_zb = 1;
                  if (13 != gf.field_k) {
                    break L33;
                  } else {
                    ((oa) this).field_zb = 1;
                    break L33;
                  }
                }
                return true;
              } else {
                L34: {
                  ((oa) this).field_Z = ((oa) this).field_Ab.toString();
                  ((oa) this).field_zb = 2;
                  if (13 != gf.field_k) {
                    break L34;
                  } else {
                    ((oa) this).field_zb = 1;
                    break L34;
                  }
                }
                return true;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
