/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchStatistics {
    private int[] trapsDestroyed;
    static SpriteData field_g;
    static String field_k;
    static String field_l;
    private int[] charactersFaced;
    private boolean[] penalised;
    static int[] field_f;
    private int[] field_p;
    static FontMetrics field_n;
    private int[] bladeDeaths;
    private int[] treasureScore;
    private int[] crushDeaths;
    private int[] fireDeaths;
    private boolean[] lostRound;
    private int[] fallDeaths;
    private int[] charactersPlayed;

    final void addTreasureScore(int param0, int param1, int param2) {
        this.treasureScore[param0] = this.treasureScore[param0] + param2;
        if (param1 != 65408) {
          this.addFallDeath(-108, -74);
        }
    }

    private final void addFireDeath(int param0, int param1) {
        this.fireDeaths[param1] = this.fireDeaths[param1] + 1;
        int var3 = 125 % ((param0 + 38) / 60);
    }

    final void recordPenalty(int param0, int param1, int param2) {
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param2 != -4) {
          return;
        }
        var4 = param0;
        if (var4 == 7) {
          this.a(param1, 9266);
        } else {
          if (5 == var4) {
            this.addFallDeath(-127, param1);
          } else {
            if (var4 == 12) {
              this.addFireDeath(-112, param1);
            } else {
              if (var4 == 10) {
                this.addBladeDeath(param1, -11);
              } else {
                if (15 == var4) {
                  this.addBladeDeath(param1, -11);
                } else {
                  if (var4 == 14) {
                    this.addCrushDeath(-5, param1);
                  } else {
                    if (var4 == 3) {
                      this.addCrushDeath(-5, param1);
                    } else {
                      if (var4 == 4) {
                        this.addCrushDeath(-5, param1);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        this.markPenalised(param1, -98);
        return;
    }

    final void markCharacterFaced(int param0, int param1, boolean param2) {
        if (!param2) {
          return;
        }
        this.charactersFaced[param0] = WallTile.bitwiseOr(this.charactersFaced[param0], 1 << param1);
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 105 % ((param0 + 9) / 56);
        if (SnakePitTile.a(false)) {
          if (param1) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 192);
          }
          ModelFactory.field_a.renderWithTooltip(-108, 0, 0);
          return;
        }
    }

    final void addTrapsDestroyed(int param0, int param1, int param2) {
        this.trapsDestroyed[param2] = this.trapsDestroyed[param2] + param0;
        int var4 = 41 % ((param1 + 34) / 36);
    }

    private final void addFallDeath(int param0, int param1) {
        this.fallDeaths[param1] = this.fallDeaths[param1] + 1;
        if (param0 != -127) {
          this.fallDeaths = (int[]) null;
        }
    }

    final void a(byte param0) {
        if (param0 < 42) {
          this.addBladeDeath(-107, 24);
        }
    }

    private final void addBladeDeath(int param0, int param1) {
        this.bladeDeaths[param0] = this.bladeDeaths[param0] + 1;
        if (param1 != -11) {
          this.markRoundLosers(43, false);
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_l = null;
        field_k = null;
        field_g = null;
        field_f = null;
        field_n = null;
    }

    private final void addCrushDeath(int param0, int param1) {
        this.crushDeaths[param1] = this.crushDeaths[param1] + 1;
        if (param0 != -5) {
          this.markCharacterFaced(52, 52, false);
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != 9266) {
          return;
        }
        this.field_p[param0] = this.field_p[param0] + 1;
    }

    final void markCharacterPlayed(int param0, byte param1, int param2) {
        this.charactersPlayed[param0] = WallTile.bitwiseOr(this.charactersPlayed[param0], 1 << param2);
        if (param1 != -52) {
          MatchStatistics.releaseStatics(false);
        }
    }

    private final void markPenalised(int param0, int param1) {
        int var3 = -47 % ((0 - param1) / 59);
        this.penalised[param0] = true;
    }

    final static int scaleLightness(int param0, int param1, int param2) {
        param2 = (127 & param1) * param2 >> 7;
        if (param0 != -127) {
          field_n = (FontMetrics) null;
          if (2 > param2) {
            param2 = 2;
            return (param1 & 65408) + param2;
          }
          if (param2 > 126) {
            param2 = 126;
            return (param1 & 65408) + param2;
          }
          return (param1 & 65408) + param2;
        }
        if (2 > param2) {
          param2 = 2;
          return (param1 & 65408) + param2;
        }
        if (param2 > 126) {
          param2 = 126;
          return (param1 & 65408) + param2;
        }
        return (param1 & 65408) + param2;
    }

    MatchStatistics(int param0) {
        this.fireDeaths = new int[param0];
        this.trapsDestroyed = new int[param0];
        this.field_p = new int[param0];
        this.charactersFaced = new int[param0];
        this.crushDeaths = new int[param0];
        this.fallDeaths = new int[param0];
        this.lostRound = new boolean[param0];
        this.penalised = new boolean[param0];
        this.bladeDeaths = new int[param0];
        this.treasureScore = new int[param0];
        this.charactersPlayed = new int[param0];
    }

    final void markRoundLosers(int param0, boolean param1) {
        int var3 = 0;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1) {
          return;
        }
        for (var3 = 0; this.lostRound.length > var3; var3++) {
          if (var3 != param0) {
            this.lostRound[var3] = true;
          }
        }
    }

    static {
        field_k = "+1 Idol";
        field_f = new int[8192];
        field_l = "Players: ";
    }
}
