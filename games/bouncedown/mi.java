/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    private int field_a;
    int field_f;
    static vf field_c;
    private boolean field_g;
    int field_b;
    static boolean field_j;
    static String field_e;
    private int field_h;
    private int field_d;
    private int field_i;
    static tg field_k;

    final void a(int param0, int param1, int param2) {
        Object var5 = null;
        if (param0 >= ((mi) this).field_f) {
          throw new IllegalArgumentException();
        } else {
          if (((mi) this).field_f <= param1) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              ((mi) this).field_a = 0;
              ((mi) this).field_h = 0;
              if (vh.field_e != 0) {
                ((mi) this).field_d = pj.field_b;
                ((mi) this).field_b = param1;
                ((mi) this).field_g = true;
                ((mi) this).field_i = vh.field_e;
                ((mi) this).field_h = vh.field_e;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 != (((mi) this).field_i ^ -1)) {
              if (n.field_m != 0) {
                L1: {
                  if (-1 > (((mi) this).field_d ^ -1)) {
                    ((mi) this).field_d = ((mi) this).field_d - 1;
                    break L1;
                  } else {
                    ((mi) this).field_d = ig.field_a;
                    ((mi) this).field_d = ((mi) this).field_d - 1;
                    break L1;
                  }
                }
                if (param2 == -798) {
                  L2: {
                    if (0 != vh.field_e) {
                      break L2;
                    } else {
                      if (n.field_m != 0) {
                        break L2;
                      } else {
                        ((mi) this).field_i = 0;
                        if (((mi) this).field_i == 0) {
                          L3: {
                            L4: {
                              if (((mi) this).field_g) {
                                break L4;
                              } else {
                                if (!field_j) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            if (param0 < 0) {
                              if (!((mi) this).field_g) {
                                break L3;
                              } else {
                                ((mi) this).field_b = -1;
                                return;
                              }
                            } else {
                              if (((mi) this).field_b != param0) {
                                ((mi) this).field_g = true;
                                ((mi) this).field_b = param0;
                                return;
                              } else {
                                ((mi) this).field_g = true;
                                ((mi) this).field_b = param0;
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
                  if (((mi) this).field_i == 0) {
                    L5: {
                      if (((mi) this).field_g) {
                        if (param0 < 0) {
                          if (!((mi) this).field_g) {
                            break L5;
                          } else {
                            ((mi) this).field_b = -1;
                            return;
                          }
                        } else {
                          if (((mi) this).field_b != param0) {
                            ((mi) this).field_g = true;
                            ((mi) this).field_b = param0;
                            return;
                          } else {
                            ((mi) this).field_g = true;
                            ((mi) this).field_b = param0;
                            return;
                          }
                        }
                      } else {
                        if (!field_j) {
                          break L5;
                        } else {
                          if (param0 < 0) {
                            if (!((mi) this).field_g) {
                              return;
                            } else {
                              ((mi) this).field_b = -1;
                              return;
                            }
                          } else {
                            if (((mi) this).field_b != param0) {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              return;
                            } else {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              return;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  var5 = null;
                  mi.a(-29, -13, (he) null);
                  if (0 == vh.field_e) {
                    if (n.field_m == 0) {
                      ((mi) this).field_i = 0;
                      if (((mi) this).field_i == 0) {
                        L6: {
                          L7: {
                            if (((mi) this).field_g) {
                              break L7;
                            } else {
                              if (!field_j) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (param0 < 0) {
                            if (!((mi) this).field_g) {
                              break L6;
                            } else {
                              ((mi) this).field_b = -1;
                              break L6;
                            }
                          } else {
                            if (((mi) this).field_b != param0) {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L6;
                            } else {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L6;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (((mi) this).field_i == 0) {
                        L8: {
                          L9: {
                            if (((mi) this).field_g) {
                              break L9;
                            } else {
                              if (!field_j) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (param0 < 0) {
                            if (!((mi) this).field_g) {
                              break L8;
                            } else {
                              ((mi) this).field_b = -1;
                              break L8;
                            }
                          } else {
                            if (((mi) this).field_b != param0) {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L8;
                            } else {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L8;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (((mi) this).field_i == 0) {
                      L10: {
                        L11: {
                          if (((mi) this).field_g) {
                            break L11;
                          } else {
                            if (!field_j) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (param0 < 0) {
                          if (!((mi) this).field_g) {
                            break L10;
                          } else {
                            ((mi) this).field_b = -1;
                            break L10;
                          }
                        } else {
                          if (((mi) this).field_b != param0) {
                            ((mi) this).field_g = true;
                            ((mi) this).field_b = param0;
                            break L10;
                          } else {
                            ((mi) this).field_g = true;
                            ((mi) this).field_b = param0;
                            break L10;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param2 == -798) {
                  L12: {
                    if (0 != vh.field_e) {
                      break L12;
                    } else {
                      if (n.field_m != 0) {
                        break L12;
                      } else {
                        ((mi) this).field_i = 0;
                        if (((mi) this).field_i != 0) {
                          return;
                        } else {
                          L13: {
                            L14: {
                              if (((mi) this).field_g) {
                                break L14;
                              } else {
                                if (!field_j) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (param0 < 0) {
                              if (!((mi) this).field_g) {
                                break L13;
                              } else {
                                ((mi) this).field_b = -1;
                                break L13;
                              }
                            } else {
                              if (((mi) this).field_b != param0) {
                                ((mi) this).field_g = true;
                                ((mi) this).field_b = param0;
                                break L13;
                              } else {
                                ((mi) this).field_g = true;
                                ((mi) this).field_b = param0;
                                break L13;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  if (((mi) this).field_i == 0) {
                    if (((mi) this).field_g) {
                      if (param0 < 0) {
                        if (((mi) this).field_g) {
                          ((mi) this).field_b = -1;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((mi) this).field_b != param0) {
                          ((mi) this).field_g = true;
                          ((mi) this).field_b = param0;
                          return;
                        } else {
                          ((mi) this).field_g = true;
                          ((mi) this).field_b = param0;
                          return;
                        }
                      }
                    } else {
                      if (field_j) {
                        L15: {
                          if (param0 < 0) {
                            if (!((mi) this).field_g) {
                              break L15;
                            } else {
                              ((mi) this).field_b = -1;
                              break L15;
                            }
                          } else {
                            if (((mi) this).field_b != param0) {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L15;
                            } else {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L15;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L16: {
                    var5 = null;
                    mi.a(-29, -13, (he) null);
                    if (0 != vh.field_e) {
                      break L16;
                    } else {
                      if (n.field_m != 0) {
                        break L16;
                      } else {
                        ((mi) this).field_i = 0;
                        break L16;
                      }
                    }
                  }
                  if (((mi) this).field_i != 0) {
                    return;
                  } else {
                    L17: {
                      L18: {
                        if (((mi) this).field_g) {
                          break L18;
                        } else {
                          if (!field_j) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (param0 < 0) {
                        if (!((mi) this).field_g) {
                          break L17;
                        } else {
                          ((mi) this).field_b = -1;
                          break L17;
                        }
                      } else {
                        if (((mi) this).field_b != param0) {
                          ((mi) this).field_g = true;
                          ((mi) this).field_b = param0;
                          break L17;
                        } else {
                          ((mi) this).field_g = true;
                          ((mi) this).field_b = param0;
                          break L17;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              if (param2 == -798) {
                L19: {
                  if (0 != vh.field_e) {
                    break L19;
                  } else {
                    if (n.field_m != 0) {
                      break L19;
                    } else {
                      ((mi) this).field_i = 0;
                      if (((mi) this).field_i != 0) {
                        return;
                      } else {
                        L20: {
                          L21: {
                            if (((mi) this).field_g) {
                              break L21;
                            } else {
                              if (!field_j) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (param0 < 0) {
                            if (!((mi) this).field_g) {
                              break L20;
                            } else {
                              ((mi) this).field_b = -1;
                              break L20;
                            }
                          } else {
                            if (((mi) this).field_b != param0) {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L20;
                            } else {
                              ((mi) this).field_g = true;
                              ((mi) this).field_b = param0;
                              break L20;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (((mi) this).field_i == 0) {
                  if (((mi) this).field_g) {
                    if (param0 < 0) {
                      if (((mi) this).field_g) {
                        ((mi) this).field_b = -1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (((mi) this).field_b != param0) {
                        ((mi) this).field_g = true;
                        ((mi) this).field_b = param0;
                        return;
                      } else {
                        ((mi) this).field_g = true;
                        ((mi) this).field_b = param0;
                        return;
                      }
                    }
                  } else {
                    if (field_j) {
                      L22: {
                        if (param0 < 0) {
                          if (!((mi) this).field_g) {
                            break L22;
                          } else {
                            ((mi) this).field_b = -1;
                            break L22;
                          }
                        } else {
                          if (((mi) this).field_b != param0) {
                            ((mi) this).field_g = true;
                            ((mi) this).field_b = param0;
                            break L22;
                          } else {
                            ((mi) this).field_g = true;
                            ((mi) this).field_b = param0;
                            break L22;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L23: {
                  var5 = null;
                  mi.a(-29, -13, (he) null);
                  if (0 != vh.field_e) {
                    break L23;
                  } else {
                    if (n.field_m != 0) {
                      break L23;
                    } else {
                      ((mi) this).field_i = 0;
                      break L23;
                    }
                  }
                }
                if (((mi) this).field_i != 0) {
                  return;
                } else {
                  L24: {
                    L25: {
                      if (((mi) this).field_g) {
                        break L25;
                      } else {
                        if (!field_j) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    if (param0 < 0) {
                      if (!((mi) this).field_g) {
                        break L24;
                      } else {
                        ((mi) this).field_b = -1;
                        break L24;
                      }
                    } else {
                      if (((mi) this).field_b != param0) {
                        ((mi) this).field_g = true;
                        ((mi) this).field_b = param0;
                        break L24;
                      } else {
                        ((mi) this).field_g = true;
                        ((mi) this).field_b = param0;
                        break L24;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((mi) this).field_i = 0;
        int var5 = 53 % ((param1 - -13) / 62);
        ((mi) this).field_g = param0 ? true : false;
        if (!((mi) this).field_g) {
            ((mi) this).field_b = param3;
        } else {
            ((mi) this).field_b = param2;
            return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        var3 = 0;
        if (param1 == 122) {
          L0: while (true) {
            if ((param0 ^ -1) >= -1) {
              return var3;
            } else {
              var3 = 1 & param2 | var3 << 1978875745;
              param2 = param2 >>> 1;
              param0--;
              continue L0;
            }
          }
        } else {
          return -76;
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_e = null;
        if (param0 >= -71) {
            field_e = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, he param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ii var7 = null;
        ii var8 = null;
        var6 = Bounce.field_N;
        var7 = hh.field_p;
        var8 = var7;
        var8.a(true, param0);
        var8.field_h = var8.field_h + 1;
        var4 = var8.field_h;
        var8.a(1, (byte) 126);
        var8.e(-750655096, param2.field_j);
        var8.e(-750655096, param2.field_m);
        var8.e(-750655096, param2.field_r);
        var8.b(param2.field_s, (byte) 57);
        var8.b(param2.field_h, (byte) 49);
        var8.b(param2.field_q, (byte) 92);
        var8.b(param2.field_t, (byte) -50);
        var8.a(param2.field_g.length, (byte) 50);
        var5 = 0;
        L0: while (true) {
          if (param2.field_g.length <= var5) {
            if (param1 >= -58) {
              mi.b((byte) -128);
              int discarded$4 = var8.b(var4, -1);
              var8.b(-var4 + var8.field_h, true);
              return;
            } else {
              int discarded$5 = var8.b(var4, -1);
              var8.b(-var4 + var8.field_h, true);
              return;
            }
          } else {
            var7.b(param2.field_g[var5], (byte) -59);
            var5++;
            continue L0;
          }
        }
    }

    final void a(byte param0) {
        ((mi) this).field_a = 0;
        ((mi) this).field_h = 0;
        if (0 == ((mi) this).field_i) {
          if (98 == lh.field_f) {
            L0: {
              if (-1 <= (((mi) this).field_b ^ -1)) {
                ((mi) this).field_b = ((mi) this).field_f;
                break L0;
              } else {
                break L0;
              }
            }
            ((mi) this).field_g = false;
            ((mi) this).field_b = ((mi) this).field_b - 1;
            if (0 != ((mi) this).field_i) {
              if (param0 >= 58) {
                if (((mi) this).field_i == 0) {
                  L1: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L1;
                    } else {
                      L2: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L1;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                field_k = null;
                if (((mi) this).field_i == 0) {
                  L3: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L3;
                    } else {
                      L4: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((mi) this).field_a = lh.field_f;
              if (param0 >= 58) {
                if (((mi) this).field_i == 0) {
                  L5: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L5;
                    } else {
                      L6: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L5;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                field_k = null;
                if (((mi) this).field_i == 0) {
                  L7: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L7;
                    } else {
                      L8: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L7;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (0 != ((mi) this).field_i) {
              if (param0 >= 58) {
                if (((mi) this).field_i != 0) {
                  return;
                } else {
                  L9: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L9;
                    } else {
                      L10: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                field_k = null;
                if (((mi) this).field_i != 0) {
                  return;
                } else {
                  L11: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L11;
                    } else {
                      L12: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L11;
                    }
                  }
                  return;
                }
              }
            } else {
              ((mi) this).field_a = lh.field_f;
              if (param0 >= 58) {
                if (((mi) this).field_i != 0) {
                  return;
                } else {
                  L13: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L13;
                    } else {
                      L14: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L13;
                    }
                  }
                  return;
                }
              } else {
                field_k = null;
                if (((mi) this).field_i != 0) {
                  return;
                } else {
                  L15: {
                    if ((lh.field_f ^ -1) != -100) {
                      break L15;
                    } else {
                      L16: {
                        ((mi) this).field_b = ((mi) this).field_b + 1;
                        if (((mi) this).field_b >= ((mi) this).field_f) {
                          ((mi) this).field_b = 0;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      ((mi) this).field_g = false;
                      break L15;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          if (0 != ((mi) this).field_i) {
            if (param0 >= 58) {
              if (((mi) this).field_i != 0) {
                return;
              } else {
                L17: {
                  if ((lh.field_f ^ -1) != -100) {
                    break L17;
                  } else {
                    L18: {
                      ((mi) this).field_b = ((mi) this).field_b + 1;
                      if (((mi) this).field_b >= ((mi) this).field_f) {
                        ((mi) this).field_b = 0;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    ((mi) this).field_g = false;
                    break L17;
                  }
                }
                return;
              }
            } else {
              field_k = null;
              if (((mi) this).field_i != 0) {
                return;
              } else {
                L19: {
                  if ((lh.field_f ^ -1) != -100) {
                    break L19;
                  } else {
                    L20: {
                      ((mi) this).field_b = ((mi) this).field_b + 1;
                      if (((mi) this).field_b >= ((mi) this).field_f) {
                        ((mi) this).field_b = 0;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    ((mi) this).field_g = false;
                    break L19;
                  }
                }
                return;
              }
            }
          } else {
            ((mi) this).field_a = lh.field_f;
            if (param0 >= 58) {
              if (((mi) this).field_i != 0) {
                return;
              } else {
                L21: {
                  if ((lh.field_f ^ -1) != -100) {
                    break L21;
                  } else {
                    L22: {
                      ((mi) this).field_b = ((mi) this).field_b + 1;
                      if (((mi) this).field_b >= ((mi) this).field_f) {
                        ((mi) this).field_b = 0;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    ((mi) this).field_g = false;
                    break L21;
                  }
                }
                return;
              }
            } else {
              field_k = null;
              if (((mi) this).field_i != 0) {
                return;
              } else {
                L23: {
                  if ((lh.field_f ^ -1) != -100) {
                    break L23;
                  } else {
                    L24: {
                      ((mi) this).field_b = ((mi) this).field_b + 1;
                      if (((mi) this).field_b >= ((mi) this).field_f) {
                        ((mi) this).field_b = 0;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    ((mi) this).field_g = false;
                    break L23;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (((mi) this).field_h == 0) {
            if (-85 != ((mi) this).field_a) {
              if (-84 == ((mi) this).field_a) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          int discarded$8 = mi.a(30, (byte) -44, -106);
          if (((mi) this).field_h == 0) {
            if (-85 == ((mi) this).field_a) {
              return true;
            } else {
              L0: {
                if (-84 != ((mi) this).field_a) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    mi(int param0) {
        ((mi) this).field_g = false;
        ((mi) this).field_b = 0;
        ((mi) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_j = false;
        field_c = new vf();
    }
}
