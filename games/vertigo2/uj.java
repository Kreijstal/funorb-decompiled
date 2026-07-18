/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private int field_d;
    static String field_e;
    private int field_l;
    int field_b;
    static boolean field_g;
    private int field_a;
    static String field_h;
    private boolean field_f;
    private int field_i;
    static String field_k;
    static String[] field_j;
    int field_c;

    final static boolean c(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -87) {
          if (null == nj.field_b) {
            if (pm.field_a) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          uj.a(-74, 73, 75, true, 41, -1);
          if (null != nj.field_b) {
            return true;
          } else {
            L0: {
              if (!pm.field_a) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void d(byte param0) {
        L0: {
          ((uj) this).field_i = 0;
          ((uj) this).field_a = 0;
          if (((uj) this).field_l == 0) {
            ((uj) this).field_i = de.field_f;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 != ((uj) this).field_l) {
            break L1;
          } else {
            if (de.field_f == 98) {
              L2: {
                if (((uj) this).field_c <= 0) {
                  ((uj) this).field_c = ((uj) this).field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((uj) this).field_c = ((uj) this).field_c - 1;
              ((uj) this).field_f = false;
              break L1;
            } else {
              if (param0 <= 32) {
                field_k = null;
                if (0 == ((uj) this).field_l) {
                  if (99 == de.field_f) {
                    ((uj) this).field_c = ((uj) this).field_c + 1;
                    ((uj) this).field_f = false;
                    if (((uj) this).field_c >= ((uj) this).field_b) {
                      ((uj) this).field_c = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (0 == ((uj) this).field_l) {
                  if (99 == de.field_f) {
                    ((uj) this).field_c = ((uj) this).field_c + 1;
                    ((uj) this).field_f = false;
                    if (((uj) this).field_c >= ((uj) this).field_b) {
                      ((uj) this).field_c = 0;
                      return;
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
            }
          }
        }
        if (param0 > 32) {
          if (0 == ((uj) this).field_l) {
            if (99 == de.field_f) {
              ((uj) this).field_c = ((uj) this).field_c + 1;
              ((uj) this).field_f = false;
              if (((uj) this).field_c < ((uj) this).field_b) {
                return;
              } else {
                ((uj) this).field_c = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_k = null;
          if (0 == ((uj) this).field_l) {
            if (99 == de.field_f) {
              ((uj) this).field_c = ((uj) this).field_c + 1;
              ((uj) this).field_f = false;
              if (((uj) this).field_c >= ((uj) this).field_b) {
                ((uj) this).field_c = 0;
                return;
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
    }

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 84) {
          if (0 == ((uj) this).field_a) {
            if (84 != ((uj) this).field_i) {
              if (((uj) this).field_i == 83) {
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
          field_h = null;
          if (0 == ((uj) this).field_a) {
            if (84 == ((uj) this).field_i) {
              return true;
            } else {
              L0: {
                if (((uj) this).field_i != 83) {
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

    final void a(byte param0, int param1, int param2) {
        if (~((uj) this).field_b < ~param1) {
          if (((uj) this).field_b > param2) {
            ((uj) this).field_a = 0;
            if (param0 != -29) {
              ((uj) this).field_d = -6;
              ((uj) this).field_i = 0;
              if (kf.field_c != 0) {
                ((uj) this).field_l = kf.field_c;
                ((uj) this).field_a = kf.field_c;
                ((uj) this).field_c = param2;
                ((uj) this).field_f = true;
                ((uj) this).field_d = uh.field_mc;
                if (((uj) this).field_l != 0) {
                  L0: {
                    if (q.field_v != 0) {
                      if (0 < ((uj) this).field_d) {
                        ((uj) this).field_d = ((uj) this).field_d - 1;
                        break L0;
                      } else {
                        ((uj) this).field_d = ol.field_I;
                        ((uj) this).field_d = ((uj) this).field_d - 1;
                        if (kf.field_c == 0) {
                          L1: {
                            if (q.field_v == 0) {
                              ((uj) this).field_l = 0;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                          L2: {
                            if (0 != ((uj) this).field_l) {
                              break L2;
                            } else {
                              L3: {
                                if (((uj) this).field_f) {
                                  break L3;
                                } else {
                                  if (wo.field_s) {
                                    break L3;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              if (param1 < 0) {
                                if (((uj) this).field_f) {
                                  ((uj) this).field_c = -1;
                                  break L2;
                                } else {
                                  return;
                                }
                              } else {
                                if (~((uj) this).field_c == ~param1) {
                                  ((uj) this).field_c = param1;
                                  ((uj) this).field_f = true;
                                  break L2;
                                } else {
                                  ((uj) this).field_c = param1;
                                  ((uj) this).field_f = true;
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          L4: {
                            if (0 != ((uj) this).field_l) {
                              break L4;
                            } else {
                              L5: {
                                if (((uj) this).field_f) {
                                  break L5;
                                } else {
                                  if (wo.field_s) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              if (param1 < 0) {
                                if (((uj) this).field_f) {
                                  ((uj) this).field_c = -1;
                                  break L4;
                                } else {
                                  return;
                                }
                              } else {
                                if (~((uj) this).field_c == ~param1) {
                                  ((uj) this).field_c = param1;
                                  ((uj) this).field_f = true;
                                  break L4;
                                } else {
                                  ((uj) this).field_c = param1;
                                  ((uj) this).field_f = true;
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                  L6: {
                    if (kf.field_c != 0) {
                      break L6;
                    } else {
                      if (q.field_v == 0) {
                        ((uj) this).field_l = 0;
                        break L6;
                      } else {
                        L7: {
                          if (0 != ((uj) this).field_l) {
                            break L7;
                          } else {
                            L8: {
                              if (((uj) this).field_f) {
                                break L8;
                              } else {
                                if (wo.field_s) {
                                  break L8;
                                } else {
                                  return;
                                }
                              }
                            }
                            if (param1 < 0) {
                              if (((uj) this).field_f) {
                                ((uj) this).field_c = -1;
                                break L7;
                              } else {
                                return;
                              }
                            } else {
                              if (~((uj) this).field_c == ~param1) {
                                ((uj) this).field_c = param1;
                                ((uj) this).field_f = true;
                                return;
                              } else {
                                ((uj) this).field_c = param1;
                                ((uj) this).field_f = true;
                                return;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L9: {
                    if (0 != ((uj) this).field_l) {
                      break L9;
                    } else {
                      L10: {
                        if (((uj) this).field_f) {
                          break L10;
                        } else {
                          if (wo.field_s) {
                            break L10;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param1 < 0) {
                        if (((uj) this).field_f) {
                          ((uj) this).field_c = -1;
                          break L9;
                        } else {
                          return;
                        }
                      } else {
                        if (~((uj) this).field_c == ~param1) {
                          ((uj) this).field_c = param1;
                          ((uj) this).field_f = true;
                          return;
                        } else {
                          ((uj) this).field_c = param1;
                          ((uj) this).field_f = true;
                          return;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L11: {
                    if (kf.field_c != 0) {
                      break L11;
                    } else {
                      if (q.field_v == 0) {
                        ((uj) this).field_l = 0;
                        break L11;
                      } else {
                        L12: {
                          if (0 != ((uj) this).field_l) {
                            break L12;
                          } else {
                            L13: {
                              if (((uj) this).field_f) {
                                break L13;
                              } else {
                                if (wo.field_s) {
                                  break L13;
                                } else {
                                  return;
                                }
                              }
                            }
                            if (param1 < 0) {
                              if (((uj) this).field_f) {
                                ((uj) this).field_c = -1;
                                break L12;
                              } else {
                                return;
                              }
                            } else {
                              if (~((uj) this).field_c == ~param1) {
                                ((uj) this).field_c = param1;
                                ((uj) this).field_f = true;
                                return;
                              } else {
                                ((uj) this).field_c = param1;
                                ((uj) this).field_f = true;
                                return;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L14: {
                    if (0 != ((uj) this).field_l) {
                      break L14;
                    } else {
                      L15: {
                        if (((uj) this).field_f) {
                          break L15;
                        } else {
                          if (wo.field_s) {
                            break L15;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param1 < 0) {
                        if (((uj) this).field_f) {
                          ((uj) this).field_c = -1;
                          break L14;
                        } else {
                          return;
                        }
                      } else {
                        if (~((uj) this).field_c == ~param1) {
                          ((uj) this).field_c = param1;
                          ((uj) this).field_f = true;
                          return;
                        } else {
                          ((uj) this).field_c = param1;
                          ((uj) this).field_f = true;
                          return;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L16: {
                  if (((uj) this).field_l == 0) {
                    break L16;
                  } else {
                    if (q.field_v != 0) {
                      if (0 < ((uj) this).field_d) {
                        ((uj) this).field_d = ((uj) this).field_d - 1;
                        break L16;
                      } else {
                        ((uj) this).field_d = ol.field_I;
                        L17: {
                          ((uj) this).field_d = ((uj) this).field_d - 1;
                          if (kf.field_c != 0) {
                            break L17;
                          } else {
                            if (q.field_v == 0) {
                              ((uj) this).field_l = 0;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (0 != ((uj) this).field_l) {
                            break L18;
                          } else {
                            L19: {
                              if (((uj) this).field_f) {
                                break L19;
                              } else {
                                if (wo.field_s) {
                                  break L19;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            if (param1 < 0) {
                              if (((uj) this).field_f) {
                                ((uj) this).field_c = -1;
                                break L18;
                              } else {
                                break L18;
                              }
                            } else {
                              if (~((uj) this).field_c == ~param1) {
                                ((uj) this).field_c = param1;
                                ((uj) this).field_f = true;
                                break L18;
                              } else {
                                ((uj) this).field_c = param1;
                                ((uj) this).field_f = true;
                                break L18;
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                L20: {
                  if (kf.field_c != 0) {
                    break L20;
                  } else {
                    if (q.field_v == 0) {
                      ((uj) this).field_l = 0;
                      break L20;
                    } else {
                      L21: {
                        if (0 != ((uj) this).field_l) {
                          break L21;
                        } else {
                          L22: {
                            if (((uj) this).field_f) {
                              break L22;
                            } else {
                              if (wo.field_s) {
                                break L22;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (((uj) this).field_f) {
                              ((uj) this).field_c = -1;
                              break L21;
                            } else {
                              break L21;
                            }
                          } else {
                            if (~((uj) this).field_c == ~param1) {
                              ((uj) this).field_c = param1;
                              ((uj) this).field_f = true;
                              break L21;
                            } else {
                              ((uj) this).field_c = param1;
                              ((uj) this).field_f = true;
                              break L21;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L23: {
                  if (0 != ((uj) this).field_l) {
                    break L23;
                  } else {
                    L24: {
                      if (((uj) this).field_f) {
                        break L24;
                      } else {
                        if (wo.field_s) {
                          break L24;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param1 < 0) {
                      if (((uj) this).field_f) {
                        ((uj) this).field_c = -1;
                        break L23;
                      } else {
                        return;
                      }
                    } else {
                      if (~((uj) this).field_c == ~param1) {
                        ((uj) this).field_c = param1;
                        ((uj) this).field_f = true;
                        return;
                      } else {
                        ((uj) this).field_c = param1;
                        ((uj) this).field_f = true;
                        return;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L25: {
                ((uj) this).field_i = 0;
                if (kf.field_c == 0) {
                  break L25;
                } else {
                  ((uj) this).field_l = kf.field_c;
                  ((uj) this).field_a = kf.field_c;
                  ((uj) this).field_c = param2;
                  ((uj) this).field_f = true;
                  ((uj) this).field_d = uh.field_mc;
                  break L25;
                }
              }
              L26: {
                if (((uj) this).field_l == 0) {
                  break L26;
                } else {
                  if (q.field_v != 0) {
                    if (0 < ((uj) this).field_d) {
                      ((uj) this).field_d = ((uj) this).field_d - 1;
                      break L26;
                    } else {
                      ((uj) this).field_d = ol.field_I;
                      L27: {
                        ((uj) this).field_d = ((uj) this).field_d - 1;
                        if (kf.field_c != 0) {
                          break L27;
                        } else {
                          if (q.field_v == 0) {
                            ((uj) this).field_l = 0;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (0 != ((uj) this).field_l) {
                          break L28;
                        } else {
                          L29: {
                            if (((uj) this).field_f) {
                              break L29;
                            } else {
                              if (wo.field_s) {
                                break L29;
                              } else {
                                break L28;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (((uj) this).field_f) {
                              ((uj) this).field_c = -1;
                              break L28;
                            } else {
                              break L28;
                            }
                          } else {
                            if (~((uj) this).field_c == ~param1) {
                              ((uj) this).field_c = param1;
                              ((uj) this).field_f = true;
                              break L28;
                            } else {
                              ((uj) this).field_c = param1;
                              ((uj) this).field_f = true;
                              break L28;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    break L26;
                  }
                }
              }
              L30: {
                if (kf.field_c != 0) {
                  break L30;
                } else {
                  if (q.field_v == 0) {
                    ((uj) this).field_l = 0;
                    break L30;
                  } else {
                    L31: {
                      if (0 != ((uj) this).field_l) {
                        break L31;
                      } else {
                        L32: {
                          if (((uj) this).field_f) {
                            break L32;
                          } else {
                            if (wo.field_s) {
                              break L32;
                            } else {
                              break L31;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (((uj) this).field_f) {
                            ((uj) this).field_c = -1;
                            break L31;
                          } else {
                            break L31;
                          }
                        } else {
                          if (~((uj) this).field_c == ~param1) {
                            ((uj) this).field_c = param1;
                            ((uj) this).field_f = true;
                            break L31;
                          } else {
                            ((uj) this).field_c = param1;
                            ((uj) this).field_f = true;
                            break L31;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L33: {
                if (0 != ((uj) this).field_l) {
                  break L33;
                } else {
                  L34: {
                    if (((uj) this).field_f) {
                      break L34;
                    } else {
                      if (wo.field_s) {
                        break L34;
                      } else {
                        return;
                      }
                    }
                  }
                  if (param1 < 0) {
                    if (((uj) this).field_f) {
                      ((uj) this).field_c = -1;
                      break L33;
                    } else {
                      return;
                    }
                  } else {
                    if (~((uj) this).field_c == ~param1) {
                      ((uj) this).field_c = param1;
                      ((uj) this).field_f = true;
                      return;
                    } else {
                      ((uj) this).field_c = param1;
                      ((uj) this).field_f = true;
                      return;
                    }
                  }
                }
              }
              return;
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void a(int param0, boolean param1) {
        ((uj) this).field_i = 0;
        ((uj) this).field_a = 0;
        if (((uj) this).field_l == 0) {
          ((uj) this).field_i = de.field_f;
          if (0 == ((uj) this).field_l) {
            if (de.field_f == 96) {
              if (((uj) this).field_c > 0) {
                L0: {
                  ((uj) this).field_c = ((uj) this).field_c - 1;
                  ((uj) this).field_f = false;
                  if (((uj) this).field_l != 0) {
                    break L0;
                  } else {
                    if (de.field_f == 97) {
                      L1: {
                        ((uj) this).field_c = ((uj) this).field_c + 1;
                        if (~((uj) this).field_c <= ~((uj) this).field_b) {
                          ((uj) this).field_c = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ((uj) this).field_f = false;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    ((uj) this).field_f = true;
                    break L2;
                  }
                }
                L3: {
                  if (0 != ((uj) this).field_l) {
                    break L3;
                  } else {
                    L4: {
                      if (de.field_f == 98) {
                        break L4;
                      } else {
                        if (de.field_f != 99) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((uj) this).field_f = false;
                    if (0 <= ((uj) this).field_c) {
                      break L3;
                    } else {
                      ((uj) this).field_c = param0;
                      break L3;
                    }
                  }
                }
                return;
              } else {
                ((uj) this).field_c = ((uj) this).field_b;
                L5: {
                  ((uj) this).field_c = ((uj) this).field_c - 1;
                  ((uj) this).field_f = false;
                  if (((uj) this).field_l != 0) {
                    break L5;
                  } else {
                    if (de.field_f == 97) {
                      L6: {
                        ((uj) this).field_c = ((uj) this).field_c + 1;
                        if (~((uj) this).field_c <= ~((uj) this).field_b) {
                          ((uj) this).field_c = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((uj) this).field_f = false;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (param1) {
                    break L7;
                  } else {
                    ((uj) this).field_f = true;
                    break L7;
                  }
                }
                if (0 == ((uj) this).field_l) {
                  if (de.field_f != 98) {
                    L8: {
                      if (de.field_f != 99) {
                        break L8;
                      } else {
                        ((uj) this).field_f = false;
                        if (0 <= ((uj) this).field_c) {
                          break L8;
                        } else {
                          ((uj) this).field_c = param0;
                          break L8;
                        }
                      }
                    }
                    return;
                  } else {
                    L9: {
                      ((uj) this).field_f = false;
                      if (0 <= ((uj) this).field_c) {
                        break L9;
                      } else {
                        ((uj) this).field_c = param0;
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L10: {
                if (((uj) this).field_l != 0) {
                  break L10;
                } else {
                  if (de.field_f == 97) {
                    L11: {
                      ((uj) this).field_c = ((uj) this).field_c + 1;
                      if (~((uj) this).field_c <= ~((uj) this).field_b) {
                        ((uj) this).field_c = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((uj) this).field_f = false;
                    break L10;
                  } else {
                    if (param1) {
                      L12: {
                        if (0 != ((uj) this).field_l) {
                          break L12;
                        } else {
                          if (de.field_f == 98) {
                            ((uj) this).field_f = false;
                            if (0 <= ((uj) this).field_c) {
                              break L12;
                            } else {
                              ((uj) this).field_c = param0;
                              return;
                            }
                          } else {
                            if (de.field_f != 99) {
                              break L12;
                            } else {
                              L13: {
                                ((uj) this).field_f = false;
                                if (0 <= ((uj) this).field_c) {
                                  break L13;
                                } else {
                                  ((uj) this).field_c = param0;
                                  break L13;
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L14: {
                        ((uj) this).field_f = true;
                        if (0 != ((uj) this).field_l) {
                          break L14;
                        } else {
                          L15: {
                            if (de.field_f == 98) {
                              break L15;
                            } else {
                              if (de.field_f != 99) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          ((uj) this).field_f = false;
                          if (0 <= ((uj) this).field_c) {
                            break L14;
                          } else {
                            ((uj) this).field_c = param0;
                            break L14;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param1) {
                L16: {
                  if (0 != ((uj) this).field_l) {
                    break L16;
                  } else {
                    if (de.field_f == 98) {
                      ((uj) this).field_f = false;
                      if (0 <= ((uj) this).field_c) {
                        break L16;
                      } else {
                        ((uj) this).field_c = param0;
                        return;
                      }
                    } else {
                      if (de.field_f != 99) {
                        break L16;
                      } else {
                        ((uj) this).field_f = false;
                        if (0 <= ((uj) this).field_c) {
                          return;
                        } else {
                          ((uj) this).field_c = param0;
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L17: {
                  ((uj) this).field_f = true;
                  if (0 != ((uj) this).field_l) {
                    break L17;
                  } else {
                    if (de.field_f == 98) {
                      ((uj) this).field_f = false;
                      if (0 <= ((uj) this).field_c) {
                        break L17;
                      } else {
                        ((uj) this).field_c = param0;
                        return;
                      }
                    } else {
                      if (de.field_f != 99) {
                        break L17;
                      } else {
                        ((uj) this).field_f = false;
                        if (0 <= ((uj) this).field_c) {
                          return;
                        } else {
                          ((uj) this).field_c = param0;
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            L18: {
              if (((uj) this).field_l != 0) {
                break L18;
              } else {
                if (de.field_f == 97) {
                  L19: {
                    ((uj) this).field_c = ((uj) this).field_c + 1;
                    if (~((uj) this).field_c <= ~((uj) this).field_b) {
                      ((uj) this).field_c = 0;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  ((uj) this).field_f = false;
                  break L18;
                } else {
                  L20: {
                    if (param1) {
                      break L20;
                    } else {
                      ((uj) this).field_f = true;
                      break L20;
                    }
                  }
                  L21: {
                    if (0 != ((uj) this).field_l) {
                      break L21;
                    } else {
                      L22: {
                        if (de.field_f == 98) {
                          break L22;
                        } else {
                          if (de.field_f != 99) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      ((uj) this).field_f = false;
                      if (0 <= ((uj) this).field_c) {
                        break L21;
                      } else {
                        ((uj) this).field_c = param0;
                        break L21;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param1) {
              L23: {
                if (0 != ((uj) this).field_l) {
                  break L23;
                } else {
                  if (de.field_f == 98) {
                    ((uj) this).field_f = false;
                    if (0 <= ((uj) this).field_c) {
                      break L23;
                    } else {
                      ((uj) this).field_c = param0;
                      return;
                    }
                  } else {
                    if (de.field_f != 99) {
                      break L23;
                    } else {
                      L24: {
                        ((uj) this).field_f = false;
                        if (0 <= ((uj) this).field_c) {
                          break L24;
                        } else {
                          ((uj) this).field_c = param0;
                          break L24;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              L25: {
                ((uj) this).field_f = true;
                if (0 != ((uj) this).field_l) {
                  break L25;
                } else {
                  L26: {
                    if (de.field_f == 98) {
                      break L26;
                    } else {
                      if (de.field_f != 99) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  ((uj) this).field_f = false;
                  if (0 <= ((uj) this).field_c) {
                    break L25;
                  } else {
                    ((uj) this).field_c = param0;
                    break L25;
                  }
                }
              }
              return;
            }
          }
        } else {
          L27: {
            if (0 != ((uj) this).field_l) {
              break L27;
            } else {
              if (de.field_f == 96) {
                if (((uj) this).field_c > 0) {
                  L28: {
                    ((uj) this).field_c = ((uj) this).field_c - 1;
                    ((uj) this).field_f = false;
                    if (((uj) this).field_l != 0) {
                      break L28;
                    } else {
                      if (de.field_f == 97) {
                        L29: {
                          ((uj) this).field_c = ((uj) this).field_c + 1;
                          if (~((uj) this).field_c <= ~((uj) this).field_b) {
                            ((uj) this).field_c = 0;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        ((uj) this).field_f = false;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L30: {
                    if (param1) {
                      break L30;
                    } else {
                      ((uj) this).field_f = true;
                      break L30;
                    }
                  }
                  L31: {
                    if (0 != ((uj) this).field_l) {
                      break L31;
                    } else {
                      L32: {
                        if (de.field_f == 98) {
                          break L32;
                        } else {
                          if (de.field_f != 99) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      ((uj) this).field_f = false;
                      if (0 <= ((uj) this).field_c) {
                        break L31;
                      } else {
                        ((uj) this).field_c = param0;
                        break L31;
                      }
                    }
                  }
                  return;
                } else {
                  ((uj) this).field_c = ((uj) this).field_b;
                  L33: {
                    ((uj) this).field_c = ((uj) this).field_c - 1;
                    ((uj) this).field_f = false;
                    if (((uj) this).field_l != 0) {
                      break L33;
                    } else {
                      if (de.field_f == 97) {
                        L34: {
                          ((uj) this).field_c = ((uj) this).field_c + 1;
                          if (~((uj) this).field_c <= ~((uj) this).field_b) {
                            ((uj) this).field_c = 0;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        ((uj) this).field_f = false;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                  }
                  L35: {
                    if (param1) {
                      break L35;
                    } else {
                      ((uj) this).field_f = true;
                      break L35;
                    }
                  }
                  L36: {
                    if (0 != ((uj) this).field_l) {
                      break L36;
                    } else {
                      L37: {
                        if (de.field_f == 98) {
                          break L37;
                        } else {
                          if (de.field_f != 99) {
                            break L36;
                          } else {
                            break L37;
                          }
                        }
                      }
                      ((uj) this).field_f = false;
                      if (0 <= ((uj) this).field_c) {
                        break L36;
                      } else {
                        ((uj) this).field_c = param0;
                        break L36;
                      }
                    }
                  }
                  return;
                }
              } else {
                break L27;
              }
            }
          }
          L38: {
            if (((uj) this).field_l != 0) {
              break L38;
            } else {
              if (de.field_f == 97) {
                L39: {
                  ((uj) this).field_c = ((uj) this).field_c + 1;
                  if (~((uj) this).field_c <= ~((uj) this).field_b) {
                    ((uj) this).field_c = 0;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                ((uj) this).field_f = false;
                break L38;
              } else {
                L40: {
                  if (param1) {
                    break L40;
                  } else {
                    ((uj) this).field_f = true;
                    break L40;
                  }
                }
                L41: {
                  if (0 != ((uj) this).field_l) {
                    break L41;
                  } else {
                    L42: {
                      if (de.field_f == 98) {
                        break L42;
                      } else {
                        if (de.field_f != 99) {
                          break L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                    ((uj) this).field_f = false;
                    if (0 <= ((uj) this).field_c) {
                      break L41;
                    } else {
                      ((uj) this).field_c = param0;
                      break L41;
                    }
                  }
                }
                return;
              }
            }
          }
          if (param1) {
            L43: {
              if (0 != ((uj) this).field_l) {
                break L43;
              } else {
                if (de.field_f == 98) {
                  ((uj) this).field_f = false;
                  if (0 <= ((uj) this).field_c) {
                    break L43;
                  } else {
                    ((uj) this).field_c = param0;
                    return;
                  }
                } else {
                  if (de.field_f != 99) {
                    break L43;
                  } else {
                    L44: {
                      ((uj) this).field_f = false;
                      if (0 <= ((uj) this).field_c) {
                        break L44;
                      } else {
                        ((uj) this).field_c = param0;
                        break L44;
                      }
                    }
                    return;
                  }
                }
              }
            }
            return;
          } else {
            L45: {
              ((uj) this).field_f = true;
              if (0 != ((uj) this).field_l) {
                break L45;
              } else {
                L46: {
                  if (de.field_f == 98) {
                    break L46;
                  } else {
                    if (de.field_f != 99) {
                      break L45;
                    } else {
                      break L46;
                    }
                  }
                }
                ((uj) this).field_f = false;
                if (0 <= ((uj) this).field_c) {
                  break L45;
                } else {
                  ((uj) this).field_c = param0;
                  break L45;
                }
              }
            }
            return;
          }
        }
    }

    public static void a() {
        field_h = null;
        field_j = null;
        field_k = null;
        field_e = null;
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            boolean discarded$8 = uj.c((byte) -98);
            if (((uj) this).field_i != 103) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((uj) this).field_i != 103) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -98) {
          L0: {
            boolean discarded$10 = ((uj) this).c(-119);
            if (((uj) this).field_i != 97) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((uj) this).field_i != 97) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = param2 - param4;
            var7 = param1 + -param0;
            if (var7 == 0) {
              L1: {
                if (var6_int == 0) {
                  break L1;
                } else {
                  ce.a(param0, (byte) -86, param4, param5, param2);
                  break L1;
                }
              }
              return;
            } else {
              if (var6_int != 0) {
                L2: {
                  if (0 > var7) {
                    var7 = -var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var6_int >= 0) {
                    break L3;
                  } else {
                    var6_int = -var6_int;
                    break L3;
                  }
                }
                L4: {
                  if (var7 >= var6_int) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                L5: {
                  var8 = stackIn_16_0;
                  if (var8 != 0) {
                    var9 = param0;
                    param0 = param4;
                    var10 = param1;
                    param1 = param2;
                    param4 = var9;
                    param2 = var10;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param0 > param1) {
                    var9 = param0;
                    param0 = param1;
                    var10 = param4;
                    param4 = param2;
                    param1 = var9;
                    param2 = var10;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var9 = param4;
                  var10 = -param0 + param1;
                  var11 = param2 + -param4;
                  var12 = -(var10 >> 1);
                  if (param2 > param4) {
                    stackOut_24_0 = 1;
                    stackIn_25_0 = stackOut_24_0;
                    break L7;
                  } else {
                    stackOut_23_0 = -1;
                    stackIn_25_0 = stackOut_23_0;
                    break L7;
                  }
                }
                L8: {
                  var13 = stackIn_25_0;
                  if (var11 < 0) {
                    var11 = -var11;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var8 != 0) {
                    var16 = param0;
                    var14 = var16;
                    L10: while (true) {
                      if (param1 < var16) {
                        break L9;
                      } else {
                        L11: {
                          var12 = var12 + var11;
                          vl.field_e[var16][var9] = param5;
                          if (var12 > 0) {
                            var12 = var12 - var10;
                            var9 = var9 + var13;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var16++;
                        continue L10;
                      }
                    }
                  } else {
                    var14 = param0;
                    L12: while (true) {
                      if (param1 < var14) {
                        break L9;
                      } else {
                        L13: {
                          vl.field_e[var9][var14] = param5;
                          var12 = var12 + var11;
                          if (var12 <= 0) {
                            break L13;
                          } else {
                            var9 = var9 + var13;
                            var12 = var12 - var10;
                            break L13;
                          }
                        }
                        var14++;
                        continue L12;
                      }
                    }
                  }
                }
                L14: {
                  if (param3) {
                    break L14;
                  } else {
                    field_e = null;
                    break L14;
                  }
                }
                break L0;
              } else {
                oq.a(param1, param0, (byte) -84, param4, param5);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var6, "uj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(String param0, String param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param0.length();
            var6 = param1.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (var8 == 0) {
                  break L1;
                } else {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param3.indexOf(param0, var9_int);
                    if (var9_int < 0) {
                      break L1;
                    } else {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L2;
                    }
                  }
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param3.indexOf(param0, var10);
                if (var11 >= 0) {
                  StringBuilder discarded$3 = var9.append(param3.substring(var10, var11));
                  var10 = var5 + var11;
                  StringBuilder discarded$4 = var9.append(param1);
                  continue L3;
                } else {
                  StringBuilder discarded$5 = var9.append(param3.substring(var10));
                  stackOut_11_0 = var9.toString();
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("uj.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_12_0;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -58) {
          L0: {
            field_j = null;
            if (((uj) this).field_i != 96) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((uj) this).field_i != 96) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(byte param0) {
        if (param0 != 45) {
            return false;
        }
        return 102 == ((uj) this).field_i ? true : false;
    }

    final void a(boolean param0, int param1, int param2, byte param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ((uj) this).field_l = 0;
        if (param3 == 80) {
          L0: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param0) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L0;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L0;
            }
          }
          ((uj) this).field_f = stackIn_11_1 != 0;
          if (((uj) this).field_f) {
            ((uj) this).field_c = param1;
            return;
          } else {
            ((uj) this).field_c = param2;
            return;
          }
        } else {
          L1: {
            ((uj) this).field_b = -66;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((uj) this).field_f = stackIn_4_1 != 0;
          if (((uj) this).field_f) {
            ((uj) this).field_c = param1;
            return;
          } else {
            ((uj) this).field_c = param2;
            return;
          }
        }
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 85) {
          L0: {
            field_k = null;
            if (((uj) this).field_l == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((uj) this).field_l == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    uj(int param0) {
        ((uj) this).field_f = false;
        ((uj) this).field_c = 0;
        ((uj) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "<times> <%0>";
        field_e = "you died";
        field_h = "Players";
        field_j = new String[]{"Paint all these purple to complete each level.", "You can jump higher while on a fan.", "Green portals transport you to red portals.", "You can't jump while on a gluey tile.", "You can't pass these blocks, and if you land on one you'll slide off of it.", "Danger: this block will kill you!", "Moving onto it will cause the bomb to blow up, destroying nearby blocks.", "This block crumbles when you move off of it, and must be destroyed to complete the level.", "Pulls you towards it.", "Pushes you away.", "You can't paint this block (but you don't have to).", "These blocks phase in and out of existence. You'll fall through them when they're transparent."};
    }
}
