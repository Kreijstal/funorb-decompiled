/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wca {
    String field_f;
    private int field_m;
    private int field_i;
    private int field_j;
    kga field_g;
    private int field_d;
    String field_a;
    static int field_n;
    int field_b;
    int[] field_c;
    String field_h;
    int field_e;
    int[] field_l;
    si field_k;

    final int a(pd param0, int param1, boolean[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var4 = param1;
        L0: while (true) {
          if (((wca) this).field_c.length <= var4) {
            return -1;
          } else {
            if (var4 == 1) {
              var4++;
              var4++;
              continue L0;
            } else {
              if (-5 != (var4 ^ -1)) {
                if (var4 != 7) {
                  if (10 != var4) {
                    if (!param2[var4]) {
                      if (((Object) (Object) fw.field_h[((wca) this).field_c[var4]]).equals((Object) (Object) param0)) {
                        var5 = (var4 - -2) / 3;
                        if (0 != var5) {
                          if (param2[var5 * 3 - 2]) {
                            return var4;
                          } else {
                            var4++;
                            continue L0;
                          }
                        } else {
                          return var4;
                        }
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int a(int param0, pd param1, boolean[] param2) {
        Object var5 = null;
        if ((((wca) this).field_k.field_b ^ -1) != -8) {
          L0: {
            if ((((wca) this).field_k.field_b ^ -1) == -7) {
              L1: {
                if (gma.field_e[((wca) this).field_j].field_b != gfa.field_a[param1.field_a].field_k.field_b) {
                  break L1;
                } else {
                  if (param2[1]) {
                    break L1;
                  } else {
                    return 0;
                  }
                }
              }
              if (!((Object) (Object) fw.field_h[((wca) this).field_m]).equals((Object) (Object) param1)) {
                break L0;
              } else {
                if (param2[4]) {
                  break L0;
                } else {
                  return 1;
                }
              }
            } else {
              if (gfa.field_a[param1.field_a].field_k.field_b != gma.field_e[((wca) this).field_j].field_b) {
                if (gfa.field_a[param1.field_a].field_k.field_b != gma.field_e[((wca) this).field_m].field_b) {
                  break L0;
                } else {
                  if (!param2[4]) {
                    return 1;
                  } else {
                    L2: {
                      if (!((Object) (Object) fw.field_h[((wca) this).field_i]).equals((Object) (Object) param1)) {
                        break L2;
                      } else {
                        if (!param2[7]) {
                          return 2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                        break L3;
                      } else {
                        if (!param2[10]) {
                          return 3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (param0 >= 2) {
                        break L4;
                      } else {
                        var5 = null;
                        int discarded$11 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                        break L4;
                      }
                    }
                    return -1;
                  }
                }
              } else {
                if (!param2[1]) {
                  return 0;
                } else {
                  L5: {
                    if (gfa.field_a[param1.field_a].field_k.field_b != gma.field_e[((wca) this).field_m].field_b) {
                      break L5;
                    } else {
                      if (!param2[4]) {
                        return 1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (!((Object) (Object) fw.field_h[((wca) this).field_i]).equals((Object) (Object) param1)) {
                      break L6;
                    } else {
                      if (!param2[7]) {
                        return 2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                      break L7;
                    } else {
                      if (!param2[10]) {
                        return 3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param0 >= 2) {
                      break L8;
                    } else {
                      var5 = null;
                      int discarded$12 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                      break L8;
                    }
                  }
                  return -1;
                }
              }
            }
          }
          if (!((Object) (Object) fw.field_h[((wca) this).field_i]).equals((Object) (Object) param1)) {
            if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
              if (param0 >= 2) {
                return -1;
              } else {
                var5 = null;
                int discarded$13 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                return -1;
              }
            } else {
              if (!param2[10]) {
                return 3;
              } else {
                L9: {
                  if (param0 >= 2) {
                    break L9;
                  } else {
                    var5 = null;
                    int discarded$14 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                    break L9;
                  }
                }
                return -1;
              }
            }
          } else {
            if (!param2[7]) {
              return 2;
            } else {
              L10: {
                if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                  break L10;
                } else {
                  if (!param2[10]) {
                    return 3;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if (param0 >= 2) {
                  break L11;
                } else {
                  var5 = null;
                  int discarded$15 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                  break L11;
                }
              }
              return -1;
            }
          }
        } else {
          if (((Object) (Object) fw.field_h[((wca) this).field_j]).equals((Object) (Object) param1)) {
            if (!param2[1]) {
              return 0;
            } else {
              L12: {
                if (!((Object) (Object) fw.field_h[((wca) this).field_m]).equals((Object) (Object) param1)) {
                  break L12;
                } else {
                  if (param2[4]) {
                    break L12;
                  } else {
                    return 1;
                  }
                }
              }
              if (!((Object) (Object) fw.field_h[((wca) this).field_i]).equals((Object) (Object) param1)) {
                if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                  if (param0 >= 2) {
                    return -1;
                  } else {
                    var5 = null;
                    int discarded$16 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                    return -1;
                  }
                } else {
                  if (!param2[10]) {
                    return 3;
                  } else {
                    L13: {
                      if (param0 >= 2) {
                        break L13;
                      } else {
                        var5 = null;
                        int discarded$17 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                        break L13;
                      }
                    }
                    return -1;
                  }
                }
              } else {
                if (!param2[7]) {
                  return 2;
                } else {
                  L14: {
                    if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                      break L14;
                    } else {
                      if (!param2[10]) {
                        return 3;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (param0 >= 2) {
                      break L15;
                    } else {
                      var5 = null;
                      int discarded$18 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                      break L15;
                    }
                  }
                  return -1;
                }
              }
            }
          } else {
            L16: {
              if (!((Object) (Object) fw.field_h[((wca) this).field_m]).equals((Object) (Object) param1)) {
                break L16;
              } else {
                if (param2[4]) {
                  break L16;
                } else {
                  return 1;
                }
              }
            }
            if (!((Object) (Object) fw.field_h[((wca) this).field_i]).equals((Object) (Object) param1)) {
              if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                if (param0 >= 2) {
                  return -1;
                } else {
                  var5 = null;
                  int discarded$19 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                  return -1;
                }
              } else {
                if (!param2[10]) {
                  return 3;
                } else {
                  L17: {
                    if (param0 >= 2) {
                      break L17;
                    } else {
                      var5 = null;
                      int discarded$20 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                      break L17;
                    }
                  }
                  return -1;
                }
              }
            } else {
              if (!param2[7]) {
                return 2;
              } else {
                L18: {
                  if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                    break L18;
                  } else {
                    if (!param2[10]) {
                      return 3;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (param0 >= 2) {
                    break L19;
                  } else {
                    var5 = null;
                    int discarded$21 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                    break L19;
                  }
                }
                return -1;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oha var10 = null;
        oha var11 = null;
        if (param4 < 61) {
          wca.a((byte) 117);
          var11 = al.a(-72, param3);
          var6 = var11.field_h;
          var7 = var11.field_a;
          var8 = var11.field_l;
          if (param0) {
            L0: {
              hh.field_b[var6].e(5 + param2, param1 + 5);
              if (1 == var8) {
                break L0;
              } else {
                if (2 == var8) {
                  break L0;
                } else {
                  if (3 == var8) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        if (1 == var7) {
                          break L2;
                        } else {
                          if (var7 != 2) {
                            break L1;
                          } else {
                            if (!hl.a((byte) 104, var11.field_j)) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      L3: {
                        if (-2 < (var8 ^ -1)) {
                          break L3;
                        } else {
                          us.field_c.a(param2 + 11, param1);
                          break L3;
                        }
                      }
                      L4: {
                        if (var8 <= -3) {
                          us.field_c.a(18 + param2, 3 + param1);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (-4 <= var8) {
                        us.field_c.a(21 + param2, 10 + param1);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (1 == var7) {
              if (-2 < (var8 ^ -1)) {
                L5: {
                  if (var8 <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (-4 <= var8) {
                  us.field_c.a(21 + param2, 10 + param1);
                  return;
                } else {
                  return;
                }
              } else {
                L6: {
                  us.field_c.a(param2 + 11, param1);
                  if (var8 <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-4 <= var8) {
                    us.field_c.a(21 + param2, 10 + param1);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              if (var7 == 2) {
                if (hl.a((byte) 104, var11.field_j)) {
                  L8: {
                    if (-2 < (var8 ^ -1)) {
                      break L8;
                    } else {
                      us.field_c.a(param2 + 11, param1);
                      break L8;
                    }
                  }
                  L9: {
                    if (var8 <= -3) {
                      us.field_c.a(18 + param2, 3 + param1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-4 <= var8) {
                      us.field_c.a(21 + param2, 10 + param1);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            hh.field_b[var6].a(5 + param2, param1 + 5, 128);
            if (1 != var8) {
              L11: {
                if (2 == var8) {
                  break L11;
                } else {
                  if (3 == var8) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                L13: {
                  if (1 == var7) {
                    break L13;
                  } else {
                    if (var7 != 2) {
                      break L12;
                    } else {
                      if (!hl.a((byte) 104, var11.field_j)) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                L14: {
                  if (-2 < (var8 ^ -1)) {
                    break L14;
                  } else {
                    us.field_c.a(param2 + 11, param1);
                    break L14;
                  }
                }
                L15: {
                  if (var8 <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (-4 <= var8) {
                  us.field_c.a(21 + param2, 10 + param1);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            } else {
              L16: {
                L17: {
                  if (1 == var7) {
                    break L17;
                  } else {
                    if (var7 != 2) {
                      break L16;
                    } else {
                      if (!hl.a((byte) 104, var11.field_j)) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                L18: {
                  if (-2 < (var8 ^ -1)) {
                    break L18;
                  } else {
                    us.field_c.a(param2 + 11, param1);
                    break L18;
                  }
                }
                L19: {
                  if (var8 <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (-4 <= var8) {
                  us.field_c.a(21 + param2, 10 + param1);
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            }
          }
        } else {
          var10 = al.a(-72, param3);
          var6 = var10.field_h;
          var7 = var10.field_a;
          var8 = var10.field_l;
          if (param0) {
            L20: {
              hh.field_b[var6].e(5 + param2, param1 + 5);
              if (1 == var8) {
                break L20;
              } else {
                if (2 == var8) {
                  break L20;
                } else {
                  if (3 == var8) {
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
            }
            L21: {
              L22: {
                if (1 == var7) {
                  break L22;
                } else {
                  if (var7 != 2) {
                    break L21;
                  } else {
                    if (!hl.a((byte) 104, var10.field_j)) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L23: {
                if (-2 < (var8 ^ -1)) {
                  break L23;
                } else {
                  us.field_c.a(param2 + 11, param1);
                  break L23;
                }
              }
              L24: {
                if (var8 <= -3) {
                  us.field_c.a(18 + param2, 3 + param1);
                  break L24;
                } else {
                  break L24;
                }
              }
              if (-4 <= var8) {
                us.field_c.a(21 + param2, 10 + param1);
                break L21;
              } else {
                break L21;
              }
            }
            return;
          } else {
            L25: {
              hh.field_b[var6].a(5 + param2, param1 + 5, 128);
              if (1 == var8) {
                break L25;
              } else {
                if (2 == var8) {
                  break L25;
                } else {
                  if (3 == var8) {
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
            }
            L26: {
              L27: {
                if (1 == var7) {
                  break L27;
                } else {
                  if (var7 != 2) {
                    break L26;
                  } else {
                    if (!hl.a((byte) 104, var10.field_j)) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
              }
              L28: {
                if (-2 < (var8 ^ -1)) {
                  break L28;
                } else {
                  us.field_c.a(param2 + 11, param1);
                  break L28;
                }
              }
              L29: {
                if (var8 <= -3) {
                  us.field_c.a(18 + param2, 3 + param1);
                  break L29;
                } else {
                  break L29;
                }
              }
              if (-4 <= var8) {
                us.field_c.a(21 + param2, 10 + param1);
                break L26;
              } else {
                break L26;
              }
            }
            return;
          }
        }
    }

    public final boolean equals(Object param0) {
        if (this == param0) {
            return true;
        }
        if (!(param0 != null)) {
            return false;
        }
        if (this.getClass() != param0.getClass()) {
            return false;
        }
        wca var2 = (wca) param0;
        if (var2.field_b == var2.field_b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int var1 = 1;
        var1 = ((wca) this).field_b + 31 * var1;
        return var1;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        if (param0 <= -59) {
          dl.field_h = new js(16);
          var1 = 0;
          L0: while (true) {
            if (var1 >= ol.field_l.length) {
              return;
            } else {
              dl.field_h.a((long)ol.field_l[var1].hashCode(), (byte) -55, (bw) (Object) new ji(var1));
              var1++;
              continue L0;
            }
          }
        } else {
          wca.a((byte) 26);
          dl.field_h = new js(16);
          var1 = 0;
          L1: while (true) {
            if (var1 >= ol.field_l.length) {
              return;
            } else {
              dl.field_h.a((long)ol.field_l[var1].hashCode(), (byte) -55, (bw) (Object) new ji(var1));
              var1++;
              continue L1;
            }
          }
        }
    }

    wca(int param0, String param1, String param2, int[] param3, int[] param4, int param5, kga param6, String param7) {
        ((wca) this).field_f = param1;
        ((wca) this).field_h = param2;
        ((wca) this).field_g = param6;
        ((wca) this).field_b = param0;
        ((wca) this).field_a = param7;
        ((wca) this).field_k = fw.field_h[((wca) this).field_b].field_g;
        Random discarded$0 = new Random((long)param0);
        ((wca) this).field_c = param4;
        ((wca) this).field_e = param5;
        ((wca) this).field_j = ((wca) this).field_c[1];
        ((wca) this).field_l = param3;
        ((wca) this).field_m = ((wca) this).field_c[4];
        ((wca) this).field_d = ((wca) this).field_c[10];
        ((wca) this).field_i = ((wca) this).field_c[7];
    }

    static {
    }
}
