/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static volatile long field_g;
    private boolean field_b;
    static fn field_f;
    private float field_i;
    private int field_h;
    private int field_a;
    static int field_d;
    static int field_e;
    static vn[][] field_j;
    private int field_c;

    final void a(byte param0) {
        if (param0 != 29) {
          ((qj) this).c(19);
          ((qj) this).field_b = true;
          fn discarded$4 = kh.a(59, false);
          return;
        } else {
          ((qj) this).field_b = true;
          fn discarded$5 = kh.a(59, false);
          return;
        }
    }

    final void c(int param0) {
        ((qj) this).field_b = false;
        fn discarded$0 = kh.a(param0, false);
    }

    final void b(int param0) {
        if ((float)param0 != ((qj) this).field_i) {
          ((qj) this).field_i = ((qj) this).field_i + 0.5f;
          if (5.0f >= ((qj) this).field_i) {
            if (((qj) this).field_a > 25) {
              ((qj) this).field_a = ((qj) this).field_a - 25;
              return;
            } else {
              return;
            }
          } else {
            ((qj) this).field_i = -1.0f;
            if (((qj) this).field_a <= 25) {
              return;
            } else {
              ((qj) this).field_a = ((qj) this).field_a - 25;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, wk param1) {
        vn[] stackIn_4_0 = null;
        vn[] stackIn_5_0 = null;
        vn[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vn[] stackIn_11_0 = null;
        vn[] stackIn_12_0 = null;
        vn[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        vn[] stackOut_10_0 = null;
        vn[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        vn[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        vn[] stackOut_3_0 = null;
        vn[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        vn[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (param0 != 6) {
          L0: {
            field_j = null;
            if (((qj) this).field_i >= 0.0f) {
              L1: {
                stackOut_10_0 = lb.field_eb;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!((qj) this).field_b) {
                  stackOut_12_0 = (vn[]) (Object) stackIn_12_0;
                  stackOut_12_1 = (int)((qj) this).field_i;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L1;
                } else {
                  stackOut_11_0 = (vn[]) (Object) stackIn_11_0;
                  stackOut_11_1 = 6;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L1;
                }
              }
              ((vn) (Object) stackIn_13_0[stackIn_13_1]).e(param1.a(((qj) this).field_h, (byte) -72) - 12, param1.a(((qj) this).field_c, 0) - 12, ((qj) this).field_a);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (((qj) this).field_i >= 0.0f) {
              L3: {
                stackOut_3_0 = lb.field_eb;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!((qj) this).field_b) {
                  stackOut_5_0 = (vn[]) (Object) stackIn_5_0;
                  stackOut_5_1 = (int)((qj) this).field_i;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = (vn[]) (Object) stackIn_4_0;
                  stackOut_4_1 = 6;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              ((vn) (Object) stackIn_6_0[stackIn_6_1]).e(param1.a(((qj) this).field_h, (byte) -72) - 12, param1.a(((qj) this).field_c, 0) - 12, ((qj) this).field_a);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 97) {
            field_f = null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 < 48) {
          field_g = 75L;
          ((qj) this).field_a = 256;
          ((qj) this).field_h = param1;
          ((qj) this).field_c = param2;
          ((qj) this).field_i = 0.0f;
          return;
        } else {
          ((qj) this).field_a = 256;
          ((qj) this).field_h = param1;
          ((qj) this).field_c = param2;
          ((qj) this).field_i = 0.0f;
          return;
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (param0 >= -98) {
          L0: {
            char discarded$1 = qj.a(-122, 'ﾛ');
            var2 = param1;
            if (32 != var2) {
              if (var2 != 160) {
                if (-96 != var2) {
                  if (45 != var2) {
                    if (-92 != var2) {
                      L1: {
                        if (-94 == var2) {
                          break L1;
                        } else {
                          if (-36 != var2) {
                            L2: {
                              if (var2 != 224) {
                                if (var2 != -226) {
                                  if (var2 == -227) {
                                    break L2;
                                  } else {
                                    if (-229 == var2) {
                                      break L2;
                                    } else {
                                      if (-228 == var2) {
                                        break L2;
                                      } else {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (193 != var2) {
                                            if (-195 != var2) {
                                              if (var2 == -197) {
                                                break L2;
                                              } else {
                                                if (-196 == var2) {
                                                  break L2;
                                                } else {
                                                  if (-233 != var2) {
                                                    L3: {
                                                      if (var2 == 233) {
                                                        break L3;
                                                      } else {
                                                        if (-235 == var2) {
                                                          break L3;
                                                        } else {
                                                          if (var2 != 235) {
                                                            if (var2 == 200) {
                                                              break L3;
                                                            } else {
                                                              if (var2 == 201) {
                                                                break L3;
                                                              } else {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (-204 == var2) {
                                                                    break L3;
                                                                  } else {
                                                                    if (var2 != 237) {
                                                                      if (var2 != 238) {
                                                                        if (239 != var2) {
                                                                          if (-206 != var2) {
                                                                            if (206 != var2) {
                                                                              if (-208 != var2) {
                                                                                L4: {
                                                                                  if (var2 == -243) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    if (-244 == var2) {
                                                                                      break L4;
                                                                                    } else {
                                                                                      if (var2 != -245) {
                                                                                        if (246 != var2) {
                                                                                          if (var2 == -246) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            if (-211 == var2) {
                                                                                              break L4;
                                                                                            } else {
                                                                                              if (-212 == var2) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                if (212 == var2) {
                                                                                                  break L4;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) != -215) {
                                                                                                    if (var2 == -214) {
                                                                                                      break L4;
                                                                                                    } else {
                                                                                                      if (var2 != 249) {
                                                                                                        if (-251 != var2) {
                                                                                                          if (-252 != var2) {
                                                                                                            L5: {
                                                                                                              if (-253 == var2) {
                                                                                                                break L5;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if ((var2 ^ -1) != -219) {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L5;
                                                                                                                    } else {
                                                                                                                      if (220 != var2) {
                                                                                                                        L6: {
                                                                                                                          if (var2 == -232) {
                                                                                                                            break L6;
                                                                                                                          } else {
                                                                                                                            if (199 == var2) {
                                                                                                                              break L6;
                                                                                                                            } else {
                                                                                                                              L7: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L7;
                                                                                                                                } else {
                                                                                                                                  if (376 == var2) {
                                                                                                                                    break L7;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (-210 != var2) {
                                                                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                                                                          return 'b';
                                                                                                                                        } else {
                                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        return 'n';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            return 'u';
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'o';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                return 'i';
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        } else {
                                                                          return 'i';
                                                                        }
                                                                      } else {
                                                                        return 'i';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            return 'e';
                                                          }
                                                        }
                                                      }
                                                    }
                                                    return 'e';
                                                  } else {
                                                    return 'e';
                                                  }
                                                }
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      }
                      return param1;
                    } else {
                      return param1;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return '_';
        } else {
          L8: {
            var2 = param1;
            if (32 != var2) {
              if (var2 != 160) {
                if (-96 != var2) {
                  if (45 != var2) {
                    if (-92 != var2) {
                      if (-94 != var2) {
                        if (-36 != (var2 ^ -1)) {
                          L9: {
                            if (var2 != 224) {
                              if ((var2 ^ -1) != -226) {
                                if (var2 != -227) {
                                  if (-229 != var2) {
                                    if (-228 == var2) {
                                      break L9;
                                    } else {
                                      if (var2 == 192) {
                                        break L9;
                                      } else {
                                        if (193 != var2) {
                                          if (-195 != var2) {
                                            if (var2 == -197) {
                                              break L9;
                                            } else {
                                              if (-196 == var2) {
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (-233 != var2) {
                                                    if (var2 == 233) {
                                                      break L10;
                                                    } else {
                                                      if (-235 == var2) {
                                                        break L10;
                                                      } else {
                                                        if (var2 != 235) {
                                                          if (var2 == 200) {
                                                            break L10;
                                                          } else {
                                                            if (var2 == 201) {
                                                              break L10;
                                                            } else {
                                                              if (202 == var2) {
                                                                break L10;
                                                              } else {
                                                                if (-204 == var2) {
                                                                  break L10;
                                                                } else {
                                                                  L11: {
                                                                    if (var2 != 237) {
                                                                      if (var2 != 238) {
                                                                        if (239 != var2) {
                                                                          if (-206 != var2) {
                                                                            if (206 != var2) {
                                                                              if (-208 != (var2 ^ -1)) {
                                                                                L12: {
                                                                                  if (var2 == -243) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    if (-244 == var2) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      if (var2 != -245) {
                                                                                        if (246 != var2) {
                                                                                          if (var2 == -246) {
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (-211 == var2) {
                                                                                              break L12;
                                                                                            } else {
                                                                                              if (-212 == var2) {
                                                                                                break L12;
                                                                                              } else {
                                                                                                if (212 == var2) {
                                                                                                  break L12;
                                                                                                } else {
                                                                                                  if (var2 != -215) {
                                                                                                    if (var2 == -214) {
                                                                                                      break L12;
                                                                                                    } else {
                                                                                                      L13: {
                                                                                                        if (var2 != 249) {
                                                                                                          if (-251 != var2) {
                                                                                                            if (-252 != var2) {
                                                                                                              if (-253 == (var2 ^ -1)) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if ((var2 ^ -1) != -219) {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L13;
                                                                                                                    } else {
                                                                                                                      if (220 != var2) {
                                                                                                                        L14: {
                                                                                                                          if (var2 == -232) {
                                                                                                                            break L14;
                                                                                                                          } else {
                                                                                                                            if (199 == var2) {
                                                                                                                              break L14;
                                                                                                                            } else {
                                                                                                                              L15: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L15;
                                                                                                                                } else {
                                                                                                                                  if (376 == var2) {
                                                                                                                                    break L15;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (-210 != var2) {
                                                                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                                                                          return 'b';
                                                                                                                                        } else {
                                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        return 'n';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L13;
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L12;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L12;
                                                                                        }
                                                                                      } else {
                                                                                        break L12;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L11;
                                                                              }
                                                                            } else {
                                                                              break L11;
                                                                            }
                                                                          } else {
                                                                            break L11;
                                                                          }
                                                                        } else {
                                                                          break L11;
                                                                        }
                                                                      } else {
                                                                        break L11;
                                                                      }
                                                                    } else {
                                                                      break L11;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                return 'e';
                                              }
                                            }
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                break L9;
                              }
                            } else {
                              break L9;
                            }
                          }
                          return 'a';
                        } else {
                          return param1;
                        }
                      } else {
                        return param1;
                      }
                    } else {
                      return param1;
                    }
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            } else {
              break L8;
            }
          }
          return '_';
        }
    }

    qj() {
        ((qj) this).field_i = -1.0f;
        ((qj) this).field_h = 0;
        ((qj) this).field_b = false;
        ((qj) this).field_c = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0L;
        field_f = null;
        field_d = 640;
        field_j = new vn[10][];
    }
}
