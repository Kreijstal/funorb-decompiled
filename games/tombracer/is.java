/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is extends jea {
    private jea field_tb;
    private StringBuilder field_vb;
    private int field_ub;
    private jea field_zb;
    static hra field_wb;
    static pea field_xb;
    static float field_Ab;
    static jea field_yb;

    public static void f(int param0) {
        if (param0 != 2) {
          field_wb = null;
          field_xb = null;
          field_wb = null;
          field_yb = null;
          return;
        } else {
          field_xb = null;
          field_wb = null;
          field_yb = null;
          return;
        }
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (((is) this).field_ub == 0) {
          if (fna.field_h == 85) {
            L0: {
              if (0 < ((is) this).field_vb.length()) {
                StringBuilder discarded$7 = ana.a(-1 + ((is) this).field_vb.length(), ' ', -11, ((is) this).field_vb);
                break L0;
              } else {
                break L0;
              }
            }
            if (-13 < ((is) this).field_vb.length()) {
              L1: {
                var2 = Character.toLowerCase(kda.field_td);
                if (var2 == 32) {
                  var2 = 95;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (95 != var2) {
                  break L2;
                } else {
                  if ((((is) this).field_vb.length() ^ -1) < -1) {
                    StringBuilder discarded$8 = ((is) this).field_vb.append(var2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (dja.a((byte) -17, (char) var2)) {
                L3: {
                  StringBuilder discarded$9 = ((is) this).field_vb.append(var2);
                  if (-85 == fna.field_h) {
                    if (-1 >= ((is) this).field_vb.length()) {
                      ((is) this).field_ub = 1;
                      break L3;
                    } else {
                      ((is) this).field_r = ((is) this).field_vb.toString();
                      ((is) this).field_ub = 2;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((fna.field_h ^ -1) == -14) {
                    ((is) this).field_ub = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (!param0) {
                  return true;
                } else {
                  field_Ab = -0.0745474174618721f;
                  return true;
                }
              } else {
                if (!dp.a(125, (char) var2)) {
                  if (-85 == fna.field_h) {
                    if (-1 <= (((is) this).field_vb.length() ^ -1)) {
                      L5: {
                        ((is) this).field_ub = 1;
                        if ((fna.field_h ^ -1) == -14) {
                          ((is) this).field_ub = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    } else {
                      L6: {
                        ((is) this).field_r = ((is) this).field_vb.toString();
                        ((is) this).field_ub = 2;
                        if ((fna.field_h ^ -1) == -14) {
                          ((is) this).field_ub = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    }
                  } else {
                    L7: {
                      if ((fna.field_h ^ -1) == -14) {
                        ((is) this).field_ub = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (param0) {
                      field_Ab = -0.0745474174618721f;
                      return true;
                    } else {
                      return true;
                    }
                  }
                } else {
                  StringBuilder discarded$10 = ((is) this).field_vb.append(var2);
                  if (-85 == fna.field_h) {
                    if (-1 < ((is) this).field_vb.length()) {
                      L8: {
                        ((is) this).field_r = ((is) this).field_vb.toString();
                        ((is) this).field_ub = 2;
                        if ((fna.field_h ^ -1) == -14) {
                          ((is) this).field_ub = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    } else {
                      L9: {
                        ((is) this).field_ub = 1;
                        if ((fna.field_h ^ -1) == -14) {
                          ((is) this).field_ub = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (!param0) {
                          break L10;
                        } else {
                          field_Ab = -0.0745474174618721f;
                          break L10;
                        }
                      }
                      return true;
                    }
                  } else {
                    L11: {
                      if (fna.field_h == -14) {
                        ((is) this).field_ub = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (param0) {
                      field_Ab = -0.0745474174618721f;
                      return true;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              if (-85 == fna.field_h) {
                if (-1 < ((is) this).field_vb.length()) {
                  L12: {
                    ((is) this).field_r = ((is) this).field_vb.toString();
                    ((is) this).field_ub = 2;
                    if ((fna.field_h ^ -1) == -14) {
                      ((is) this).field_ub = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (!param0) {
                      break L13;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      break L13;
                    }
                  }
                  return true;
                } else {
                  L14: {
                    ((is) this).field_ub = 1;
                    if ((fna.field_h ^ -1) == -14) {
                      ((is) this).field_ub = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (!param0) {
                      break L15;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      break L15;
                    }
                  }
                  return true;
                }
              } else {
                L16: {
                  if (fna.field_h == -14) {
                    ((is) this).field_ub = 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (!param0) {
                    break L17;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L17;
                  }
                }
                return true;
              }
            }
          } else {
            L18: {
              if (-13 >= (((is) this).field_vb.length() ^ -1)) {
                break L18;
              } else {
                L19: {
                  var2 = Character.toLowerCase(kda.field_td);
                  if (var2 == 32) {
                    var2 = 95;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (95 != var2) {
                    break L20;
                  } else {
                    if ((((is) this).field_vb.length() ^ -1) < -1) {
                      StringBuilder discarded$11 = ((is) this).field_vb.append(var2);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                if (dja.a((byte) -17, (char) var2)) {
                  L21: {
                    StringBuilder discarded$12 = ((is) this).field_vb.append(var2);
                    if (-85 == fna.field_h) {
                      if (-1 >= ((is) this).field_vb.length()) {
                        ((is) this).field_ub = 1;
                        break L21;
                      } else {
                        ((is) this).field_r = ((is) this).field_vb.toString();
                        ((is) this).field_ub = 2;
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if ((fna.field_h ^ -1) == -14) {
                      ((is) this).field_ub = 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  if (param0) {
                    field_Ab = -0.0745474174618721f;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (!dp.a(125, (char) var2)) {
                    break L18;
                  } else {
                    L23: {
                      StringBuilder discarded$13 = ((is) this).field_vb.append(var2);
                      if (-85 == fna.field_h) {
                        if (-1 >= ((is) this).field_vb.length()) {
                          ((is) this).field_ub = 1;
                          break L23;
                        } else {
                          ((is) this).field_r = ((is) this).field_vb.toString();
                          ((is) this).field_ub = 2;
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (fna.field_h == -14) {
                        ((is) this).field_ub = 1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (!param0) {
                        break L25;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        break L25;
                      }
                    }
                    return true;
                  }
                }
              }
            }
            if (-85 == fna.field_h) {
              if (-1 < ((is) this).field_vb.length()) {
                L26: {
                  ((is) this).field_r = ((is) this).field_vb.toString();
                  ((is) this).field_ub = 2;
                  if ((fna.field_h ^ -1) == -14) {
                    ((is) this).field_ub = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (!param0) {
                    break L27;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L27;
                  }
                }
                return true;
              } else {
                L28: {
                  ((is) this).field_ub = 1;
                  if ((fna.field_h ^ -1) == -14) {
                    ((is) this).field_ub = 1;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (!param0) {
                    break L29;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L29;
                  }
                }
                return true;
              }
            } else {
              L30: {
                if (fna.field_h == -14) {
                  ((is) this).field_ub = 1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (!param0) {
                  break L31;
                } else {
                  field_Ab = -0.0745474174618721f;
                  break L31;
                }
              }
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final int a(boolean param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 == 1513) {
          ((is) this).c(-57, param0);
          if (param0) {
            L0: while (true) {
              if (!es.a(true)) {
                L1: {
                  ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
                  if (!param0) {
                    break L1;
                  } else {
                    if (-1 == (hf.field_b ^ -1)) {
                      break L1;
                    } else {
                      if (0 != ((is) this).field_y) {
                        break L1;
                      } else {
                        ((is) this).field_ub = 1;
                        return ((is) this).field_ub;
                      }
                    }
                  }
                }
                return ((is) this).field_ub;
              } else {
                L2: {
                  if (-86 != (fna.field_h ^ -1)) {
                    break L2;
                  } else {
                    if (((is) this).field_vb.length() > 0) {
                      StringBuilder discarded$10 = ana.a(-1 + ((is) this).field_vb.length(), ' ', -11, ((is) this).field_vb);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (ih.a((CharSequence) (Object) ((is) this).field_vb, true, kda.field_td)) {
                    StringBuilder discarded$11 = ((is) this).field_vb.append(kda.field_td);
                    break L3;
                  } else {
                    L4: {
                      if (((is) this).field_vb.length() != 0) {
                        break L4;
                      } else {
                        if (91 == kda.field_td) {
                          StringBuilder discarded$12 = ((is) this).field_vb.append(kda.field_td);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (1 != ((is) this).field_vb.length()) {
                        break L5;
                      } else {
                        if (kda.field_td == 35) {
                          StringBuilder discarded$13 = ((is) this).field_vb.append(kda.field_td);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (kda.field_td != 93) {
                      break L3;
                    } else {
                      StringBuilder discarded$14 = ((is) this).field_vb.append(kda.field_td);
                      break L3;
                    }
                  }
                }
                if (fna.field_h == 84) {
                  if (-1 <= (((is) this).field_vb.length() ^ -1)) {
                    return 1;
                  } else {
                    ((is) this).field_r = ((is) this).field_vb.toString();
                    return 2;
                  }
                } else {
                  if (13 == fna.field_h) {
                    return 1;
                  } else {
                    continue L0;
                  }
                }
              }
            }
          } else {
            L6: {
              ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
              if (!param0) {
                break L6;
              } else {
                if (-1 == hf.field_b) {
                  break L6;
                } else {
                  if (0 != ((is) this).field_y) {
                    break L6;
                  } else {
                    ((is) this).field_ub = 1;
                    return ((is) this).field_ub;
                  }
                }
              }
            }
            return ((is) this).field_ub;
          }
        } else {
          field_wb = null;
          ((is) this).c(-57, param0);
          if (!param0) {
            ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
            if (param0) {
              if (-1 != hf.field_b) {
                if (0 != ((is) this).field_y) {
                  return ((is) this).field_ub;
                } else {
                  ((is) this).field_ub = 1;
                  return ((is) this).field_ub;
                }
              } else {
                return ((is) this).field_ub;
              }
            } else {
              return ((is) this).field_ub;
            }
          } else {
            L7: while (true) {
              if (es.a(true)) {
                L8: {
                  if (-86 != (fna.field_h ^ -1)) {
                    break L8;
                  } else {
                    if (((is) this).field_vb.length() > 0) {
                      StringBuilder discarded$15 = ana.a(-1 + ((is) this).field_vb.length(), ' ', -11, ((is) this).field_vb);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (ih.a((CharSequence) (Object) ((is) this).field_vb, true, kda.field_td)) {
                    StringBuilder discarded$16 = ((is) this).field_vb.append(kda.field_td);
                    break L9;
                  } else {
                    L10: {
                      if (((is) this).field_vb.length() != 0) {
                        break L10;
                      } else {
                        if (91 == kda.field_td) {
                          StringBuilder discarded$17 = ((is) this).field_vb.append(kda.field_td);
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (1 != ((is) this).field_vb.length()) {
                        break L11;
                      } else {
                        if (kda.field_td == 35) {
                          StringBuilder discarded$18 = ((is) this).field_vb.append(kda.field_td);
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (kda.field_td != 93) {
                      break L9;
                    } else {
                      StringBuilder discarded$19 = ((is) this).field_vb.append(kda.field_td);
                      break L9;
                    }
                  }
                }
                if (fna.field_h == 84) {
                  if (-1 > (((is) this).field_vb.length() ^ -1)) {
                    ((is) this).field_r = ((is) this).field_vb.toString();
                    return 2;
                  } else {
                    return 1;
                  }
                } else {
                  if (13 == fna.field_h) {
                    return 1;
                  } else {
                    continue L7;
                  }
                }
              } else {
                L12: {
                  ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
                  if (-1 == hf.field_b) {
                    break L12;
                  } else {
                    if (0 != ((is) this).field_y) {
                      break L12;
                    } else {
                      ((is) this).field_ub = 1;
                      break L12;
                    }
                  }
                }
                return ((is) this).field_ub;
              }
            }
          }
        }
    }

    is(int param0, int param1, int param2, int param3, String param4, jea param5, jea param6, jea param7) {
        super(0L, param5);
        ((is) this).field_ub = 0;
        ((is) this).field_zb = new jea(0L, param6, param4);
        ((is) this).b(-125, ((is) this).field_zb);
        ((is) this).field_tb = new jea(0L, param7);
        ((is) this).field_tb.field_ib = 16764006;
        ((is) this).b(-128, ((is) this).field_tb);
        ((is) this).field_tb.field_sb = "|";
        ((is) this).field_vb = new StringBuilder(12);
        int var9 = ((is) this).field_zb.b((byte) 69);
        ((is) this).field_zb.a(var9, di.field_a, -23776, 3, 5);
        ((is) this).field_tb.a(var9, di.field_a, -23776, 3 + di.field_a, 5);
        int var10 = 5 + (var9 - -5);
        int var11 = di.field_a * 2 + 6;
        int var12 = bt.a((byte) -8, var10, param2, param0);
        int var13 = hsa.a(param3, var11, param1, (byte) 69);
        ((is) this).a(var10, var11, -23776, var13, var12);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = new hra();
        field_xb = new pea(16);
    }
}
